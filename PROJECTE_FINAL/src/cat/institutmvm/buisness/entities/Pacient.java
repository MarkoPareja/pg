/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.buisness.entities;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author marko
 */
public class Pacient extends Persona {
    private String tsi;

    public Pacient(String tsi, String dni, String nom, String cognoms, LocalDate dataNaixement, String genere) {
        super(dni, nom, cognoms, dataNaixement, genere);
        this.setTsi(tsi);
    }

    public String getTsi() {
        return tsi;
    }

    public void setTsi(String tsi) {
        this.tsi = tsi;
    }
    
    public int getAge(){
        return Period.between(this.getDataNaixement(), LocalDate.now()).getYears();
    }

    public String toString(int age) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
