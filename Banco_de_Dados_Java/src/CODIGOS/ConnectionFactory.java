/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mael
 */
public class ConnectionFactory {
public static Connection createConnection(String banco_de_dados) {

    Connection conexao = null;
    
    try {
      conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+banco_de_dados+"", "root", "");
    } catch (SQLException e) {
    }
    return conexao;
    
} 
    
    
}
