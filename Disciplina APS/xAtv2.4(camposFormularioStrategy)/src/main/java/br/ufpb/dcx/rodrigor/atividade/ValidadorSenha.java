package br.ufpb.dcx.rodrigor.atividade;

public class ValidadorSenha implements ValidadorCampo{

    private int tam_min,tam_max;

    public static final int INDEFINIDO = -1;

    public ValidadorSenha(){
        this(INDEFINIDO,INDEFINIDO);
    }

    public ValidadorSenha(int min, int max){
        this.tam_min = min;
        this.tam_max = max;
    }

    @Override
    public Resultado validar(String valor){
        if(valor == null) throw new IllegalArgumentException("valor é nuloo!!!!");
        if(tam_max != INDEFINIDO && valor.length() > tam_max){
            return new Resultado("Valor maior que o máximo suportado:"+this.tam_max);
        }
        if(tam_min != INDEFINIDO && valor.length() < tam_min){
            return new Resultado("Valor menor que o mínimo suportado:"+this.tam_min);
        }

        int numMai = 0, numMin = 0, numNum = 0;
        for (int i = 0; i < valor.length(); i++) {
            char caractere = valor.charAt(i);
            if (Character.isDigit(caractere)){
                numNum += 1;
            } else if (Character.isLowerCase(caractere)) {
                numMin += 1;
            } else if (Character.isUpperCase(caractere)) {
                numMai += 1;
            }
        }

        if (numNum < 1 || numMin < 1 || numMai < 1) return new Resultado("A senha deve ter pelo menos uma letra minuscula, uma maiuscula e um número!");

        return new Resultado();
    }

    /*
    Forma Rodríguica de fazer o método acima
    @Override
    public Resultado validar(String valor) {
        Resultado resultadoBase = super.validar(valor);
        if (!resultadoBase.ok()) {
            return resultadoBase;
        }

        if (!valor.matches(".*[a-z].*")) {
            return new Resultado("A senha deve conter pelo menos uma letra minúscula.");
        }
        if (!valor.matches(".*[A-Z].*")) {
            return new Resultado("A senha deve conter pelo menos uma letra maiúscula.");
        }
        if (!valor.matches(".*\\d.*")) {
            return new Resultado("A senha deve conter pelo menos um número.");
        }
        return new Resultado();
    }
    */
}
