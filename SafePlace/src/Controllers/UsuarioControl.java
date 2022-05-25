package Controllers;

import Models.UsuarioModel;
import Database.UsuarioDB;
import java.sql.SQLException;

public class UsuarioControl {
    
    UsuarioModel user;
    UsuarioDB db ;

    public UsuarioControl() {
        user = new UsuarioModel();
        db = new UsuarioDB();
    }
    
    
    
    public boolean login(String login ,String senha) throws SQLException{
        
        user.setLogin(login);
        user.setSenha(senha);
        
        boolean logou = db.login(user);
        
        System.out.println(this.user.getTipo());
        
        return logou;
    
    };
    
    public void cadastarInquelino(){};
    
    public void cadastrarArea(){};
    
    public void cadastarVacina(){};
    
    public void cadastarCondominio(){};
    
    public void gerarAcesso(){};
    
    public void consultarAcesso(){};
    
    public void consultarAreas(){};
}
