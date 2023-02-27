/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm.app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import cat.institutmvm.method.method;
import java.nio.file.Files;
import java.nio.file.Paths;

public class main {
    private static final String MENU = "Escull una opció:\nA. Veure articles\nB. Enregistrar un nou article\nC. Mostrar total d'articles\nD. Sortir";
    private static final String MSG_1 = "Quina opció vols?: ";
    private static final String MSG_2 = "Indica el nom del document: ";
    private static final String MSG_3 = "La llista d'articles és la seguent:";
    private static final String MSG_4 = "Codi article: ";
    
    
    public static void main(String[] args) {
        int rowCounter = 0;
        String opcio = "";
        String line = "";
        String cvsSplitBy = ",";
        Scanner sc = new Scanner(System.in);
        method method = new method();
        
        System.out.println(MENU);
        
        System.out.print("\n"+MSG_1);
        opcio = sc.next();
        
        
        
        switch(opcio){
            case "A" :
                System.out.print("\n"+MSG_2);
                sc.nextLine();
                String fileName = sc.nextLine();
                if (!fileName.endsWith(".txt")) {
                    fileName = fileName + ".txt";
                }
                System.out.println("");
                try (BufferedReader br = new BufferedReader(new FileReader("files/" + fileName))) {            
                    while ((line = br.readLine()) != null) {
                        String[] data = line.split(cvsSplitBy);
                        if (rowCounter == 0) {
                            // Imprime la cabecera de la tabla
                            System.out.format("%-20s%-20s%-20s%-20s%-20s\n", data[0], data[1], data[2], data[3], data[4]);
                            // Cambia los números (4) por la cantidad de columnas que tenga tu archivo CSV
                        } else {
                            // Imprime los datos de cada fila
                            System.out.format("%-20s%-20s%-20s%-20s%-20s\n", data[0], data[1], data[2], data[3], data[4]);
                        }
                        rowCounter++;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } 
            case "B" :
                
            default :
                System.out.println("Error");
                break;
        }

        
    }
    
}
