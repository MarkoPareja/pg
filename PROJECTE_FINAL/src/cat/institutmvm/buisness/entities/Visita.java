/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.buisness.entities;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author marko
 */
public interface Visita {
    /**
     * 
     * @param max
     * @return Numero random
     */
    public int random(int max);
    
    /**
     * 
     * @return La data actual
     */
    public LocalDate dataActual();
    
    /**
     * 
     * @return Nivell 0
     */
    public int nivell();
}
