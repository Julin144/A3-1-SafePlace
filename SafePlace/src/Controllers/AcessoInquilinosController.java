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
    public AcessoAreaModel[] _listaAcessos;
    public InquilinoModel[] listaInq;
    public InquilinoModel inquilinoSelecionado;
    public AcessoAreaModel acessoSelecionado;

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
        this.listaInq = new InquilinoModel[_listaAcessos.length];
        int contLista = 0;

        for (AcessoAreaModel acesso : _listaAcessos) {
            for (InquilinoModel inq : inqList) {
                if (inq.getIdInquilino() == acesso.getIdInquilino()) {
                    listaInq[contLista++] = inq;
                    model.addRow(new Object[]{inq.getNome(), inq.getCpf(), inq.getAprtNumero(), acesso.getHrIni(), acesso.getHrFim()});
                }
            }
        }
    }

    public void montarListaInquilino() {
        if (this.inquilinoSelecionado != null) {
            for (AcessoAreaModel acesso : _listaAcessos) {
                if (this.inquilinoSelecionado.getIdInquilino() == acesso.getIdInquilino()) {
                    this.acessoSelecionado = acesso;
                }
            }
        }
    }

    public void definirInquilinoSelecionado(InquilinoModel inquilino) {
        this.inquilinoSelecionado = inquilino;
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
