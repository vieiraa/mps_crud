package infra;

import util.InfraException;

enum Factory {
    FILE(0), MEMORY(1);
    
    int factory;
    
    Factory(int f) {
        factory = f;
    }
}

// Abstract factory
public abstract class DaoFactory {
    public abstract IUserDao getDaoUser(String filename) throws InfraException;
    public abstract IUserDao getDaoUser();
    
    public static DaoFactory getDaoFactory(Factory factory) {
        switch (factory) {
            case FILE:
                return new FileDaoFactory();
            case MEMORY:
                return new MemoryDaoFactory();
        }
        
        return null;
    }
}
