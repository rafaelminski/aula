import java.util.Scanner;

 public class Metodos {
    static  Scanner sc = new Scanner(System.in);

    //módulos
    public static void cabecalho() {
    System.out.println("==========");
    }
    public static String getString() {
        String st;
        st = sc.next();
        return st;
    }
    public static int getInt(){
        int valor;
        valor = sc.nextInt();
        return valor;
    }

    public static boolean ehPar(int x){
        boolean par;
        if(x%2 == 0){
            par = true;
        }else{
            par = false;
        }
        return par;
    }
    //public static void procEhpar (int x){
       // if(x%2==0){
          //  System.out.println("é par");
          //  }else{
           //     System.out.println("é impar");
           // }
       // }
    

    public static void main(String [] args) {
        //variaveis
        int n;
        boolean par;
        //entrada e saída
        cabecalho();
        System.out.println("Digite um valor inteiro: ");
        n = getInt();
        
        par = ehPar(n);

        if(par){
            System.out.printf("%d é par\n",n);
        }else{
            System.out.printf("%d é impar\n",n);
        }
        cabecalho();
        
    }
}
