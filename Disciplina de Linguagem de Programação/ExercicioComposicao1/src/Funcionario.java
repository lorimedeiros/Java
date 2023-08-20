import java.util.ArrayList;
import java.util.Calendar;

public class Funcionario {

    private String nome;
    private NivelFuncionario nivel;
    private Double salarioBase;
    private Departamento departamento;
    private ArrayList <ContratoPorHora> contratos = new ArrayList<>();

    public Funcionario() {
    }

    public Funcionario(String nome, NivelFuncionario nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelFuncionario getNivel() {
        return nivel;
    }

    public void setNivel(NivelFuncionario nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public ArrayList<ContratoPorHora> getContratos() {
        return contratos;
    }

    public void adicionarContrato(ContratoPorHora contrato){

        contratos.add(contrato);

    }

    public void removerContrato(ContratoPorHora contrato){

        contratos.remove(contrato);

    }

    public Double rendimento(int ano, int mes){

        double soma = salarioBase;
        Calendar ca = Calendar.getInstance();

        for(ContratoPorHora ct : contratos){

            ca.setTime(ct.getData()); //peguei a data do contrato e defini como o calendario
            int anoC = ca.get(Calendar.YEAR);
            int mesC = 1 + ca.get(Calendar.MONTH); //mais 1 pq o mes do calendar começa com 0

            if (ano == anoC && mes == mesC){
                soma += ct.valorTotal();
            }
        }

        return soma;

    }

    public String toString(){

        return "Nome: " + getNome() + "\nDepartamento: " + getDepartamento();

    }

}
