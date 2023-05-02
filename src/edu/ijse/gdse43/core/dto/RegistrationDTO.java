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
public class RegistrationDTO extends SuperDTO{
    private String registrationID;
    private String registrationDate;
    private String fees;
    private String batchID;
   
    public RegistrationDTO() {
    }

    public RegistrationDTO(String registrationID, String registrationDate, String fees, String batchID) {
        this.registrationID = registrationID;
        this.registrationDate = registrationDate;
        this.fees = fees;
        this.batchID = batchID;
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
     * @return the registrationDate
     */
    public String getRegistrationDate() {
        return registrationDate;
    }

    /**
     * @param registrationDate the registrationDate to set
     */
    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * @return the fees
     */
    public String getFees() {
        return fees;
    }

    /**
     * @param fees the fees to set
     */
    public void setFees(String fees) {
        this.fees = fees;
    }

    /**
     * @return the batchID
     */
    public String getBatchID() {
        return batchID;
    }

    /**
     * @param batchID the batchID to set
     */
    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    @Override
    public String toString() {
        return "RegistrationDTO{" + "registrationID=" + registrationID + ", registrationDate=" + registrationDate + ", fees=" + fees + ", batchID=" + batchID + '}';
    }

    
    

}