public class booblesort {

    public static void troca(int [] vetor, int pos_a, int pos_b){
        int aux = vetor[pos_b];
        vetor[pos_b] = vetor[pos_a];
        vetor[pos_a] = aux;
    }

    public static int [] merge ( int [] val_a, int [] val_b ) { 

        int [] res = new int [val_a.length+val_b.length];
        if(val_a.length==0) return val_b;
        if(val_b.length==0) return val_a;
        int i=0, j=0, k=0, tam;
        tam = val_a.length + val_b.length;
        while (k<tam) {
            
        
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
            k++;
        }
        return res;
        }
        

        public static int [] mergeSort(int [] v){
            int [] vr, ve, vd;
            int meio;

            if(v.length<2){
                return v;
            }

            meio = v.length / 2;
            ve = vetor_sub(v, 0, meio);
            vd = vetor_sub(v, meio, v.length);

            vr = merge(mergeSort(ve), mergeSort(vd));




            return vr;
        }

    public static int getValPos(int val,int pos){
        return (int) (val% (int)Math.pow(10, pos+1)/(int)Math.pow(10, pos));
    }

public static int[] countingSortPos (int[] v, int pos){
    int[] saida = new int[v.length];
    int[] count = new int[10];
    int i, val_pos,val;
    for(i=0; i<v.length;i++){
        val = v[i];
        val_pos = getValPos(val, pos);
        count[val_pos]++;
    }
    for(i=1;i<count.length;i++){
        count[i]+=count[i-1];
    }

    for(i=v.length-1;i>0;i--){
        val = v[i];
        val_pos = getValPos(val, pos);
        count[val_pos]--;
        saida[count[val_pos]] = val;
    }
    
    return saida;
}


    public static int [] vetor_sub (int [] v, int ini, int fim){
        int [] vr = new int[fim -ini];
        int i, k=0;
        for(i=ini;i<fim;i++){
            vr [k]= v[i];
            k++;
        } 
        
        
        
        return vr;
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

        int i;
        int [] v1 = {42,13,27,9,2,55,22,94,1,200,0,300};
        int [] vr = mergeSort(v1);

        for(i=0;i<vr.length;i++){
            System.out.printf(  "%d ", vr[i] );
        }
        System.out.println();




        /*int [] v1 = {5,7,9,11};
        int [] v2 = {6,10,12,15};

        int [] res = merge(v1, v2);
        for(int i =0; i<res.length;i++){
            System.out.printf(" %d ", res[i]);
        }
        System.out.println();*/

    }



        /*int [] valores = {94,27,32,46,8,0};
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
    */
        }