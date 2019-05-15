package business.control;

import java.util.TreeMap;

import javax.management.RuntimeErrorException;

import java.util.Map;

import business.model.Data;
import business.model.User;
import business.validation.ILoginValidation;
import business.validation.IPasswordValidation;
import business.validation.LoginValidation;
import business.validation.PasswordValidation;
import infra.IUserPersistence;
import infra.UserCareTaker;
import util.InfraException;
import util.UserLoginException;
import util.UserPasswordException;

public class UserControl {
    private static UserControl instance;
    private Map<String, User> users;
    private UserCareTaker ct;
    
    private UserControl() {
        users = new TreeMap<>();
    }
    
    public void add(String login, String senha, String name, Data dn) throws UserLoginException, UserPasswordException {
        if (users.containsKey(login))
            throw new UserLoginException("Login ja existe");
        
        User user = new User(login, senha, name, dn);
        ILoginValidation lv = new LoginValidation();
        IPasswordValidation pv = new PasswordValidation();
        lv.validate(login);
        pv.validate(senha);
        users.put(login, user);
    }
    
    public void add(User u) {
        users.put(u.getLogin(), u);
    }
    
    public void update() {
        //
    }
    
    public Map<String, User> getUsers() {
        return users;
    }
    
    public User getUser(String login) throws UserLoginException {
        if (users.containsKey(login))
            return users.get(login);
        
        throw new UserLoginException("Login invalido");
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
    
    public static UserControl getInstance() {
        if (instance == null)
            instance = new UserControl();
        
        return instance;
    }
}
