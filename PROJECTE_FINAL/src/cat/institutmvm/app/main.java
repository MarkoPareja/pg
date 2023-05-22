/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm.app;

import cat.institutmvm.buisness.entities.Pacient;
import cat.institutmvm.persistence.utils.JDBCUtils;
import cat.institutmvm.ui.MyFrame;
import javax.swing.JFrame;

public class main {
    public static void main(String[] args) {
        MyFrame efrm = new MyFrame();
        efrm.setVisible(true);
        efrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
