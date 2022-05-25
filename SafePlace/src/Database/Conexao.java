package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class Conexao {
        

    
        public static Connection obterConexao() throws SQLException, ClassNotFoundException {
            Class.forName("com.mysql.cj.jdbc.Driver");    

            String url = "jdbc:mysql:localhost:3306/SAFEPLACE?useTimezone=true&serverTimezone=UTC";
            String user = "Alunos";
            String password = "alunos";

            return DriverManager.getConnection(url,user,password);
        }
}