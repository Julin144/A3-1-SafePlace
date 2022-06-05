/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Database.AreaDB;
import Database.AcessoAreaDB;
import Database.InquilinoDB;
import Dto.Request.CadastroAcessoAreaRequestDto;
import Models.AreaModel;
import Models.AcessoAreaModel;
import Models.InquilinoModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author er679
 */
public class AcessoInquilinosController {

    private InquilinoDB _inquilinoDb;
    private AreaDB _areaDb;
    private AcessoAreaDB _acessoDb;
    private AcessoAreaModel[] _listaAcessos;

    public AcessoInquilinosController() {
        _areaDb = new AreaDB();
        _acessoDb = new AcessoAreaDB();
        _inquilinoDb = new InquilinoDB();
    }

    public void montarListaAcessos(AreaModel area) throws Exception {
        _listaAcessos = _acessoDb.buscarAcessoInquilino(area);
    }

    public void montarListaTabela(DefaultTableModel model) throws Exception {
        InquilinoModel[] inqList = _inquilinoDb.buscarInquilino();

        for (AcessoAreaModel acesso : _listaAcessos) {
            for (InquilinoModel inq : inqList) {
                if (inq.getIdInquilino() == acesso.getIdInquilino()) {
                    model.addRow(new Object[]{inq.getNome(), inq.getCpf(), inq.getAprtNumero(), acesso.getHrIni(), acesso.getHrFim()});
                }
            }
        }
    }

    public String CadatrarAcesso(CadastroAcessoAreaRequestDto request) {
        String result;

        AcessoAreaModel acesso = new AcessoAreaModel();

        acesso.setIdInquilino(request.getIdInquilino());
        acesso.setIdArea(request.getIdArea());
        acesso.setHrIni(request.getHrIni());
        acesso.setHrFim(request.getHrFim());

        try {
            _acessoDb.inserirAcessoArea(acesso);

            result = "Acesso cadastrado com sucesso!";

        } catch (Exception ex) {
            result = "Erro durante o cadastro do acesso.";
        }

        return result;
    }
}
