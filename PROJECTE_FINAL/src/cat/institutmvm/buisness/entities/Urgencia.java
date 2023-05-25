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
    private Pacient paci;

    /**
     * 
     * @param dni
     * @param motiu
     * @param torn
     * @param nivell
     * @param data 
     */
    public Urgencia(String dni, String motiu, int torn, int nivell, LocalDate data) {
        this.setDni(dni);
        this.setMotiu(motiu);
        this.setTorn(torn);
        this.setNivell(nivell);
        this.setData(data);
    }
    
    public Urgencia(){}
    
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
     * @return motiu
     */
    public String getMotiu() {
        return motiu;
    }

    /**
     * 
     * @return torn
     */
    public int getTorn() {
        return torn;
    }

    /**
     * 
     * @return nivell
     */
    public int getNivell() {
        return nivell;
    }

    /**
     * 
     * @return data
     */
    public LocalDate getData() {
        return data;
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
     * @param motiu 
     */
    public void setMotiu(String motiu) {
        this.motiu = motiu;
    }

    /**
     * 
     * @param torn 
     */
    public void setTorn(int torn) {
        this.torn = torn;
    }

    /**
     * 
     * @param nivell 
     */
    public void setNivell(int nivell) {
        this.nivell = nivell;
    }

    /**
     * 
     * @param data 
     */
    public void setData(LocalDate data) {
        this.data = data;
    }
//</editor-fold>

    /**
     * 
     * @param max
     * @return max
     */
    @Override
    public int random(int max) {
        int min = 0;
        torn = (int) Math.floor(Math.random() * (max - min) + min);
        return torn;
    }

    /**
     * 
     * @return La data actual
     */
    @Override
    public LocalDate dataActual() {
        return LocalDate.now();
    }

    /**
     * 
     * @return El numero 0
     */
    @Override
    public int nivell() {
        return 0;
    }
    
    /**
     * 
     * @param integer
     * @return sb
     */
    public String toString(int integer) {
        StringBuilder sb = new StringBuilder();
        sb.append(integer);
        return sb.toString();
    }
    
    /**
     * 
     * @return String
     */
    @Override
    public String toString() {
        return String.format("Urgencia: DNI=%s, Motiu=%s, Torn=%d, Nivell=%d, Data=%s",
                getDni(), getMotiu(), getTorn(), getNivell(), getData());
    }
}
