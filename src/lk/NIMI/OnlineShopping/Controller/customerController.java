/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.NIMI.OnlineShopping.Controller;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import lk.NIMI.OnlineShopping.Model.Customer;

/**
 *
 * @author ASUS
 */
public class customerController {
    
    public static int addCustomer(Customer c)throws ClassNotFoundException,SQLException{
        
        String sql = "insert into customer(name,userName,email,tel,password,birthday,address) values('"+c.getName()+"','"+c.getUserName()+"','"+c.getEmail()+"','"+c.getTel()+"','"+c.getPassword()+"','"+c.getDob()+"','"+c.getAddress()+"')"; 
        Connection conn= dbConnection.getDbConnection().getConnection();
        Statement stm=conn.createStatement();
        int res=stm.executeUpdate(sql);
        
        return res;
    }
}
