import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        //variáveis
        Scanner entrada;        
        
        float a, b, c;
        
        //entradas
        entrada = new Scanner(System.in);
        System.out.println(" Digite 3 valores para cadoa lado de um triangulo ");
        a = entrada.nextFloat();
        b = entrada.nextFloat();
        c= entrada.nextFloat();
        
        entrada.close();

        //processamento
        // também pode ser feito desta maneira
        //if(a>= b+c || b>= c+a || c>= a+b){
          // System.out.println("não forma triângulo");
           // }else{
             //  System.out.println("forma triângulo");
           // }

            if(a < b+c && b < c+a && c < a+b){
                System.out.println(" forma triângulo");
                 }else{
                    System.out.println(" não forma triângulo");
                 }   
           
    }
}

