package util;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import business.model.User;

public class TestaComparator {
    private Set<User> login, data;
    
    public TestaComparator() {
        login = new TreeSet<>();
        data = new TreeSet<>();
    }
    
    public TestaComparator(Map<String, User> users) {
        login = new TreeSet<>(new ComparadorUser());
        data = new TreeSet<>(new ComparadorData());
        login.addAll(users.values());
        data.addAll(users.values());
    }
    
    public Set<User> ordenaLogin() {
        return login;
    }
    
    public Set<User> ordenaData() {
        return data;
    }
    
    public void printLogin() {
        login.stream().forEach(u -> System.out.println(u.toString()));
    }
    
    public void printData() {
        data.stream().forEach(u -> System.out.println(u.toString()));
    }
}
