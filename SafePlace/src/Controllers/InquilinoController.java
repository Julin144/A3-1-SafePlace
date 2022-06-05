/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Database.InquilinoDB;
import Dto.Request.*;
import Models.InquilinoModel;
import View.TelaCadastroInquilino;
import View.TelaLogin;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Jack
 */
public class InquilinoController 
{
    public InquilinoDB _inquilinoDb;
    public InquilinoModel inquilinoSelecionado;
    public boolean erroReq = false;
    
    public InquilinoController()
    {
        _inquilinoDb = new InquilinoDB();
    }
    
    public InquilinoModel[] montarListaInquilino() throws Exception 
    {
        InquilinoModel[] inquilinos;
        inquilinos = _inquilinoDb.buscarInquilino();
        //this.inquilinoSelecionado = inquilinos != null ? inquilinos[0] : null;
        
        return inquilinos;
    }
    
    public String CadastrarInquilino(CadastroInquilinoRequestDto request)
    {
        String result = "";
        
        InquilinoModel inquilino = new InquilinoModel();
        
        inquilino.setNome(request.getNomeInquilino());
        inquilino.setCpf(request.getCpfInquilino());
        inquilino.setAprtNumero(Integer.parseInt(request.getNumeroApInquilino()));
        
        try
        {
            if(!_inquilinoDb.existeInquilino(inquilino)){
                _inquilinoDb.inserirInquilino(inquilino);
                inquilinoSelecionado = inquilino;
                
                result = "Inquilino cadastrado com sucesso!";
                erroReq = false;
            } else {
                result = "Inquilino com o mesmo CPF já cadastrado, favor alterar!";
                erroReq = true;
            }
        }catch(Exception e)
        {
            Logger.getLogger(TelaCadastroInquilino.class.getName()).log(Level.SEVERE, null, e);
            result = "Erro durante o cadastro do inquilino.";
            erroReq = true;
        }
        
        return result;
    }
 
    public String atualizarInquilino()
    {
        String result = "";  
        
        try
        {
            if(this.inquilinoSelecionado != null) {
                _inquilinoDb.updateInquilino(this.inquilinoSelecionado);
                result = "Inquilino atualizado com sucesso!";
                erroReq = false;
            }
        }catch(Exception e)
        {
            Logger.getLogger(TelaCadastroInquilino.class.getName()).log(Level.SEVERE, null, e);
            result = "Erro durante a atualização do inquilino.";
            erroReq = true;
        }
        
        return result;
    }
    
    public String deletarInquilino()
    {
        String result = "";  
        
        try
        {
            _inquilinoDb.deleteInquilino(this.inquilinoSelecionado);
            result = "Inquilino Excluido com sucesso!";
            erroReq = false;
        }catch(Exception e)
        {
            Logger.getLogger(TelaCadastroInquilino.class.getName()).log(Level.SEVERE, null, e);
            result = "Erro durante a Exclusão do inquilino.";
            erroReq = true;
        }
        
        return result;
    }
    
    public void setInquilino(InquilinoModel inquilino) {
        this.inquilinoSelecionado = inquilino;
    }
}
