/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Database.AreaDB;
import Database.CondominioDB;
import Dto.Request.CadastroAreaRequestDto;
import Models.AreaModel;
import Models.CondominioModel;
import View.TelaCadastroInquilino;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jack
 */
public class AreaController 
{
    CondominioDB dbCondominio;
    AreaDB _areaDB;

    //Condominio
    public CondominioModel[] condominios;
    public CondominioModel condominioSelecionado;
    //Area
    public AreaModel[] areas;
    public AreaModel areaSelecionada;
    public boolean erroReq = false;

    public AreaController() {
        dbCondominio = new CondominioDB();
        _areaDB = new AreaDB();
    }

    //Condominio
    public void montarListaCondominioArea() throws Exception {
        this.condominios = dbCondominio.buscarCondominios();
        this.condominioSelecionado = this.condominios.length != 0 ? this.condominios[0] : null;

        if (this.condominioSelecionado != null) {
            this.areas = _areaDB.buscarAreas(this.condominioSelecionado);
            this.areaSelecionada = this.areas.length != 0 ? this.areas[0] : null;
        }
    }

    public void montarListaAreas() throws Exception {
        if (this.condominioSelecionado != null) {
            this.areas = _areaDB.buscarAreas(this.condominioSelecionado);
            this.areaSelecionada = this.areas.length != 0 ? this.areas[0] : null;
        }
    }

    public void definirCondominioSelecionado(CondominioModel condominio) {
        this.condominioSelecionado = condominio;
    }

    public void definirAreaSelecionada(AreaModel area) {
        this.areaSelecionada = area;
    }
    
    public String cadastrarArea(CadastroAreaRequestDto request)
    {
        String result;
        
        AreaModel area = new AreaModel();
        
        area.setDescricao(request.getDescricao());
        area.setDosesRequisitadas(request.getDosesRequisitadas());
        area.setIdCondominio(this.condominioSelecionado.getIdCondominio());
        
        try
        {
            _areaDB.inserirArea(area);
            
            result = "Área cadastrada com sucesso!";
            
        }catch(Exception e)
        {
            Logger.getLogger(TelaCadastroInquilino.class.getName()).log(Level.SEVERE, null, e);
            result = "Erro durante o cadastro da área!";
        }
        
        return result;
    }
    
     public String atualizarArea()
    {
        String result = "";  
        
        try
        {
            if(this.areaSelecionada != null) {
                _areaDB.updateArea(this.areaSelecionada);
                result = "Inquilino atualizado com sucesso!";
                erroReq = false;
            }
        }catch(Exception e)
        {
            Logger.getLogger(TelaCadastroInquilino.class.getName()).log(Level.SEVERE, null, e);
            result = "Erro durante a atualização do inquilino.";
            erroReq = true;
        }
        
        return result;
    }
    
    public String deletarArea()
    {
        String result = "";  
        
        try
        {
            _areaDB.deleteArea(this.areaSelecionada);
            result = "Área Excluida com sucesso!";
            erroReq = false;
        }catch(Exception e)
        {
            Logger.getLogger(TelaCadastroInquilino.class.getName()).log(Level.SEVERE, null, e);
            result = "Erro durante a Exclusão da Área.";
            erroReq = true;
        }
        
        return result;
    }
}
