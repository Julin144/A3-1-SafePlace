package Controllers;

import Models.UsuarioModel;
import Database.UsuarioDB;
import Dto.Request.CadastroUsuarioRequestDto;
import Dto.Request.CadastroVacinaRequestDto;


public class UsuarioController {
    
    UsuarioModel user;
    UsuarioDB db;

    //Criar o objeto aqui
    
    public UsuarioController() {
        user = new UsuarioModel();
        db = new UsuarioDB();
        
        //Instanciar o objeto aqui 
        
    }
    
    public boolean login(String login ,String senha) throws Exception{
        user.setLogin(login);
        user.setSenha(senha);
        
        return db.login(user);
    };
    
    public String getAcesso() {
        return this.user.getTipo();
    }
    
    public String cadastrarUsuario(CadastroUsuarioRequestDto request)
    {
        String result;
        
        UsuarioModel usuario = new UsuarioModel();
        
        usuario.setTipo(request.getLogin());
        usuario.setSenha(request.getSenha());
        usuario.setTipo(request.getTipo());
        
        try
        {
            //Colocar o metodo de inserirDB aqui
            
            result = "Usuário cadastrado com sucesso!";
            
        }catch(Exception ex)
        {
            result = "Erro durante o cadastro do usuário";
        }
        
        return result;
    }
    
    public void cadastrarArea(){};
    
    public void cadastarVacina(){};
    
    public void cadastarCondominio(){};
    
    public void gerarAcesso(){};
    
    public void consultarAcesso(){};
    
    public void consultarAreas(){};
}