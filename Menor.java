import java.util.Scanner;
public class Menor {
    public static void main(String[] args) {
        //variáveis
        Scanner entrada;        
        int a, b, c ;
        
        //entradas
        entrada = new Scanner(System.in);
        System.out.println(" Digite três valores ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();

        
               
        
        entrada.close();

        //processamento
        // "e" em java é && e "ou" é || print de booleano é %b, o "não" em java é "!""
        if(a<b && a<c){
            System.out.printf("menor valor %d \n",a);
        }else{
            if(b<a && b<c){
                System.out.printf("menor valor %d \n",b);
            }else{
                System.out.printf("menor valor %d \n",c);
            }

        }

        

        //saída
        
        
    }
}
