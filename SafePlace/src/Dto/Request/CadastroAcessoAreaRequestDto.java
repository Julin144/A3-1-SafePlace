/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto.Request;

/**
 *
 * @author Thais Dias
 */
public class CadastroAcessoAreaRequestDto {

    private String hrIni;
    private String hrFim;
    
    private int idAcesso;
    private int idInquilino;
    private int idArea;
    

    public String getHrIni() 
    {
        return hrIni;
    }

    public void setHrIni(String hrIni) 
    {
        this.hrIni = hrIni;
    }

    public String getHrFim() 
    {
        return hrFim;
    }

    public void setHrFim(String hrFim) 
    {
        this.hrFim = hrFim;
    }

    public int getIdAcesso() 
    {
        return idAcesso;
    }

    public void setIdAcesso(int idAcesso) 
    {
        this.idAcesso = idAcesso;
    }

    public int getIdInquilino() 
    {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino) 
    {
        this.idInquilino = idInquilino;
    }

    public int getIdArea() 
    {
        return idArea;
    }

    public void setIdArea(int idArea) 
    {
        this.idArea = idArea;
    }
}
