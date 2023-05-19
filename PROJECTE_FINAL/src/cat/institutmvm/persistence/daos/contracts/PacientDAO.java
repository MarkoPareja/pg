/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cat.institutmvm.persistence.daos.contracts;

import cat.institutmvm.buisness.entities.Urgencia;
import cat.institutmvm.persistence.exceptions.DAOException;
import java.util.List;

public interface PacientDAO {
    Employee getEmployeeById(String id) throws DAOException;
    List<Employee> getEmployees() throws DAOException;
}
