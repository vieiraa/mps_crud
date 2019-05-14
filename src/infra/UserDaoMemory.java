package infra;

import java.util.HashMap;
import java.util.Map;

import business.model.Data;
import business.model.User;
import business.validation.ILoginValidation;
import business.validation.IPasswordValidation;
import business.validation.LoginValidation;
import business.validation.PasswordValidation;
import util.InfraException;
import util.UserLoginException;
import util.UserPasswordException;

public class UserDaoMemory implements IUserDao {
    private Map<String, User> users;
    
    public UserDaoMemory() {
        users = new HashMap<String, User>();
    }
    
    public void add(String login, String senha, String nome, Data dn) throws UserLoginException, UserPasswordException {
        User user = new User(login, senha, nome, dn);
        ILoginValidation lv = new LoginValidation();
        IPasswordValidation pv = new PasswordValidation();
        lv.validate(login);
        pv.validate(senha);
        users.put(login, user);
    }
    
    public Map<String, User> getUsers() {
        return users;
    }
    
    public void listAll() {
        users.values().stream().forEach(u -> System.out.println(u.toString()));
    }
    
    public void list(String login) {
        System.out.println(users.get(login).toString());
    }
    
    public void del(String login) {
        users.remove(login);
    }

    @Override
    public Map<String, User> loadUsers() throws InfraException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void saveUsers() throws InfraException {
        // TODO Auto-generated method stub
        
    }
}
