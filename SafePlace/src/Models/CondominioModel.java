/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Jack
 */
public class CondominioModel 
{

    private int idCondominio;
    private String nome;
    private String endereco;

    public CondominioModel(){ 
    }

        public int getIdCondominio() 
        {
            return idCondominio;
        }
        
        public void setIdCondominio(int idCondominio)
        {
            this.idCondominio = idCondominio;
        }
        
        public String getNome()
        {
            return nome;
        }
    
        public void setNome(String nome)
        {
            this.nome = nome;
        }

        public String getEndereco()
        {
            return endereco;
        }
        
        public void setEndereco(String endereco)
        {
            this.endereco = endereco;
        }
        

}



