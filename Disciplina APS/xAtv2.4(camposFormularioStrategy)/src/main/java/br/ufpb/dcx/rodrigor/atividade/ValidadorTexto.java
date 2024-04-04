package br.ufpb.dcx.rodrigor.atividade;

public class ValidadorTexto implements ValidadorCampo{

    private int tam_min,tam_max;

    public static final int INDEFINIDO = -1;

    public ValidadorTexto(){
        this(INDEFINIDO,INDEFINIDO);
    }

    public ValidadorTexto(int min, int max){
        this.tam_min = min;
        this.tam_max = max;
    }

    @Override
    public Resultado validar(String valor) {
        if(valor == null) throw new IllegalArgumentException("valor é nuloo!!!!");
        if(tam_max != INDEFINIDO && valor.length() > tam_max){
            return new Resultado("Valor maior que o máximo suportado:"+this.tam_max);
        }
        if(tam_min != INDEFINIDO && valor.length() < tam_min){
            return new Resultado("Valor menor que o mínimo suportado:"+this.tam_min);
        }
        return new Resultado();
    }
}
