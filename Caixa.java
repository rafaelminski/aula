import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
       //variáveis
       Scanner entrada;
       int valor_sacar, n100, n50, n20, n10,n5,n2, sobra;
       
       //entradas
       entrada = new Scanner(System.in);
       System.out.println("valor a ser sacado:");
       valor_sacar = entrada.nextInt();
      
       
       
       entrada.close();
       //processamento
       n100 = valor_sacar/100;
       sobra = valor_sacar%100;
       n50 = sobra/50;
       sobra = sobra%50;
       n20 = sobra/20;
       sobra = sobra%20;
       n10 = sobra/10;
       sobra = sobra%10;
       n5 = sobra/5;
       sobra = sobra%5;
       n2 = sobra/2;
       sobra = sobra%2;



       //saída
       System.out.printf("notas de : R$ 100,00 %d  \n", n100);
       System.out.printf("notas de : R$ 50,00 %d  \n", n50);
       System.out.printf("notas de : R$ 20,00 %d  \n", n20);
       System.out.printf("notas de : R$ 10,00 %d  \n", n10);
       System.out.printf("notas de : R$ 5,00 %d  \n", n5);
       System.out.printf("notas de : R$ 2,00 %d  \n", n2);






   }
   
}