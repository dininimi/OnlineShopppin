/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.NIMI.OnlineShopping.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class dbConnection {
    
   
    private Connection conn;
    private static dbConnection dbConnections;
    
    private dbConnection()throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","");
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public static dbConnection getDbConnection()throws ClassNotFoundException,SQLException{
        if(dbConnections==null){
            dbConnections=new dbConnection();
        }
        return dbConnections;
    }
   /*public static Connection con(){
       Connection con=null;
       try{
           Class.forName("com.mysql.cj.jdbc.Driver"); 
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","");
           
           if(con!=null){
               System.out.print("Connected");
           }
       }catch(ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
       return con; 
   }*/
    
}
