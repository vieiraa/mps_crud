package infra;

import util.InfraException;

public class FileDaoFactory extends DaoFactory {

    @Override
    public IUserDao getDaoUser(String filename) throws InfraException {
        return new UserDaoFile(filename);
    }

    @Override
    public IUserDao getDaoUser() {
        // TODO Auto-generated method stub
        return null;
    }
}
