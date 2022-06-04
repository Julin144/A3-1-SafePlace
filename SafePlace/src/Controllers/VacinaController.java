/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Dto.Request.CadastroVacinaRequestDto;
import Models.VacinaModel;

/**
 *
 * @author Jack
 */
public class VacinaController 
{
    //Criar o objeto aqui
    public VacinaController()
    {
        //Abrir instancia do metodo cadastradar do objeto aqui
    }
    
    
    public String VacinaController(CadastroVacinaRequestDto request)
    {
        String result;
    
    VacinaModel vacina = new VacinaModel();
    
    vacina.setQtdDose(request.setQtdDoseVacina());
    
    try
        {
            //Usar o metodo inserir do objeto DB aqui
            
            result = "Vacina cadastrada com sucesso!";
            
        }catch(Exception ex)
        {
            result = "Erro durante o cadastro da vacina.";
        }
    
    return result;
    }
    
    
    
}
