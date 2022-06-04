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

    //Condominio
    public CondominioModel[] condominios;
    public CondominioModel condominioSelecionado;
    //Area
    public AreaModel[] areas;
    public AreaModel areaSelecionada;
    //Acesso
    public AcessoAreaModel[] acessos;
    //Inquilino
    public InquilinoModel[] inquilinos;
    
    public void montarListaInquilino() throws Exception {
//        this.condominios = dbCondominio.buscarCondominios();;
//        //teste
//        this.condominioSelecionado = this.condominios.length != 0 ? this.condominios[0] : null;
//        
//        this.areas = dbArea.buscarAreas(this.condominioSelecionado);
//        //teste
//        this.areaSelecionada = this.areas.length != 0 ? this.areas[0] : null;
        
        this.acessos = dbAcesso.buscarAcessoInquilino();
    }
}
