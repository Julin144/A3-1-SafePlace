/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author Jack
 */
public class AcessoAreaModel 
{

    //private Date hrIni;
    //private Date hrFim;
    private Timestamp hrIni;
    private Timestamp hrFim;
    
    private int idAcesso;
    private int idInquilino;
    private int idArea;
    private int numDoses;
    

    public Timestamp getHrIni() 
    {
        return hrIni;
    }

    public void setHrIni(Timestamp hrIni) 
    {
        this.hrIni = hrIni;
    }

    public Timestamp getHrFim() 
    {
        return hrFim;
    }

    public void setHrFim(Timestamp hrFim) 
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
