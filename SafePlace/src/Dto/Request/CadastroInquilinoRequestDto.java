/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto.Request;

/**
 *
 * @author Jack
 */
public class CadastroInquilinoRequestDto 
{
    private String nomeInquilino;
    private String cpfInquilino;
    private String numeroApInquilino;
    
    public String getNomeInquilino()
    {
        return this.nomeInquilino;
    }
    
    public void setNomeInquilino(String nomeInquilino)
    {
        this.nomeInquilino = nomeInquilino;
    }
    
    public String getCpfInquilino()
    {
        return this.cpfInquilino;
    }
    
    public void setCpfInquilino(String cpfInquilino)
    {
        this.cpfInquilino = cpfInquilino;
    }
    
    public String getNumeroApInquilino()
    {
        return this.numeroApInquilino;
    }
    
    public void setNumeroApInquilino(String numeroApInquilino)
    {
        this.numeroApInquilino = numeroApInquilino;
    }
    
    
    
    
}
