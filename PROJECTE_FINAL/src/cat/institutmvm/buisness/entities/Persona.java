/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.buisness.entities;

import java.time.LocalDate;

/**
 *
 * @author marko
 */
public class Persona {
    private String dni, nom, cognoms, genere;
    private LocalDate dataNaixement;

    /**
     * 
     * @param dni
     * @param nom
     * @param cognoms
     * @param dataNaixement
     * @param genere 
     */
    public Persona(String dni, String nom, String cognoms, LocalDate dataNaixement, String genere) {
        this.setDni(dni);
        this.setNom(nom);
        this.setCognoms(cognoms);
        this.setDataNaixement(dataNaixement);
        this.setGenere(genere);
    }
    
    public Persona(){}
    
    //<editor-fold defaultstate="collapsed" desc="getter">
    /**
     * 
     * @return dni
     */
    public String getDni() {
        return dni;
    }
    
    /**
     * 
     * @return nom
     */
    public String getNom() {
        return nom;
    }
    
    /**
     * 
     * @return cognoms
     */
    public String getCognoms() {
        return cognoms;
    }
    
    /**
     * 
     * @return dataNaixement
     */
    public LocalDate getDataNaixement() {
        return dataNaixement;
    }
    
    /**
     * 
     * @return genere
     */
    public String getGenere() {
        return genere;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="setter">
    /**
     * 
     * @param dni 
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    /**
     * 
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     * 
     * @param cognoms 
     */
    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    /**
     * 
     * @param dataNaixement 
     */
    public void setDataNaixement(LocalDate dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    /**
     * 
     * @param genere 
     */
    public void setGenere(String genere) {
        this.genere = genere;
    }
//</editor-fold>

    
    
    
}
