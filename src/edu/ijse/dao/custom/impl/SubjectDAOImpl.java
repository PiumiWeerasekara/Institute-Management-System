/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.custom.SubjectDAO;
import edu.ijse.gdse43.core.dto.BatchDTO;
import edu.ijse.gdse43.core.dto.SubjectDTO;
import edu.ijse.gdse43.core.dto.TeacherDTO;
import edu.ijse.gdse43.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DEll
 */
public class SubjectDAOImpl implements SubjectDAO{

    @Override
    public boolean add(SubjectDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(SubjectDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(SubjectDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SubjectDTO search(String subject) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select * from Subject where SubjectName='" +subject+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return new SubjectDTO(rst.getString(1),
                    rst.getString(2)
                    );

        }
        return null;
    }

    @Override
    public ArrayList<SubjectDTO> getAll() throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="Select * from Subject";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<SubjectDTO>alSubjects=null;
        while(rst.next()){
            if(alSubjects==null){
                alSubjects=new ArrayList<>();
            }
            SubjectDTO subject=new SubjectDTO(rst.getString(1),
            rst.getString(2));
            alSubjects.add(subject);
        }
        return alSubjects;
    }
        
       
    }
    

