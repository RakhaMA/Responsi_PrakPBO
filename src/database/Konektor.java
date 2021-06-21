/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
// KONEKTOR DATABASE
/**
 *
 * @author rakha mohammad
 */
public class Konektor {
    String DBurl = "jdbc:mysql://localhost/prak_pbo";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;

    public Konektor() {
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Connection Successful");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Connection Failed");
        }
    } 
}
