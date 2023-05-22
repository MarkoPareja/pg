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
        var efrm = new MyFrame();
        efrm.setVisible(true);
        efrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
        ColorJDBCDAO colorDAO = new ColorJDBCDAO();
        
        try {
            Color c = colorDAO.getColorById(5);
            if (c != null) {
                System.out.println(c.toString());
            }            
        } catch (DAOException ex) {
            System.out.printf("Error:: %s %n", ex.getMessage());
        }
        
        EmployeeJDBCDAO emplDAO = new EmployeeJDBCDAO();
        
        try {
            Employee e = emplDAO.getEmployeeById("E001");
            if (e != null) {
                System.out.println(e.toString());
            }            
        } catch (DAOException ex) {
            System.out.printf("Error:: %s %n", ex.getMessage());
        }
        
        CompanyJDBCDAO compDAO = new CompanyJDBCDAO();
        
        try {
            Company comp = compDAO.getCompanyById("C001");
            if (comp != null) {
                System.out.println(comp.toString());
            }            
        } catch (DAOException ex) {
            System.out.printf("Error:: %s %n", ex.getMessage());
        }
        */
    }
}
