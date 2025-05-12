/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adega;

import java.sql.SQLException;

/**
 *
 * @author joaov
 */
public class Adega {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Conexao c1 = new Conexao();
        c1.getConnection();  
        Tela tela= new Tela();
        tela.setVisible(true);
    }
    
}
