package util;

import java.util.Comparator;

import business.model.User;

public class ComparadorUser implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        if (o1.getLogin().compareTo(o2.getLogin()) == 0) {
            return o1.getPassword().compareTo(o2.getPassword());
        }
        
        return o1.getLogin().compareTo(o2.getLogin());
    }
}
