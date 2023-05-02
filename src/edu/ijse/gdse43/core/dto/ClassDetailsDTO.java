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
public class ClassDetailsDTO extends SuperDTO{
    private String classDetailsID;
    private String sheduleID;

    public ClassDetailsDTO() {
    }

    public ClassDetailsDTO(String classDetailsID, String classID, String sheduleID) {
        this.classDetailsID = classDetailsID;
        this.sheduleID = sheduleID;
    }

    /**
     * @return the classDetailsID
     */
    public String getClassDetailsID() {
        return classDetailsID;
    }

    /**
     * @param classDetailsID the classDetailsID to set
     */
    public void setClassDetailsID(String classDetailsID) {
        this.classDetailsID = classDetailsID;
    }

    

    /**
     * @return the sheduleID
     */
    public String getSheduleID() {
        return sheduleID;
    }

    /**
     * @param sheduleID the sheduleID to set
     */
    public void setSheduleID(String sheduleID) {
        this.sheduleID = sheduleID;
    }

   
}
