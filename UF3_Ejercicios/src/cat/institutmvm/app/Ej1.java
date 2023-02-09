package cat.institutmvm.app;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ej1 {
    public static void main(String[] args) {
        int i;
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
    }
}