/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.dao.custom;

import edu.ijse.gdse43.core.dto.SheduleDTO;
import edu.ijse.gdse43.dao.SuperDAO;

/**
 *
 * @author DEll
 */
public interface SheduleDAO extends SuperDAO<SheduleDTO> {

    public String searchNameById(String subjectId) throws Exception;

    public String searchTeacherNameById(String teacherId) throws Exception;

    public String searchIdByName(String s) throws Exception;
    
    public String searchBatchIdByName(String s) throws Exception;
    
    public String searchBatchNo(String batchNo)throws Exception ;
}
