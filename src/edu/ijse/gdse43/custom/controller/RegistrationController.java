/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.custom.controller;

import edu.ijse.dao.custom.RegistrationDAO;
import edu.ijse.gdse43.core.dto.RegistrationDTO;
import edu.ijse.gdse43.dao.DAOFactory;
import java.util.ArrayList;

/**
 *
 * @author DEll
 */
public class RegistrationController {
    private static RegistrationDAO registrationDAO=(RegistrationDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.REGISTRATION);
   
    public static boolean deleteRegistration(RegistrationDTO registration)throws Exception{
        boolean result=registrationDAO.delete(registration);
        return result;
    }
     public static boolean updateRegistration(RegistrationDTO registration)throws Exception{
        boolean result=registrationDAO.update(registration);
        return result;
    }
     public static RegistrationDTO searchRegistration(String registration)throws Exception{
        RegistrationDTO searchedRegistration=registrationDAO.search(registration);
        return searchedRegistration;
    }
    
    
     public static ArrayList<RegistrationDTO>getAllRegistration()throws Exception{
    ArrayList<RegistrationDTO>allRegistrations=registrationDAO.getAll();
    return allRegistrations;
   } 
   
    
}
