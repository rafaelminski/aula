import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        //variáveis
        Scanner entrada;        
        float salario_fixo, valor_total_vendas, salario_final;
        
        //entradas
        entrada = new Scanner(System.in);
        System.out.println(" Salário Fixo : ");
        salario_fixo = entrada.nextFloat();
        System.out.println("valor total de vendas:");
        valor_total_vendas = entrada.nextFloat();
               
        
        entrada.close();

        //processamento
        salario_final = salario_fixo + valor_total_vendas * 5/100 ;

        //saída
        System.out.printf("O valor final é: R$ %.2f  \n", salario_final);
        

    }

}
