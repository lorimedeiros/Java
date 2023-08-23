import java.util.Objects;

public class Automovel {

    private Integer id;
    private String modelo;
    private Integer ano;
    private Boolean alugado;

    public Automovel(){}

    public Automovel(Integer id, String modelo, Integer ano) {
        this.id = id;
        this.modelo = modelo;
        this.ano = ano;
        this.alugado = false;
    }

    public Integer getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public boolean getAlugado(){
        return alugado;
    }

    public void setAlugado(boolean a){
        alugado = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automovel automovel = (Automovel) o;
        return Objects.equals(id, automovel.id) && Objects.equals(modelo, automovel.modelo) && Objects.equals(ano, automovel.ano) && Objects.equals(alugado, automovel.alugado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modelo, ano, alugado);
    }

    public String toString(){
        return "Modelo: " + getModelo() + "\nAno: " + getAno() + "\nId: " + getId();
    }

}
