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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UrgenciaJDBCDAO implements UrgenciaDAO{

    @Override
    public void getUrgenciaByDni(String dni, LocalDate data, String motiu, int nivell, int torn) throws DAOException {
        var dataDate = java.sql.Date.valueOf(data);
        try (var connection = JDBCUtils.openConnection();
            PreparedStatement sentSQL = connection.prepareStatement("INSERT INTO Urgencia(dni, data, motiu, nivell, torn) VALUES (?,?,?,?,?)")) {
            
            sentSQL.setString(1, dni);
            sentSQL.setDate(2, dataDate);
            sentSQL.setString(3, motiu);
            sentSQL.setInt(4, nivell);
            sentSQL.setInt(5, torn);
            sentSQL.executeUpdate();

        }
        catch (SQLException  | IOException ex) {
            //Logger
            throw new DAOException(ex);
        }
    }

    @Override
    public Urgencia getUrgenciaByDni(LocalDate data) throws DAOException {
        Urgencia urg = null;
        var dataDate = java.sql.Date.valueOf(data);
        try (var connection = JDBCUtils.openConnection();
            PreparedStatement sentSQL = connection.prepareStatement("SELECT u.dni, u.data, u.motiu, u.nivell, u.torn FROM Urgencia AS u JOIN Persona AS p WHERE data = ?")) {
            
            sentSQL.setDate(1, dataDate);
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
    public List<Urgencia> getList() throws DAOException {
        List<Urgencia> urg = new ArrayList<>();
        
        try (var connection = JDBCUtils.openConnection();
            PreparedStatement sentSQL = connection.prepareStatement("SELECT DISTINCT u.dni, u.data, u.motiu, u.nivell, u.torn FROM Urgencia AS u JOIN Persona AS p WHERE data = CURDATE()")) {
            
            try (ResultSet reader = sentSQL.executeQuery()) {
                if (reader.next()) {
                    urg.add(JDBCUtils.getUrgencia(reader));
                }            
            }
        }
        catch (SQLException  | IOException ex) {
            throw new DAOException(ex);
        }
        return urg;
    }

}