import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teatrobard {

    private static double valorIngresso = 50.00;
    private static char[][] mapaAssentos = new char[15][10]; // Filas x Colunas
    private static int lugaresLivres = 150;
    private static int lugaresReservados = 0;
    private static int lugaresConfirmados = 0;
    private static int ingressosEstudantes = 0;
    private static double valorTotalArrecadado = 0.0;

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
        for (int i = 0; i < mapaAssentos.length; i++) {
            for (int j = 0; j < mapaAssentos[i].length; j++) {
                if (mapaAssentos[i][j] == 'O') {
                    System.
