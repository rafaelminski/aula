import java.util.Scanner;


public class Jogo {
     public static void main(String[] args) {
        //variáveis
        Scanner entrada;
        int hora_inicial, minuto_inicial, hora_final, minuto_final, tempo_1,tempo_2, tempo_total, horas, minutos;
        
        //entradas
        entrada = new Scanner(System.in);
        System.out.println("entre com a hora e o minuto inicial do jogo:");
        hora_inicial = entrada.nextInt();
        minuto_inicial = entrada.nextInt();
        System.out.println("entre com a hora e o minuto final do jogo:");
        hora_final = entrada.nextInt();
        minuto_final = entrada.nextInt();

        entrada.close();
        //processamento
        tempo_1 = hora_inicial*60;
        tempo_1 = tempo_1 + minuto_inicial ;
        tempo_2 = hora_final*60;
        tempo_2 = tempo_2 + minuto_final;
        tempo_total = tempo_2 - tempo_1;
        horas = tempo_total/60;
        minutos = tempo_total%60;

        //saída
        System.out.println("A duração total do jogo foi:" + horas + " horas " +  minutos + " minutos " );
        



    }
    
}