public class booblesort {

    public static void troca(int [] vetor, int pos_a, int pos_b){
        int aux = vetor[pos_b];
        vetor[pos_b] = vetor[pos_a];
        vetor[pos_a] = aux;
    }

    public static int [] merge (int [] val_a, int val_b){
        int [] res = new int [val_a.length+val_b.length];
        if(val_a.length==0) return val_b;
        if(val_b.length==0) return val_a;
        int i=0, j=0, k=0;
        for(k=0;k<res.length;k++){
            if(i<val_a.length&&j<val_b.length){
                if(val_a[i]<val_b[j]){
                    res[k]=val_a[i];
                    i++;
                }else{
                    res[k]= val_b[j];
                    j++;
                }
            }else{
                if(i>=val_a.length){
                    res[k]=val_b[j];
                    j++;
                }
                else{
                    res[k]=val_a[i];
                    i++;
                
                }
            }
        }
        }
    




    public static void selection_sort(int[] valores){
        int i,j,menor_val=0, menor_pos=0;
        for (i = 0;i<valores.length;i++){
            for(j=i;j<valores.length;j++){
                if(valores[j]<menor_val){
                    menor_val= valores[j];
                    menor_pos = j;
                
                }
            }
            troca(valores,i,menor_pos);
        }
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