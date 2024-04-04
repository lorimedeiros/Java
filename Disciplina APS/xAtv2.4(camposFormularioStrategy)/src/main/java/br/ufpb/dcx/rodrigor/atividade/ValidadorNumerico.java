package br.ufpb.dcx.rodrigor.atividade;

public class ValidadorNumerico implements ValidadorCampo{

    private int valor_min, valor_max;

    public static final int INDEFINIDO = 0;

    public ValidadorNumerico(){
        this(INDEFINIDO,INDEFINIDO);
    }

    public ValidadorNumerico(int valor_min, int valor_max) {
        this.valor_min = valor_min;
        this.valor_max = valor_max;
    }

    @Override
    public Resultado validar(String valor) {
        if(valor == null) throw new IllegalArgumentException("valor é nuloo!!!!");
        if(Integer.parseInt(valor) < valor_min && valor_min != INDEFINIDO) return new Resultado("Valor menor que o mínimo suportado:"+this.valor_min);
        if(Integer.parseInt(valor) > valor_max && valor_max != INDEFINIDO) return new Resultado("Valor maior que o máximo suportado:"+this.valor_max);
        return new Resultado();
    }
}
