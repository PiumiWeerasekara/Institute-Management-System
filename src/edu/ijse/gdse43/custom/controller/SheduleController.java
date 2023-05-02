/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.custom.controller;

import edu.ijse.dao.custom.SheduleDAO;
import edu.ijse.gdse43.core.dto.BatchDTO;
import edu.ijse.gdse43.core.dto.SheduleDTO;
import edu.ijse.gdse43.dao.DAOFactory;
import java.util.ArrayList;

/**
 *
 * @author DEll
 */
public class SheduleController {

    private static SheduleDAO sheduleDAO = (SheduleDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SHEDULE);

    public static boolean addShedule(SheduleDTO shedule) throws Exception {
        boolean result = sheduleDAO.add(shedule);
        return result;
    }
    
    public static String searchNameById(String subjectId) throws Exception{
       return sheduleDAO.searchNameById(subjectId);
       
    }
     public static String searchTeacherName(String teacherId) throws Exception {
       return sheduleDAO.searchTeacherNameById(teacherId);
    }
      public static String searchTeacherIdByName(String teacherId) throws Exception {
       return sheduleDAO.searchIdByName(teacherId);
    }
     
    public static String searchBatchNo(String no) throws Exception {
        return sheduleDAO.searchBatchNo(no);
    }
    public static String searchBatchIdByName(String no) throws Exception {
        return sheduleDAO.searchBatchIdByName(no);
    }

    public static boolean updateShedule(SheduleDTO shedule) throws Exception {
        boolean result = sheduleDAO.update(shedule);
        return result;
    }

    public static SheduleDTO searchShedule(String shedule) throws Exception {
        SheduleDTO searchShedule = sheduleDAO.search(shedule);
        return searchShedule;
    }
    
    
    public static ArrayList<SheduleDTO>getAllShedules()throws Exception{
        ArrayList<SheduleDTO>allShedules=sheduleDAO.getAll();
        return allShedules;
    }

}
