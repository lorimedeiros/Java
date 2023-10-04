package Back;

import java.time.LocalDate;

public interface Servico {

    LocalDate getData();
    Integer getCodigo();
    String getDescricao();
    Double getPreco();

}
