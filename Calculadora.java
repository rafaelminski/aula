import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //variáveis
        Scanner entrada;        
        int a, b;
        String operador;
        float resultado;
        
        //entradas
        entrada = new Scanner(System.in);
        System.out.println(" Digite dois valores ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        System.out.println(" Escolha o operador (+ - * / ):");
        operador = entrada.next();


        
               
        
        entrada.close();

        //processamento
        // "e" em java é && e "ou" é || print de booleano é %b, o "não" em java é "!""

        if(operador .equals("+")){
            resultado = a + b;
            System.out.printf("resultado %.2f \n",resultado);
        }else{
            if(operador .equals("-")){
                resultado = a - b;
                System.out.printf("resultado %.2f \n",resultado);
            }else{
                if(operador .equals("*")){
                    resultado = a * b;
                    System.out.printf("resultado %.2f \n",resultado);
                }else{
                resultado = a / b;    
                System.out.printf("resultado %.2f \n",resultado);
                }
        

            }
            
        }
        //essa também é uma forma válida
        //if(!operador .equals("+") &&  !operador .equals("-") &&  !operador .equals("*") && !operador .equals("/")){
           // System.out.printf("operador inválido \n");

        //}
        if(!(operador .equals("+") ||  operador .equals("-") || operador .equals("*") || operador .equals("/"))){
            System.out.printf("operador inválido \n");
        }
    
    }
}

