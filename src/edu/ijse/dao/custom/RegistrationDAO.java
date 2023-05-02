/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.dao.custom;

import edu.ijse.gdse43.core.dto.RegistrationDTO;
import edu.ijse.gdse43.dao.SuperDAO;

/**
 *
 * @author DEll
 */
public interface RegistrationDAO extends SuperDAO<RegistrationDTO>{
     public String searchNameById(String subjectId)throws Exception;
}
