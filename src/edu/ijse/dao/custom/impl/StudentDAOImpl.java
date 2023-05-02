/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.custom.StudentDAO;
import edu.ijse.gdse43.core.dto.StudentDTO;
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
public class StudentDAOImpl implements StudentDAO {

    @Override
    public boolean add(StudentDTO student) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Insert into Student values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        System.out.println(student.toString());
        stm.setObject(1, student.getStudentID());
        stm.setObject(2, student.getRegistrationID());
        stm.setObject(3, student.getFrstName());
        stm.setObject(4, student.getLastName());
        stm.setObject(5, student.getDob());
        stm.setObject(6, student.getPhone());
        stm.setObject(7, student.getAddress());
        stm.setObject(8, student.getNic());
        stm.setObject(9, student.getSchool());
        int res = stm.executeUpdate();
        return res > 0;

    }

    @Override
    public boolean delete(StudentDTO student) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Delete from Student where StudentID=?";
        PreparedStatement stm = connection.prepareCall(sql);
        stm.setObject(1, student.getStudentID());
        int res = stm.executeUpdate();
        return res > 0;

    }

    @Override
    public boolean update(StudentDTO student) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Update Student set RegistrationID=?,FName=?,LName=?,DOB=?,Phone=?,Address=?,NIC=?,School=?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, student.getRegistrationID());
        stm.setObject(2, student.getFrstName());
        stm.setObject(3, student.getLastName());
        stm.setObject(4, student.getDob());
    stm.setObject(5, student.getPhone());
        stm.setObject(6, student.getAddress());
        stm.setObject(7, student.getNic());
        stm.setObject(8, student.getSchool());
        int res = stm.executeUpdate();
        return res > 0;

    }

    @Override
    public StudentDTO search(String student) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select * from Student where StudentID='" + student + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return new StudentDTO(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));

        }
        return null;
        
    }
    

    @Override
    public ArrayList<StudentDTO> getAll() throws Exception {
Connection connection=DBConnection.getInstance().getConnection();
String sql="Select * from Student";
Statement stm=connection.createStatement();
ResultSet rst=stm.executeQuery(sql);
ArrayList<StudentDTO>alStudents=null;
while(rst.next()){
    if(alStudents==null){
        alStudents=new ArrayList<>();
    }
    StudentDTO student=new StudentDTO(rst.getString(1),
    rst.getString(2),
    rst.getString(3),
    rst.getString(4),
    rst.getString(5),
    rst.getString(6),
    rst.getString(7),
    rst.getString(8),
    rst.getString(9));
    alStudents.add(student);
    
}
return alStudents;

    }

    
}
