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
public class ExamDetailsDTO extends SuperDTO{
    private String examID;
    private String studentID;
    private String examDate;
    private String examTime;

    public ExamDetailsDTO() {
    }

    public ExamDetailsDTO(String examID, String studentID, String examDate, String examTime) {
        this.examID = examID;
        this.studentID = studentID;
        this.examDate = examDate;
        this.examTime = examTime;
    }

    
    

    /**
     * @return the examID
     */
    public String getExamID() {
        return examID;
    }

    /**
     * @param examID the examID to set
     */
    public void setExamID(String examID) {
        this.examID = examID;
    }

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the examDate
     */
    public String getExamDate() {
        return examDate;
    }

    /**
     * @param examDate the examDate to set
     */
    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

    /**
     * @return the examTime
     */
    public String getExamTime() {
        return examTime;
    }

    /**
     * @param examTime the examTime to set
     */
    public void setExamTime(String examTime) {
        this.examTime = examTime;
    }

   
}
