/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.entities;

/**
 * Esta clase urgencia recibe datos ya obtenidos en la clase Pacient pero con un Override de el Metodo de Torn.
 * @author marko
 */
public class Urgencia implements Torn{
    private String data, dni;
    private int min, max, torn, nivell;
    
    /**
     * 
     * @param data
     * @param dni
     * @param nivell 
     */
    public Urgencia(String data, String dni, int nivell) {
        this.setData(data);
        this.setTorn(torn);
        this.setDni(dni);
        this.setNivell(nivell);
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getTorn() {
        return torn;
    }

    public void setTorn(int torn) {
        this.torn = torn;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNivell() {
        return nivell;
    }

    public void setNivell(int nivell) {
        this.nivell = nivell;
    }
    
    /**
     * 
     * @param max
     * @return torn
     */
     @Override
    public int random(int max) {
        int min = 0;
        torn = (int) Math.floor(Math.random() * (max - min) + min);
        return torn;
    }
    
    
}
