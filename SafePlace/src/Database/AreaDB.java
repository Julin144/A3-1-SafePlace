/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import Models.AreaModel;
import Models.CondominioModel;
import Models.UsuarioModel;

/**
 *
 * @author 822158274
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class AreaDB {
    
    public AreaModel[] buscarAreas(CondominioModel condominio) throws Exception {
        String sql = "SELECT * FROM AREA WHERE idCondominio = ?";
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                ) {

            ps.setInt(1, condominio.getIdCondominio());
            ResultSet rs = ps.executeQuery();
                        
            int totalDeAreas = rs.last() ? rs.getRow() : 0;
            AreaModel[] areas = new AreaModel[totalDeAreas];
            rs.beforeFirst();
            
            int contador = 0;
            while (rs.next()) {
                int id = rs.getInt("idArea");
                String descricao = rs.getString("descricao");
                int doses = rs.getInt("dosesRequisitadas");
                
                areas[contador++] = new AreaModel(id, descricao, doses);
            }
            return areas;
        }
    }
    
    public void inserirArea(AreaModel area) throws Exception {
        String sql = "INSERT INTO Area(descricao,dosesRequisitadas) VALUES (?,?);";
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(sql);) {
            
            ps.setString(1, area.getDescricao());
            ps.setInt(2, area.getDosesRequisitadas());
            
            
            ps.execute();
        }
    }
}