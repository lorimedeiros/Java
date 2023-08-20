import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Postagem {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date dataCriacao;
    private String titulo;
    private String conteudo;
    private Integer curtidas;
    private ArrayList <Comentario> comentarios = new ArrayList<>();

    public Postagem(Date dataCriacao, String titulo, String conteudo, Integer curtidas) {
        this.dataCriacao = dataCriacao;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.curtidas = curtidas;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public void adicionarComentario(Comentario comentario){
        comentarios.add(comentario);
    }

    public String toString(){
        return getTitulo() + "\n" + getCurtidas() + " curtidas - " + sdf.format(getDataCriacao()) + "\n" + getConteudo();
    }

    public String mostraComentarios(){

        String st = "Comentários:\n";
        for (int i = 0; i < comentarios.size(); i++){
            st += comentarios.get(i) + "\n";
        }

        return st;

    }
}
