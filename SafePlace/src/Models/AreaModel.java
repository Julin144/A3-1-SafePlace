/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Jack
 */
public class AreaModel 
{

    private int idArea;
    private int idCondominio;
    private String descricao;
    private int dosesRequisitadas;

    public AreaModel(int id, String descricao,int doses) 
    {
        this.idArea = id;
        this.descricao = descricao;
        this.dosesRequisitadas = doses;
    }

    public int getIdArea() 
    {
        return idArea;
    }

    public void setIdArea(int idArea) 
    {
        this.idArea = idArea;
    }

    public String getDescricao() 
    {
        return descricao;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    public int getDosesRequisitadas() 
    {
        return dosesRequisitadas;
    }

    public void setDosesRequisitadas(int dosesRequisitadas) 
    {
        this.dosesRequisitadas = dosesRequisitadas;
    }
 
    @Override
    public String toString() {
        return this.descricao;
    }

    /**
     * @return the idCondominio
     */
    public int getIdCondominio() {
        return idCondominio;
    }

    /**
     * @param idCondominio the idCondominio to set
     */
    public void setIdCondominio(int idCondominio) {
        this.idCondominio = idCondominio;
    }
}
