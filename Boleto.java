import java.util.Scanner;


public class Boleto {
     public static void main(String[] args) {
        //variáveis
        Scanner entrada;
        int  dias_atraso, juros;
        float valor_boleto,total_boleto;
        //entradas
        entrada = new Scanner(System.in);
        System.out.println("valor do boleto:");
        valor_boleto = entrada.nextFloat();
        System.out.println("juros:");
        juros = entrada.nextInt();
        System.out.println("dias de atraso:");
        dias_atraso = entrada.nextInt();
        
        
        entrada.close();
        //processamento
        total_boleto = valor_boleto + valor_boleto  * juros/100 * dias_atraso ;

        //saída
        System.out.printf("O valor final do boleto é: R$ %.2f  \n", total_boleto);
        



    }
    
}