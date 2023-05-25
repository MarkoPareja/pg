/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

import cat.institutmvm.MyEventFrame;
import cat.institutmvm.MyFrame;
import cat.institutmvm.MyGrid;
import javax.swing.JFrame;

public class Application {
    public static void main(String[] args) {
        //no és correcte, perquè la finestra no es pot tancar i queda executant-se
        /*
        JFrame window;
        window = new JFrame();
        window.setBounds(0, 0, 300, 400);
        window.setTitle("Primera Finestra en Java");
        window.setVisible(true);
        */

        //var frm = new MyFrame();
        
        //var efrm = new MyEventFrame();
        
        //var efrm = new MyForm();
        
        var efrg = new MyGrid();
    }  
}