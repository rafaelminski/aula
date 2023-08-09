import java.util.Scanner; //falta resolver



public class ex1177 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 20;
         int[] va = new int[n];
         
        for(int i=0;i<n;i++){
            va[i] = entrada.nextInt();

        }
        entrada.close();
        
        
        for(int i=0;i<n;i++)
        System.out.printf("N[%d] = %d\n",i,va[i]);
        
        

        



    }
}
