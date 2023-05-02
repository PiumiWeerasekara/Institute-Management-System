/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.custom.RegistrationDAO;
import edu.ijse.gdse43.core.dto.RegistrationDTO;
import edu.ijse.gdse43.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DEll
 */
public class RegistrationDAOImpl implements RegistrationDAO {

    @Override
    public boolean add(RegistrationDTO registration) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Insert into Registration values(?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, registration.getRegistrationID());
        stm.setObject(2, registration.getRegistrationDate());
        stm.setObject(3, registration.getFees());
        stm.setObject(4, registration.getBatchID());
        int res = stm.executeUpdate();
        return res > 0;

    }

    @Override
    public boolean delete(RegistrationDTO registration) throws Exception {
        String sql = "Delete from Teacher where RegistrationID=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, registration.getRegistrationID());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean update(RegistrationDTO registration) throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="Update Registration set RegistrationDate=?,Fees=?,BatchID=?";
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1,registration.getRegistrationDate());
        stm.setObject(2,registration.getFees());
        stm.setObject(3,registration.getBatchID());
        int res=stm.executeUpdate();
        return res>0;
        
        
    }

    @Override
    public RegistrationDTO search(String registration) throws Exception {
Connection connection=DBConnection.getInstance().getConnection();
String sql="select * from Registration where RegistrationID='"+registration+"'";
        Statement stm=connection.createStatement();
        ResultSet  rst=stm.executeQuery(sql);
        if(rst.next()){
            return new RegistrationDTO(rst.getString(1),
            rst.getString(2),
            rst.getString(3),
            rst.getString(4));
        }
        return null;
    }

    @Override
    public ArrayList<RegistrationDTO> getAll() throws Exception {
Connection connection=DBConnection.getInstance().getConnection();
String sql="Select * from Registration";
Statement stm=connection.createStatement();
ResultSet rst=stm.executeQuery(sql);

ArrayList<RegistrationDTO>alRegistrations=null;
while(rst.next()){
    if(alRegistrations==null){
        alRegistrations=new ArrayList<>();
    }
    RegistrationDTO registration=new RegistrationDTO(rst.getString(1),
    rst.getString(2),
    rst.getString(3),
    rst.getString(4));
    
    alRegistrations.add(registration);
}
return null;
    }

    @Override
    public String searchNameById(String subjectId) throws Exception {
Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select * from Subject where SubjectID='" + subjectId + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String subName = "";
        while (rst.next()) {
            subName = rst.getString(2);
        }
        return subName;
    }
    }


