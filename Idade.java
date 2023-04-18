import java.util.Scanner;
public class Idade {
    public static void main(String[] args) {
        //variáveis
        Scanner entrada;        
        int Idade;
        
        //entradas
        entrada = new Scanner(System.in);
        System.out.println(" Digite sua idade ");
        Idade = entrada.nextInt();
        
               
        
        entrada.close();

        //processamento
        System.out.printf("Parabêns! Você tem %d  anos \n", Idade);

        

        //saída
        if(Idade >= 18){
            System.out.println("Você é maior de idade");
        }
    }
}
