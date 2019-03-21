package business.validation;

import util.UserLoginException;

public interface ILoginValidation {
    void validate(String field) throws UserLoginException;
}
