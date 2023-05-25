/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.ui;

import cat.institutmvm.buisness.entities.Pacient;
import cat.institutmvm.buisness.entities.Urgencia;
import cat.institutmvm.persistence.daos.impl.PacientJDBCDAO;
import cat.institutmvm.persistence.daos.impl.UrgenciaJDBCDAO;
import cat.institutmvm.persistence.exceptions.DAOException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
/**
 *
 * @author marko
 */
public class MyFrame extends JFrame {

    private JLabel labelSubtitulo, labelDni, labelNom, labelTsi,
            labelMotiu, labelData, labelEdat, labelGen;
    private JTextField txtDni, txtNom, txtTsi, txtData, txtEdat, txtGen;
    private JTextArea txtMotiu;

    public MyFrame() {
        //<editor-fold desc="Centrar frame">
        Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension screenSize = screen.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 4, screenHeight / 2);
        setLocation(screenWidth / 3, screenHeight / 9);
        this.setResizable(true);
        this.setMinimumSize(new Dimension(485, 740));
        //</editor-fold>

        this.setTitle("Formulari");
        JPanel cuestionari = new JPanel();
        JPanel cuestionariNom = new JPanel();
        JPanel cuestionariCognom = new JPanel();
        JPanel cuestionariNomtxt = new JPanel();
        JPanel cuestionariCognomtxt = new JPanel();
        JPanel cuestionariTsi = new JPanel();
        JPanel cuestionariMotiu = new JPanel();
        JPanel cuestionariTsitxt = new JPanel();
        JPanel cuestionariMotiutxt = new JPanel();
        JPanel cuestionariData = new JPanel();
        JPanel cuestionariEdat = new JPanel();
        JPanel cuestionariGenere = new JPanel();
        JPanel cuestionariDatatxt = new JPanel();
        JPanel cuestionariEdattxt = new JPanel();
        JPanel cuestionariGeneretxt = new JPanel();
        JPanel cuestionariBoton5 = new JPanel();

        labelDni = new JLabel("DNI:");

        txtDni = new JTextField(25);

        JButton btnCheck = new JButton("֍");

        labelNom = new JLabel("Nom i cognoms:");

        txtNom = new JTextField(30);

        txtNom.setEditable(false);

        labelTsi = new JLabel("TSI:");

        txtTsi = new JTextField(30);

        txtTsi.setEditable(false);

        labelData = new JLabel("Data naixement:");

        txtData = new JTextField(30);

        txtData.setEditable(false);

        labelEdat = new JLabel("Edat:");

        txtEdat = new JTextField(30);

        txtEdat.setEditable(false);

        labelGen = new JLabel("Genere:");

        txtGen = new JTextField(30);

        txtGen.setEditable(false);

        labelMotiu = new JLabel("Motiu de la urgència:");

        txtMotiu = new JTextArea(9, 31);

