import java.util.Scanner;

public class Teatro {
    // declaração de variáveis globais e a matriz
    public static double valorIngresso = 50.00;
    public static char[][] mapaAssentos = new char[15][10]; // Filas x Colunas
    public static int lugaresLivres = 150;
    public static int lugaresReservados = 0;
    public static int lugaresConfirmados = 0;
    public static int ingressosEstudantes = 0;
    public static double valorTotalArrecadado = 0.0;

    // método que cria o menu administrativo e que tem como parâmetro a variável
    // scanner
    // dentro deste método é possível chamar outros métodos para as opções
    // escolhidas
    // o método começa com um loop, que retorna ações que o usuário deve escolher
    // que serão armazenadas na variável opcao
    public static void menuAdministrativo(Scanner scanner) {
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

    // método que cria o menu cliente, quando escolhida a opção deste método no
    // swith do trecho acima,
    // o mesmo retorna para esse método
    // dentro do switch deste método são chamadas alguns outros métodos de acordo
    // com a escolha do usuário

    public static void menuCliente(Scanner scanner) {
        while (true) {
            System.out.println("\nÁrea de Clientes:");
            System.out.println("1. Visualizar Mapa de Assentos");
            System.out.println("2. Realizar Reserva");
            System.out.println("3. Cancelar Reserva");
            System.out.println("4. Confirmar ocupação");
            System.out.println("5. Cancelar ocupação");
            System.out.println("6. Voltar ao Menu Principal");
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
                    realizarOcupacao(scanner); 
                    break; 
                case 5:
                    cancelarOcupacao(scanner);
                    break;  
                case 6:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    // esse método quando chamado mostra o mapa atualizado dos assentos
    public static void visualizarMapaAssentos() {
        System.out.println("\nMapa de Assentos:");
        for (int i = 0; i < mapaAssentos.length; i++) {
            for (int j = 0; j < mapaAssentos[i].length; j++) {
                if (mapaAssentos[i][j] == 'R') {
                    System.out.print("R ");
                }else if (mapaAssentos[i][j] == 'X') {
                    System.out.print("X ");
                }
                 else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    public static void gerarRelatorio() {
        System.out.println("\nRelatório:");
        System.out.println("Quantidade de lugares livres: " + lugaresLivres);
        System.out.println("Quantidade de lugares reservados: " + lugaresReservados);
        System.out.println("Quantidade de lugares confirmados: " + lugaresConfirmados);
        System.out.println("Número total de ingressos de estudantes: " + ingressosEstudantes);
        System.out.println("Valor total arrecadado com os ingressos: R$" + valorTotalArrecadado);
    }

    public static void realizarReserva(Scanner scanner) {
        System.out.print("Fila (1-15): ");
        int fila = scanner.nextInt();
        System.out.print("Coluna (1-10): ");
        int coluna = scanner.nextInt();

        if (fila < 1 || fila > 15 || coluna < 1 || coluna > 10) {
            System.out.println("Assento inválido. Tente novamente.");
            return;
        }

        if (mapaAssentos[fila - 1][coluna - 1] != 'R' && mapaAssentos[fila - 1][coluna - 1] != 'X') {
            // Assento está livre, pode prosseguir com a reserva
        } else {
            System.out.println("Este assento já está reservado ou ocupado.");
            return;
        }
        mapaAssentos[fila - 1][coluna - 1] = 'R';
        lugaresReservados++;
        //lugaresConfirmados++;
        lugaresLivres--;
        System.out.println("Reserva realizada com sucesso.");

       


    }
    public static void realizarOcupacao(Scanner scanner){
        System.out.print("Fila (1-15): ");
        int fila = scanner.nextInt();
        System.out.print("Coluna (1-10): ");
        int coluna = scanner.nextInt();

        if (fila < 1 || fila > 15 || coluna < 1 || coluna > 10) {
            System.out.println("Assento inválido. Tente novamente.");
            return;
        }
        if (mapaAssentos[fila - 1][coluna - 1] != 'R' && mapaAssentos[fila - 1][coluna - 1] != 'X') {
            // Assento está livre, pode prosseguir com a ocupação
        } else {
            System.out.println("Este assento já está reservado ou ocupado.");
            return;
        }
        mapaAssentos[fila - 1][coluna - 1] = 'X';
        
        lugaresConfirmados++;
        lugaresLivres--;
        System.out.print("O cliente é estudante? (S/N): ");
        char resposta = scanner.next().charAt(0);

        if (resposta == 'S' || resposta == 's') {
            valorTotalArrecadado += valorIngresso / 2;
            ingressosEstudantes++;
        } else {
            valorTotalArrecadado += valorIngresso;
        }
        
        System.out.println("Lugar ocupado com sucesso .");
    }

    public static void cancelarReserva(Scanner scanner) {
        System.out.print("Fila (1-15): ");
        int fila = scanner.nextInt();
        System.out.print("Coluna (1-10): ");
        int coluna = scanner.nextInt();

        if (fila < 1 || fila > 15 || coluna < 1 || coluna > 10) {
            System.out.println("Assento inválido. Tente novamente.");
            return;
        }

        if (mapaAssentos[fila - 1][coluna - 1] != 'R') {
            System.out.println("Este assento não está reservado.");
            return;
        }

        // Marque o assento como livre ('O')
        mapaAssentos[fila - 1][coluna - 1] = 'O';

        // Atualize as variáveis relevantes
        lugaresReservados--;
        lugaresLivres++;

        System.out.println("Reserva cancelada com sucesso.");
    }

     public static void cancelarOcupacao(Scanner scanner) {
        System.out.print("Fila (1-15): ");
        int fila = scanner.nextInt();
        System.out.print("Coluna (1-10): ");
        int coluna = scanner.nextInt();

        if (fila < 1 || fila > 15 || coluna < 1 || coluna > 10) {
            System.out.println("Assento inválido. Tente novamente.");
            return;
        }

        if (mapaAssentos[fila - 1][coluna - 1] != 'X') {
            System.out.println("Este assento não está ocupado.");
            return;
        }
        System.out.print("O cliente é estudante? (S/N): ");
        char resposta = scanner.next().charAt(0);
          if (resposta == 'S' || resposta == 's') {
            valorTotalArrecadado -= valorIngresso / 2;
            ingressosEstudantes--;
        } else {
            valorTotalArrecadado -= valorIngresso;
        }
        // Marque o assento como livre ('O')
        mapaAssentos[fila - 1][coluna - 1] = 'O';

        // Atualize as variáveis relevantes
        lugaresConfirmados --;
        lugaresLivres++;

        System.out.println("Ocupação cancelada com sucesso.");
    }

    public static void main(String[] args) {
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
}
