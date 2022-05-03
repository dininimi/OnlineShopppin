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
import lk.NIMI.OnlineShopping.Model.Customer;
import lk.NIMI.OnlineShopping.Model.Item;



/**
 *
 * @author ASUS
 */
public class itemController {
    
    public static int addItem(Item i)throws ClassNotFoundException,SQLException{
        String sql = "Insert into item(id,brandName,model,price,features,stock,item_type,image) values('"+1+"','"+i.getBrandName()+"','"+i.getModel()+"','"+i.getPrice()+"','"+i.getFeatures()+"','"+i.getStock()+"','"+i.getItemType()+"','"+i.getImg()+"')";
        Connection conn= dbConnection.getDbConnection().getConnection();
        Statement stm=conn.createStatement();
        int res=stm.executeUpdate(sql);
        
        return res;
        
    }
    
    public static ResultSet loadItem(String type) throws SQLException,ClassNotFoundException{
            
        Item i=new Item();
        String Sql="SELECT * from Item where item_type='"+type+"'";
        Connection conn= dbConnection.getDbConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery(Sql);
        
        
        
        return rst;
       /* if(rst.next()){
            i.setBrandName(rst.getString("brandName"));
            i.setModel(rst.getString("model"));
            i.setPrice(Double.parseDouble(rst.getString("price")));
            i.setFeatures(rst.getString("features"));
            i.setStock(Integer.parseInt(rst.getString("stock")));
            i.setItemType(rst.getString("item_type"));
            i.setImg(rst.getString("image"));
            
            return i;
            
        }else{
            return null;
        }*/
        
    
      
    }
    public void getItemToItemDtail(Item i){
            
    
    }
    public void sendItemToItemDetail(){
        
    }
    
   
}
