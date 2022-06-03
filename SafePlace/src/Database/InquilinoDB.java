/*
<<<<<<< HEAD
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

/**
 *
 * @author Thais Dias
 */
public class InquilinoDB {
    
=======
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
                int id = rs.getInt("idInquilino");
                //
                String nome = rs.getString("nome");
                int CPF = rs.getInt("cpf");
                int apartNumero = rs.getInt("aprtNumero");
                
                inquilinos[contador++] = new InquilinoModel();
            }
            return inquilinos;
        }
    }
>>>>>>> 4a2c3f9182ff0c3f5dc4f6bcad0748fdfcb31c1d
}
