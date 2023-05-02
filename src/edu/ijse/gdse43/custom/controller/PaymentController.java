/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.custom.controller;

import edu.ijse.dao.custom.PaymentDAO;
import edu.ijse.gdse43.core.dto.PaymentDTO;
import edu.ijse.gdse43.dao.DAOFactory;
import java.util.ArrayList;

/**
 *
 * @author DEll
 */
public class PaymentController {

    private static PaymentDAO paymentDAO = (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);

    public static boolean addPayment(PaymentDTO payment) throws Exception {
        boolean result = paymentDAO.add(payment);
        return result;
    }

    public static boolean deletePayment(PaymentDTO payment) throws Exception {
        boolean result = paymentDAO.delete(payment);
        return result;
    }

    public static boolean updatepayment(PaymentDTO payment) throws Exception {
        boolean result = paymentDAO.update(payment);
        return result;
    }

    public static PaymentDTO searchPayment(String payment) throws Exception {
        PaymentDTO searchPayment = paymentDAO.search(payment);
        return searchPayment;
    }

    public static ArrayList<PaymentDTO> getAllPayments() throws Exception {
        ArrayList<PaymentDTO> allPayments =paymentDAO.getAll();
        return allPayments;
    }
}


