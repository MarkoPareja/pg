package cat.institutmvm.ui;

import cat.institutmvm.buisness.entities.Urgencia;
import cat.institutmvm.buisness.entities.Pacient;
import cat.institutmvm.persistence.daos.impl.PacientJDBCDAO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import cat.institutmvm.persistence.daos.impl.UrgenciaJDBCDAO;
import cat.institutmvm.persistence.exceptions.DAOException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;


public class MySecFrame extends JFrame {

    private PacientJDBCDAO pacientDAO;
    private UrgenciaJDBCDAO urgenciaDAO = new UrgenciaJDBCDAO();
    private Urgencia urg = new Urgencia();
    private Pacient pac = new Pacient();

    public MySecFrame() {
        pacientDAO = new PacientJDBCDAO();
        urgenciaDAO = new UrgenciaJDBCDAO();
        urgenciaDAO = new UrgenciaJDBCDAO();
        initComponents();
    }

    public List<Urgencia> getUrgenciasByDay(LocalDate date) {
        try {
            return urgenciaDAO.getList().stream()
                    .filter(urgencia -> urgencia.getData().equals(date))
                    .collect(Collectors.toList());
        } catch (DAOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Pacient> getUrgenciasByGender(List<Urgencia> urgencias, String gender) {
        return urgencias.stream()
            .filter(urgencia -> {
                Pacient pacient = getPacientByDni(urgencia.getDni());
                return pacient != null && pacient.getGenere().equalsIgnoreCase(gender);
            })
            .map(urgencia -> getPacientByDni(urgencia.getDni()))
            .collect(Collectors.toList());
    }

    public String formatPacient(Pacient pacient) {
        StringBuilder sb = new StringBuilder();
        sb.append("Pacient:").append("\n");
        sb.append("DNI: ").append(pacient.getDni()).append("\n");
        sb.append("Nom: ").append(pacient.getNom()).append("\n");
        sb.append("Cognoms: ").append(pacient.getCognoms()).append("\n");
        sb.append("DataNaixement: ").append(pacient.getDataNaixement()).append("\n");
        sb.append("Genere: ").append(pacient.getGenere()).append("\n");
        sb.append("TSI: ").append(pacient.getTsi()).append("\n");
        sb.append("--------------------------------------");
        return sb.toString();
    }

    public int getMinAge(List<Urgencia> urgencias) {
        return urgencias.stream()
                .map(urgencia -> getPacientByDni(urgencia.getDni()))
                .mapToInt(Pacient::getAge)
                .min()
                .orElse(0);
    }

    public int getMaxAge(List<Urgencia> urgencias) {
        return urgencias.stream()
                .map(urgencia -> getPacientByDni(urgencia.getDni()))
                .mapToInt(Pacient::getAge)
                .max()
                .orElse(0);
    }

    public double getAverageAge(List<Urgencia> urgencias) {
        return urgencias.stream()
                .map(urgencia -> getPacientByDni(urgencia.getDni()))
                .mapToInt(Pacient::getAge)
                .average()
                .orElse(0);
    }

    public Pacient getPacientByDni(String dni) {
        try {
            return pacientDAO.getPacientByDni(dni);
        } catch (DAOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void initComponents() {
        JButton btnGenerarXML = new JButton("Generar XML");
        btnGenerarXML.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateXMLDocument();
            }
        });
    }

    public void generateXMLDocument() {
        try {
            LocalDate today = LocalDate.now();
            List<Urgencia> urgencias = urgenciaDAO.getList().stream()
                    .filter(urgencia -> urgencia.getData().equals(today))
                    .collect(Collectors.toList());

            StringBuilder xmlBuilder = new StringBuilder();
            xmlBuilder.append("<visites>\n");

            for (Urgencia urgencia : urgencias) {
                Pacient pacient = getPacientByDni(urgencia.getDni());
                xmlBuilder.append("\t<visita>\n");
                xmlBuilder.append("\t\t<dni>").append(pacient.getDni()).append("</dni>\n");
                xmlBuilder.append("\t\t<nom>").append(pacient.getNom()).append("</nom>\n");
                xmlBuilder.append("\t\t<cognoms>").append(pacient.getCognoms()).append("</cognoms>\n");
                xmlBuilder.append("\t\t<dataNaixement>").append(pacient.getDataNaixement()).append("</dataNaixement>\n");
                xmlBuilder.append("\t\t<genere>").append(pacient.getGenere()).append("</genere>\n");
                xmlBuilder.append("\t\t<tsi>").append(pacient.getTsi()).append("</tsi>\n");
                xmlBuilder.append("\t</visita>\n");
            }

            xmlBuilder.append("</visites>");

            String xmlContent = xmlBuilder.toString();

            FileWriter fileWriter = new FileWriter("files/visites.xml");
            fileWriter.write(xmlContent);
            fileWriter.close();

            JOptionPane.showMessageDialog(null, "Documento XML generado correctamente: visitas.xml", "Generar XML", JOptionPane.INFORMATION_MESSAGE);
        } catch (DAOException | IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el documento XML", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
