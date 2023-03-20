/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cat.institutmvm.ui;
import cat.institutmvm.entities.Bici;
import cat.institutmvm.entities.Person;
import cat.institutmvm.entities.Carta;
import cat.institutmvm.entities.Cat;
import cat.institutmvm.entities.Cat1;
import cat.institutmvm.entities.Llum;
import cat.institutmvm.entities.Vol;
import cat.institutmvm.entities.Animal;

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
        bici.setAlcada("1.2m");
        bici.setPes("3kg");
        System.out.println(bici.getFullBici());
        //Ejercicio5
        Cat cat = new Cat("Marina", "5", "Regular", "Fodder");
        cat.meow();
        cat.play();
        cat.wash();
        cat.eat();
        cat.hunt();
        System.out.println(cat.getFullCat());
        //Ejercicio6
        /**
         * Esto es el constructor del objeto Cat, dentro tenemos varios estados
         * como nombre, edad, etc.
         * @param Cat
         * @return sb.toString()
         * @author main
         */
        //Ejercicio7
        Cat1 cat1 = new Cat1(true, true, false, "Logan", 12, "Regular", "Fodder");      
        System.out.println(cat1.getFullAnimal());
        cat1.meow();
        cat1.play();
        cat1.wash();
        cat1.eat();
        cat1.hunt();
        //Ejercicio8
        
    }
    
}
