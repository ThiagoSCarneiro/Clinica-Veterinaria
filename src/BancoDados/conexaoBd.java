/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexaoBd {

    private static final String URL = "jdbc:mysql://localhost:3306/clinica_vet";
    private static final String USER = "root";
    private static final String SENHA = "root";

    private static Connection conn;

    public static Connection getConexao(){

        if (conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USER, SENHA);
                return conn;
            } catch (SQLException e) {
                Logger.getLogger(conexaoBd.class.getName()).log(Level.SEVERE, null, e);
                return null;
            }//try
        } else {
            return conn;
        }// if
    }//getconctio

}
