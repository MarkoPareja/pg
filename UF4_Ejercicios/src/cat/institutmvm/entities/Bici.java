/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.entities;

/**
 *
 * @author alumne_1r
 */
public class Bici {
    private String color, alçada, pes;

    public String getColor() {
       return color;
    }

    public void setColor(String color) {
       this.color = color;
    }

    public String getPes() {
       return pes;
    }

    public void setPes(String pes) {
       this.pes = pes;
    }
    
    public String getAlçada() {
       return alçada;
    }

    public void setAlçada(String alçada) {
       this.alçada = alçada;
    }

    public String getFullBici(){
       StringBuffer sb = new StringBuffer();
       sb.append(this.getColor());
       sb.append(" ");
       sb.append(this.getPes());
       sb.append(" ");
       sb.append(this.getAlçada());
       return sb.toString();
    }
}
