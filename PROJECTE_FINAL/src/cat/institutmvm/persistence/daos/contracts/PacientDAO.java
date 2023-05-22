/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cat.institutmvm.persistence.daos.contracts;

import cat.institutmvm.buisness.entities.Pacient;
import cat.institutmvm.persistence.exceptions.DAOException;

public interface PacientDAO {
    Pacient getPacientByDni(String dni) throws DAOException;
}
