/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.institutmvm.persistence.utils;

import cat.institutmvm.buisness.entities.Pacient;
import cat.institutmvm.buisness.entities.Urgencia;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public final class JDBCUtils {

    
    private JDBCUtils() {
    }

    public static Connection openConnection() throws SQLException, IOException {
        Properties props = new Properties();
        props.load(new FileReader("config/jdbc.properties"));
        return DriverManager.getConnection(props.getProperty("mysql.url"),
                                           props.getProperty("mysql.username"),
                                           props.getProperty("mysql.password"));
    }
    
    public static Urgencia getUrgencia(ResultSet reader) throws SQLException {
        /*
        Pacient pac = new Pacient(reader.getString("pa.tsi"), reader.getString("p.dni"), 
        reader.getString("p.nom"), reader.getString("p.cognom"), 
        reader.getDate("p.data_naixement").toLocalDate(), reader.getString("p.genere"));
        */
        Urgencia urg = new Urgencia(reader.getString("u.dni"), 
                reader.getString("u.motiu"), reader.getInt("u.torn"),
                reader.getInt("u.nivell"), reader.getDate("u.data").toLocalDate());
        return urg;
    }
    
    public static Pacient getPacient(ResultSet reader) throws SQLException {
        Pacient pac = new Pacient(reader.getString("pa.tsi"), reader.getString("p.dni"), 
        reader.getString("p.nom"), reader.getString("p.cognom"), 
        reader.getDate("p.data_naixement").toLocalDate(), reader.getString("p.genere"));
        return pac;
    }  
}