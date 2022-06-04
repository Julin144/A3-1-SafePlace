/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Dto.Request.CadastroCondominioRequestDto;
import Models.CondominioModel;

/**
 *
 * @author Jack
 */
public class CondominioController 
{
    //Criar o objeto DB aqui
    
    public CondominioController()
    {
       //Instanciar o objeto DB aqui
    }
    
    public String CadastrarCondominio(CadastroCondominioRequestDto request)
    {
        String result;
        
        CondominioModel condominio = new CondominioModel();
        
        condominio.setNome(request.getNome());
        condominio.setEndereco(request.getEndereco());
        
        try
        {
            //Usar o metodo inserir do objeto DB aqui
            
            result = "Condominio cadastrado com sucesso!";
        }catch(Exception ex)
        {
            result = "Erro durante o cadastro do inquilino.";
        }
        
        return result;
    }
}
