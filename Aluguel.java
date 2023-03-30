import java.util.Scanner;


public class Aluguel {
     public static void main(String[] args) {
        //variáveis
        Scanner entrada;
        int km, dias;
        float valor;
        //entradas
        entrada = new Scanner(System.in);
        System.out.println("dias:");
        dias = entrada.nextInt();
        System.out.println("km:");
        km = entrada.nextInt();
        
        
        entrada.close();
        //processamento
        valor = dias * 60 + km * (float) 0.15;

        //saída
        System.out.printf("O valor final é: R$ %.2f  \n", valor);
        



    }
    
}