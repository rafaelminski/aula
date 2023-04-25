import java.util.Scanner;


public class Calculadora1 {
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
        //processamento e saída
        switch (operador) {
            case "+":
                resultado = a+b;
                System.out.printf("resultado %.2f \n",resultado);
                break;
            case "-":
                resultado = a-b;
                System.out.printf("resultado %.2f \n",resultado);
                break;
            case "*":
                resultado = a*b;
                System.out.printf("resultado %.2f \n",resultado);
                break;
            case "/":
                resultado = a/b;
                System.out.printf("resultado %.2f \n",resultado);
                break;
            default:
                System.out.println("operador inválido");
        }

        
        



    }
    
}