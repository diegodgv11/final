package com.machine.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    private static Connection connection = null;
    private static final String path = "final.accdb";
    private static final String ucanaccessPrefix = "jdbc:ucanaccess://";
    
    private Database() {}
    
    public static Connection getConnection(){
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(ucanaccessPrefix + path);                   
            } catch (SQLException error) {
                System.out.print(error.getMessage());
            }
        }
        
        return connection;
    }
    
    public void close(){
        try {
            connection.close();            
        } catch (SQLException error) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, error);
        }
    }
}


