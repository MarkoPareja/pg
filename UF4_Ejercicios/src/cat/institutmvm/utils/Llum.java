/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.utils;

public class Llum {
    private String tamany, pes, forma;

    public String getTamany() {
       return tamany;
    }

    public void setTamany(String tamany) {
       this.tamany = tamany;
    }

    public String getPes() {
       return pes;
    }

    public void setPes(String pes) {
       this.pes = pes;
    }
    
    public String getForma() {
       return forma;
    }

    public void setForma(String forma) {
       this.forma = forma;
    }

    public String getFullLlum(){
       StringBuffer sb = new StringBuffer();
       sb.append(this.getTamany());
       sb.append(" ");
       sb.append(this.getPes());
       sb.append(" ");
       sb.append(this.getForma());
       return sb.toString();
    }
}
