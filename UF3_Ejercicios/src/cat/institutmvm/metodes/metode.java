/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.metodes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alumne_1r
 */
public class metode {
    
    public int valida(int num, int min, int max){
        return (num<min || num>max)? 0 : num;
    }  
    
    public int valorCorrecte(Scanner sc, String MSG_1) {
        boolean valorCorrecte;
        int num = 0;
        System.out.print(MSG_1);
        valorCorrecte = sc.hasNextInt();
        if (valorCorrecte) {
            num = sc.nextInt();
        }
        else{
            sc.next();
        }
        return num;
    }

    public boolean valida(int num1, int MAX, int MIN, String MSG_1) {
        boolean exit;
        if (num1 <= MAX && num1 >= MIN) {
            return exit = true;
        } else {
            System.out.println(MSG_1);
            return exit = false;
        }
    }
    
    public String sufix(String fileName){
        if (!fileName.endsWith(".txt")) {
            fileName = fileName + ".txt";
        }
        return fileName;
    }
    
    public void llegir(String fileName){
        int i = 0;
        try (FileReader fr = new FileReader("files/" + fileName)) {
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
    }
    
    public void escriureNou(String fileName, String textName){
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
    }
    
    public void afegirText(String fileName, String textName){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("files/" + fileName, true));
            bw.newLine();
            bw.write(textName);
            bw.close();
        } catch (IOException ex) {
            System.out.println("An error occurred : ");
            ex.printStackTrace();
        }
    }
    
    public void contarChar(String fileName){
        int cont = 0;
        try{      
            File file = new File("files/" + fileName);
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
    }
    
    

}