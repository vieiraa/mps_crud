package business.validation;

import util.UserLoginException;

public class LoginValidation implements ILoginValidation {

    @Override
    public void validate(String login) throws UserLoginException {
        if (login.isEmpty())
            throw new UserLoginException("Login vazio.");
        
        else if (login.length() > 15)
            throw new UserLoginException("Numero de caracteres nao permitido.");
        
        else if (login.matches(".*\\d.*"))
            throw new UserLoginException("Nao eh permitido numeros no login");
    }
}
