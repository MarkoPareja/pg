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
import java.nio.file.Files;
import java.nio.file.Paths;

public class main {

    private static final String MSG_1 = "Introduce el nombre del documento: ";
    private static final String MSG_2 = "Ha ocurrido un error";
    private static final String MSG_3 = "No se encontro el archivo";
    private static final String MSG_4 = "Indroduce el texto que deseas guardar: ";
    private static final String MSG_MENU = "-----------------------------------------\n" + "-------------------MENU------------------\n" + "-----1 -> Llegir fitxer------------------\n" + "-----2 -> Guardar text en fitxer---------\n" + "-----3 -> Afegir text en fitxer----------\n" + "-----4 -> Comptar longitud del document--\n" + "-----------------------------------------";

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
 /*Ejercicio4*/
 /*
        try {
            File file = new File("files/document.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("An error occurred : ");
            e.printStackTrace();
        }
        

        try {
            File file = new File("files/document.txt");
            BufferedReader reader = new BufferedReader(new FileReader("files/document.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred : ");
            e.printStackTrace();
        }
        
        
        try (FileReader fr = new FileReader("files/document.txt")) {
            while((i = fr.read()) != -1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException fe){
            System.out.println("An error occurred : ");
            fe.printStackTrace();
        } catch (IOException ioex) {
            System.out.println("An error occurred : ");
            ioex.printStackTrace();
        }
        
        
        try {
            String content = new String(Files.readAllBytes(Paths.get("files/document.txt")));
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("An error occurred : ");
            e.printStackTrace();
        }
         */

 /*Ejercicio5*/
 /*
        Scanner sc = new Scanner(System.in);
        System.out.print(MSG_4);
        String textName = sc.nextLine();
        System.out.print(MSG_1);
        String fileName = sc.nextLine();

        if (!fileName.endsWith(".txt")) {
            fileName += ".txt";
        }
 
        try{
            FileWriter fw = new FileWriter("files/" + fileName);
            fw.write(textName);
            fw.close();
        } catch (IOException ex) {
            System.out.println("An error occurred : ");
            ex.printStackTrace();
        } finally {
            System.out.println("El fitxer s'ha creat correctament.");
        }
         */
 /*Ejercicio6*/
 /*
        Scanner sc = new Scanner(System.in);
        System.out.print(MSG_4);
        String textName = sc.nextLine();
        System.out.print(MSG_1);
        String fileName = sc.nextLine();

        if (!fileName.endsWith(".txt")) {
            fileName += ".txt";
        }
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("files/" + fileName, true));
            bw.write(textName);
            bw.newLine();
            bw.close();
        } catch (IOException ex) {
            System.out.println("An error occurred : ");
            ex.printStackTrace();
        }
         */
 /*Ejercicio7*/
        int option = 0;
        String fileName = "";
        String textName = "";
        boolean exit = false;
        System.out.println(MSG_MENU);

        Scanner sc = new Scanner(System.in);
        /*do {
            option = method.valorCorrecte(sc, "\nOpción: ");
            exit = method.valida(option, 4, 1, "Error");
        } while (!exit);
        */
        
        do{
            System.out.print("\nOpció: ");
            option = method.valida(sc.nextInt(), 1, 4);
        }while(option<1 || option>4);
        
        switch (option) {

            case 1:
                System.out.print(MSG_1);
                fileName = sc.next();
                
                fileName = method.sufix(fileName);
                method.llegir(fileName);
                break;
            case 2:
                System.out.print(MSG_4);
                if(sc.hasNextLine()){
                    textName = sc.nextLine();
                }
                else{
                    System.out.println("error");
                    sc.next();
                }                /*
                System.out.print("\n"+MSG_1);
                fileName = sc.next();
                
                fileName = method.sufix(fileName);
                
                method.escriureNou(fileName, textName); */ 
                break;
            case 3:

                break;
            case 4:

                break;
            default:;
                System.out.println("Error");
                break;
        }
        sc.close();
    }
}
