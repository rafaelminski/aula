import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        //variaveis
        Scanner entrada;
        int n, r, i;
        //entradas
        entrada = new Scanner(System.in);
        System.out.println("Entre com um valor");
        n = entrada.nextInt();
        //processamento
        i = 1;
        while(i<=10){
            r = n*i;
            System.out.printf("%d x %d = %d \n",n,i,r);
            i ++;
        }





    }
}
