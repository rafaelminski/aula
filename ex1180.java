import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ex1180 {
 
    public static void main(String[] args) throws IOException {
 
        
       

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
         int[] vx = new int[n];
        for(int i=0;i<n;i++){
            vx[i] = entrada.nextInt();

        }
        entrada.close();

        int menor_valor=vx[0];
        int posicao=0;
        for(int i=0; i<n;i++){
            
            if( vx[i] < menor_valor ){
                menor_valor = vx[i];
                posicao = i;
            }
        }
        System.out.printf("Menor valor: %d\n",menor_valor);
        System.out.printf("Posicao: %d",posicao);
    }
 
}