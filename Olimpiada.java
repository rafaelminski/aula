import java.util.Scanner;

public class Olimpiada {
    public static void main(String[] args) {
        //variáveis
        Scanner entrada;        
        int d;
        
        
        //entradas
        entrada = new Scanner(System.in);
        System.out.println(" Digite a distância do lançamento ");
        d = entrada.nextInt();
        


        
               
        
        entrada.close();

        //processamento
        // "e" em java é && e "ou" é || print de booleano é %b, o "não" em java é "!""

        if(d >= 0 && d<=800 ){
            d = 1;
            System.out.printf("pontos %d \n",d);
        }else{
            if(d > 800 && d <= 1400){
                d = 2;
                System.out.printf("pontos  %d \n",d);
            }else{
                if(d > 1400 && d <=2000);
                d = 3;
                System.out.printf(" pontos: %d \n",d);
            }
            }
            
        
    }
}

