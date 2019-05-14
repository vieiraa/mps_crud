package infra;

import java.util.Map;

import business.model.Data;
import business.model.User;
import util.InfraException;
import util.UserLoginException;
import util.UserPasswordException;

public interface IUserDao {
    void add(String login, String senha, String name, Data data) throws UserLoginException, UserPasswordException;
    void del(String login);
    Map<String, User> getUsers();
    void listAll();
    void list(String login);
    Map<String, User> loadUsers() throws InfraException;
    void saveUsers() throws InfraException;
}
