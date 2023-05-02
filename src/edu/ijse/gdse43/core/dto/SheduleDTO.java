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
public class SheduleDTO extends SuperDTO {

    private String sheduleID;
    private String batchID;
    private String teacherID;
    private String subjectID;
    private String date;
    private String startTime;
    private String endTime;

    public SheduleDTO() {
    }

    public SheduleDTO(String sheduleID, String batchID, String teacherID, String subjectID, String date, String startTime, String endTime) {
        this.sheduleID = sheduleID;
        this.batchID = batchID;
        this.teacherID = teacherID;
        this.subjectID = subjectID;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
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

    /**
     * @return the teacherID
     */
    public String getTeacherID() {
        return teacherID;
    }

    /**
     * @param teacherID the teacherID to set
     */
    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    /**
     * @return the subjectID
     */
    public String getSubjectID() {
        return subjectID;
    }

    /**
     * @param subjectID the subjectID to set
     */
    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

  

}
