public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido(){
        return salarioBruto - imposto;
    }

    public void aumentoSalario(double porcentagem){
        double aumento = salarioBruto * (porcentagem / 100 );
        this.salarioBruto = (salarioBruto - imposto) + aumento;
    }

}
