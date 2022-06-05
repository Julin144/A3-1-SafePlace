/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Database.InquilinoDB;
import Database.VacinaDB;
import Dto.Request.CadastroVacinaRequestDto;
import Models.InquilinoModel;
import Models.VacinaModel;
import java.util.ArrayList;

/**
 *
 * @author Jack
 */
public class VacinaController 
{
    private static VacinaDB _vacinaDB;
    private static InquilinoDB _inquilinoDB;
    
    
    //Inquilino
    public InquilinoModel inquilinoSelecionado;
    
    
    public VacinaController()
    {
        _vacinaDB = new VacinaDB();
        _inquilinoDB = new InquilinoDB();
        
    }
    
    
    public String CadastrarVacina(CadastroVacinaRequestDto request)
    {
        String result;
    
    VacinaModel vacina = new VacinaModel();
    
    vacina.setQtdDose(request.getQtdDoseVacina());
    
    try
        {
            _vacinaDB.inserirInquilinoVacina(vacina);
            
            result = "Vacina cadastrada com sucesso!";
            
        }catch(Exception ex)
        {
            result = "Erro durante o cadastro da vacina.";
        }
    
    return result;
    }
    
    public InquilinoModel[] montarListaInquilino() throws Exception 
    {
        InquilinoModel[] inquilinos;
      
        
        inquilinos = _inquilinoDB.buscarInquilino();
        
        return inquilinos;
    }
    
    
    
    
}
