/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

public class Metodes14 {
    private static final String MSG_1 = "Introdueix un nombre";
    
    public static void main(String[] args) {
      ListaMetodos method = new ListaMetodos();
      
      int num1;
      
      num1 = method.valorCorrecte();   
      method.randomSearch(num1);
    }
}
