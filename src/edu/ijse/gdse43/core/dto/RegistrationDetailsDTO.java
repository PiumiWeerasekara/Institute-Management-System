/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.core.dto;

/**
 *
 * @author DEll
 */
public class RegistrationDetailsDTO extends SuperDTO{
    private String registrationID;
    private String SubjectID;

    public RegistrationDetailsDTO() {
        
    }

    public RegistrationDetailsDTO(String registrationID, String SubjectID) {
        this.registrationID = registrationID;
        this.SubjectID = SubjectID;
    }

    /**
     * @return the registrationID
     */
    public String getRegistrationID() {
        return registrationID;
    }

    /**
     * @param registrationID the registrationID to set
     */
    public void setRegistrationID(String registrationID) {
        this.registrationID = registrationID;
    }

    /**
     * @return the SubjectID
     */
    public String getSubjectID() {
        return SubjectID;
    }

    /**
     * @param SubjectID the SubjectID to set
     */
    public void setSubjectID(String SubjectID) {
        this.SubjectID = SubjectID;
    }

  
    

    
}
