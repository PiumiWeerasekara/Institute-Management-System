/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.custom.ExamDAO;
import edu.ijse.gdse43.core.dto.ExamDTO;
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
public class ExamDAOImpl implements ExamDAO {

    @Override
    public boolean add(ExamDTO exam) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Insert into Exam values(?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, exam.getExamID());
        stm.setObject(2, exam.getSubjectID());
        stm.setObject(3, exam.getMarks());
        int res = stm.executeUpdate();
        return res > 0;

    }

    @Override
    public boolean delete(ExamDTO exam) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Delete from Exam where ExamID=?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, exam.getExamID());
        int res = stm.executeUpdate();
        return res > 0;

    }

    @Override
    public boolean update(ExamDTO exam) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Update Exam set subjectName=?,marks=?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, exam.getSubjectID());
        stm.setObject(2, exam.getMarks());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public ExamDTO search(String exam) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select * from Exam where ExamID='" + exam + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return new ExamDTO(rst.getString(1),
                    rst.getString(2),
                    Integer.parseInt(rst.getString(3)));

        }
        return null;
    }

    @Override
    public ArrayList<ExamDTO> getAll() throws Exception {
Connection connection=DBConnection.getInstance().getConnection();
String sql="Select * from Exam";
Statement stm=connection.createStatement();
ResultSet rst=stm.executeQuery(sql);

ArrayList<ExamDTO>alExams=null;
while(rst.next()){
    if(alExams==null){
        alExams=new ArrayList<>();
    }
    ExamDTO exam=new ExamDTO();

        ExamDTO examDTO=new ExamDTO(rst.getString(1),
       rst.getString(2),
        Integer.parseInt(rst.getString(3)));
    
        alExams.add(exam);
}
return alExams;
        
}


    }


   




 

