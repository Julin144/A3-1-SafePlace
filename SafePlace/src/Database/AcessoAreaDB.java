/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;


import Models.AcessoAreaModel;
import Models.AreaModel;
import Models.InquilinoModel;


/**
 *
 * @author 822158274
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class AcessoAreaDB {
    
    AcessoAreaModel acessoArea = new AcessoAreaModel();
    
    public void inserirAcessoArea() throws Exception {


        String sql = "INSERT INTO AcessoArea(idInquilino,idArea,hrIni,hrFim) VALUES (?,?,?,?);";
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {
            
            ps.setInt(1, acessoArea.getIdInquilino());
            ps.setInt(2, acessoArea.getIdArea());
            ps.setTimestamp(3, acessoArea.getHrIni());
            ps.setTimestamp(4, acessoArea.getHrFim());
            
            ResultSet rs = ps.executeQuery();
        }
    }

    public AcessoAreaModel[] buscarAcessoArea(AreaModel area) throws Exception {
        String sql = "SELECT * FROM AcessoArea WHERE idArea = ?";
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                ) {
            
            ps.setInt(1, area.getIdArea());
            ResultSet rs = ps.executeQuery();

            int totalAcessos = rs.last() ? rs.getRow() : 0;
            AcessoAreaModel[] acessos = new AcessoAreaModel[totalAcessos];
            rs.beforeFirst();
            int contador = 0;
            
            while (rs.next()) {
                int id = rs.getInt("idAcesso");
                int idInquilino = rs.getInt("idInquilino");
                Timestamp hrIni = rs.getTimestamp("hrIni");
                Timestamp hrFim = rs.getTimestamp("hrFim");
                
                acessos[contador++] = new AcessoAreaModel();
            }
            return acessos;
        }
    }
   
    public void updateAcessoArea() throws Exception {


        String sql = "UPDATE AcessoArea SET idInquilino = ?,idArea= ?,hrIni= ?,hrFim= ? WHERE  idArea = ?";
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {
            
            ps.setInt(1, acessoArea.getIdInquilino());
            ps.setInt(2, acessoArea.getIdArea());
            ps.setTimestamp(3, acessoArea.getHrIni());
            ps.setTimestamp(4, acessoArea.getHrFim());
            ps.setInt(5, acessoArea.getIdAcesso());
            
            ResultSet rs = ps.executeQuery();
        }
    }
    //AreaModel area, InquilinoModel inquilino
    public AcessoAreaModel[] buscarAcessoInquilino(AreaModel area) throws Exception {;
        //String sql = "SELECT inq.nome, inq.aprtNumero, ace.hrIni, ace.hrFim FROM AcessoArea ace, Inquilino inq WHERE idArea = 1, idInquilino = 1"; THAIS
        String sql = "SELECT * FROM AcessoArea ace WHERE idArea = ?";
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                ) {
            
            ps.setInt(1, area.getIdArea());
            ResultSet rs = ps.executeQuery();

            int totalAcessos = rs.last() ? rs.getRow() : 0;
            AcessoAreaModel[] acessos = new AcessoAreaModel[totalAcessos];
            rs.beforeFirst();
            int contador = 0;
            
            while (rs.next()) {
                AcessoAreaModel acessoArea = new AcessoAreaModel();
                
                int idAcesso = rs.getInt("idAcesso");
                int idInquilino = rs.getInt("idInquilino");
                int idArea = rs.getInt("idArea");
                //Timestamp hrIni = rs.getTimestamp("hr");
                //Timestamp hrFim = rs.getTimestamp("hrFim");
                
                acessoArea.setIdAcesso(idAcesso);
                acessoArea.setIdInquilino(idInquilino);
                acessoArea.setIdArea(idArea);
                
                acessos[contador++] = acessoArea;
            }
            return acessos;
        }
    }

    public void delete() throws Exception {


        String sql = "DELETE FROM AcessoArea WHERE idAcesso = ?;";
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {
             
            ps.setInt(1, acessoArea.getIdAcesso());   
            
            ResultSet rs = ps.executeQuery();
        }
    }

}
