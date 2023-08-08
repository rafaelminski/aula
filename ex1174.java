import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ex1174 {
 
    public static void main(String[] args) throws IOException {
 
        int n = 5;
        float[] a = new float[n];

        Scanner entrada = new Scanner(System.in);

        for(int i=0;i<n;i++){
            a[i] = entrada.nextFloat();

        }
        entrada.close();

        for(int i=0; i<n;i++){
            if(a[i] <= 10.0f){
                System.out.printf("A[%d] = %.1f\n",i,a[i]);
            }
        }
 
    }
 
}