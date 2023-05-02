/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.dao.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author DEll
 */
public class DBConnection {

    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
        Properties dpProperties = new Properties();
        File dbFile = new File("Settings/ControllerFactorySettings.properties");
        FileReader dpFileReader = new FileReader(dbFile);
        dpProperties.load(dpFileReader);

        String ip = dpProperties.getProperty("ip");
        String port = dpProperties.getProperty("port");
        String database = dpProperties.getProperty("database");
        String username = dpProperties.getProperty("username");
        String password=dpProperties.getProperty("password");

        String url = "jdbc:mysql://" + ip + ":" + port + "/" + database;

        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url,username,password);
    }
    public static DBConnection getInstance() throws IOException, FileNotFoundException, ClassNotFoundException, SQLException{
        if(dbConnection==null){
        dbConnection=new DBConnection();
    }
        return dbConnection;
    }
    public Connection getConnection(){
        return connection;
        
    }
}

  