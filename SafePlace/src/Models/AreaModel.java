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
    private String descricao;
    private int dosesRequisitadas;

    public AreaModel() 
    {
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
    
}
