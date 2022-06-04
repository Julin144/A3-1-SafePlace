/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Database.InquilinoDB;
import Dto.Request.*;
import Models.InquilinoModel;


/**
 *
 * @author Jack
 */
public class InquilinoController 
{
    private static InquilinoDB _inquilinoDb;
    
    public InquilinoController()
    {
        _inquilinoDb = new InquilinoDB();
    }
    
    public String CadatrarInquilino(CadastroInquilinoRequestDto request)
    {
        String result;
        
        InquilinoModel inquilino = new InquilinoModel();
        
        inquilino.setNome(request.getNomeInquilino());
        inquilino.setCpf(Integer.parseInt(request.getCpfInquilino()));
        inquilino.setAprtNumero(Integer.parseInt(request.getNumeroApInquilino()));
        
        try
        {
            _inquilinoDb.inserirInquilino(inquilino);
            
            result = "Inquilino cadastrado com sucesso!";
            
        }catch(Exception ex)
        {
            result = "Erro durante o cadastro do inquilino.";
        }
        
        return result;
    }
}
