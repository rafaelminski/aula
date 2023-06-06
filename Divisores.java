import java.util.Scanner;

public class Divisores {
    public static void main(String[]args){
        //variaveis
        int x, i;
        Scanner sc;
         //entradas
        sc= new Scanner(System.in);
        System.out.println("Entre com um valor");
        x = sc.nextInt();
        sc.close();
        //processamento
        for(i=1;i<=x;i++){
            if(x%i == 0 ){
                System.out.println(i);
            }
        }

    }
}
