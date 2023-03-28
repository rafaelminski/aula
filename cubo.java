import java.util.Scanner;


public class Horas {
     public static void main(String[] args) {
        //variáveis
        Scanner entrada;
        int hora, minuto, segundo, tempo;
        
        //entradas
        entrada = new Scanner(System.in);
        System.out.println("Hora:");
        hora = entrada.nextInt();
        System.out.println("Minuto:");
        minuto = entrada.nextInt();
        System.out.println("Segundo:");
        segundo = entrada.nextInt();

        
        entrada.close();
        //processamento
        tempo = hora*3600;
        tempo = tempo + minuto * 60;
        tempo = tempo + segundo;

        //saída
        System.out.printf("Se passaram %d segundos desde 00:00 %d \n", tempo);
        



    }
    
}
