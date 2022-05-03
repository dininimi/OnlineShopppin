/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.NIMI.OnlineShopping.Controller;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lk.NIMI.OnlineShopping.Model.Item;

/**
 *
 * @author ASUS
 */
public class cartController {
    
    
    public void addToCart(Item i,int qty)throws SQLException,ClassNotFoundException{
    
        String sql = "insert into cart(brandName,model,price,quantity) values('"+i.getBrandName()+"','"+i.getModel()+"','"+i.getPrice()+"','"+qty+"')";
        Connection conn= dbConnection.getDbConnection().getConnection();
        Statement stm=conn.createStatement();
        int res=stm.executeUpdate(sql);
    
    }
    public ResultSet loadCart()throws SQLException,ClassNotFoundException{
        Item i=new Item();
        String Sql="SELECT * from cart";
        Connection conn= dbConnection.getDbConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery(Sql);
        
        
        
        return rst;
    
    }
    public void clearCart() throws SQLException,ClassNotFoundException{
        String sql = "truncate table cart";
        Connection conn= dbConnection.getDbConnection().getConnection();
        Statement stm=conn.createStatement();
        int res=stm.executeUpdate(sql);
    }
}
