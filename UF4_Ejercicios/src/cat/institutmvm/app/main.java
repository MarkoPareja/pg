/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm.app;
import cat.institutmvm.entities.Bici;
import cat.institutmvm.entities.Person;
import cat.institutmvm.entities.Carta;
import cat.institutmvm.entities.Llum;
import cat.institutmvm.entities.Vol;

public class main {

    public static void main(String[] args) {
        //Ejercicio2
        Person alejandro = new Person();
        alejandro.setName("Alejandro");
        alejandro.setSurname("Dopico");
        System.out.println(alejandro.getFullName());
        //Ejercicio3
        Carta poker = new Carta();
        poker.setColor("roja");
        poker.setTipe("diamantes");
        poker.setNumber(4);
        System.out.println(poker.getFullCard());
        
        Llum llum = new Llum();
        llum.setForma("rodona");
        llum.setPes("700g");
        llum.setTamany("70cm");
        System.out.println(llum.getFullLlum());
        
        Vol vol = new Vol();
        vol.setDesti("Madrid");
        vol.setHoraArrivada("15:30");
        vol.setHoraSortida("14:30");
        vol.setIdVol("ART0032");
        System.out.println(vol.getFullVol());
        //Ejercicio4
        Bici bici = new Bici();
        bici.setColor("roja");
        bici.setAlçada("1.2m");
        bici.setPes("3kg");
        System.out.println(bici.getFullBici());
    }
    
}
