package Back;

import Back.Servico;

import java.time.LocalDate;

public abstract class ServicoBase implements Servico {

    private LocalDate data;
    private Integer codigo;
    private String descricao;

    public ServicoBase(LocalDate data, Integer codigo, String descricao){
        this.data = data;
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public LocalDate getData(){
        return data;
    }

    @Override
    public Integer getCodigo(){
        return codigo;
    }

    @Override
    public String getDescricao(){
        return descricao;
    }

    @Override
    public abstract Double getPreco();

}
