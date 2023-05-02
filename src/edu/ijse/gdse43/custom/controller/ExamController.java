/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.custom.controller;

import edu.ijse.dao.custom.ExamDAO;
import edu.ijse.dao.custom.ExamDetailsDAO;
import edu.ijse.gdse43.core.dto.ExamDTO;
import edu.ijse.gdse43.core.dto.ExamDetailsDTO;
import edu.ijse.gdse43.dao.DAOFactory;
import edu.ijse.gdse43.dao.db.DBConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DEll
 */
public class ExamController {

    private static ExamDAO examDAO = (ExamDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.EXAM);
    private static ExamDetailsDAO examDetailsDAO = (ExamDetailsDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.EXAMDETAILS);

    public static boolean addExam(ExamDTO exam, ExamDetailsDTO examDetails) {

        Connection connection = null;

        try {
            connection = DBConnection.getInstance().getConnection();

            connection.setAutoCommit(false);

            boolean isExamAdded = examDAO.add(exam);
            if (!isExamAdded) {
               connection.rollback();
                System.out.println("printsagefygsayfgsayfgsaygfysagyfsadgfgasdf");
                return false;
            }
            isExamAdded = examDetailsDAO.add(examDetails);
            System.out.println("print");
            if (!isExamAdded) {
                connection.rollback();
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(ExamController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(ExamController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }
    public static ArrayList<ExamDTO>getAllExams()throws Exception{
         ArrayList<ExamDTO>allExams=examDAO.getAll();
        return allExams;
    }

}

 