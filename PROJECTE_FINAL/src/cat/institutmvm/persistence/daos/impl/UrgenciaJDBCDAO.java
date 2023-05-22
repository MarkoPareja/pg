/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.persistence.daos.impl;

import cat.institutmvm.buisness.entities.Urgencia;
import cat.institutmvm.persistence.exceptions.DAOException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import cat.institutmvm.persistence.daos.contracts.UrgenciaDAO;
import cat.institutmvm.persistence.utils.JDBCUtils;
import java.time.LocalDate;

public class UrgenciaJDBCDAO implements UrgenciaDAO{

    @Override
    public Urgencia getUrgenciaByDni(String dni, String data, String motiu, int nivell, int torn) throws DAOException {
        Urgencia urg = null;
        
        try (var connection = JDBCUtils.openConnection();
            PreparedStatement sentSQL = connection.prepareStatement("INSERT INTO Urgencia(dni, data, motiu, nivell, torn) VALUES (?,?,?,?,?,?)")) {
            
            sentSQL.setString(1, dni);
            sentSQL.setString(2, data);
            sentSQL.setString(3, motiu);
            sentSQL.setInt(4, nivell);
            sentSQL.setInt(5, torn);
            
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
}