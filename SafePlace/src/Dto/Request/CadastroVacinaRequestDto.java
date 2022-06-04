/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto.Request;

/**
 *
 * @author Jack
 */
public class CadastroVacinaRequestDto 
{
    
    private String tipoVacina;
    private int qtdDoseVacina;

    public String getTipoVacina() 
    {
        return tipoVacina;
    }

    public void setTipoVacina(String tipo) 
    {
        this.tipoVacina = tipoVacina;
    }

    public int getQtdDoseVacina() 
    {
        return qtdDoseVacina;
    }

    public void setQtdDoseVacina(int qtdDoseVacina) 
    {
        this.qtdDoseVacina = qtdDoseVacina;
    }
    
}
