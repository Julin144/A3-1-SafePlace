package Controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
        
        private Connection conexao;
    
        public Connection abrirConexao(){
        String url = "jdbc:mysql:localhost:3306/sadb";
        String user = "Alunos";
        String password = "alunos";
        try {
            conexao = DriverManager.getConnection(url,user,password);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexao;
    }
}