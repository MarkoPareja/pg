/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.entities;

/**
 *
 * @author alumne_1r
 */
public abstract class Turismo extends WheeledVehicle{
    private String model, marca, color;
    
    public Turismo(String model, String marca, String color, String terreno, String metode_moviment, int peso_kg, int diametreRoda, int suportPes) {
        super(terreno, metode_moviment, peso_kg, diametreRoda, suportPes);
        this.setModel(model);
        this.setMarca(marca);
        this.setColor(color);
    }
    
    //<editor-fold defaultstate="collapsed" desc="setter">
    
    public void setModel(String model) {
        this.model = model;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="getter">
    public String getModel() {
        return model;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }
//</editor-fold>

    
    
}
