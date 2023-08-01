import java.util.Scanner;

class vetores{

    public static void comVetor() {
        Scanner sc = new Scanner (System.in);
        int [] numeros = {0,0,0,0,0};
        int n = 5;
        int soma;
        float media;
        System.out.println("entre com 5 valores");
        for(int i=0;i<n;i++){
            numeros[i]=sc.nextInt();
        }
        sc.close();

        soma = 0;
        
        for(int i = 0; i < n; i++){
            soma+= numeros[i];
            media = soma/n;
            if(numeros[i]> media){
                int qtd=0;
                qtd++;
            }
        }

        
        
        System.out.println(media);
    }




     public static void main(String[] args) {

        
        comVetor();


        
    
        
    }
}