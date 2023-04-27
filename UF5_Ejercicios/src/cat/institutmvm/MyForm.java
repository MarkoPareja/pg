/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

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
import javax.swing.JComboBox;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author alumne_1r
 */
public class MyForm extends JFrame{
       private JLabel labelSubtitulo,labelNombres,labelApellidos, labelEdat;
       private JTextField txtNombres,txtApellidos;
       private JButton btnGuardar;
       public MyForm(){
           //<editor-fold desc="Centrar frame">
        Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension screenSize = screen.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 2, screenHeight / 2);
        setLocation(screenWidth / 4, screenHeight / 4);
        this.setResizable(false);
        //</editor-fold>
        
        
        this.setTitle("Formulari");
        JPanel cuestionari = new JPanel();
        JPanel cuestionariNom = new JPanel();
        JPanel cuestionariCognom = new JPanel();
        JPanel cuestionariEdat = new JPanel();
        JPanel cuestionariNomtxt = new JPanel();
        JPanel cuestionariCognomtxt = new JPanel();
        JPanel cuestionariEdattxt = new JPanel();
        JPanel cuestionariBoton = new JPanel();
        
        
        labelNombres = new JLabel("Nom:");
       
        txtNombres = new JTextField(20);
       
        labelApellidos = new JLabel("Cognom:");
       
        txtApellidos = new  JTextField(20);
        add(txtApellidos);
        
        /*----------Desplegable---------*/
        labelEdat = new JLabel("Edat: ");
        JComboBox edad = new JComboBox();
        for(int i = 0; i <= 100; i++){
            edad.addItem(i);
        }
        
        cuestionariNom.add(labelNombres);
        cuestionariNomtxt.add(txtNombres);
        cuestionariCognom.add(labelApellidos);
        cuestionariCognomtxt.add(txtApellidos);
        cuestionariEdat.add(labelEdat);
        cuestionariEdattxt.add(edad);
        cuestionari.add(cuestionariNom);
        cuestionari.add(cuestionariNomtxt);
        cuestionari.add(cuestionariCognom);
        cuestionari.add(cuestionariCognomtxt);
        cuestionari.add(cuestionariEdat);
        cuestionari.add(cuestionariEdattxt);
        cuestionariNom.setBorder(new EmptyBorder(30, 0, 0, 180));
        cuestionariNomtxt.setBorder(new EmptyBorder(0, 60, 0, 60));
        cuestionariCognom.setBorder(new EmptyBorder(30, 0, 0, 160));
        cuestionariCognomtxt.setBorder(new EmptyBorder(0, 60, 0, 60));
        cuestionariEdat.setBorder(new EmptyBorder(30, 0, 0, 180));
        cuestionariEdattxt.setBorder(new EmptyBorder(0, 55, 0, 230));
        cuestionari.setBackground(Color.white);
        cuestionariNom.setBackground(Color.white);
        cuestionariCognom.setBackground(Color.white);
        cuestionariNomtxt.setBackground(Color.white);
        cuestionariCognomtxt.setBackground(Color.white);
        cuestionariEdat.setBackground(Color.white);
        cuestionariEdattxt.setBackground(Color.white);
        
        /*---------- Botones ----------*/
       
        btnGuardar = new JButton("Afegir");
        cuestionariBoton.add(btnGuardar);
        cuestionari.add(cuestionariBoton);
        cuestionariBoton.setBorder(new EmptyBorder(20,0,0,160));
        cuestionariBoton.setBackground(Color.white);
        
        //Creem el camp de text
        JTextField txtOut = new JTextField("");
        txtOut.setEditable(false);
        txtOut.setBorder(new EmptyBorder(0,0,350,0));
        txtOut.setBackground(Color.white);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                txtOut.setText("El nom de l'usuari és "+txtNombres.getText()+" "+txtApellidos.getText()+". Te "+edad.getSelectedItem()+" anys.");
            }
        });
        
        
        
        JSplitPane mainPanel 
                = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, cuestionari, txtOut);
        mainPanel.setDividerSize(0);
        mainPanel.setDividerLocation(320);
        mainPanel.setEnabled(false);
        getContentPane().add(mainPanel);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
