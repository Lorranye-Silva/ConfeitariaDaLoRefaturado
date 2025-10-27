/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author lorra
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/lorranye_confeitaria";
        String user = "root";
        String password = "admin123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, password);
    }
}

