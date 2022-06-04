/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Models.InquilinoModel;
/**
 *
 * @author 822158274
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InquilinoDB {
    
    InquilinoModel inquilino = new InquilinoModel();
    
    public void inserirInquilino() throws Exception {


        String sql = "INSERT INTO Inquilino(nome,cpf ,aprtNumero) VALUES (?,?,?);";
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {
            
            ps.setString(1, inquilino.getNome());
            ps.setInt(2, inquilino.getCpf());
            ps.setInt(3, inquilino.getAprtNumero());
            
            ResultSet rs = ps.executeQuery();
        }
    }

    public InquilinoModel[] buscarInquilino() throws Exception {
        String sql = "SELECT * FROM INQUILINO";
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = ps.executeQuery()) {

            int totalInquilinos = rs.last() ? rs.getRow() : 0;
            InquilinoModel[] inquilinos = new InquilinoModel[totalInquilinos];
            rs.beforeFirst();
            int contador = 0;
            
            while (rs.next()) {
                InquilinoModel inq = new InquilinoModel();
                
                int id = rs.getInt("idInquilino");
                String nome = rs.getString("nome");
                int CPF = rs.getInt("cpf");
                int apartNumero = rs.getInt("aprtNumero");
                
                inq.setIdInquilino(id);
                inq.setNome(nome);
                inq.setCpf(CPF);
                inq.setAprtNumero(apartNumero);
                
                inquilinos[contador++] = inq;
            }
            return inquilinos;
        }
    }
   
    public void updateInquilino() throws Exception {


        String sql = "UPDATE Inquilino SET nome = ?,cpf= ?,aprtNumero= ? WHERE  idInquilino = ?";
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {
            
            ps.setString(1, inquilino.getNome());
            ps.setInt(2, inquilino.getCpf());
            ps.setInt(3, inquilino.getAprtNumero());
            ps.setInt(4, inquilino.getIdInquilino());
            
            ResultSet rs = ps.executeQuery();
        }
    }
    
    public void deleteInquilino() throws Exception {


        String sql = "DELETE FROM Inquilino WHERE idInquilino = ?;";
        try (Connection conn = Conexao.obterConexao();
                PreparedStatement ps
                = conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);) {
           
            ps.setInt(1, inquilino.getIdInquilino());       
            
            ResultSet rs = ps.executeQuery();
        }
    }
}