        JScrollPane scroll = new JScrollPane(txtMotiu,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        txtMotiu.setRows(9);
        txtMotiu.setColumns(29);
        txtMotiu.setLineWrap(true);
        txtMotiu.setWrapStyleWord(true);
        txtMotiu.setMaximumSize(screenSize);

        /*----------Desplegable---------*/
        labelEdat = new JLabel("Edat: ");
        JComboBox edad = new JComboBox();
        for (int i = 0; i <= 100; i++) {
            edad.addItem(i);
        }

        cuestionariNom.add(labelDni);
        cuestionariNomtxt.add(txtDni);
        cuestionariCognom.add(labelNom);
        cuestionariCognomtxt.add(txtNom);
        cuestionariTsi.add(labelTsi);
        cuestionariTsitxt.add(txtTsi);
        cuestionariMotiu.add(labelMotiu);
        cuestionariData.add(labelData);
        cuestionariDatatxt.add(txtData);
        cuestionariEdat.add(labelEdat);
        cuestionariEdattxt.add(txtEdat);
        cuestionariGenere.add(labelGen);
        cuestionariGeneretxt.add(txtGen);
        cuestionariMotiutxt.add(scroll);
        cuestionariBoton5.add(btnCheck);
        cuestionari.add(cuestionariNom);
        cuestionari.add(cuestionariNomtxt);
        cuestionari.add(cuestionariBoton5);
        cuestionari.add(cuestionariCognom);
        cuestionari.add(cuestionariCognomtxt);
        cuestionari.add(cuestionariTsi);
        cuestionari.add(cuestionariTsitxt);
        cuestionari.add(cuestionariData);
        cuestionari.add(cuestionariDatatxt);
        cuestionari.add(cuestionariEdat);
        cuestionari.add(cuestionariEdattxt);
        cuestionari.add(cuestionariGenere);
        cuestionari.add(cuestionariGeneretxt);
        cuestionari.add(cuestionariMotiu);
        cuestionari.add(cuestionariMotiutxt);
        cuestionariNom.setBorder(new EmptyBorder(10, 0, 0, 310));
        cuestionariNomtxt.setBorder(new EmptyBorder(0, 30, 0, 0));
        cuestionariBoton5.setBorder(new EmptyBorder(0, 0, 0, 23));
        cuestionariCognom.setBorder(new EmptyBorder(0, 0, 0, 245));
        cuestionariCognomtxt.setBorder(new EmptyBorder(0, 0, 0, 0));
        cuestionariTsi.setBorder(new EmptyBorder(0, 0, 0, 315));
        cuestionariTsitxt.setBorder(new EmptyBorder(0, 0, 0, 0));
        cuestionariData.setBorder(new EmptyBorder(0, 0, 0, 245));
        cuestionariDatatxt.setBorder(new EmptyBorder(0, 0, 0, 0));
        cuestionariEdat.setBorder(new EmptyBorder(0, 0, 0, 305));
        cuestionariEdattxt.setBorder(new EmptyBorder(0, 0, 0, 0));
        cuestionariGenere.setBorder(new EmptyBorder(0, 0, 0, 295));
        cuestionariGeneretxt.setBorder(new EmptyBorder(0, 0, 0, 0));
        cuestionariMotiu.setBorder(new EmptyBorder(0, 0, 0, 220));
        cuestionariMotiutxt.setBorder(new EmptyBorder(0, 0, 0, 0));

        /*---------- Botones ----------*/
        JPanel cuestionariBoton1 = new JPanel();
        JPanel cuestionariBoton2 = new JPanel();
        JPanel cuestionariBoton3 = new JPanel();
        JPanel cuestionariBoton4 = new JPanel();
        JButton btnAfegir = new JButton("Afegir");
        JButton btnMostrar = new JButton("Mostrar");
        JButton btnEstats = new JButton("Estadístiques");
        JButton btnFitxer = new JButton("Fitxer");
        cuestionariBoton1.add(btnAfegir);
        cuestionariBoton2.add(btnMostrar);
        cuestionariBoton3.add(btnEstats);
        cuestionariBoton4.add(btnFitxer);
        cuestionari.add(cuestionariBoton1);
        cuestionari.add(cuestionariBoton2);
        cuestionari.add(cuestionariBoton3);
        cuestionari.add(cuestionariBoton4);
        cuestionariBoton1.setBorder(new EmptyBorder(0, 30, 0, 0));
        //cuestionariBoton.setBorder(new EmptyBorder(20,0,0,160));
        //cuestionariBoton.setBackground(Color.white);

        //GRAELLA
        JPanel tabla1 = new JPanel();

        String[] columnNames = {"DNI", "Data", "Motiu", "Nivell", "Torn"};
        Object[][] datos = {};

        DefaultTableModel dtm = new DefaultTableModel(datos, columnNames);

        JTable table = new JTable(dtm);
        tabla1.add(table);
        table.setRowHeight(20);

        //cuestionari.add(tabla1);
        JTableHeader header = table.getTableHeader();
        JTableHeader add = new JTableHeader();
        add.setBackground(Color.gray);
        add.setPreferredSize(header.getPreferredSize());

        Box head = Box.createVerticalBox();
        head.add(header);
        head.add(add);

        JScrollPane scrollPane = new JScrollPane(tabla1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setColumnHeaderView(header);

        JPanel tabla2 = new JPanel();
        tabla2.add(scrollPane);
        cuestionari.add(tabla2);
        tabla2.setVisible(false);
        table.setEnabled(false);
        table.getTableHeader().setReorderingAllowed(false);
        
        //Bordes del cuestionario
        cuestionari.setBorder(new EmptyBorder(120, 120, 20, 0));
        cuestionari.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Dades del pacient",
                TitledBorder.LEFT, TitledBorder.TOP, null,
                Color.BLACK));

        //Creem el camp de text);
        JTextField txtOut = new JTextField("");
        txtOut.setEditable(false);
        txtOut.setBorder(new EmptyBorder(0, 0, 350, 0));
        txtOut.setBackground(Color.white);

        //Override de botones
        btnCheck.addActionListener(new ActionListener() {
            PacientJDBCDAO pac = new PacientJDBCDAO();

            @Override
            public void actionPerformed(ActionEvent ev) {
                Pacient dbPacient;
                try {
                    dbPacient = pac.getPacientByDni(txtDni.getText());
                    txtNom.setText(dbPacient.getNom() + " " + dbPacient.getCognoms());
                    txtData.setText(dbPacient.getDataNaixement().toString());
                    txtGen.setText(dbPacient.getGenere());
                    txtTsi.setText(dbPacient.getTsi());
                    txtEdat.setText(dbPacient.toString(dbPacient.getAge()));
                } catch (DAOException ex) {
                    txtDni.setText("No hi ha registres");
                }
            }
        });

