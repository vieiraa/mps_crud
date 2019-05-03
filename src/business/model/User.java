package business.model;

public class User {
    private String login;
    private String password;
    private String name;
    private Data dataNascimento;
    boolean admin;
    
    public User() {
        dataNascimento = new Data();
    }
    
    public User(String l, String n, String p, Data dn) {
        login = l;
        password = p;
        name = n;
        dataNascimento = dn;
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
    
    public Data getData() {
        return dataNascimento;
    }
    
    public String getDataFormatada() {
        return dataNascimento.toString();
    }
    
    public String toString() {
        return String.format("%s - %s", login, getDataFormatada());
    }
}
