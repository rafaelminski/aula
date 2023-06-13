import java.util.Scanner;




public class Main {

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



    public static void main(String [] args) {
        //variaveis
        String nome, sobrenome;
       
        //entrada e saída
        cabecalho();
        System.out.println("Digite seu nome: ");
        nome = getString();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = getString();
        System.out.printf("Boa noite, %s %s\n", nome, sobrenome);
        cabecalho();
        
    }
}