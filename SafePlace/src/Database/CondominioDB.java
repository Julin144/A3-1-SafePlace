/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import Models.CondominioModel;
/**
 *
 * @author Thais Dias
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class CondominioDB {
    
    public CondominioModel[] buscarCondominios() throws Exception {
        String sql = "SELECT * FROM CONDOMINIO";
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = ps.executeQuery()) {

            int totalDeCondominios = rs.last() ? rs.getRow() : 0;
            CondominioModel[] condominios = new CondominioModel[totalDeCondominios];
            rs.beforeFirst();
            int contador = 0;
            
            while (rs.next()) {
                int id = rs.getInt("idCondominio");
                String nome = rs.getString("nome");
                String endereco = rs.getString("endereco");
                
                condominios[contador++] = new CondominioModel(id, nome, endereco);
            }
            return condominios;
            
            
        }
    }
    
}
