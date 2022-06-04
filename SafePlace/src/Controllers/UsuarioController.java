package Controllers;

import Models.UsuarioModel;
import Database.UsuarioDB;
import Dto.Request.CadastroUsuarioRequestDto;
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
            //Colocar o metodo de inserirDB aqui

            result = "Usuário cadastrado com sucesso!";

        } catch (Exception ex) {
            result = "Erro durante o cadastro do usuário";
        }

        return result;
    }

    public void cadastrarArea() {
    }

    ;
    
    public void cadastarVacina() {
    }

    ;
    
    public void cadastarCondominio() {
    }

    ;
    
    public void gerarAcesso() {
    }

    ;
    
    public void consultarAcesso() {
    }

    ;
    
    public void consultarAreas() {
    }
;
}
