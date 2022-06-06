/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Database.CondominioDB;
import Dto.Request.CadastroCondominioRequestDto;
import Models.CondominioModel;
import View.TelaCadastroCondominio;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jack
 */
public class CondominioController 
{
    CondominioDB _condominioDB;
    public CondominioModel condominioSelecionado;
    public boolean erroReq = false;
    
    public CondominioController()
    {
       _condominioDB = new CondominioDB();
    }
    
       
    public CondominioModel[] mostrarListaCondominio() throws Exception{
        CondominioModel[] condominios;
        condominios = _condominioDB.buscarCondominios();
        
        return condominios;
    }
    
    public String CadastrarCondominio(CadastroCondominioRequestDto request)
    {
        String result;
        
        CondominioModel condominio = new CondominioModel();
        
        condominio.setNome(request.getNome());
        condominio.setEndereco(request.getEndereco());
        
        try{   
            if(!_condominioDB.existeCondominio(condominio)){
                _condominioDB.inserirCondominio(condominio);
                condominioSelecionado = condominio;
            }
                       
            result = "Condomínio cadastrado com sucesso!";
        }catch(Exception ex)
        {
            result = "Erro durante o cadastro do condomínio.";
        }
        
        return result;
    }
    public String atualizarCondominio(){
        String result = "";
        try{
            if(this.condominioSelecionado != null){
                _condominioDB.updateCondominio(this.condominioSelecionado);
                result = "Condominio cadastrado com sucesso!";
                erroReq = false;
            }
        }catch(Exception e){
            Logger.getLogger(TelaCadastroCondominio.class.getName()).log(Level.SEVERE, null, e);
            result = "Erro durante a atualização do Condominio.";
            erroReq = true;
        }
        
        return result;
    }
    
    public String deletarInquilino()
    {
        String result = "";  
        
        try
        {
            _condominioDB.deleteCondominio(this.condominioSelecionado);
            result = "Condominio Excluido com sucesso!";
            erroReq = false;
        }catch(Exception e)
        {
            Logger.getLogger(TelaCadastroCondominio.class.getName()).log(Level.SEVERE, null, e);
            result = "Erro durante a Exclusão do Condominio.";
            erroReq = true;
        }
        
        return result;
    }
    public void setCondominio(CondominioModel condominio) {
        this.condominioSelecionado = condominio;
    }
}
