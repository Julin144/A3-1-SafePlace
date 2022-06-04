/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Database.AreaDB;
import Database.CondominioDB;
import Models.AreaModel;
import Models.CondominioModel;

/**
 *
 * @author er679
 */
public class HomeControl {

    CondominioDB dbCondominio;
    AreaDB dbArea;

    //Condominio
    public CondominioModel[] condominios;
    public CondominioModel condominioSelecionado;
    //Area
    public AreaModel[] areas;
    public AreaModel areaSelecionada;

    public HomeControl() {
        dbCondominio = new CondominioDB();
        dbArea = new AreaDB();
    }

    //Condominio
    public void montarListaCondominioArea() throws Exception {
        this.condominios = dbCondominio.buscarCondominios();
        this.condominioSelecionado = this.condominios.length != 0 ? this.condominios[0] : null;

        if (this.condominioSelecionado != null) {
            this.areas = dbArea.buscarAreas(this.condominioSelecionado);
            this.areaSelecionada = this.areas.length != 0 ? this.areas[0] : null;
        }
    }

    public void montarListaAreas() throws Exception {
        if (this.condominioSelecionado != null) {
            this.areas = dbArea.buscarAreas(this.condominioSelecionado);
            this.areaSelecionada = this.areas.length != 0 ? this.areas[0] : null;
        }
    }

    public void definirCondominioSelecionado(CondominioModel condominio) {
        this.condominioSelecionado = condominio;
    }

    public void definirAreaSelecionada(AreaModel area) {
        this.areaSelecionada = area;
    }
}
