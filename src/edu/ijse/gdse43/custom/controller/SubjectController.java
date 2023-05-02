/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.custom.controller;

import edu.ijse.dao.custom.SubjectDAO;
import edu.ijse.gdse43.core.dto.SubjectDTO;
import edu.ijse.gdse43.dao.DAOFactory;
import java.util.ArrayList;

/**
 *
 * @author DEll
 */
public class SubjectController {
private static SubjectDAO subjectDAO=(SubjectDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUBJECT);
public static ArrayList<SubjectDTO>getAllSubjects()throws Exception{
    ArrayList<SubjectDTO>allSubjects=subjectDAO.getAll();
    return allSubjects;
} 

 public static SubjectDTO searchSubjectName(String name) throws Exception {
        SubjectDTO searchSubjectName = subjectDAO.search(name);
        return searchSubjectName;
    }
}

    
