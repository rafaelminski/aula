import java.util.Scanner;

public class Trabalho {

    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        int n_div = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                n_div++;
            }
        }
        return n_div == 2;
    }

    public static int PrimosNoIntervalo(int x, int y) {
        int menor, maior;
        int cont = 0;
        if (x < y) {
            menor = x;
            maior = y;
        } else {
            menor = y;
            maior = x;
        }
        for (int i = menor; i <= maior; i++) {
            if (ehPrimo(i)) {
                cont++;
            }
        }
        return cont;
    }

    public static String verificarOrdenacao(int n, Scanner sc) {
        System.out.println("Digite os " + n + " valores:");

        int valorAnterior = sc.nextInt();
        boolean crescente = true;
        boolean decrescente = true;
        boolean iguais = true;

        for (int i = 1; i < n; i++) {
            int valorAtual = sc.nextInt();
            if (valorAtual < valorAnterior) {
                crescente = false;
            }
            if (valorAtual > valorAnterior) {
                decrescente = false;
            }
            if (valorAtual != valorAnterior) {
                iguais = false;
            }
            valorAnterior = valorAtual;
        }

        if (iguais) {
            return "Os valores são iguais.";
        } else if (crescente) {
            return "Os valores estão ordenados numericamente de maneira crescente.";
        } else if (decrescente) {
            return "Os valores estão ordenados numericamente de maneira decrescente.";
        } else {
            return "Os valores estão desordenados numericamente.";
        }
    }

    public static boolean ehPerfeito(int num) {
        if (num <= 0) {
            return false;
        }
        int somaDivisores = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                somaDivisores += i;
            }
        }
        return somaDivisores == num;
    }

    public static void perfeitosNoIntervalo(int a, int b) {
        int menor, maior;
        if (a < b) {
            menor = a;
            maior = b;
        } else {
            menor = b;
            maior = a;
        }

        System.out.println("Os números perfeitos no intervalo [" + menor + ", " + maior + "] são:");
        int totalPerfeitos = 0;
        for (int i = menor; i <= maior; i++) {
            if (ehPerfeito(i)) {
                System.out.print(i + " ");
                totalPerfeitos++;
            }
        }

        if (totalPerfeitos == 0) {
            System.out.print("Nenhum");
        }

        System.out.println();
        System.out.println("Total: " + totalPerfeitos + " número(s).");
    }

    public static void verificarPrimoPerfeito(int numero) {
        if (numero <= 1 || !ehPrimo(numero)) {
            System.out.println(numero + " não é um número primo .");
            return;
        }

        int soma = 0;
        int numeroAtual = 2;

        while (numeroAtual <= numero) {
            if (ehPrimo(numeroAtual)) {
                soma += numeroAtual;

                if (soma == numero) {
                    System.out.println(numero + " é um número primo perfeito.");
                    System.out.println("É resultado da soma dos números:");
                    int primeiroPrimo = 2;
                    for (int i = primeiroPrimo; i <= numeroAtual; i++) {
                        if (ehPrimo(i)) {
                            System.out.println(i);
                        }
                    }
                    return;
                }

                while (soma > numero) {
                    if (ehPrimo(numeroAtual)) {
                        soma -= numeroAtual;
                    }
                    numeroAtual++;
                }
            }
            numeroAtual++;
        }

        System.out.println(numero + " não é um número primo perfeito.");
       
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // primos no intervalo
            int x = 20;
            int y = 10;
            int qtd = PrimosNoIntervalo(x, y);
            System.out.printf("No intervalo ( %d , %d ) há %d números primos \n", x, y, qtd);

        // ordenados
        System.out.print("Digite o número de valores a serem observados (n): ");
        int n = sc.nextInt();
        

        String resultado = verificarOrdenacao(n, sc);
        System.out.println(resultado);

        // perfeitos
        int a = 2;
        int b = 10;
        perfeitosNoIntervalo(a, b);

        //primos perfeitos
        System.out.print("Digite um número para verificar se é um número primo perfeito: ");
        int numero = sc.nextInt();
        verificarPrimoPerfeito(numero);

        sc.close();
    }
}
