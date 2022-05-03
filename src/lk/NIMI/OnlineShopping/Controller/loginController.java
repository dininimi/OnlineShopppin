/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.NIMI.OnlineShopping.Controller;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import lk.NIMI.OnlineShopping.Model.Customer;
import java.sql.*;

/**
 *
 * @author ASUS
 */
public class loginController {
    
    public static Customer checkLogin(String userName)throws ClassNotFoundException,SQLException{
        
        String Sql="SELECT userName,password FROM `customer` WHERE userName='chathu'";
        Connection conn= dbConnection.getDbConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery(Sql);
        
        if(rst.next()){
            Customer c=new Customer(rst.getString("userName"),rst.getString("password"));
            return c;
            
        }else{
            return null;
        }
        
        
        
      
        
    }
    
}
