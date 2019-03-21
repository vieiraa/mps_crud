package util;

import java.util.Comparator;

import business.model.Data;
import business.model.User;

public class ComparadorData implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        if (o1.getData().getAno() < o2.getData().getAno())
            return -1;
        
        else if (o1.getData().getAno() > o2.getData().getAno())
            return 1;
        
        else {
            if (o1.getData().getMes() < o2.getData().getMes())
                return -1;
            
            else if (o1.getData().getMes() > o2.getData().getMes())
                return 1;
            
            else {
                if (o1.getData().getDia() < o2.getData().getDia())
                    return -1;
                
                else if (o1.getData().getDia() > o2.getData().getDia())
                    return 1;
            }
        }
        
        return 0;
    }
}
