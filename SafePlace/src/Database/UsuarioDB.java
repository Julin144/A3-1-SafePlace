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
    
    public void inserirUsuario(UsuarioModel usuario) throws Exception 
    {
        String sql = "INSERT INTO USUARIO (LOGIN, SENHA, TIPO) VALUES (?, ?, ?);";
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(sql);) 
        {
            
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getTipo());
            
            ps.execute();
        }
    }
    
        public UsuarioModel[] buscarUsuario() throws Exception {
        String sql = "SELECT * FROM USUARIO";
        try ( Connection conn = Conexao.obterConexao();  PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);  ResultSet rs = ps.executeQuery()) {

            int totalUsuarios = rs.last() ? rs.getRow() : 0;
            UsuarioModel[] Usuarios = new UsuarioModel[totalUsuarios];
            rs.beforeFirst();
            int contador = 0;

            while (rs.next()) {
                UsuarioModel user = new UsuarioModel();
                
                            
                
                int id = rs.getInt("idUsuario");
                String login = rs.getString("login");
                String senha = rs.getString("Senha");
                String tipo = rs.getString("tipo");
                
                user.setIdUsuario(id);
                user.setLogin(login);
                user.setSenha(senha);
                user.setTipo(tipo);

                Usuarios[contador++] = user;
            }
            return Usuarios;
        }
    }

    public void updateUsuario(UsuarioModel user) throws Exception {

        String sql = "UPDATE Usuario SET login = ?,senha= ?,tipo= ? WHERE  idUsuario = ?";
        try ( Connection conn = Conexao.obterConexao();  PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {

            ps.setString(1, user.getLogin());
            ps.setString(2, user.getSenha());
            ps.setString(3, user.getTipo());
            
            ps.setInt(4,user.getIdUsuario());
            
            int rs = ps.executeUpdate();
        }
    }

    public void deleteUsuario(UsuarioModel user) throws Exception {

        String sql = "DELETE FROM Usuario WHERE idUsuario = ?;";
        try ( Connection conn = Conexao.obterConexao();  PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {

            ps.setInt(1, user.getIdUsuario());

            int rs = ps.executeUpdate();
        }
    }

    public boolean existeUsuario(UsuarioModel user) throws Exception {
        String sql = "select * from Usuario where idUsuario = ?;";

        boolean r;
        try ( Connection conn = Conexao.obterConexao();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, user.getIdUsuario());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                r = true;
            } else {
                r = false;
            }

            return r;
        }
    }
}