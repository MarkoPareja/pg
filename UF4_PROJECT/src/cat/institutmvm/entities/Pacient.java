/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.entities;

/**
 * La clase Pacient es una case para gestionar los datos de el paciente.
 * @author marko
 */
public class Pacient {
    private String dni, nom, cognom, tsi, motiu;
    /**
     * 
     * @param dni
     * @param nom
     * @param cognom
     * @param tsi
     * @param motiu 
     */
    public Pacient(String dni, String nom, String cognom, String tsi, String motiu) {
        this.setDni(dni);
        this.setMotiu(motiu);
        this.setNom(nom);
        this.setCognom(cognom);
        this.setTsi(tsi);
    }
    
//<editor-fold defaultstate="collapsed" desc="getter">
     public String getDni() {
        return dni;
    }
    
     public String getNom() {
        return nom;
    }
     
     public String getCognom() {
        return cognom;
    }
     
     public String getTsi() {
        return tsi;
    }
     
     public String getMotiu() {
        return motiu;
    }
//</editor-fold>
   
//<editor-fold defaultstate="collapsed" desc="setter">
     public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public void setTsi(String tsi) {
        this.tsi = tsi;
    }

    public void setMotiu(String motiu) {
        this.motiu = motiu;
    }
//</editor-fold>
    
    
    
}
