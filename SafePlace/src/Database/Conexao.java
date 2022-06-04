package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public final class Conexao {
    private static String host = "localhost";//MEU DB
    //private static String host = "127.0.0.1";//DB SAOJUDAS
    private static String porta = "3306";
    private static String db = "SAFEPLACE";
    private static String usuario = "root", senha = "Vercy@9141";//DB SAOJUDAS
    //private static String usuario = "REI", senha = "1234";//MEU DB
    
    public static Connection obterConexao() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");// ACESSO A LIB MYSQL
        //string de conexao
        //jdbc:mysql://localhost:3306/2021_usjt_psc_segunda_sistema_academico
        String url = String.format(
            "jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC", host, porta, db
        );
        
        return DriverManager.getConnection(
            url,
            usuario,
            senha
        );
    }
}