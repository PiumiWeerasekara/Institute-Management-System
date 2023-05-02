/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.custom.PaymentDAO;
import edu.ijse.gdse43.core.dto.PaymentDTO;
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
public class PaymentDAOImpl implements PaymentDAO {

    @Override
    public boolean add(PaymentDTO payment) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        System.out.println("ppp"+payment.getPaymentID()+payment.getStudentID()+payment.getSubjectID());
        String sql = "Insert into Payment Value(?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, payment.getPaymentID());
        stm.setObject(3, payment.getStudentID());
        stm.setObject(2, payment.getSubjectID());
        stm.setObject(4, payment.getMonth());
        stm.setObject(5, payment.getAmount());
        int res = stm.executeUpdate();
        return res > 0;

    }

    @Override
    public boolean delete(PaymentDTO payment) throws Exception {
        String sql = "Delete from Payment where PaymentID=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, payment.getPaymentID());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean update(PaymentDTO payment) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Update Payment set StudentID=?,SubjectName=?,ClassName=?,Month=?,Amount=?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, payment.getStudentID());
        stm.setObject(2, payment.getSubjectID());
        stm.setObject(3, payment.getMonth());
        stm.setObject(4, payment.getAmount());
        int res = stm.executeUpdate();
        return res > 0;

    }

    @Override
    public PaymentDTO search(String payment) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select * from Payment where PaymentID='" + payment + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return new PaymentDTO(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                   Integer.parseInt(rst.getString(5)));
        }
        return null;
    }

    @Override
    public ArrayList<PaymentDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select * from Payment";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<PaymentDTO> alPayments = null;
        while (rst.next()) {
            if (alPayments == null) {
                alPayments = new ArrayList<>();
            }
            PaymentDTO payment = new PaymentDTO(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    Integer.parseInt(rst.getString(5)));
            alPayments.add(payment);
        }
        return alPayments;
    }

}
