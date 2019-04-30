package view;

import business.control.UserControl;
import business.model.Data;
import infra.IUserDao;
import infra.UserDaoFile;
import infra.UserPersistence;
import util.InfraException;
import util.UserLoginException;
import util.UserPasswordException;

public class Main {

    public static void main(String[] args) throws InfraException, UserLoginException, UserPasswordException {
        IUserDao dao = new UserDaoFile("/home/jordy/teste.txt");
        dao.add("jordy", "jordy1", new Data("10/01/1997"));
        dao.saveUsers();
    }

}
