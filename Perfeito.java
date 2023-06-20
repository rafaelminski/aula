import java.util.Scanner;

public class Perfeito {
    static  Scanner sc = new Scanner(System.in);
    
    public static boolean ehperfeito(){
        int x, i , acm;
        x = sc.nextInt();
        acm = 0;
        for(i=1;i<x;i++){
            if(x%i == 0){
                acm=acm +i;
                System.out.println();
            }
        }
        if(acm==x){
            System.out.printf( " %d É perfeito",x);
        }else{
            System.out.printf("%d Não é perfeito",x);
        }
        return ehperfeito();
    }




    public static void main(String[] args){
    
        
        System.out.println("Entre com um valor");
         ehperfeito();
        
        
       
}
}
