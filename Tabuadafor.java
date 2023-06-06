import java.util.Scanner;

public class Tabuadafor {
    public static void main(String[] args){
        //variaveis
        Scanner entrada;
        int n, r, i;
        //entradas
        entrada = new Scanner(System.in);
        System.out.println("Entre com um valor");
        n = entrada.nextInt();
        entrada.close();
        //processamento
       
        for(i=1;i<=10;i++){
            r = n*i;
            System.out.printf("%d x %d = %d \n",n,i,r);
           
        }





    }
}
