/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.custom.ExamDetailsDAO;
import edu.ijse.gdse43.core.dto.ExamDetailsDTO;
import edu.ijse.gdse43.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author DEll
 */
public class ExamDetailsDAOImpl implements ExamDetailsDAO{

    @Override
    public boolean add(ExamDetailsDTO examDetails) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Insert into ExamDetails values(?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, examDetails.getExamID());
        stm.setObject(2, examDetails.getStudentID());
        stm.setObject(3, examDetails.getExamDate());
        stm.setObject(4, examDetails.getExamTime());
        
        int res = stm.executeUpdate();
        return res > 0;

    }

   

    @Override
    public boolean update(ExamDetailsDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ExamDetailsDTO search(String dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ExamDetailsDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(ExamDetailsDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }


