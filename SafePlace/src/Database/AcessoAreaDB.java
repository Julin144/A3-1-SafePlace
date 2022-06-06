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
import java.text.SimpleDateFormat;

public class AcessoAreaDB {

    //AcessoAreaModel acessoArea = new AcessoAreaModel();
    public void inserirAcessoArea(AcessoAreaModel acessoArea) throws Exception {
        String sql = "INSERT INTO AcessoArea(idInquilino,idArea,hrIni,hrFim) VALUES (?,?,?,?);";
        try ( Connection conn = Conexao.obterConexao();  PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {

            ps.setInt(1, acessoArea.getIdInquilino());
            ps.setInt(2, acessoArea.getIdArea());
            ps.setString(3, acessoArea.getHrIni());
            ps.setString(4, acessoArea.getHrFim());

            int rs = ps.executeUpdate();
        }
    }

    public void updateAcessoArea(AcessoAreaModel acessoArea) throws Exception {

        String sql = "UPDATE AcessoArea SET hrIni = ?, hrFim = ? WHERE idAcesso = ?";
        try ( Connection conn = Conexao.obterConexao();  PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {

            ps.setString(1, acessoArea.getHrIni());
            ps.setString(2, acessoArea.getHrFim());
            ps.setInt(3, acessoArea.getIdAcesso());

            int rs = ps.executeUpdate();
        }
    }
    
    public void delete(AcessoAreaModel acessoArea) throws Exception {

        String sql = "DELETE FROM AcessoArea WHERE idAcesso = ?;";
        try ( Connection conn = Conexao.obterConexao();  PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {

            ps.setInt(1, acessoArea.getIdAcesso());

            int rs = ps.executeUpdate();
        }
    }

    public AcessoAreaModel[] buscarAcessosArea(AreaModel area) throws Exception {;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:MM:ss");

        String sql = "SELECT ace.idAcesso, ace.idInquilino, ace.idArea, date_format(ace.hrIni, '%d/%m/%Y %H:%i:%S') hrIni, date_format(ace.hrFim, '%d/%m/%Y %H:%i:%S') hrFim FROM AcessoArea ace WHERE idArea = ? ORDER BY ace.idInquilino;";
        try ( Connection conn = Conexao.obterConexao();  PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {

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
                String hrIni = rs.getString("hrIni");
                String hrFim = rs.getString("hrFim");

                acessoArea.setIdAcesso(idAcesso);
                acessoArea.setIdInquilino(idInquilino);
                acessoArea.setIdArea(idArea);
                acessoArea.setHrIni(hrIni);
                acessoArea.setHrFim(hrFim);

                acessos[contador++] = acessoArea;
            }
            return acessos;
        }
    }
    
    public AcessoAreaModel[] buscarAcessosInquilino(InquilinoModel inquilino) throws Exception {;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:MM:ss");

        String sql = "SELECT ace.idAcesso, ace.idInquilino, ace.idArea, date_format(ace.hrIni, '%d/%m/%Y %H:%i:%S') hrIni, date_format(ace.hrFim, '%d/%m/%Y %H:%i:%S') hrFim FROM AcessoArea ace WHERE idInquilino = ?;";
        try ( Connection conn = Conexao.obterConexao();  PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {

            ps.setInt(1, inquilino.getIdInquilino());
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
                String hrIni = rs.getString("hrIni");
                String hrFim = rs.getString("hrFim");

                acessoArea.setIdAcesso(idAcesso);
                acessoArea.setIdInquilino(idInquilino);
                acessoArea.setIdArea(idArea);
                acessoArea.setHrIni(hrIni);
                acessoArea.setHrFim(hrFim);

                acessos[contador++] = acessoArea;
            }
            return acessos;
        }
    }
}
