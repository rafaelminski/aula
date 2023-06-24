

public class Decrescente {
    public static void contagemDecrescente(int x){
        while(x>=0){
            System.out.println(x);
            x--;
        }
    }
    public static void contagemDecrescenteRec(int x){
        System.out.println(x);
        if(x>0){
            x--;
            contagemDecrescente(x);
        }
    }
    public static int somaValores(int x){
        int soma=0;
        while(x>0){
            soma+=x;
            x--;
        }
        return soma;
        
    }
    public static int fatorial(int x){
        int fat=1;
        while(x>0){
            fat*=x;
            x--;
        }
        return fat;
        
    }
    public static int somaValoresRec(int x){
        
        if(x>0){
           return(x+somaValoresRec(x-1));
            
        }
        return 0;
    }
    public static int fatorialRec(int x){
        
        if(x>0){
           return(x*fatorialRec(x-1));
            
        }
        return 1;
    }






   public static void main(String[] args) {
        int y=5;
         //contagemDecrescente(y);  
         //contagemDecrescenteRec(y);  
         //System.out.println(somaValores(y));
         //System.out.println(somaValoresRec(y));
         //System.out.println(fatorialRec(y));
         System.out.println(fatorial(y));
    }
}