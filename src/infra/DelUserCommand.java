package infra;

// Somente para admins.
public class DelUserCommand implements Command {
    Facade facade;
    
    public DelUserCommand() {
        facade = Facade.getInstance();
    }
    
    // Formulario perguntando ao admin qual usuario deletar
    public String askUser() {
        String user = "";
        return user;
    }
    
    @Override
    public void execute() {
        String user = askUser();
        facade.delUser(user);
    }

}
