package infra;

public class UserMemento {
    private String login, password, name;
    
    public UserMemento(String l, String p, String n) {
        login = l;
        password = p;
        name = n;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void revert(UserMemento user) {
        login = user.login;
        password = user.password;
        name = user.name;
    }
    
    public UserMemento save() {
        return this;
    }
}
