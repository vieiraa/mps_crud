package infra;

import util.UserLoginException;
import util.UserPasswordException;

public interface Command {
    void execute() throws UserLoginException, UserPasswordException;
}
