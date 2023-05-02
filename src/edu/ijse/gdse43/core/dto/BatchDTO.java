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
public class BatchDTO extends SuperDTO {
    private String batchID;
    private String batchNo;

    public BatchDTO() {
    }

    public BatchDTO(String batchID, String batchNo) {
        this.batchID = batchID;
        this.batchNo = batchNo;
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
     * @return the batchNo
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * @param batchNo the batchNo to set
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

   
    
}
