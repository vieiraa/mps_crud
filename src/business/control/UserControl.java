package business.control;

import java.util.TreeMap;
import java.util.Map;

import business.model.Data;
import business.model.User;
import business.validation.ILoginValidation;
import business.validation.IPasswordValidation;
import business.validation.LoginValidation;
import business.validation.PasswordValidation;
import infra.IUserPersistence;
import util.InfraException;
import util.UserLoginException;
import util.UserPasswordException;

public class UserControl {
    private Map<String, User> users;
    
    public UserControl() {
        users = new TreeMap<>();
    }
    
    public void add(String login, String senha, Data dn) throws UserLoginException, UserPasswordException {
        User user = new User(login, senha, dn);
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
    
    public void saveUsers(IUserPersistence up) {
        try {
            up.saveUsers(users);
        } catch (InfraException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void loadUsers(IUserPersistence up) {
        try {
            users = up.loadUsers();
        } catch (InfraException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
