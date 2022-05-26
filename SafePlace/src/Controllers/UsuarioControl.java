package Controllers;

import Models.UsuarioModel;
import Database.UsuarioDB;

public class UsuarioControl {
    
    UsuarioModel user;
    UsuarioDB db ;

    public UsuarioControl() {
        user = new UsuarioModel();
        db = new UsuarioDB();
    }
    
    
    
    public boolean login(String login ,String senha) throws Exception{
        user.setLogin(login);
        user.setSenha(senha);
        
        return db.login(user);
    };
    
    public void cadastarInquelino(){};
    
    public void cadastrarArea(){};
    
    public void cadastarVacina(){};
    
    public void cadastarCondominio(){};
    
    public void gerarAcesso(){};
    
    public void consultarAcesso(){};
    
    public void consultarAreas(){};
}