/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineshopping;

import lk.NIMI.OnlineShopping.Controller.dbConnection;
import lk.NIMI.OnlineShopping.View.AdminForm;
import lk.NIMI.OnlineShopping.View.MainFrame;
import lk.NIMI.OnlineShopping.View.loginForm;
import lk.NIMI.OnlineShopping.View.signinForm;

/**
 *
 * @author ASUS
 */
public class OnlineShopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //AdminForm n=new AdminForm();
        loginForm n=new loginForm();
        //MainFrame n=new MainFrame();
        n.setVisible(true);
      
    }
    
}
