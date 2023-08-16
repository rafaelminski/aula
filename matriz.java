public class matriz{
    
    public static void main(String[] args) {
        int [] [] matriz ;
        int i, j;
        int n_linhas = 7, n_colunas = 7;
        matriz = new int[n_linhas][n_colunas];
        for (i=0;i<n_linhas;i++){
            for(j=0;j<n_colunas;j++){
               
                if(i==0){
                    matriz[i][j] = 1;
                }else{
                    if(i==n_linhas - 1){
                        matriz[i][j] = 1;
                    }else{
                        if(j==0){
                            matriz [i][j] = 1;
                        }else{
                            if(j==n_colunas-1){
                            matriz[i][j] = 1;
                        }else{
                            matriz [i][j] = 9;
                        }
                    }
                    }
                }
                System.out.printf("%d ", matriz[i][j]);
            }
            
            System.out.println();
        }
    }
}