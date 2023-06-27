public class Fibonatirec {

    public static int fibonacci(int n){
        if(n<=2){
            return 1;
        }
        return fibonacci(n-2)+ fibonacci(n-1);
    }







    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        //sem função
        int acm1=1;
        int acm2=0;
        int i;
        for(i=1;i<7;i++){
            acm2+=acm1;
            acm1+=acm2;
            System.out.println(acm2);
            System.out.println(acm1);
        }
    }
}
