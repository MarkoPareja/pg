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
import cat.institutmvm.persistence.utils.JDBCUtils;

public class UrgenciaJDBCDAO implements UrgenciaDAO{

    @Override
    public Urgencia getUrgenciaByDni(String dni) throws DAOException {
        Urgencia urg = null;
        
        try (var connection = JDBCUtils.openConnection();
            PreparedStatement sentSQL = connection.prepareStatement("SELECT codi, data, dni, motiu, nivell, torn FROM Urgencia WHERE dni = ?")) {
            
            sentSQL.setString(1, dni);
            try (ResultSet reader = sentSQL.executeQuery()) {
                if (reader.next()) {
                    // ORM: [--,--,--,--,--,--] -----> []Color
                    urg = JDBCUtils.getUrgencia(reader);
                }            
            }
        }
        catch (SQLException  | IOException ex) {
            //Logger
            throw new DAOException(ex);
        }
        
        return urg;
    }

    @Override
    public List<Urgencia> getUrgencia() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}