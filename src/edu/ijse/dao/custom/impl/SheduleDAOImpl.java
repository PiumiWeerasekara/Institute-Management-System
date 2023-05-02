/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.custom.SheduleDAO;
import edu.ijse.gdse43.core.dto.SheduleDTO;
import edu.ijse.gdse43.dao.db.DBConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DEll
 */
public class SheduleDAOImpl implements SheduleDAO {

    @Override
    public boolean add(SheduleDTO shedule) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Insert into Shedule Values(?,?,?,?,?,?,?)";
        System.out.println("Shedule" + shedule.getBatchID() + shedule.getTeacherID() + shedule.getSubjectID());
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, shedule.getSheduleID());
        stm.setObject(2, shedule.getBatchID());
        stm.setObject(3, shedule.getTeacherID());
        stm.setObject(4, shedule.getSubjectID());
        stm.setObject(5, shedule.getDate());
        stm.setObject(6, shedule.getStartTime());
        stm.setObject(7, shedule.getEndTime());
        int res = stm.executeUpdate();
        return res > 0;

    }

    @Override
    public boolean delete(SheduleDTO shedule) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Delete from Shedule SheduleID=?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, shedule.getSheduleID());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean update(SheduleDTO shedule) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Update Shedule set BatchID=?,TeacherID=,SubjectID=?,Date=?,StartTime=?,EndTime=?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, shedule.getBatchID());
        stm.setObject(2, shedule.getTeacherID());
        stm.setObject(3, shedule.getSubjectID());
        stm.setObject(4, shedule.getDate());
        stm.setObject(5, shedule.getStartTime());
        stm.setObject(6, shedule.getEndTime());
        int res = stm.executeUpdate();
        return res > 0;

    }

    @Override
    public SheduleDTO search(String shedule) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select * from Shedule where SheduleID='" + shedule + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return new SheduleDTO(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7));
        }
        return null;

    }

    @Override
    public ArrayList<SheduleDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select * from shedule";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<SheduleDTO> alShedules = null;
        while (rst.next()) {
            if (alShedules == null) {
                alShedules = new ArrayList<>();

            }
            SheduleDTO shedule = new SheduleDTO(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7));
            alShedules.add(shedule);

        }
        return alShedules;

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

    @Override
    public String searchTeacherNameById(String teacherId) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select * from Teacher where TeacherID='" + teacherId + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String teacherName = "";
        while (rst.next()) {
            teacherName = rst.getString(2);
        }
        return teacherName;
    }

    @Override
    public String searchBatchNo(String batchNo) throws Exception {

        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select * from Batch where BatchID='" + batchNo + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String batchName = "";
        while (rst.next()) {
            batchName = rst.getString(2);
        }

        return batchName;
    }

    @Override
    public String searchIdByName(String s) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select * from Teacher where TeacherName='" + s + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String teacherName = "";
        while (rst.next()) {
            teacherName = rst.getString(1);
        }
        return teacherName;
    }

    @Override
    public String searchBatchIdByName(String s) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select * from Batch where BatchNo='" + s + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        String batchName = "";
        while (rst.next()) {
            batchName = rst.getString(1);
        }

        return batchName;
    }
}
