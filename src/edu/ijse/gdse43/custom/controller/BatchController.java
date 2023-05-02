/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.custom.controller;

import edu.ijse.dao.custom.BatchDAO;
import edu.ijse.gdse43.core.dto.BatchDTO;
import edu.ijse.gdse43.dao.DAOFactory;
import java.util.ArrayList;

/**
 *
 * @author DEll
 */
public class BatchController {
   private static BatchDAO batchDAO=(BatchDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BATCH);
   public static boolean addBatch(BatchDTO batch)throws Exception{
       boolean result=batchDAO.add(batch);
       return result;
       
   }
   public static ArrayList<BatchDTO> getAllBatches()throws Exception{
       ArrayList<BatchDTO> result=batchDAO.getAll();
       return result;
   }
   public static BatchDTO searchBatchName(String name) throws Exception {
        BatchDTO searchSubjectName = batchDAO.search(name);
        return searchSubjectName;
    }
   
   public static BatchDTO searchBatchID(String id)throws Exception{
       BatchDTO searchBatchID=batchDAO.search(id);
       return searchBatchID(id);
   }
    

    
}
