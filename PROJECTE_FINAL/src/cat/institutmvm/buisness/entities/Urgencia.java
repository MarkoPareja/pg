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
public class Urgencia implements Visita {
    private String dni, motiu;
    private int torn, nivell;
    private LocalDate data;

    
    public Urgencia(String dni, String motiu, int torn, int nivell, LocalDate data) {
        this.setDni(dni);
        this.setMotiu(motiu);
        this.setTorn(torn);
        this.setNivell(nivell);
        this.setData(data);
    }
    
    public Urgencia(){}
    
    //<editor-fold defaultstate="collapsed" desc="getter">
    public String getDni() {
        return dni;
    }

    public String getMotiu() {
        return motiu;
    }

    public int getTorn() {
        return torn;
    }

    public int getNivell() {
        return nivell;
    }

    public LocalDate getData() {
        return data;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="setter">
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setMotiu(String motiu) {
        this.motiu = motiu;
    }

    public void setTorn(int torn) {
        this.torn = torn;
    }

    public void setNivell(int nivell) {
        this.nivell = nivell;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
//</editor-fold>

    @Override
    public int random(int max) {
        int min = 0;
        torn = (int) Math.floor(Math.random() * (max - min) + min);
        return torn;
    }

    @Override
    public LocalDate dataActual() {
        return LocalDate.now();
    }

    @Override
    public int nivell() {
        return 0;
    }
    
    public String toString(int integer) {
        StringBuilder sb = new StringBuilder();
        sb.append(integer);
        return sb.toString();
    }
}
