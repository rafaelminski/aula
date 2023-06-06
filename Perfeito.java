import java.util.Scanner;

public class Perfeito {
    public static void main(String[] args){
        //variaveis
        Scanner entrada;
        int x, n_div, i, soma;
        //entradas
        entrada = new Scanner(System.in);
        System.out.println("Entre com um valor");
        x = entrada.nextInt();
        entrada.close();
        //processamento
       
        for(i=1;i<x;i++){
            if(x%i == 0 ){
                n_div = i;
                soma = n_div + n_div; 
                if(soma==x){
                    System.out.println("É perfeito");
                }else{
                    System.out.println("Não é perfeito");
                }
            }
        }
}
}
