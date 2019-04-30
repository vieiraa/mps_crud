package business.validation;

import util.UserPasswordException;

public class PasswordValidation implements IPasswordValidation {

    @Override
    public void validate(String password) throws UserPasswordException {
        if (password.length() > 16)
            throw new UserPasswordException("Senha muito grande.");
        
        else if (password.length() < 6)
            throw new UserPasswordException("Senha muito pequena.");
        
        else if (!password.matches(".*\\d.*"))
            throw new UserPasswordException("Senha nao possui numeros.");
        
        else if (!password.matches(".*([A-Za-z]).*"))
            throw new UserPasswordException("Senha nao possui letras.");
    }

}
