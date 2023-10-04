package Front;

import Back.InventarioDeServicos;

public class Facade {

    InventarioDeServicos inv = new InventarioDeServicos();

    public void banho(char pelo, char tamanho){
        inv.addBanho(pelo, tamanho);
    }

    public void tosa(char tamanho){
        inv.addTosa(tamanho);
    }

    public void hotel(char tamanho, Integer horas){
        inv.addHotel(tamanho, horas);
    }

    public String mostrarBanhos(){
        return inv.retornaBanho();
    }

    public String mostrarTosas(){
        return inv.retornaTosa();
    }

    public String mostrarHoteis(){
        return inv.retornaHotel();
    }

    public String mostrarResumo() {
        return inv.retornaTudoResumo();
    }

    public String mostrarDetalhe() {
        return inv.retornaTudoDetalhado();
    }

}
