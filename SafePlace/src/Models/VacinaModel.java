/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Jack
 */
public class VacinaModel 
{

    private int idVacina;
    private int idInquilino;
    private String tipo;
    private int qtdDose;
    
    public VacinaModel() 
    {
    }

    public int getIdVacina() 
    {
        return idVacina;
    }

    public void setIdVacina(int idVacina) 
    {
        this.idVacina = idVacina;
    }

    public int getIdInquilino() 
    {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) 
    {
        this.idInquilino = idInquilino;
    }
    
    
    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    public int getQtdDose() 
    {
        return qtdDose;
    }

    public void setQtdDose(int qtdDose) 
    {
        this.qtdDose = qtdDose;
    }
    
}
