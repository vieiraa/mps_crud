package business.model;

public class Event {
    private static long id = 0;
    private String nome;
    private String location;
    private Data data;
    private String horario;
    private String desc;
    private float preco;
    
    public Event(String nome, String l, Data data, String horario, String desc, float preco) {
        super();
        this.nome = nome;
        this.location = l;
        this.data = data;
        this.horario = horario;
        this.desc = desc;
        this.preco = preco;
        id++;
    }
    
    public long getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocation() {
        return location;
    }
    
    public void setLocation(String l) {
        location = l;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Local: " + location + "\n" +
               "Data: " + data.toString() + "\n" +
               "Preço: " + preco;
    }
}
