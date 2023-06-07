import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        //variaveis
        Scanner entrada;
        int x,i;
        //entradas
        entrada = new Scanner(System.in);
        x= entrada.nextInt();
        entrada.close();
        for(i=1;i<=x;i++){
            System.out.printf("%d %d %d  \n ",i,i*i,i*i*i);
            System.out.printf("%d %d %d  \n ",i,i*i+1,i*i*i+1);

        }
        }
    }

