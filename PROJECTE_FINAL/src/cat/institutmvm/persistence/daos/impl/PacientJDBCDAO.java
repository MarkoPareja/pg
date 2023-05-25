/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.persistence.daos.impl;

import cat.institutmvm.buisness.entities.Pacient;
import cat.institutmvm.buisness.entities.Urgencia;
import cat.institutmvm.persistence.daos.contracts.PacientDAO;
import cat.institutmvm.persistence.exceptions.DAOException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import cat.institutmvm.persistence.utils.JDBCUtils;
import java.util.ArrayList;
import java.util.List;

public class PacientJDBCDAO implements PacientDAO{

    @Override
    public Pacient getPacientByDni(String dni) throws DAOException {
        Pacient pac = null;
        //String sql = "SELECT p.dni, pa.tsi, p.cognom, p.nom, p.data_naixement, p.genere FROM Persona AS p JOIN Pacient AS pa WHERE pa.dni = p.dni AND p.dni = "+dni;
        //System.out.println(sql);
        try (var connection = JDBCUtils.openConnection();
            PreparedStatement sentSQL = connection.prepareStatement("SELECT p.dni, pa.tsi, p.cognom, p.nom, p.data_naixement, p.genere FROM Persona AS p JOIN Pacient AS pa WHERE pa.dni = p.dni AND p.dni = ?")) {
            sentSQL.setString(1, dni);
            try (ResultSet reader = sentSQL.executeQuery()) {
                if (reader.next()) {
                    // ORM: [--,--,--,--,--,--] -----> []Color
                    pac = JDBCUtils.getPacient(reader);
                }            
            }
        }
        catch (SQLException  | IOException ex) {
            throw new DAOException(ex);
        }
        return pac;
    }
    
    @Override
    public List<Pacient> getList() throws DAOException {
        List<Pacient> pac = new ArrayList<>();

        try (var connection = JDBCUtils.openConnection();
            PreparedStatement sentSQL = connection.prepareStatement("SELECT DISTINCT p.dni, pa.tsi, p.cognom, p.nom, p.data_naixement, p.genere FROM Persona AS p JOIN Pacient AS pa WHERE data = CURDATE()")) {

            try (ResultSet reader = sentSQL.executeQuery()) {
                while (reader.next()) {
                    pac.add(JDBCUtils.getPacient(reader));
                }            
            }
        }
        catch (SQLException | IOException ex) {
            throw new DAOException(ex);
        }
        return pac;
    }
}