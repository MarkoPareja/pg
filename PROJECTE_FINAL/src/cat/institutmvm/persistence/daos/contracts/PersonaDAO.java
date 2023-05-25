/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cat.institutmvm.persistence.daos.contracts;

import cat.institutmvm.buisness.entities.Persona;
import cat.institutmvm.persistence.exceptions.DAOException;
import java.util.List;
/**
 * 
 * @author marko
 */
public interface PersonaDAO {
    /**
     * 
     * @param dni
     * @return Persona
     * @throws DAOException 
     */
    Persona getPersonaByDni(String dni) throws DAOException;
    
    /**
     * 
     * @return List<Persona>
     * @throws DAOException 
     */
    List<Persona> getPersonas() throws DAOException;
}
