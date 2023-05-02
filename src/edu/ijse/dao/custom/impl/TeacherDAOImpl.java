/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.custom.TeacherDAO;
import edu.ijse.gdse43.core.dto.TeacherDTO;
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
public class TeacherDAOImpl implements TeacherDAO {

    @Override
    public boolean add(TeacherDTO teacher) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Insert into Teacher values(?,?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, teacher.getTeacherID());
        stm.setObject(2, teacher.getName());
        stm.setObject(3, teacher.getPhone());
        stm.setObject(4, teacher.getAddress());
        stm.setObject(5, teacher.getNic());
        stm.setObject(6, teacher.getSubject());
        int res = stm.executeUpdate();
        return res > 0;

    }

    @Override
    public boolean delete(TeacherDTO teacher) throws Exception {
        String sql = "Delete from Teacher where TeacherID=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, teacher.getTeacherID());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean update(TeacherDTO teacher) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Update Teacher set TeacherName=?,Phone=?,Address=?,NIC=?,Subject=?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, teacher.getName());
        stm.setObject(2, teacher.getPhone());
        stm.setObject(3, teacher.getAddress());
        stm.setObject(4, teacher.getNic());
        stm.setObject(5, teacher.getSubject());
        int res = stm.executeUpdate();
        return res > 0;

    }

    @Override
    public TeacherDTO search(String teacher) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select * from Teacher where TeacherID='" +teacher+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return new TeacherDTO(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6));
        }
        return null;
    }
    @Override
    public ArrayList<TeacherDTO>getAll()throws Exception{
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="Select * from teacher";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        
        ArrayList<TeacherDTO>alTeachers=null;
        while(rst.next()){
            if(alTeachers==null){
                alTeachers=new ArrayList<>();
            } 
                TeacherDTO teacher=new TeacherDTO(rst.getString(1),
                rst.getString(2),
                rst.getString(3),
                rst.getString(4),
                rst.getString(5),
                rst.getString(6));
                
                alTeachers.add(teacher);
        }
        return alTeachers;
        }
       
        

  }

 
    



