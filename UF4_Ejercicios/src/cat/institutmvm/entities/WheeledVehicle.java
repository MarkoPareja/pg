/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.entities;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alumne_1r
 */
public abstract class WheeledVehicle extends Vehicle{
    private int diametreRoda, suportPes;

    public WheeledVehicle(String terreno, String metode_moviment, int peso_kg, int diametreRoda, int suportPes) {
        super(terreno, metode_moviment, peso_kg);
        this.setDiametreRoda(diametreRoda);
        this.setSuportPes(suportPes);
    }
    
    public abstract String printInformation();
    
    //<editor-fold defaultstate="collapsed" desc="setter">
    public void setDiametreRoda(int diametreRoda) {
        this.diametreRoda = diametreRoda;
    }

    public void setSuportPes(int suportPes) {
        this.suportPes = suportPes;
    }
    
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="getter">
    public int getDiametreRoda() {
        return diametreRoda;
    }
    
    public int getSuportPes() {
        return suportPes;
    }
    
//</editor-fold>     

    
    
}
