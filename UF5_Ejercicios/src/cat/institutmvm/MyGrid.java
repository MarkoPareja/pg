/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alumne_1r
 */
public class MyGrid extends JFrame{
    public MyGrid(){
          Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension screenSize = screen.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 2, screenHeight / 2);
        setLocation(screenWidth / 4, screenHeight / 4);
        this.setMinimumSize(new Dimension (250, 100) );

        String[] columnNames = {"Nom", "Cognoms", "Edat", "Salari", "Comercial"};
        Object[][] datos = {
            {"Juan", "Guarzillo", 25, 9342, true},
            {"Sonia", "Trillao", 45, 5453, false},
            {"Pedro", "Loquillo", 43, 4345, false},
            {"Marc", "Planget", 32, 10532, true},
            {"Pere", "Trusquillo", 21, 5532, false}};

        DefaultTableModel dtm = new DefaultTableModel(datos, columnNames);

        JPanel grid = new JPanel();
        final JTable table = new JTable(dtm);
        grid.add(table);
        
        // Modificar celda especifica
        table.getTableHeader().setReorderingAllowed(false);
        table.setEnabled(false);
        table.setDragEnabled(rootPaneCheckingEnabled);
        table.setPreferredScrollableViewportSize(new Dimension(250, 100));
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }         
        });
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
}
