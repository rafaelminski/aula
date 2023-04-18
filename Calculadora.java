import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //variáveis
        Scanner entrada;        
        int a, b;
        char operador;
        float resultado;
        
        //entradas
        entrada = new Scanner(System.in);
        System.out.println(" Digite dois valores ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        System.out.println(" Escolha o operador + - * / ");
        operador = entrada.nextLine().charAt(4);


        
               
        
        entrada.close();

        //processamento
        // "e" em java é && e "ou" é || print de booleano é %b, o "não" em java é "!""
        if(operador .equals("+")){
            resultado = a + b;
            System.out.printf("resultado %d \n",resultado);
        }else{
            if(operador .equals("-")){
                resultado = a - b;
                System.out.printf("resultado %d \n",resultado);
            }else{
                if(operador .equals("*")){
                    resultado = a * b;
                    System.out.printf("resultado %d \n",resultado);
                }else{
                resultado = a / b;    
                System.out.printf("resultado %d \n",resultado);
                }
            }

        }

    
}
}

