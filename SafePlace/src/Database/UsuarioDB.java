/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import Database.Conexao;
import Models.UsuarioModel;

/**
 *
 * @author 822158274
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class UsuarioDB {
    
    public boolean login(UsuarioModel user) throws SQLException{
    
        String sql = "select idUsuario,nome,senha,tipo from Usuario where senha = ? and login = ? ;";

        boolean r = false;
        
        try ( Connection conexao = Conexao.obterConexao();
        PreparedStatement ps = conexao.prepareStatement(sql)){
        ps.setString(1, sql);
        ps.setString(2, sql);
        
        ResultSet rs = ps.executeQuery();
        
        if(rs.next()){
           user.setTipo(rs.getString("tipo"));
           user.setIdUsuario(rs.getInt("idUsuario"));
           r =  true;
        }
        else{
            r = false;
        }
        
        return r;
    }
 }
}
