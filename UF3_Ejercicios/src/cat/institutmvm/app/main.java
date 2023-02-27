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
    public static final String ANSI_PURPLE = "\033[0;34m";
    public static final String ANSI_RESET = "\033[0;30m";
    public static final String msgMenu = ANSI_PURPLE + "-----------------------------------------\n" + ANSI_PURPLE + "-------------------" + ANSI_RESET + "MENU" + ANSI_PURPLE + "------------------\n" + "-----" + ANSI_RESET + "1 -> Llegir fitxer" + ANSI_PURPLE + "------------------\n" + "-----" + ANSI_RESET + "2 -> Guardar text en fitxer" + ANSI_PURPLE + "---------\n" + "-----" + ANSI_RESET + "3 -> Afegir text en fitxer" + ANSI_PURPLE + "----------\n" + "-----" + ANSI_RESET + "4 -> Comptar longitud del document" + ANSI_PURPLE + "--\n" + ANSI_PURPLE + "-----------------------------------------" + ANSI_RESET;

    public static void main(String[] args) throws IOException {
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
 /*
        int option = 0;
        String fileName = "";
        String textName = "";
        boolean exit = false;
        System.out.println(msgMenu);

        Scanner sc = new Scanner(System.in);
        do {
            option = method.valorCorrecte(sc, "\nOpción: ");
            exit = method.valida(option, 4, 1, "Error");
        } while (!exit);

        if (option == 1) {
            System.out.print(MSG_1);
            fileName = sc.next();
            fileName = method.sufix(fileName);
        } else if (option == 2) {
            System.out.print(MSG_4);
            sc.nextLine();
            textName = sc.nextLine();
            System.out.print("\n" + MSG_1);
            fileName = sc.next();
            fileName = method.sufix(fileName);
        } else if (option == 3) {
            System.out.print(MSG_4);
            sc.nextLine();
            textName = sc.nextLine();
            System.out.print("\n" + MSG_1);
            fileName = sc.next();
            fileName = method.sufix(fileName);
        } else if (option == 4) {
            System.out.print(MSG_1);
            fileName = sc.next();
            fileName = method.sufix(fileName);
        }

        switch (option) {

            case 1:
                method.llegir(fileName);
                break;
            case 2:
                method.escriureNou(fileName, textName);
                break;
            case 3:
                method.afegirText(fileName, textName);
                break;
            case 4:
                method.contarChar(fileName);
                break;
            default:;
                System.out.println("Error");
                break;
        }
        sc.close();
         */
 /*Ejercicio8*/
 /*
        String fileName = "";
        String textName = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.print(MSG_4);
        textName = sc.nextLine();
        System.out.print("\n" + MSG_1);
        fileName = sc.next();
        fileName = method.sufix(fileName);
        
        //FILE WRITER
        try{
            FileWriter fw = new FileWriter("files/" + fileName);
            fw.write(textName);
            fw.close();
        } catch (IOException ex) {
            System.out.println("An error occurred : ");
            ex.printStackTrace();
        } finally {
            System.out.println("El fitxer s'ha creat correctament.\n");
        }
        
        System.out.print(MSG_4);
        sc.nextLine();
        textName = sc.nextLine();
        System.out.print("\n" + MSG_1);
        fileName = sc.next();
        fileName = method.sufix(fileName);
        
        //BUFFERED WRITER
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("files/" + fileName));
            bw.write(textName);
            bw.close();
        } catch (IOException ex) {
            System.out.println("An error occurred : ");
            ex.printStackTrace();
        }finally {
            System.out.println("El fitxer s'ha creat correctament.\n");    
        }
        
        System.out.print(MSG_4);
        sc.nextLine();
        textName = sc.nextLine();
        System.out.print("\n" + MSG_1);
        fileName = sc.next();
        fileName = method.sufix(fileName);
        
        //BUFFERED WRITER NEW LINE
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("files/" + fileName, true));
            bw.newLine();
            bw.write(textName);
            bw.close();
        } catch (IOException ex) {
            System.out.println("An error occurred : ");
            ex.printStackTrace();
        }finally {
            System.out.println("S'ha afegit el text correctament.");    
        }
         */
 /*Ejercicio9*/
        //No lo pides en ningun sitio, pero lo tengo hecho en otro documento
        /*Ejercicio10*/
 /*
        String csvFile = "ruta_del_archivo.csv";
        String line = "";
        String cvsSplitBy = ",";
        int rowCounter = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("files/dades.csv"))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                if (rowCounter == 0) {
                    // Imprime la cabecera de la tabla
                    System.out.format("%-20s%-20s%-20s%-20s\n", data[0], data[1], data[2], data[3]);
                    // Cambia los números (4) por la cantidad de columnas que tenga tu archivo CSV
                } else {
                    // Imprime los datos de cada fila
                    System.out.format("%-20s%-20s%-20s%-20s\n", data[0], data[1], data[2], data[3]);
                }
                rowCounter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
         */
    }
}
