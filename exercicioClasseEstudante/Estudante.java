public class Estudante {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    
    public double somaDasNotas(){
        return nota1 + nota2 + nota3;
    }

    public String resultado(){
        if (somaDasNotas() >= 60){
            return "Passou";
        } else {
            return "Reprovou\nFaltaram " + (60 - somaDasNotas) + " pontos";
        }
    }

}
