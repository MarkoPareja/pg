/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.entities;

public class Carta {
    private String color, tipe;
    int number;

    public String getColor() {
       return color;
    }

    public void setColor(String color) {
       this.color = color;
    }

    public String getTipe() {
       return tipe;
    }

    public void setTipe(String tipe) {
       this.tipe = tipe;
    }
    
    public int getNumber() {
       return number;
    }

    public void setNumber(int number) {
       this.number = number;
    }

    public String getFullCard(){
       StringBuffer sb = new StringBuffer();
       sb.append(this.getColor());
       sb.append(" ");
       sb.append(this.getTipe());
       sb.append(" ");
       sb.append(this.getNumber());
       return sb.toString();
    }

}
