/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adega;
import java.sql.*;

public class Conexao {
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/adega", "root", "");
        Class.forName("com.mysql.cj.jdbc.Driver");
        return conexao;
    } 
}