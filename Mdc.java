import java.util.Scanner;

public class Mdc{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y, i, mdc;
        System.out.println("digite dois valores");
        x = entrada.nextInt();
        y = entrada.nextInt();
        i= 1;
        mdc=0;
        while(i<=x && i<=y){
            if(x%i==0 && y%i==0){
                mdc=i;
               }   
            i ++;
    
        }
        
        System.out.printf("mdc:%d \n",mdc);
    }
}
