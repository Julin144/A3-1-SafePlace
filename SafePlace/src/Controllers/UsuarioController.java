package Controllers;

import Models.UsuarioModel;
import Database.UsuarioDB;
import Dto.Request.CadastroUsuarioRequestDto;
import View.TelaCadastroUsuario;
import View.TelaLogin;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioController {

    UsuarioModel user;
    UsuarioDB db;

    //Criar o objeto aqui
    public UsuarioController() {
        user = new UsuarioModel();
        db = new UsuarioDB();

    }
    public UsuarioModel usuarioSelecionado;
    public boolean erroReq = false;

    public String login(String login, String senha) {
        user.setLogin(login);
        user.setSenha(senha);

        String result = "";

        try {
            if (db.login(user)) {
                result = "SUCESSO";
            } else {
                result = "Usuário/Senha não encontrados no banco.";
            }
        } catch (Exception e) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, e);
            result = "Falha ao realizar Login.";
        }

        return result;
    }

    ;
    
    public String getAcesso() {
        return this.user.getTipo();
    }

    public String cadastrarUsuario(CadastroUsuarioRequestDto request) {
        String result;

        UsuarioModel usuario = new UsuarioModel();

        usuario.setTipo(request.getLogin());
        usuario.setSenha(request.getSenha());
        usuario.setTipo(request.getTipo());

        try {
            db.inserirUsuario(usuario);

            result = "Usuário cadastrado com sucesso!";

        } catch (Exception ex) {
            result = "Erro durante o cadastro do usuário";
        }

        return result;
    }
    
    public UsuarioModel[] montarListaUsuario() throws Exception 
    {
        UsuarioModel[] users;
        users = db.buscarUsuario();
        //this.inquilinoSelecionado = users != null ? users[0] : null;
        
        return users;
    }
    
    public String atualizarUsuario()
    {
        String result = "";  
        
        try
        {
            if(this.usuarioSelecionado != null) {
                db.updateUsuario(this.usuarioSelecionado);
                result = "Usuario atualizado com sucesso!";
                erroReq = false;
            }
        }catch(Exception e)
        {
            Logger.getLogger(TelaCadastroUsuario.class.getName()).log(Level.SEVERE, null, e);
            result = "Erro durante a atualização do usuario.";
            erroReq = true;
        }
        
        return result;
    }
    
    public String deletarUsuario()
    {
        String result = "";  
        
        try
        {
            db.deleteUsuario(this.usuarioSelecionado);
            result = "Inquilino Excluido com sucesso!";
            erroReq = false;
        }catch(Exception e)
        {
            Logger.getLogger(TelaCadastroUsuario.class.getName()).log(Level.SEVERE, null, e);
            result = "Erro durante a Exclusão do inquilino.";
            erroReq = true;
        }
        
        return result;
    }
    
    public void setUsuario(UsuarioModel usuario) {
        this.usuarioSelecionado = usuario;
    }
    
}
