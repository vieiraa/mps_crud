package business.model;

public class Event {
    private static long id = 0;
    private String nome;
    private String lat, lng;
    private Data data;
    private String horario;
    private String desc;
    private float preco;
    
    public Event(String nome, String lat, String lng, Data data, String horario, String desc, float preco) {
        super();
        this.nome = nome;
        this.lat = lat;
        this.lng = lng;
        this.data = data;
        this.horario = horario;
        this.desc = desc;
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
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
}
