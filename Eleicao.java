import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        //variáveis
        Scanner entrada;
        int  candidato_a, candidato_b, candidato_c, votos_totais, votos_brancos, votos_nulos;
        
        //entradas
        entrada = new Scanner(System.in);
        System.out.println("Votos candidato a:");
        candidato_a = entrada.nextInt();
        System.out.println("Votos candidato b:");
        candidato_b = entrada.nextInt();
        System.out.println("Votos candidato c:");
        candidato_c = entrada.nextInt();
        System.out.println("Votos Brancos:");
        votos_brancos = entrada.nextInt();
        System.out.println("Votos Nulos:");
        votos_nulos = entrada.nextInt();
        
        
        entrada.close();
        //processamento
        votos_totais = candidato_a + candidato_b + candidato_c + votos_brancos + votos_nulos ;
        candidato_a = candidato_a* 100/votos_totais ;
        candidato_b = candidato_b * 100/votos_totais;
        candidato_c = candidato_c* 100/votos_totais ;
        votos_brancos = votos_brancos* 100/votos_totais ;
        votos_nulos = votos_nulos*100/votos_totais;

        //saída
        System.out.printf("quantidade total de votos é: %d  \n", votos_totais);
        System.out.printf("porcentagem de votos candidato a é: %d  \n", candidato_a);
        System.out.printf("porcentagem de votos candidato a é: %d  \n", candidato_b);
        System.out.printf("porcentagem de votos candidato a é:  %d  \n", candidato_c);
        System.out.printf("porcentagem de votos candidato a é:  %d  \n", votos_brancos);
        System.out.printf("porcentagem de votos candidato a é:  %d  \n", votos_nulos);
        
        
    }     
    
}
