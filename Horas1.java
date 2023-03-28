import java.util.Scanner;


public class Horas1 {
     public static void main(String[] args) {
        //variáveis
        Scanner entrada;
        int hora, minuto, segundo, tempo,tempoh, tempom, tempos;
        
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
        tempoh = tempo/3600;
        tempom = tempo%3600;
        tempom = tempom/60;
        tempos = tempom%60;


        //saída
        System.out.printf("Se passaram %d segundos desde 00:00 \n", tempo);
        System.out.printf("Se passaram %d horas desde 00:00 \n", tempoh);
        System.out.printf("Se passaram %d minutos desde 00:00 \n", tempom);
        System.out.printf("Se passaram %d segundos desde 00:00 \n", tempos);
        



    }
    
}