        btnAfegir.addActionListener(new ActionListener() {
            UrgenciaJDBCDAO urg = new UrgenciaJDBCDAO();
            Urgencia urge = new Urgencia();

            @Override
            public void actionPerformed(ActionEvent ev) {
                try {
                    urg.getUrgenciaByDni(txtDni.getText(), urge.dataActual(), txtMotiu.getText(), urge.nivell(), urge.random(50000));
                    txtMotiu.setText("Les dades s'han inserit correctament");
                } catch (DAOException ex) {
                    txtMotiu.setText("Les dades no s'han inserit");
                }
            }
        });

        btnMostrar.addActionListener(new ActionListener() {
            UrgenciaJDBCDAO urg = new UrgenciaJDBCDAO();
            Urgencia urge = new Urgencia();
            boolean isExpanded = false;
            boolean enabled = false;

            @Override
            public void actionPerformed(ActionEvent ev) {
                try {
                    List<Urgencia> dbUrgencia = urg.getList();

                    boolean tableVisible = tabla2.isVisible();

                    if (!isExpanded) {
                        isExpanded = true;
                        tableVisible = true;
                        setSize(485, 740 + 200);
                    } else {
                        isExpanded = false;
                        tableVisible = false;
                        setSize(485, 740);
                    }

                    // Actualizar la visibilidad de la tabla
                    tabla2.setVisible(tableVisible);

                    DefaultTableModel dtm = (DefaultTableModel) table.getModel();
                    dtm.setRowCount(0);

                    // Llenar los datos en la tabla
                    for (Urgencia urgencia : dbUrgencia) {
                        Object[] rowData = {
                            urgencia.getDni(),
                            urgencia.getData(),
                            urgencia.getMotiu(),
                            urgencia.getNivell(),
                            urgencia.getTorn()
                        };
                        dtm.addRow(rowData);
                    }
                } catch (DAOException e) {
                    e.printStackTrace();
                }
            }
        });

        btnEstats.addActionListener(new ActionListener() {
            MySecFrame sf = new MySecFrame();


            public void actionPerformed(ActionEvent e) {
                List<Urgencia> urgencias = sf.getUrgenciasByDay(LocalDate.now());
                List<Pacient> urgenciasFemeninas = sf.getUrgenciasByGender(urgencias, "Femení");
                List<Pacient> urgenciasMasculinas = sf.getUrgenciasByGender(urgencias, "Masculí");
                int edadMinima = sf.getMinAge(urgencias);
                int edadMaxima = sf.getMaxAge(urgencias);
                double edadPromedio = sf.getAverageAge(urgencias);
                int totalPacientes = urgencias.size();

                StringBuilder sb = new StringBuilder();
                sb.append("Urgències filtrades per gènere (femení):\n");
                sb.append("--------------------------------------\n");
                if (urgenciasFemeninas.isEmpty()) {
                    sb.append("No hi ha urgències femenines.\n");
                } else {
                    for (Pacient paciente : urgenciasFemeninas) {
                        sb.append(sf.formatPacient(paciente));
                        sb.append("--------------------------------------\n");
                    }
                }
                sb.append("\nUrgències filtrades per gènere (masculí):\n");
                sb.append("---------------------------------------\n");
                if (urgenciasMasculinas.isEmpty()) {
                    sb.append("No hi ha urgències masculines.\n");
                } else {
                    for (Pacient paciente : urgenciasMasculinas) {
                        sb.append(sf.formatPacient(paciente));
                        sb.append("---------------------------------------\n");
                    }
                }
                sb.append("\nEdat mínima dels pacients: ").append(edadMinima).append(" anys\n");
                sb.append("Edat màxima dels pacients: ").append(edadMaxima).append(" anys\n");
                sb.append("Edat mitjana dels pacients: ").append(String.format("%.2f", edadPromedio)).append(" anys\n\n");
                sb.append("Total de pacients que han anat a urgències avui: ").append(totalPacientes);

                JTextArea textArea = new JTextArea(sb.toString());
                textArea.setEditable(false);
                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new Dimension(400, 400));

                JOptionPane.showMessageDialog(null, scrollPane, "Resultats", JOptionPane.PLAIN_MESSAGE);
            }
        });
        
        btnFitxer.addActionListener(new ActionListener() {
            MySecFrame sf = new MySecFrame();
            @Override
            public void actionPerformed(ActionEvent e) {
                sf.generateXMLDocument();
            }
        });

        JSplitPane mainPanel
                = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                        cuestionari, txtOut);
        mainPanel.setDividerSize(0);
        mainPanel.setDividerLocation(470);
        mainPanel.setEnabled(false);
        getContentPane().add(mainPanel);
    }
}
