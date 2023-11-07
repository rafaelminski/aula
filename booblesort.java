public class booblesort {

    public static void troca(int [] vetor, int pos_a, int pos_b){
        int aux = vetor[pos_b];
        vetor[pos_b] = vetor[pos_a];
        vetor[pos_a] = aux;
    }

    public static void insetion_sort (int [] valores){
        int i, j;
        if(valores.length > 1){
            for(i=1;i<valores.length;i++){
                j= i;
                while (valores[j]<valores[j-1] && j >0) {
                    troca(valores, j, j-1);
                    
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] valores = {94,27,32,46,8,0};
        int i, j ;
        for(i=0;i<valores.length-1;i++){
            for(j=0;j<valores.length-1-i;j++){
                if(valores[j]>valores[j+1]){
                    troca(valores, j, j+1);
                }
                
            }
           
        }
        for(int o =0;o<valores.length;o++){
           System.out.println(valores[o]);}
    }
}