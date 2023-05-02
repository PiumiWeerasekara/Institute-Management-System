/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.dao;

import edu.ijse.dao.custom.StudentDAO;
import edu.ijse.dao.custom.impl.BatchDAOImpl;
import edu.ijse.dao.custom.impl.ExamDAOImpl;
import edu.ijse.dao.custom.impl.ExamDetailsDAOImpl;
import edu.ijse.dao.custom.impl.PaymentDAOImpl;
import edu.ijse.dao.custom.impl.RegistrationDAOImpl;
import edu.ijse.dao.custom.impl.RegistrationDetailsDAOImpl;
import edu.ijse.dao.custom.impl.SheduleDAOImpl;
import edu.ijse.dao.custom.impl.StudentDAOImpl;
import edu.ijse.dao.custom.impl.SubjectDAOImpl;
import edu.ijse.dao.custom.impl.TeacherDAOImpl;

/**
 *
 * @author DEll
 */
public class DAOFactory {

    public enum DAOTypes {

        TEACHER,STUDENT,REGISTRATION,BATCH,CLASS,EXAM,CLASSDETAILS,EXAMDETAILS,PAYMENT,SHEDULE,SUBJECT,REGISTRATIONDETAILS;
    }
    private static DAOFactory daoFactory;

    private DAOFactory() {

    }

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public SuperDAO getDAO(DAOTypes dAOType) {
        switch (dAOType) {
            case TEACHER:
                return new TeacherDAOImpl();
            case STUDENT:
                return new StudentDAOImpl();
            case PAYMENT:
                return new PaymentDAOImpl();
            case BATCH:
                return new BatchDAOImpl();
            case SHEDULE:
                return new SheduleDAOImpl();
            case SUBJECT:
                return new SubjectDAOImpl();
            case REGISTRATION:
                return new RegistrationDAOImpl();
            case EXAM:
                return new ExamDAOImpl();
            case EXAMDETAILS:
                return new ExamDetailsDAOImpl();
                 case REGISTRATIONDETAILS:
                return new RegistrationDetailsDAOImpl();
            default:
           
                return null;
        }
    }
}
