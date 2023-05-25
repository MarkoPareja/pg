/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cat.institutmvm.persistence.daos.contracts;

import cat.institutmvm.buisness.entities.Pacient;
import cat.institutmvm.buisness.entities.Urgencia;
import cat.institutmvm.persistence.exceptions.DAOException;
import java.util.List;
/**
 * 
 * @author marko
 */
public interface PacientDAO {
    /**
     * 
     * @param dni
     * @return Pacient
     * @throws DAOException 
     */
    Pacient getPacientByDni(String dni) throws DAOException;
    
    /**
     * 
     * @return List<Pacient>
     * @throws DAOException 
     */
    List<Pacient> getList() throws DAOException;
}
