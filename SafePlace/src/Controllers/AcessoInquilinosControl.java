/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Database.AreaDB;
import Database.CondominioDB;
import Database.AcessoAreaDB;
import Database.InquilinoDB;
import Models.AreaModel;
import Models.CondominioModel;
import Models.AcessoAreaModel;
import Models.InquilinoModel;

/**
 *
 * @author er679
 */
public class AcessoInquilinosControl {
    AreaDB dbArea;
    CondominioDB dbCondominio;
    AcessoAreaDB dbAcesso;
    InquilinoDB dbInquilino;
    AcessoAreaModel[] listaAcessos;
    public InquilinoModel[] listaInqAcessos;
    
    public AcessoInquilinosControl() {
        this.dbArea = new AreaDB();
        this.dbCondominio = new CondominioDB();
        this.dbAcesso = new AcessoAreaDB();
        this.dbInquilino = new InquilinoDB();
    }

    public void montarListaAcessos(AreaModel area) throws Exception {
        this.listaAcessos = dbAcesso.buscarAcessoInquilino(area);
    }
    
    public void montarListaTabela() throws Exception{
        InquilinoModel[] inqList = dbInquilino.buscarInquilino();
        this.listaInqAcessos = new InquilinoModel[this.listaAcessos.length];
        
        int contador = 0;
        for(AcessoAreaModel acesso : this.listaAcessos)
            for(InquilinoModel inq : inqList) {
                if(inq.getIdInquilino() == acesso.getIdInquilino())
                    this.listaInqAcessos[contador++] = inq;
            }
    }
}
