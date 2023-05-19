/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.persistence.daos.impl;

import cat.institutmvm.buisness.entities.Urgencia;
import cat.institutmvm.persistence.exceptions.DAOException;
//import cat.institutmvm.persistence.utils.JDBCUtils;
import java.io.IOException;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import cat.institutmvm.persistence.daos.contracts.UrgenciaDAO;

public class PacientJDBCDAO implements UrgenciaDAO{

    @Override
    public Employee getEmployeeById(String id) throws DAOException {
        Employee empl = null;
        
        try (var connection = JDBCUtils.openConnection();
            PreparedStatement sentSQL = connection.prepareStatement("SELECT id,firstname, lastname, height, weight, salary, birthDate FROM employee WHERE id = ?")) {
            sentSQL.setString(1, id);
            try (ResultSet reader = sentSQL.executeQuery()) {
                if (reader.next()) {
                    // ORM: [--,--,--,--,--,--] -----> []Color
                    empl = JDBCUtils.geEmployee(reader);
                }            
            }
        }
        catch (SQLException  | IOException ex) {
            //Logger
            throw new DAOException(ex);
        }
        
        return empl;
    }

    @Override
    public List<Employee> getEmployees() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}