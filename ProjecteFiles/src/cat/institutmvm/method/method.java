/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.method;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author alumne_1r
 */
public class method {
    public String leerTabla(String fileName){
        int contadorColumnas = 0;
        String line = "";
        String cvsSplitBy = ",";
        System.out.print("");
        try ( BufferedReader br = new BufferedReader(new FileReader("files/" + fileName))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                if (contadorColumnas == 0) {
                    // Imprime la cabecera de la tabla
                    System.out.format("%-20s%-20s%-20s%-20s%-20s\n", data[0], data[1], data[2], data[3], data[4]);
                    // Cambia los números (4) por la cantidad de columnas que tenga tu archivo CSV
                } else {
                    // Imprime los datos de cada fila
                    System.out.format("%-20s%-20s%-20s%-20s%-20s\n", data[0], data[1], data[2], data[3], data[4]);
                }
                contadorColumnas++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }

    public String comprovarExtensio(String fileName) {
        if (!fileName.endsWith(".txt")) {
            fileName = fileName + ".txt";
        }
        return fileName;
    }
    
    public void sobreescribirTabla(String sb, String fileName){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("files/"+fileName, true));
            bw.newLine();
            bw.write(sb);
            bw.close();
        } catch (IOException ex) {
            System.out.println("An error occurred : ");
            ex.printStackTrace();
        } finally{
            System.out.println("El fitxer s'ha creat correctament.");
        }
    }
    
    public void escribirTabla(String sb, String fileName){
        try{
            FileWriter fw = new FileWriter("files/" + fileName);
            fw.write(sb + "\n");
            fw.close();
        } catch (IOException ex) {
            System.out.println("An error occurred : ");
            ex.printStackTrace();
        } finally {
            System.out.println("El fitxer s'ha creat correctament.");
        }
    }
    
    public int registres(String fileName){
        int contadorLineas = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("files/"+fileName))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contadorLineas++;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }

        return contadorLineas;
    }


}
