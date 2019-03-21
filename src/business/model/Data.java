package business.model;

public class Data {
    private int dia, mes, ano;
    
    public Data() {
        
    }
    
    public Data(String d) {
        this(Integer.parseInt(d.split("/")[0]), 
             Integer.parseInt(d.split("/")[1]), 
             Integer.parseInt(d.split("/")[2]));
    }
    
    public Data(int d, int m, int a) {
        setDia(d);
        setMes(m);
        setAno(a);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String toString() {
        return String.format("%02d/%02d/%02d", dia, mes, ano);
    }
}
