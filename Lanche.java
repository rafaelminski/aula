import java.util.Scanner;
public class Lanche {
    public static void main(String[] args) {
        Scanner entrada;
        double n1, n2;
        entrada = new Scanner(System.in);
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        entrada.close();
        if (n1>0.0 && n2>0.0){
            System.out.println("Q1");}
        else if (n1<0.0 && n2<0.0){
            System.out.printf("Q3");
        }
        else if (n1<0.0 && n2>0.0){
            System.out.println("Q2");
        }
        else if (n1>0.0 && n2<0.0){
            System.out.println("Q2");
        }
        else if (n1==0.0 && n2==0.0){
        System.out.println("Origem");
        }
        else if (n1==0.0){
        System.out.println("Eixo X");
        }
        else{
            System.out.println("Eixo Y");
        }
}
}
