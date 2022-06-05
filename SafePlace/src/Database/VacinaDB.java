/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import Models.VacinaModel;
/**
 *
 * @author 822158274
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class VacinaDB {
    
    VacinaModel vac = new VacinaModel();
    
    public void inserirVacina(VacinaModel vacina) throws Exception {


        String sql = "INSERT INTO Vacina(tipo,qtdDose) VALUES (?,?);";
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {
            
            ps.setString(1, vacina.getTipo());
            ps.setInt(2, vacina.getQtdDose());
            
            ps.execute();
        }
    }


    public VacinaModel[] buscarVacina() throws Exception {
    
        String sql = "SELECT * FROM Vacina WHERE idVacina= ?";
        
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                ) {
            
            ps.setInt(1, vac.getIdVacina());
            ResultSet rs = ps.executeQuery();

            int totalVacinas = rs.last() ? rs.getRow() : 0;
            
            VacinaModel[] vacinas = new VacinaModel[totalVacinas];
            rs.beforeFirst();
            
            int contador = 0;
            
            while (rs.next()) {
                VacinaModel vac = new VacinaModel();
                
                int id = rs.getInt("idVacina");
                int idInq   = rs.getInt("idInquilino");
                String tipo = rs.getString("tipo");
                int qntDose = rs.getInt("qtdDose");
                
                vac.setIdVacina(id);
                vac.setIdInquilino(idInq);
                vac.setTipo(tipo);
                vac.setQtdDose(qntDose);
                
                vacinas[contador++] = vac;
            }
            return vacinas;
        }
    }
   
    public void updateVacina() throws Exception {

        String sql = "UPDATE Vacina SET     tipo = ?, qtdDose= ? WHERE   idVacina = ?;";
        
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {
            
            ps.setString(1,vac.getTipo());
            ps.setInt(2, vac.getQtdDose());
            ps.setInt(3, vac.getIdVacina());
     
            
            ResultSet rs = ps.executeQuery();
        }
    }
    
    public void deleteVacina() throws Exception {

        String sql = "DELETE FROM   Vacina WHERE  idVacina = ?;";

        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {
           
            ps.setInt(1, vac.getIdVacina());       
            
            ResultSet rs = ps.executeQuery();
        }
    }
}