package infra;

import java.util.Map;

import business.model.User;
import util.InfraException;

public interface IUserPersistence {
    Map<String, User> loadUsers() throws InfraException;
    void saveUsers(Map<String, User> users) throws InfraException;
}
