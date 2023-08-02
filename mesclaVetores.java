import java.util.Scanner;

public class mesclaVetores {

    public static void mesclaVetores () {
        //variaveis
        int[] va = {0,0,0,0,0,0,0,0,0,0};
        int[] vb = {0,0,0,0,0,0,0,0,0,0};
        int[] vc = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int tam_va = 10 , tam_vb = 10, tam_vc = 20, i , x;
        Scanner sc = new Scanner(System.in);

        //entrada
        System.out.println("Entre com 10 valores do vetor A");
        for(i = 0;i<tam_va;i++){
            va[i] = sc.nextInt();
        }
        System.out.println("Entre com 10 valores do vetor B");
        for(i = 0;i<tam_vb;i++){
            vb[i] = sc.nextInt();
        }
        sc.close();
         int cont_vc = 0;
        //processamento
        for(i=0;i<10;i++){
            vc[cont_vc] = va[i];
            cont_vc++;
            vc[cont_vc] = vb[i];
            cont_vc++;
        }
        //também pode ser feito assim :
        // for(i=0;i<10;i++){
        //     vc[2*i] = va[i];
        //     vc[2*i+1] = vb[i];
        // }
        //saída

        System.out.println("o vetor c é :");
        for(i=0;i<tam_vc;i++){
            System.out.printf("%d " , vc[i]);
        }
        
    }

    public static void exercicio5(){
        //variaveis
        int[] va = {0,0,0,0,0,0,0,0,0,0};
        int[] vb = {0,0,0,0,0,0,0,0,0,0};
        int tam_va = 10, tam_vb = 10;
        
        
        Scanner sc = new Scanner(System.in);

         //entrada
         System.out.println("Entre com 10 valores do vetor A");
         for(int i = 0;i<tam_va;i++){
             va[i] = sc.nextInt();
         }
         sc.close();
         //processamento
          int cont = 0;
         for(int i = 0; i<tam_vb;i++){
            if(va[i]%2 == 0){
                vb[cont] = va[i];
                cont ++;
                
            }
         }
         for(int i = 0; i<tam_vb;i++){
            if(va[i]%2 == 1){
                vb[cont] = va[i];
                cont ++;
            }
         }
         //saída
         System.out.println("o vetor B é :");
         for(int i=0;i<vb.length;i++){
             System.out.printf("%d " , vb[i]);
         }
         System.out.println();

    }
    



     public static void main(String[] args) {
        //mesclaVetores();
        exercicio5();
    }
}
