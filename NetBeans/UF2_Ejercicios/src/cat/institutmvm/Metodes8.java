/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm;

/**
 *
 * @author alumne_1r
 */
import java.util.Scanner;
import java.lang.Math;

public class Metodes8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 

    System.out.print("Introduce la base: "); 
    double base = scanner.nextDouble(); 

    System.out.print("Introduce un exponente: "); 
    double exp = scanner.nextDouble();
    double num = Math.pow(base, exp); 

    System.out.println("El resultado es: " + num); 
  }
}
