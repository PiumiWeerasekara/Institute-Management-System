/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.custom.controller;

import edu.ijse.dao.custom.TeacherDAO;
import edu.ijse.gdse43.core.dto.TeacherDTO;
import edu.ijse.gdse43.dao.DAOFactory;
import java.util.ArrayList;

/**
 *
 * @author DEll
 */
public class TeacherController {
    
    private static TeacherDAO teacherDAO=(TeacherDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.TEACHER);
    public static boolean addTeacher(TeacherDTO teacher)throws Exception{
        boolean result=teacherDAO.add(teacher);
        return result;
    }
    public static boolean deleteTeacher(TeacherDTO teacher)throws Exception{
        boolean result=teacherDAO.delete(teacher);
        return result;
    }
     public static boolean updateTeacher(TeacherDTO teacher)throws Exception{
        boolean result=teacherDAO.update(teacher);
        return result;
    }
     public static TeacherDTO searchTeacher(String teacher)throws Exception{
        TeacherDTO searchedTeacher=teacherDAO.search(teacher);
        return searchedTeacher;
    }
     public static ArrayList<TeacherDTO>getAllTeachers()throws Exception{
         ArrayList<TeacherDTO>allTeachers=teacherDAO.getAll();
        return allTeachers;
    }
    
    
     
     }
     
     
     
     

 

