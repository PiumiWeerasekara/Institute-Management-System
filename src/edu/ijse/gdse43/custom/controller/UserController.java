/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.custom.controller;

import edu.ijse.gdse43.core.dto.LoginDTO;
import edu.ijse.gdse43.dao.db.DBConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DEll
 */
public class UserController {

    public static int addUser(LoginDTO login) throws SQLException, ClassNotFoundException, IOException {
        String sql = "insert into Login values(?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, login.getUserName());
        stm.setObject(2, login.getPassword());
        return stm.executeUpdate();
    }

    public static boolean login(LoginDTO login) throws SQLException, ClassNotFoundException, IOException {
        String query = "Select * from Login where username = ? AND password=?";
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(query);
        stm.setObject(1, login.getUserName());
        stm.setObject(2, login.getPassword());
        ResultSet rst = stm.executeQuery();
        return rst.next();
    }
}
