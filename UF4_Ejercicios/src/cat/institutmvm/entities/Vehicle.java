/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.entities;

/**
 *
 * @author alumne_1r
 */
public abstract class Vehicle {
    private String terreno, metode_moviment;
    private int peso_kg;

    public Vehicle(String terreno, String metode_moviment, int peso_kg) {
        this.setTerreno(terreno);
        this.setMetode_moviment(metode_moviment);
        this.setPeso_kg(peso_kg);
    }
    
    //<editor-fold defaultstate="collapsed" desc="setter">
    public String getTerreno() {
        return terreno;
    }

    public String getMetode_moviment() {
        return metode_moviment;
    }

    public int getPeso_kg() {
        return peso_kg;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="getter">
    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public void setMetode_moviment(String metode_moviment) {
        this.metode_moviment = metode_moviment;
    }

    public void setPeso_kg(int peso_kg) {
        this.peso_kg = peso_kg;
    }
//</editor-fold>

    
}
