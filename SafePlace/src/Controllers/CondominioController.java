/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Database.CondominioDB;
import Dto.Request.CadastroCondominioRequestDto;
import Models.CondominioModel;

/**
 *
 * @author Jack
 */
public class CondominioController 
{
    CondominioDB _condominioDB;
    
    public CondominioController()
    {
       _condominioDB = new CondominioDB();
    }
    
    public String CadastrarCondominio(CadastroCondominioRequestDto request)
    {
        String result;
        
        CondominioModel condominio = new CondominioModel();
        
        condominio.setNome(request.getNome());
        condominio.setEndereco(request.getEndereco());
        
        try
        {
            _condominioDB.inserirCondominio(condominio);
            
            result = "Condomínio cadastrado com sucesso!";
        }catch(Exception ex)
        {
            result = "Erro durante o cadastro do condomínio.";
        }
        
        return result;
    }
}
