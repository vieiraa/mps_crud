package business.validation;

import util.UserPasswordException;

public interface IPasswordValidation {
    void validate(String field) throws UserPasswordException;
}
