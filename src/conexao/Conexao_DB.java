/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Conexao_DB {
    public static Connection conectar_db() throws SQLException{
    try{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/login_banco","root","123456");
        
        return conn;
    }catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
     }
   }
}
