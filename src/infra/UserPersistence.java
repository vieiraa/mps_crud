package infra;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

import business.model.Data;
import business.model.User;
import util.InfraException;

public class UserPersistence implements IUserPersistence {
    private OutputStream output;
    private String filename;
    
    public UserPersistence(String f) throws InfraException {
        filename = f;
        
        try {
            output = Files.newOutputStream(Paths.get(filename), 
                    StandardOpenOption.CREATE);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new InfraException("Erro ao abrir arquivo para escrita", e);
        }
    }
    
    @Override
    public Map<String, User> loadUsers() throws InfraException {
        Map<String, User> users = new TreeMap<>();
        
        try (Stream<String> stream = Files.lines(Paths.get(filename))){
            stream.forEach(l -> {
                String[] user = l.split(" ");
                users.put(user[0], new User(user[0], user[1], user[2], new Data(user[3])));
            });
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new InfraException("Erro ao ler arquivo", e);
        }
        
        return users;
    }
    
    @Override
    public void saveUsers(Map<String, User> users) throws InfraException {
        for (User u : users.values()) {
            try {
                output.write(u.getLogin().getBytes());
                output.write(" ".getBytes());
                output.write(u.getPassword().getBytes());
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
}
