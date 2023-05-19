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
public class Persona {
    private String dni, nom, cognoms, dataNaixement, genere;

    public Persona(String dni, String nom, String cognoms, String dataNaixement, String genere) {
        this.setDni(dni);
        this.setNom(nom);
        this.setCognoms(cognoms);
        this.setDataNaixement(dataNaixement);
        this.setGenere(genere);
    }
    
    //<editor-fold defaultstate="collapsed" desc="getter">
    public String getDni() {
        return dni;
    }
    
    public String getNom() {
        return nom;
    }
    
    public String getCognoms() {
        return cognoms;
    }
    
    public String getDataNaixement() {
        return dataNaixement;
    }
    
    public String getGenere() {
        return genere;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="setter">
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public void setDataNaixement(String dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
//</editor-fold>

    
    
    
}
