/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.persistence.daos.impl;

import cat.institutmvm.buisness.entities.Pacient;
import cat.institutmvm.buisness.entities.Urgencia;
import cat.institutmvm.persistence.daos.contracts.PacientDAO;
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

public class PacientJDBCDAO implements PacientDAO{

    @Override
    public Pacient getPacientByDni(String dni) throws DAOException {
        Pacient pac = null;
        /*
        try {
            var connection = JDBCUtils.openConnection();
            PreparedStatement sentSQL = connection.prepareStatement ("SELECT pa.dni, p.nom, p.cognom, p.data_naixement, p.genere, pa.tsi FROM Pacient AS pa JOIN Persona AS p WHERE p.dni = pa.dni AND pa.dni = ?");
            sentSQL.setString(1, dni);
            try (ResultSet reader = sentSQL.executeQuery()) {
                if (reader.next()) {
                    pac = JDBCUtils.getPacient(reader);
                }            
            }
        }*/
        try(var connection = JDBCUtils.openConnection(); var sql = connection.prepareCall("SELECT pa.dni, p.nom, p.cognom, p.data_naixement, p.genere, pa.tsi FROM Pacient AS pa JOIN Persona AS p WHERE p.dni = pa.dni AND pa.dni = ?")){
            sql.setString(1, dni);
            try (ResultSet reader = sql.executeQuery()) {
                if (reader.next()) {
                    pac = JDBCUtils.getPacient(reader);
                }            
            }
        }
        catch (SQLException  | IOException ex) {
            throw new DAOException(ex);
        }
        return pac;
    }
}