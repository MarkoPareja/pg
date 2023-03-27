/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.entities;

import java.util.Random;

/**
 *
 * @author alumne_1r
 */
public class Coche extends Turismo{

    public Coche(String model, String marca, String color, String terreno, String metode_moviment, int peso_kg, int diametreRoda, int suportPes) {
        super(model, marca, color, terreno, metode_moviment, peso_kg, diametreRoda, suportPes);
    }
    
    
    @Override
    public void printInformation() {
        System.out.println("Diametre roda: " + this.getDiametreRoda() + "\nPes que suporta: " + this.getSuportPes());
    }

    @Override
    public String identificador() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        StringBuilder identificador = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            identificador.append(letras.charAt(random.nextInt(letras.length())));
        }

        for (int i = 0; i < 4; i++) {
            identificador.append(numeros.charAt(random.nextInt(numeros.length())));
        }

        return ("Matricula: " + identificador.toString());
    }
    
    
    
}
