/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.entities;

public class Vol {
    private String desti, hora_arrivada, hora_sortida, id_vol;

    public String getDesti() {
       return desti;
    }

    public void setDesti(String desti) {
       this.desti = desti;
    }

    public String getHoraArrivada() {
       return hora_arrivada;
    }

    public void setHoraArrivada(String hora_arrivada) {
       this.hora_arrivada = hora_arrivada;
    }
    
    public String getHoraSortida() {
       return hora_sortida;
    }

    public void setHoraSortida(String hora_sortida) {
       this.hora_sortida = hora_sortida;
    }
    
    public String getIdVol() {
       return id_vol;
    }

    public void setIdVol(String id_vol) {
       this.id_vol = id_vol;
    }

    public String getFullVol(){
       StringBuffer sb = new StringBuffer();
       sb.append(this.getDesti());
       sb.append(" ");
       sb.append(this.getHoraArrivada());
       sb.append(" ");
       sb.append(this.getHoraSortida());
       sb.append(" ");
       sb.append(this.getIdVol());
       return sb.toString();
    }
}
