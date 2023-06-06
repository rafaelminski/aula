import java.util.Scanner;

public class Primo {
    public static void main(String[]args){
        //variaveis
        int x, i, n_div;
        Scanner sc;
         //entradas
        sc= new Scanner(System.in);
        System.out.println("Entre com um valor");
        x = sc.nextInt();
        sc.close();
        //processamento
        n_div= 0;
        for(i=1;i<=x;i++){
            if(x%i == 0 ){
                n_div++;
            }
        }
        if(n_div>0){
            System.out.println("É PRIMO");

        }else{
            System.out.println("Não é primo");
        }

    }
}
