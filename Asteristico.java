public class Asteristico {
    
    public static void linhaCaractere(int x){
        int i;
        for(i=0;i<x;i++){
            System.out.printf("*");
        }
        System.out.println();
    }

    public static void triangulo(int n){
        int i;
        for(i=n;i>0;i--){
            linhaCaractere(n);
        }
    }

    public static void triangulorec(int n){
        
        if(n>0){
            
            
            linhaCaractere(n);
            triangulorec(n-1);
        }
    }


     public static void main(String[] args) {
        triangulorec(10);
        //triangulo(10);
    }
}
