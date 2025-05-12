/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adega;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author alunocmc
 */
public class Banco {
    Bebidas bebida = new Bebidas ();
    Connection conexao = null;
    
    public void Cadastrar (Bebidas bebida) throws SQLException, ClassNotFoundException{
        PreparedStatement ps;
        conexao = new Conexao().getConnection();
        ps=conexao.prepareStatement("insert into bebidas (nome, preco, atributo, tipo) values (?,?,?,?)");
        ps.setString(1,bebida.getNome());
        ps.setDouble(2,bebida.getPreco());
        ps.setString(3,bebida.getAtributo());
        ps.setString(4,bebida.getTipo());
        ps.execute();
    }
    
    public List<Bebidas> consultarOferta() throws ClassNotFoundException, SQLException {
        Connection conexao = new Conexao().getConnection();
        PreparedStatement ps;
        ps = conexao.prepareStatement("SELECT nome, tipo, preco, atributo FROM bebidas WHERE tipo = ?");
        ps.setString(1, bebida.getTipo());
        ps.execute();
        ResultSet rs = ps.executeQuery(); 
        
        var lprod = new ArrayList<Bebidas>();
        int cont = 0;
        while(rs.next()){
            Bebidas bebida = new Bebidas();
            bebida.setNome(rs.getString("nome"));
            bebida.setPreco(rs.getDouble("preco"));
            bebida.setAtributo(rs.getString("atributo"));
            bebida.setTipo(rs.getString("tipo"));
            
            lprod.add(bebida);
            cont = cont + 1;
        }
        System.out.println("Cont..: " + cont);        
        conexao.close();
        return lprod;

    }
    
    public List<Bebidas> consultarTodos() throws ClassNotFoundException, SQLException  {
        Connection conexao = new Conexao().getConnection();
        PreparedStatement comando = conexao.prepareStatement("select * from bebidas");        
        ResultSet rs = comando.executeQuery();        
        var lprod = new ArrayList<Bebidas>();
        int cont = 0;
        while(rs.next()){
            Bebidas bebida = new Bebidas();
            bebida.setNome(rs.getString("nome"));
            bebida.setPreco(rs.getDouble("preco"));
            bebida.setAtributo(rs.getString("atributo"));
            bebida.setTipo(rs.getString("tipo"));
            
            lprod.add(bebida);
            cont = cont + 1;
        }
        System.out.println("Cont..: " + cont);        
        conexao.close();
        return lprod;
    }    

} 


