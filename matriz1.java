import java.util.Scanner;


public class matriz1 {
    public static Scanner sc;

    public static int [][] matrizleitura(int n_linhas, int n_colunas){
        int [][] matriz = new int[n_linhas][n_colunas];
        int i, j;
        for(i=0;i<n_linhas;i++){
            for(j=0;j<n_colunas;j++){
                matriz[i][j] = sc.nextInt();
            }
        }


        return matriz;
    }

    public static void matrizPrint(int[][] matriz){
        int i, j;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[0].length;j++){
                System.out.printf("%d",matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
         sc = new Scanner(System.in);
        int [] [] matriz ;
        int i, j;
        int n_linhas = 4, n_colunas = 4;
        matriz = new int[n_linhas][n_colunas];
        System.out.println("digite 16 valores");
        for (i=0;i<n_linhas;i++){
            for(j=0;j<n_colunas;j++){
              
               matriz[i][j] = sc.nextInt();
                
            }
            
            
        }
        int cont = 0;
        for(i=0;i<n_linhas;i++){
            for(j=0;j<n_colunas;j++){
                if(matriz[i][j]<10){
                    cont ++;
                System.out.printf("%d ", matriz[i][j]);
                
                }
            }
            System.out.printf("%d",cont);
            System.out.println();
        }
        
    }
}