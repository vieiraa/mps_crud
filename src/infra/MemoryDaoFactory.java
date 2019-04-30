package infra;

import util.InfraException;

public class MemoryDaoFactory extends DaoFactory {
    
    @Override
    public IUserDao getDaoUser() {
        return new UserDaoMemory();
    }

    @Override
    public IUserDao getDaoUser(String filename) throws InfraException {
        // TODO Auto-generated method stub
        return null;
    }

}
