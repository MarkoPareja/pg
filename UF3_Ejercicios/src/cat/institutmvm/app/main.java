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
import cat.institutmvm.metodes.metode;

public class main {
    private static final String MSG_1 = "Introduce el nombre del documento: ";
    private static final String MSG_2 = "Ha ocurrido un error";
    private static final String MSG_3 = "No se encontro el archivo";
    
    
    
    public static void main(String[] args) {
        int i;
        metode method = new metode();
        
        /*Ejercicio1*/
        /*
        Scanner sc = new Scanner(System.in);
        try (FileReader fr = new FileReader("files/document.txt")) {
            while ((i = fr.read()) != -1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException fe) {
            System.out .println("An error occurred : ");
            fe.printStackTrace();
        } catch (IOException ioex) {
            System.out .println("An error occurred : ");
            ioex.printStackTrace();
        }
        */
        
        /*Ejercicio2*/
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print(MSG_1);
        String fileName = sc.nextLine();

        if (!fileName.endsWith(".txt")) {
            fileName = fileName + ".txt";
        }

        File file = new File("files/" + fileName);
        try (Scanner fileInput = new Scanner(file)) {
            while (fileInput.hasNextLine()) {
                System.out.println(fileInput.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(MSG_3 + " " + fileName);
        }
        */
        
        /*Ejercicio3*/
        /*
        int cont = 0;
        try{      
            File file = new File("files/file_ej3.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()){
                String datos = sc.nextLine();
                cont += datos.length();
            }
            System.out.println(cont + " caracters");   
        }catch(FileNotFoundException e){
            System.out.println("An error occurred : ");
            e.printStackTrace();
        }
        */
    }
}