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
import View.TelaCadastroInquilino;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jack
 */
public class VacinaController {

    private static VacinaDB _vacinaDB;
    private static InquilinoDB _inquilinoDB;
    public InquilinoModel inquilinoSelecionado;
    public VacinaModel vacinaSelecionada;
    public boolean erroReq = false;

    public VacinaController() {
        _vacinaDB = new VacinaDB();
        _inquilinoDB = new InquilinoDB();

    }

    public VacinaModel[] montarListaVacinas() throws Exception {
        VacinaModel[] vacinas = new VacinaModel[1];
        vacinas = _vacinaDB.buscarVacina(this.inquilinoSelecionado.getIdInquilino());

        return vacinas;
    }

    public String cadastrarVacina(CadastroVacinaRequestDto request) {
        String result;

        VacinaModel vacina = new VacinaModel();

        vacina.setQtdDose(request.getQtdDoseVacina());
        vacina.setTipo(request.getTipoVacina());
        vacina.setIdInquilino(request.getInquilino().getIdInquilino());

        try {
            _vacinaDB.inserirVacina(vacina);

            result = "Vacina cadastrada com sucesso!";

        } catch (Exception ex) {
            result = "Erro durante o cadastro da vacina.";
        }

        return result;
    }
    
    public String atualizarVacina()
    {
        String result = "";  
        
        try
        {
            if(this.inquilinoSelecionado != null) {
                _vacinaDB.updateVacina(this.vacinaSelecionada);
                result = "Vacina atualizada com sucesso!";
                erroReq = false;
            }
        }catch(Exception e)
        {
            Logger.getLogger(TelaCadastroInquilino.class.getName()).log(Level.SEVERE, null, e);
            result = "Erro durante a atualização da vacina.";
            erroReq = true;
        }
        
        return result;
    }
    
    public String deletarVacina()
    {
        String result = "";  
        
        try
        {
            _vacinaDB.deleteVacina(this.vacinaSelecionada);
            result = "Vacina do Inquilno Excluida com sucesso!";
            erroReq = false;
        }catch(Exception e)
        {
            Logger.getLogger(TelaCadastroInquilino.class.getName()).log(Level.SEVERE, null, e);
            result = "Erro durante a Exclusão da Vacina.";
            erroReq = true;
        }
        
        return result;
    }
    
    public void setVacina(VacinaModel vacina) {
        this.vacinaSelecionada = vacina;
    }
    
    public void setInquilino(InquilinoModel inquilino) {
        this.inquilinoSelecionado = inquilino;
    }

}
