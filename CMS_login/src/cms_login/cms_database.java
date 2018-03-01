/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in t

/**
 *
 * @author winnie
 */

package cms_login;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
/**
 *
 * @author Winnie Achieng
 */
public class cms_database {
    
    public static void main(String[]args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mashina","root","myme.5ksix7");
            Statement st=(Statement) conn.createStatement();
            System.out.println("Connected");
            
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
    
}
