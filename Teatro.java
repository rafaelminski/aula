

import java.util.Scanner;



public class Teatro {
   
    private static final int VALOR_INGRESSO_PADRAO = 50;
     // Variáveis globais
     private static int assentosLivres = 100;
     private static int assentosReservados = 0;
     private static int assentosConfirmados = 0;
     private static int valorIngresso = VALOR_INGRESSO_PADRAO;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis globais
        
        // Menu principal
        boolean sair = false;
        while (!sair) {
            int opcao = exibirMenu(scanner);
            switch (opcao) {
                case 1:
                    alterarValorIngresso(scanner);
                    break;
                case 2:
                    visualizarMapaAssentos();
                    break;
                case 3:
                    gerarRelatorio();
                    break;
                case 4:
                    realizarReserva(scanner);
                    break;
                case 5:
                    cancelReserva(scanner);
                    break;
                case 6:
                    sair = true;
                    break;
            }
        }
    }

    // Métodos públicos

    public static int exibirMenu(Scanner scanner) {
        System.out.println("====== Menu ======");
        System.out.println("1. Alterar valor do ingresso");
        System.out.println("2. Visualizar mapa de assentos");
        System.out.println("3. Gerar relatório");
        System.out.println("4. Realizar reserva");
        System.out.println("5. Cancelar reserva");
        System.out.println("6. Sair");
        System.out.print("Opção: ");
        return scanner.nextInt();
    }

    public static void alterarValorIngresso(Scanner scanner) {
        System.out.print("Informe o novo valor do ingresso: ");
        valorIngresso = scanner.nextInt();
    }

    public static void visualizarMapaAssentos() {
        System.out.println("Assentos livres: " + assentosLivres);
        System.out.println("Assentos reservados: " + assentosReservados);
        System.out.println("Assentos confirmados: " + assentosConfirmados);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int assento = i * 10 + j;
                String status = "Livre";
                if (assentosReservados > 0 && assentosReservados(assento)) {
                    status = "Reservado";
                } else if (assentosConfirmados > 0 && assentosConfirmados(assento)) {
                    status = "Confirmado";
                }
                System.out.print(status);
            }
            System.out.println();
        }
    }

    public static void gerarRelatorio() {
        System.out.println("Relatório");
        System.out.println("Assentos livres: " + assentosLivres);
        System.out.println("Assentos reservados: " + assentosReservados);
        System.out.println("Assentos confirmados: " + assentosConfirmados);
        System.out.println("Ingressos de estudantes: " + ingressosEstudantes);
        System.out.println("Receita: R$" + receita);
    }
    
    public static void cancelReserva(Scanner scanner) {
        System.out.print("Informe o número do assento a ser cancelado: ");
        int assento = scanner.nextInt();
    
        if (assentosReservados > 0 && assentosReservados(assento)) {
            assentosReservados--;
            assentosLivres++;
            ingressosEstudantes -= ingressosEstudantes.contains(assento) ? 1 : 0;
            receita -= VALOR_INGRESSO_PADRAO;
            System.out.println("Reserva cancelada com sucesso!");
        } else {
            System.out.println("Não há reserva para o assento informado.");
        }
    }
    

    public static void realizarReserva(Scanner scanner) {
        int assento = selecionarAssento(scanner);
        if (assento == -1) {
            return;
        }

        System.out.print("É estudante? (1 - Sim, 2 - Não): ");
        int ehEstudante = scanner.nextInt();

        int valorIngresso = VALOR_INGRESSO_PADRAO;
        if (ehEstudante == 1) {
            valorIngresso /= 2;
        }

       if (assentosLivres > 0) {
    assentosLivres--;
    assentosReservados++;
    ingressosEstudantes += ehEstudante == 1 ? 1 : 0;
    receita += valorIngresso;
    System.out.println("Reserva realizada com sucesso!");
} else {
    System.out.println("Não há mais assentos disponíveis.");
}
    }
}
