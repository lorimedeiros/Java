package exceptions;

public class ExcecaoDeDominio extends Exception{
    //se no lugar de exception fosse runtimeexception eu podia tirar todos aqueles throws dos métodos de Reserva
    //pois não haveria necessidade de tratar nem dos catches no Main, porém quando caísse na exceção do catch o prograa ia quebrar (mensagem de erro)
    //para corrigir essa quebra era só criar o catch com o tipo runtimeexception
    //assim poderiamos mostrar uma mensagem, por exemplo, impedindo a quebra
    private static final long serialVersionUID = 1L;
    //número de série padrão para uma exceção personalizada

    public ExcecaoDeDominio(String mensagem){
        super(mensagem);
    }
    //construtor que permitirá que eu instancie a exceção personalizada passando uma mensagem para a mesma
    //essa menagem ficará armazenada na exceção
}
