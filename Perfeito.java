import java.util.Scanner;

public class Perfeito {
    public static void main(String[] args){
        //variaveis
        Scanner entrada;
        int x, n_div, i, soma, acm;
        //entradas
        entrada = new Scanner(System.in);
        System.out.println("Entre com um valor");
        x = entrada.nextInt();
        entrada.close();
        //processamento
        soma= 0;
        acm=0;
        for(i=1;i<x;i++){
            if(x%i == 0 ){
                acm=acm+i;
                //n_div = i;
                //soma = n_div + n_div; 
                
            }
        }
        if(acm==x){
            System.out.println("É perfeito");
        }else{
            System.out.println("Não é perfeito");
        }
}
}
