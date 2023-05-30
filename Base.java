import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int b, p,result,res;
        System.out.println("digite dois valores");
        b= entrada.nextInt();
        p = entrada.nextInt();
       
        while(p>1){
            b= b*b;
            p--;
        }
        result= b;
        System.out.println(result);
    }
}
