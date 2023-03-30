import java.util.Scanner;

public class Raiz {
    public static void main(String[] args) {
        //variáveis
        Scanner entrada;
        float raiz, pot;
        float valor;
        //entradas
        entrada = new Scanner(System.in);
        System.out.println("valor:");
        valor = entrada.nextFloat();
        
        
        entrada.close();
        //processamento
        raiz = (float) Math.sqrt(valor);
        pot = (float) Math.pow(valor, 3);

        //saída
        System.out.printf("A raiz é:  %.2f  \n", raiz);
        System.out.printf("Ao cubo : %.2f \n" , pot);
        

    }
}
