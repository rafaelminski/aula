import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        //variáveis
        Scanner entrada;        
        float valor_carro, valor_final;
        
        //entradas
        entrada = new Scanner(System.in);
        System.out.println("valor do carro:");
        valor_carro = entrada.nextFloat();
               
        
        entrada.close();

        //processamento
        valor_final = valor_carro + valor_carro * 28/100 + valor_carro * 45/100 ;

        //saída
        System.out.printf("O valor final é: R$ %.2f  \n", valor_final);
        



    }
}
