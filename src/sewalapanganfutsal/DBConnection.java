/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sewalapanganfutsal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Danzeld
 */
public class DBConnection {
    
    private static Connection connect;
    
    public static Connection getConnection(){
        
        if (connect == null);
        try {
            String url = "jdbc:mysql://localhost:3306/db_futsal";
            String user = "root";
            String password = "";
            
            connect = DriverManager.getConnection(url, user, password);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal terhubung ke database: " + e.getMessage());
        }
        return connect;
    }
    
}

