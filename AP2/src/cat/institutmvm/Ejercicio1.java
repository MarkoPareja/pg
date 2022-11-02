/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ap2;

public class Ejercicio1 {

    private static final String MSG_1 = "Nombre: ";
    private static final String MSG_2 = "Nombre y apellidos: ";
    private static final String MSG_3 = "Apellidos: ";
    private static final String MSG_4 = "* * * * * * * * * *";
    private static final Integer MAX = 10;

    public static void main(String[] args) {
        int i;
        String nombre = "Marko", apellidos = "Pareja Bailén", ast = "* ";
        
        System.out.println(MSG_1 + nombre);
        System.out.println(MSG_2 + nombre + " " + apellidos);
        System.out.println(MSG_1 + nombre);
        System.out.println(MSG_3 + apellidos);

        System.out.println(" ");

        for (i = 0; i < MAX; i++) {
            System.out.println(MSG_4);
        }

        System.out.println(" ");

        for (i = 0; i < MAX; i++) {
            System.out.println(ast);
            ast = ast + "* ";
        }
    }

}