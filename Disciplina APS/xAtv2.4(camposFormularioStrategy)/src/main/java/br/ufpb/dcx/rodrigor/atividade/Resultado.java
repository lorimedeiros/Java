package br.ufpb.dcx.rodrigor.atividade;

public class Resultado {

    private boolean validado;
    private String msgErro;


    public Resultado(){
        this(true,"");
    }

    public Resultado(String msgErro){
        this(false,msgErro);
    }

    public Resultado(boolean validado, String msgErro) {
        this.validado = validado;
        this.msgErro = msgErro;
    }

    public boolean ok() {
        return validado;
    }

    public void setOK(boolean validado) {
        this.validado = validado;
    }

    public String getMsgErro() {
        return msgErro;
    }

    public void setMsgErro(String msgErro) {
        this.msgErro = msgErro;
    }
}
