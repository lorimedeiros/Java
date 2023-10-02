import java.time.LocalDate;
import java.util.Objects;

public abstract class VendaDeTurismo implements VendasDeTurismoIF {

    private LocalDate dataDoEvento;
    private String tipoDoEvento;

    public VendaDeTurismo (LocalDate dataDoEvento, String tipoDoEvento){
        this.dataDoEvento = dataDoEvento;
        this.tipoDoEvento = tipoDoEvento;
    }

    public abstract double getPreco();

    public LocalDate getDataDoEvento() {
        return dataDoEvento;
    }

    public void setDataDoEvento(LocalDate dataDoEvento) {
        this.dataDoEvento = dataDoEvento;
    }

    public String getTipoDoEvento() {
        return tipoDoEvento;
    }

    public void setTipoDoEvento(String tipoDoEvento) {
        this.tipoDoEvento = tipoDoEvento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendaDeTurismo that = (VendaDeTurismo) o;
        return Objects.equals(dataDoEvento, that.dataDoEvento) && Objects.equals(tipoDoEvento, that.tipoDoEvento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataDoEvento, tipoDoEvento);
    }

    @Override
    public String toString(){
        return "Tipo do evento: " + tipoDoEvento;
    }

}
