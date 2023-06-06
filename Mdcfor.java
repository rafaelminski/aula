import java.util.Scanner;

public class Mdcfor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y, i, menor, mdc;
        System.out.println("digite dois valores");
        x = entrada.nextInt();
        y = entrada.nextInt();
        menor = y;
        mdc= 0;
        if(x<y){
            menor = x;
        }
        for(i=1;i<=10;i++){
            if(x%i==0 && y%i==0){
                mdc=i;
               }   
            i ++;
    
        }
        
        System.out.printf("mdc:%d \n",mdc);
    }
}
