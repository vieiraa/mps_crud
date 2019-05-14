package infra;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

import business.model.Data;
import business.model.User;
import business.validation.ILoginValidation;
import business.validation.IPasswordValidation;
import business.validation.LoginValidation;
import business.validation.PasswordValidation;
import util.InfraException;
import util.UserLoginException;
import util.UserPasswordException;

public class UserDaoFile implements IUserDao {
    private Map<String, User> users;
    private OutputStream output;
    private String filename;
    
    public UserDaoFile(String f) throws InfraException {
        filename = f;
        
        try {
            output = Files.newOutputStream(Paths.get(filename), 
                    StandardOpenOption.CREATE);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new InfraException("Erro ao abrir arquivo para escrita", e);
        }
        
        users = loadUsers();
    }
    
    public Map<String, User> loadUsers() throws InfraException {
        Map<String, User> users = new TreeMap<>();
        
        try (Stream<String> stream = Files.lines(Paths.get(filename))){
            stream.forEach(l -> {
                String[] user = l.split(" ");
                for (String s : user) {
                    System.out.println(s);
                }
                users.put(user[0], new User(user[0], user[1], user[2], new Data(user[3])));
            });
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new InfraException("Erro ao ler arquivo", e);
        }
        
        return users;
    }
    
    public void saveUsers() throws InfraException {
        for (User u : users.values()) {
            try {
                output.write(u.getLogin().getBytes());
                output.write(" ".getBytes());
                output.write(u.getPassword().getBytes());
                output.write(" ".getBytes());
                output.write(u.getNome().getBytes());
                output.write(" ".getBytes());
                output.write(u.getDataFormatada().getBytes());
                output.write("\n".getBytes());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                throw new InfraException("Erro ao escrever em arquivo", e);
            } 
        }
        
        try {
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new InfraException("Erro ao fechar stream", e);
        }
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
}
