package util;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import business.model.User;

public class TestaComparator {
    private Set<User> login, data;
    
    public TestaComparator() {
        login = new TreeSet<>(new ComparadorUser());
        data = new TreeSet<>(new ComparadorData());
    }
    
    public Set<User> ordenaLogin(Map<String, User> users) {
        login.addAll(users.values());
        return login;
    }
    
    public Set<User> ordenaData(Map<String, User> users) {
        data.addAll(users.values());
        return data;
    }
    
    public void printLogin() {
        login.stream().forEach(u -> System.out.println(u.toString()));
    }
    
    public void printData() {
        data.stream().forEach(u -> System.out.println(u.toString()));
    }
}
