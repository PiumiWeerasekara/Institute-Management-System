/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.dao.custom.impl;

import edu.ijse.dao.custom.RegistrationDetailsDAO;
import edu.ijse.gdse43.core.dto.RegistrationDetailsDTO;
import edu.ijse.gdse43.dao.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DEll
 */
public class RegistrationDetailsDAOImpl  implements RegistrationDetailsDAO{

    @Override
    public boolean add(RegistrationDetailsDTO registrationDetails) throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="Insert into RegistrationDetails values(?,?)";
        PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1,registrationDetails.getRegistrationID());
        stm.setObject(2,registrationDetails.getSubjectID());
        int res=stm.executeUpdate();
        return res>0;
                
    }

    @Override
    public boolean delete(RegistrationDetailsDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(RegistrationDetailsDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistrationDetailsDTO search(String dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<RegistrationDetailsDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
