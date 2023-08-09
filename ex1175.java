import java.util.Scanner;

public class ex1175 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 20;
         int[] va = new int[n];
         int ini = 0;
         int fim = n-1;
         int aux;
        for(int i=0;i<n;i++){
            va[i] = entrada.nextInt();

        }
        entrada.close();
        while(ini<fim){
            aux = va[ini];
            va[ini]= va[fim];
            va[fim]= aux;
            ini = ini +1 ;
            fim = fim -1;
        }
        for(int i=0;i<n;i++)
        System.out.printf("N[%d] = %d\n",i,va[i]);
        
        

        



    }
}
