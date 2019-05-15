package infra;

import java.util.ArrayList;
import java.util.List;

import business.model.Data;
import business.model.Event;
import business.model.User;
import util.UserLoginException;
import util.UserPasswordException;

public class AddUserCommand implements Command {
    Facade facade;
    
    public AddUserCommand() {
        facade = Facade.getInstance();
    }
    
    // Campos do formulario de cadastro
    public User askUser() {
        String login = "", pass = "", name = "";
        Data dn = new Data("01/01/1970");
        
        User ret = new User(login, pass, name, dn);
        
        return ret;
    }
    
    @Override
    public void execute() throws UserLoginException, UserPasswordException {
        User user = askUser();
        facade.addUser(user);
    }
}
