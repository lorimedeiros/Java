package Front;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {

        Facade f = new Facade();
        Scanner sc = new Scanner(System.in);
        boolean parada1 = false;

        try {
            do {

                System.out.println(menuPrincipal());
                int escolha1 = Integer.parseInt(sc.nextLine());

                if ((escolha1 < 1) || (escolha1 > 3)) {
                    System.out.println("Opção inexistente");
                }

                if (escolha1 == 1) {

                    boolean parada2 = false;

                    do {

                        System.out.println(menuServico());
                        int escolha2 = Integer.parseInt(sc.nextLine());

                        if ((escolha2 < 1) || (escolha2 > 4)) {
                            System.out.println("Opção inexistente");
                        }

                        if (escolha2 == 1) {

                            System.out.println("Informe o tamanho do animal(P/M/G):");
                            char c = sc.next().charAt(0);
                            sc.nextLine();

                            System.out.println("Informe o tamanho do pelo(P/M/L):");
                            char c2 = sc.next().charAt(0);
                            sc.nextLine();

                            f.banho(c2, c);
                            //lembrar de adc exceção

                        } else if (escolha2 == 2) {

                            System.out.println("Informe o tamanho do animal(P/M/G):");
                            char c = sc.next().charAt(0);
                            sc.nextLine();

                            f.tosa(c);
                            //lembrar de adc exceção

                        } else if (escolha2 == 3) {

                            System.out.println("Informe o tamanho do animal(P/M/G):");
                            char c = sc.next().charAt(0);
                            sc.nextLine();

                            System.out.println("Quantas horas passará?");
                            int h = Integer.parseInt(sc.nextLine());

                            f.hotel(c, h);
                            //lembrar de adc exceção

                        } else if (escolha2 == 4) {

                            parada2 = true;

                        }

                    } while (!parada2);

                } else if (escolha1 == 2) {

                    boolean parada3 = false;

                    do {

                        System.out.println(menuHistorico());
                        int escolha3 = Integer.parseInt(sc.nextLine());

                        if ((escolha3 < 1) || (escolha3 > 6)) {
                            System.out.println("Opção inexistente");
                        }

                        if (escolha3 == 1) {
                            System.out.println(f.mostrarBanhos());
                        } else if (escolha3 == 2) {
                            System.out.println(f.mostrarTosas());
                        } else if (escolha3 == 3) {
                            System.out.println(f.mostrarHoteis());
                        } else if (escolha3 == 4) {
                            System.out.println(f.mostrarResumo());
                        } else if (escolha3 == 5) {
                            System.out.println(f.mostrarDetalhe());
                        } else if (escolha3 == 6) {
                            parada3 = true;
                        }

                    } while (!parada3);

                } else if (escolha1 == 3) {
                    parada1 = true;
                }

            } while (!parada1);

        } catch (IllegalArgumentException e){
            System.out.println("Ocorreu um erro");
        }

        sc.close();

    }

    public static String menuPrincipal(){
        return "Selecione a interface de usuário:\n" +
                "1. Cliente\n" +
                "2. Colaborador\n" +
                "3. Encerrar";
    }

    public static String menuServico(){
        return "Selecione o tipo de serviço:\n" +
                "1. Banho\n" +
                "2. Tosa\n" +
                "3. Hotel\n" +
                "4. Voltar";
    }

    public static String menuHistorico(){
        return "Selecione o tipo de histórico:\n" +
                "1. Banhos\n" +
                "2. Tosas\n" +
                "3. Hotéis\n" +
                "4. Resumo\n" +
                "5. Detalhamento\n" +
                "6. Voltar";
    }

}