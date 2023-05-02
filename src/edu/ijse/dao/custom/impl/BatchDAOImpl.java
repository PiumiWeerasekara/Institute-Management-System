/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.custom.BatchDAO;
import edu.ijse.gdse43.core.dto.BatchDTO;
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
public class BatchDAOImpl implements BatchDAO {

    @Override
    public boolean add(BatchDTO batch) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Insert into Batch values(?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, batch.getBatchID());
        stm.setObject(2, batch.getBatchNo());
        int res = stm.executeUpdate();
        return res > 0;

    }

    @Override
    public boolean delete(BatchDTO batch) throws Exception {
        String sql = "Delete from Batch where BatchID=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, batch.getBatchID());
        int res = stm.executeUpdate();
        return res > 0;

    }

    @Override
    public boolean update(BatchDTO batch) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Update Batch set BatchNo=?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, batch.getBatchNo());
        int res = stm.executeUpdate();
        return res > 0;

    }

    @Override
    public BatchDTO search(String batch) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select * from batch where BatchID='" + batch + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return new BatchDTO(rst.getString(1),
                    rst.getString(2));
        }
        return null;

    }

    @Override
    public ArrayList<BatchDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select * from Batch";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        ArrayList<BatchDTO> alBatch = null;
        while (rst.next()) {
            if (alBatch == null) {
                alBatch = new ArrayList<>();
            }
            BatchDTO batch = new BatchDTO(rst.getString(1),
                    rst.getString(2));
            alBatch.add(batch);

        }
        return alBatch;
    }

}
