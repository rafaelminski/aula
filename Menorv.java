import java.util.Scanner;

public class Menorv {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador, menor, valor;
        System.out.println("digite um valor");
        menor = entrada.nextInt();
        contador= 1;

        while(contador<5 ){
            valor = entrada.nextInt();
            contador ++;
            if(valor<menor){
                menor = valor;}

         System.out.printf("menor valor:%d",menor);
            
       

        }
        
    }
}
