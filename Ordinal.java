import java.util.Scanner;

import javax.smartcardio.CardException;

public class Ordinal {
    public static void main(String[] args) {
        //variáveis
        Scanner entrada;
        int numero, dezena, unidade;
        String palavra_1, palavra_2;
        //entradas
        entrada = new Scanner(System.in);
        System.out.println("entre com um número inteiro de 1 a 99:");
        numero = entrada.nextInt();
        
        entrada.close();
        //processamento
        dezena = numero/10;
        unidade = numero%10;
        switch (dezena){
            case 0:
                palavra_1 = "";
                break;
            case 1:
                palavra_1 = "décimo";
                break;
            case 2:
                palavra_1 = "vigésimo";
                break;
            case 3:
                palavra_1 = "trigésimo";
                break;
            case 4:
                palavra_1 = "quadragésimo";
                break;
            case 5:
                palavra_1 = "quinquagésimo";
                break;
            case 6:
                palavra_1 = "sexagésimo";
                break;
            case 7:
                palavra_1 = "septuagésimo";
                break;
            case 8:
                palavra_1 = "octagésimo";
                break;
            case 9:
                palavra_1 = "nonagésimo";
                break; }

        switch (unidade){
            case 0:
                palavra_2 = "";
                System.out.println(palavra_1, palavra_2);
                break;
            case 1:
                palavra_2 = "primeiro";
                break;
            case 2:
                palavra_2 = "segundo";
                break;
            case 3:
                palavra_2 = "terceiro";
                break;
            case 4:
                palavra_2 = "quarto";
                break;
            case 5:
                palavra_2 = "quinto";
                break;
            case 6:
                palavra_2 = "sexto";
                break;
            case 7:
                palavra_2 = "sétimo";
                break;
            case 8:
                palavra_2 = "oitávo";
                break;
            case 9:
                palavra_2 = "nono";
                break;                        
        }

        //saída
        System.out.println("A duração total do jogo foi:" + horas + " horas " +  minutos + " minutos " );
        



    }
}
