/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.sql.*;

/**
 *
 * @author irmoura
 */
public class Criar_Base {      
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        
   try{
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");
      System.out.println("Creating database...");
      stmt = conn.createStatement();   
      String sql = "CREATE DATABASE STUDENTS";//COMANDO PARA CRIAR BASE DE DADOS
      stmt.executeUpdate(sql);
      System.out.println("Database created successfully...");
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
    }
}
