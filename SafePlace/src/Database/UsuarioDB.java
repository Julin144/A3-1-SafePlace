/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import Models.UsuarioModel;

/**
 *
 * @author 822158274
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class UsuarioDB {
    
    public boolean login(UsuarioModel user) throws Exception{
    
        String sql = "select idUsuario,login,senha,tipo from Usuario where senha = ? and login = ? ;";

        boolean r;
        
        try (Connection conn = Conexao.obterConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
        ps.setString(1, user.getSenha());
        ps.setString(2, user.getLogin());
        
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