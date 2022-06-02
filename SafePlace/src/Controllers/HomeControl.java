/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Database.AreaDB;
import Models.AreaModel;

/**
 *
 * @author er679
 */
public class HomeControl {
    AreaDB dbArea;
    public AreaModel[] areas;
    public AreaModel areaSelecionada;
    
    public HomeControl(){
        dbArea = new AreaDB();
    }
    
    public void montarListaAreas() throws Exception {
        this.areas = dbArea.buscarAreas();
    }
    
    public void definirAreaSelecionada(AreaModel area) {
        this.areaSelecionada = area;
    }    
}
