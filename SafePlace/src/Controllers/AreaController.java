/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Dto.Request.CadastroAreaRequestDto;
import Models.AreaModel;

/**
 *
 * @author Jack
 */
public class AreaController 
{
    //Criar o objeto aqui
    
    public AreaController()
    {
        //instanciar o objeto aqui    
    }
    
    public String AreaController(CadastroAreaRequestDto request)
    {
        String result;
        
        AreaModel area = new AreaModel();
        
        area.setDescricao(request.getDescricao());
        area.setDosesRequisitadas(request.getDosesRequisitadas());
        
        try
        {
            //Chamar o metedo inserirArea aqui
            
            result = "Área cadastrada com sucesso!";
            
        }catch(Exception ex)
        {
            result = "Erro durante o cadastro da área.";
        }
        
        return result;
    }
    
}
