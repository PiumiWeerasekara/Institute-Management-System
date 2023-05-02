/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.custom.controller;

import edu.ijse.dao.custom.RegistrationDAO;
import edu.ijse.dao.custom.RegistrationDetailsDAO;
import edu.ijse.dao.custom.StudentDAO;
import edu.ijse.dao.custom.impl.RegistrationDetailsDAOImpl;
import edu.ijse.gdse43.core.dto.RegistrationDTO;
import edu.ijse.gdse43.core.dto.RegistrationDetailsDTO;
import edu.ijse.gdse43.core.dto.StudentDTO;
import edu.ijse.gdse43.dao.DAOFactory;
import edu.ijse.gdse43.dao.db.DBConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DEll
 */
public class StudentController {

    private static RegistrationDAO registrationDAO = (RegistrationDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.REGISTRATION);
    private static StudentDAO studentDAO = (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);
    private static RegistrationDetailsDAO registrationDetailsDAO= (RegistrationDetailsDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.REGISTRATIONDETAILS);

    public static boolean addStudentDetails(StudentDTO student, RegistrationDTO registration,RegistrationDetailsDTO registrationDetails) {

        Connection connection = null;
        try {
            connection = DBConnection.getInstance().getConnection();

            // Starting point of my transaction
            connection.setAutoCommit(false);

            boolean isRegAdded = registrationDAO.add(registration);
            if (isRegAdded) {
                boolean isAdded = studentDAO.add(student);
                if(isAdded){
                    boolean isDetailsAdded=registrationDetailsDAO.add(registrationDetails);
                }

                if (isAdded) {
                    connection.commit();
                    System.out.println("data send");
                    return true;
                }
            }
            connection.rollback();
            return false;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return false;
        } catch (IOException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);

            return false;
        } catch (Exception ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (Exception ex1) {
                Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return false;
        } finally {
            try {
                connection.setAutoCommit(true);

            } catch (SQLException ex) {
                Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     public static boolean deleteStudent(StudentDTO student)throws Exception{
        boolean result=studentDAO.delete(student);
        return result;
    }
     public static boolean updateStudent(StudentDTO student)throws Exception{
        boolean result=studentDAO.update(student);
        return result;
    }
     public static StudentDTO searchTeacher(String student)throws Exception{
        StudentDTO searchedStudent=studentDAO.search(student);
        return searchedStudent;
    }
    
    public static ArrayList<StudentDTO>getAllStudents()throws Exception{
    ArrayList<StudentDTO>allSubjects=studentDAO.getAll();
    return allSubjects;
   }

}