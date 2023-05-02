/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.gdse43.view;

/**
 *
 * @author DEll
 */
public class Screen {
    
    public static void main(String[] args) {
         SplashScreen splashScreen=new SplashScreen();
              splashScreen.setVisible(true);
              Login login=new Login();
              try {
                     for (int i = 0; i <=100; i++) {
                         Thread.sleep(40);
                         splashScreen.loadNum.setText(Integer.toString(i)+"%");
                         splashScreen.progressBar.setValue(i);
                         if(i==100){ 
                             splashScreen.setVisible(false);
                             login.setVisible(true);
                         }
                      
                  }
 
                  } catch (Exception e) {
                  }
    }
}
