import java.util.Scanner;

public class Teatro2 {
    private static double valorIngresso = 50.00;
    private static char[][] mapaAssentos = new char[15][10];
    private static int lugaresLivres = 0;
    private static int lugaresReservados = 0;
    private static int lugaresConfirmados = 0;
    private static int ingressosEstudantes = 0;
    private static double valorTotalArrecadado = 0.0;

    public static void main(String[] args) {
        inicializarMapaAssentos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bem-vindo ao Sistema de Reservas de Teatro");
            System.out.println("1. Área Administrativa");
            System.out.println("2. Área de Clientes");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    menuAdministrativo(scanner);
                    break;
                case 2:
                    menuCliente(scanner);
                    break;
                case 3:
                    System.out.println("Saindo do sistema. Até logo!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void inicializarMapaAssentos() {
        // Inicialize o mapa de assentos com os dados fornecidos
        // Este é um exemplo com base no mapa fornecido
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 && j >= 5) {
                    mapaAssentos[i][j] = 'X';
                } else if (i == 1 && j >= 7) {
                    mapaAssentos[i][j] = 'X';
                } else if (i == 2 && j < 3) {
                    mapaAssentos[i][j] = 'X';
                } else if (i == 4 && j >= 8) {
                    mapaAssentos[i][j] = 'R';
                } else if (i == 5 && j >= 7) {
                    mapaAssentos[i][j] = 'X';
                } else if (i == 6 && (j == 3 || j == 6)) {
                    mapaAssentos[i][j] = 'X';
                } else if (i == 7 && j == 4) {
                    mapaAssentos[i][j] = 'X';
                } else if (i == 8 && j == 11) {
                    mapaAssentos[i][j] = 'X';
                } else if (i == 9 && (j == 2 || j == 4)) {
                    mapaAssentos[i][j] = 'X';
                } else if (i == 11 && (j >= 5 && j <= 9)) {
                    mapaAssentos[i][j] = 'R';
                } else {
                    mapaAssentos[i][j] = '_';
                    lugaresLivres++;
                }
            }
        }
    }

    private static void menuAdministrativo(Scanner scanner) {
        while (true) {
            System.out.println("\nÁrea Administrativa:");
            System.out.println("1. Modificar Valor do Ingresso");
            System.out.println("2. Visualizar Mapa de Assentos");
            System.out.println("3. Gerar Relatório");
            System.out.println("4. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Novo valor do ingresso: R$");
                    valorIngresso = scanner.nextDouble();
                    break;
                case 2:
                    visualizarMapaAssentos();
                    break;
                case 3:
                    gerarRelatorio();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void menuCliente(Scanner scanner) {
        while (true) {
            System.out.println("\nÁrea de Clientes:");
            System.out.println("1. Visualizar Mapa de Assentos");
            System.out.println("2. Realizar Reserva");
            System.out.println("3. Cancelar Reserva");
            System.out.println("4. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    visualizarMapaAssentos();
                    break;
                case 2:
                    realizarReserva(scanner);
                    break;
                case 3:
                    cancelarReserva(scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void visualizarMapaAssentos() {
        System.out.println("\nMapa de Assentos:");
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(mapaAssentos[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void gerarRelatorio() {
        System.out.println("\nRelatório:");
        System.out.println("Quantidade de lugares livres: " + lugaresLivres);
        System.out.println("Quantidade de lugares reservados: " + lugaresReservados);
        System.out.println("Quantidade de lugares confirmados: " + lugaresConfirmados);
        System.out.println("Número total de ingressos de estudantes: " + ingressosEstudantes);
        System.out.println("Valor total arrecadado com os ingressos: R$" + valorTotalArrecadado);
    }

    private static void realizarReserva(Scanner scanner) {
        System.out.print("Fila (0-14): ");
        int fila = scanner.nextInt();
        System.out.print("Coluna (0-9): ");
        int coluna = scanner.nextInt();
    
        if (fila < 0 || fila > 14 || coluna < 0 || coluna > 9) {
            System.out.println("Assento inválido. Tente novamente.");
            return;
        }
    
        if (mapaAssentos[fila][coluna] == 'R' || mapaAssentos[fila][coluna] == 'X') {
            System.out.println("Este assento já está reservado ou ocupado.");
            return;
        }
    
        System.out.print("O cliente é estudante? (S/N): ");
        char resposta = scanner.next().charAt(0);
    
        if (resposta == 'S' || resposta == 's') {
            valorTotalArrecadado += valorIngresso / 2;
            ingressosEstudantes++;
        } else {
            valorTotalArrecadado += valorIngresso;
        }
    
        mapaAssentos[fila][coluna] = 'R';
        lugaresReservados++;
        lugaresLivres--;
        System.out.println("Reserva realizada com sucesso.");
    }
    

    private static void cancelarReserva(Scanner scanner) {
        System.out.print("Fila (0-14): ");
        int fila = scanner.nextInt();
        System.out.print("Coluna (0-9): ");
        int coluna = scanner.nextInt();
    
        if (fila < 0 || fila > 14 || coluna < 0 || coluna > 9) {
            System.out.println("Assento inválido. Tente novamente.");
            return;
        }
    
        if (mapaAssentos[fila][coluna] != 'R') {
            System.out.println("Este assento não está reservado.");
            return;
        }
    
        mapaAssentos[fila][coluna] = '_';
        lugaresReservados--;
        lugaresLivres++;
        System.out.println("Reserva cancelada com sucesso.");
    }
    
}
