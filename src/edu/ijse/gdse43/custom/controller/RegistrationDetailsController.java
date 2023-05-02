/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.custom.controller;

import edu.ijse.dao.custom.RegistrationDetailsDAO;
import edu.ijse.gdse43.core.dto.RegistrationDetailsDTO;
import edu.ijse.gdse43.dao.DAOFactory;

/**
 *
 * @author DEll
 */
public class RegistrationDetailsController {
     private static RegistrationDetailsDAO registratonDetailsDAO=(RegistrationDetailsDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.REGISTRATIONDETAILS);
    public static boolean add(RegistrationDetailsDTO registrationDetails)throws Exception{
        boolean result=registratonDetailsDAO.add(registrationDetails);
        return result;
}
}
