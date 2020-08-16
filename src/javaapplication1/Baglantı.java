/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author User
 */ 
public class Baglantı {
    public static Connection bag(){
        String URL = "jdbc:mysql://localhost/ogr_sist";
        String USER = "root";
        String PASS = "root";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
           }
    
        
    }
}
