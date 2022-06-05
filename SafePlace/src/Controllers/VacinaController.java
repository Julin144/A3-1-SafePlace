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
public class VacinaController {

    private static VacinaDB _vacinaDB;
    private static InquilinoDB _inquilinoDB;
    private InquilinoModel inquilinoSelecionado;

    public VacinaController() {
        _vacinaDB = new VacinaDB();
        _inquilinoDB = new InquilinoDB();

    }

    public VacinaModel[] montarListaVacinas() throws Exception {
        VacinaModel[] vacinas = new VacinaModel[1];
        if(this.inquilinoSelecionado != null)
            vacinas = _vacinaDB.buscarVacina(this.inquilinoSelecionado.getIdInquilino());

        return vacinas;
    }

    public String CadastrarVacina(CadastroVacinaRequestDto request) {
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
    
    public void setInquilino(InquilinoModel inquilino) {
        this.inquilinoSelecionado = inquilino;
    }

}
