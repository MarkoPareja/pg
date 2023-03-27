/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.entities;

/**
 *
 * @author alumne_1r
 */
public class Bicicleta extends WheeledVehicle{

    public Bicicleta(String terreno, String metode_moviment, int peso_kg, int diametreRoda, int suportPes) {
        super(terreno, metode_moviment, peso_kg, diametreRoda, suportPes);
    }

    @Override
    public void printInformation() {
        System.out.println("Diametre roda: " + this.getDiametreRoda() + "\nPes que suporta: " + this.getSuportPes());
    }
    
}
