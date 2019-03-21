package business.model;

public class User {
    private String login;
    private String password;
    private Data dataNascimento;
    
    public User() {
        dataNascimento = new Data();
    }
    
    public User(String l, String p, Data dn) {
        login = l;
        password = p;
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












