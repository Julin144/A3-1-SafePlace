/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Database.AreaDB;
import Dto.Request.CadastroAreaRequestDto;
import Models.AreaModel;

/**
 *
 * @author Jack
 */
public class AreaController 
{
    private static AreaDB _areaDB;
    
    public AreaController()
    {
        _areaDB = new AreaDB();
    }
    
    public String CadastrarArea(CadastroAreaRequestDto request)
    {
        String result;
        
        AreaModel area = new AreaModel();
        
        area.setDescricao(request.getDescricao());
        area.setDosesRequisitadas(request.getDosesRequisitadas());
        
        try
        {
            _areaDB.inserirArea(area);
            
            result = "Área cadastrada com sucesso!";
            
        }catch(Exception ex)
        {
            result = "Erro durante o cadastro da área.";
        }
        
        return result;
    }
    
}
