/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
/**
 *
 * @author marko
 */
public class MyFrame extends JFrame{
       private JLabel labelSubtitulo,labelDni,labelNom, labelEdat, labelTsi, labelMotiu;
       private JTextField txtDni,txtNom, txtTsi;
       private JTextArea txtMotiu;
       public MyFrame(){
           //<editor-fold desc="Centrar frame">
        Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension screenSize = screen.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 4, screenHeight / 2);
        setLocation(screenWidth / 4, screenHeight / 4);
        this.setResizable(true);
        this.setMinimumSize(new Dimension(485, 550));
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
        
        JPanel cuestionariBoton5 = new JPanel();
        
        
        
        labelDni = new JLabel("DNI:");
       
        txtDni = new JTextField(25);
        
        JButton btnCheck = new JButton("֍");
       
        labelNom = new JLabel("Nom i cognoms:");
       
        txtNom = new  JTextField(30);
        
        txtNom.setEditable(false);
        
        labelTsi = new JLabel("TSI:");
       
        txtTsi = new JTextField(30);
        
        txtTsi.setEditable(false);
       
        labelMotiu = new JLabel("Motiu de la urgència:");
       
        txtMotiu = new  JTextArea(9, 31);
        
        JScrollPane scroll = new JScrollPane (txtMotiu,
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
        for(int i = 0; i <= 100; i++){
            edad.addItem(i);
        }
        
        cuestionariNom.add(labelDni);
        cuestionariNomtxt.add(txtDni);
        cuestionariCognom.add(labelNom);
        cuestionariCognomtxt.add(txtNom);
        cuestionariTsi.add(labelTsi);
        cuestionariTsitxt.add(txtTsi);
        cuestionariMotiu.add(labelMotiu);
        cuestionariMotiutxt.add(scroll);
        cuestionariBoton5.add(btnCheck);
        cuestionari.add(cuestionariNom);
        cuestionari.add(cuestionariNomtxt);
        cuestionari.add(cuestionariBoton5);
        cuestionari.add(cuestionariCognom);
        cuestionari.add(cuestionariCognomtxt);
        cuestionari.add(cuestionariTsi);
        cuestionari.add(cuestionariTsitxt);
        cuestionari.add(cuestionariMotiu);
        cuestionari.add(cuestionariMotiutxt);
        cuestionariNom.setBorder(new EmptyBorder(10, 0, 0, 310));
        cuestionariNomtxt.setBorder(new EmptyBorder(0, 30, 0, 0));
        cuestionariBoton5.setBorder(new EmptyBorder(0, 0, 0, 23));
        cuestionariCognom.setBorder(new EmptyBorder(0, 0, 0, 245));
        cuestionariCognomtxt.setBorder(new EmptyBorder(0, 0, 0, 0));
        cuestionariTsi.setBorder(new EmptyBorder(0, 0, 0, 315));
        cuestionariTsitxt.setBorder(new EmptyBorder(0, 0, 0, 0));
        cuestionariMotiu.setBorder(new EmptyBorder(0, 0, 0, 220));
        cuestionariMotiutxt.setBorder(new EmptyBorder(0, 0, 0, 0));
        /*cuestionari.setBackground(Color.white);
        cuestionariNom.setBackground(Color.white);
        cuestionariCognom.setBackground(Color.white);
        cuestionariNomtxt.setBackground(Color.white);
        cuestionariCognomtxt.setBackground(Color.white);
        cuestionariTsi.setBackground(Color.white);
        cuestionariTsitxt.setBackground(Color.white);
        cuestionariMotiu.setBackground(Color.white);
        cuestionariMotiutxt.setBackground(Color.white);
        */
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
        cuestionariBoton1.setBorder(new EmptyBorder(0,30,0,0));
        //cuestionariBoton.setBorder(new EmptyBorder(20,0,0,160));
        //cuestionariBoton.setBackground(Color.white);
        
        
        cuestionari.setBorder(new EmptyBorder(120,120,20,0));
        cuestionari.setBorder(BorderFactory.createTitledBorder(
        BorderFactory.createEtchedBorder(), "Dades del pacient", 
        TitledBorder.LEFT, TitledBorder.TOP,null,
        Color.BLACK));
        
        //Creem el camp de text);
        JTextField txtOut = new JTextField("");
        txtOut.setEditable(false);
        txtOut.setBorder(new EmptyBorder(0,0,350,0));
        txtOut.setBackground(Color.white);
        /*
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                txtOut.setText("El nom de l'usuari és "+txtNombres.getText()+
                        " "+txtApellidos.getText()+". Te "+edad.getSelectedItem()+" anys.");
            }
        });
        */
        
        
        JSplitPane mainPanel 
                = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, 
                        cuestionari, txtOut);
        mainPanel.setDividerSize(0);
        mainPanel.setDividerLocation(470);
        mainPanel.setEnabled(false);
        getContentPane().add(mainPanel);
    }
}