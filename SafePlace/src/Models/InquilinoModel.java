/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Jack
 */
public class InquilinoModel 
{
    private int idInquilino;
    private String nome;
    private int cpf;
    private int aprtNumero;
    
    public InquilinoModel()
    {    
    }
    
    public int getIdInquilino()
    {
        return idInquilino;
    }

    public void setIdInquilino(int idInquilino)
    {
        this.idInquilino = idInquilino;
    }

    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public int getCpf()
    {
        return cpf;
    }
    
    public void setCpf(int cpf)
    {
        this.cpf = cpf;
    }
    
    public int getAprtNumero()
    {
        return aprtNumero;
    }
    
    public void setAprtNumero(int aprtNumero)
    {
        this.aprtNumero = aprtNumero;
    }
}
