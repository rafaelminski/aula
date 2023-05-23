import java.util.Scanner;

public class Numero {
    
    public static void main (String[] args){
        //variaveis
        int contador, numero;
        Scanner entrada;
        //entradas
        entrada = new Scanner(System.in);
        System.out.println("Digite números inteiros, digite 0 para parar");
        numero = 1;
        //prossessamento
        while( numero != 0){
            numero = entrada.nextInt();
            if (numero %2 ==0){
                System.out.println("par");}
            else
                System.out.println("impar");
            
            
        }
        entrada.close();





    }
}

