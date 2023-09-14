import java.util.LinkedList;
import java.util.Scanner;

public class lista {

  




    public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
        LinkedList<Integer> valores;

        valores = new LinkedList<Integer>();

       *valores.add(10);
        valores.add(20);
        valores.add(30);
        valores.add(40);
        valores.add(50);
        valores.add(60);



        //.get obtêm o valor do indice na lista, já o .set acrescenta ou substitui  o valor desejado no indice desejado da lista
        /*valores.set((1)+5);
        valores.set(1, 25);*/

        //mostra o valor da lista na posicao 0
       /*  System.out.println(valores.get(0));
        for(int i=0;i<valores.size();i++){
            System.out.println(valores.get(i));
        }*/

        //mostra a quantidade de valores dentro da lista
        /*System.out.println(valores.size());*/

        /*System.out.println("Digite n valores para obter média, digite 0 para parar");
        float n = -1;
        float media,soma=0;
        while(n !=0.0){
            n = sc.nextFloat();
            
            if(n!=0){
                valores.add(n);
            }
        }
        for(int i =0;i<valores.size();i++){
            soma+=valores.get(i);
        }

        media = soma/valores.size();
        System.out.println("média" + media);*/

        int i=0, k=100, passo= 10;

        while(i<k){
            valores.add(i);
            i+=passo;

        }
        //.remove remove o valor que está no indice indicado da lista
        valores.remove(3);
        
        //teste sem remover e depois com remove
        for(i=0;i<valores.size();i++){
            System.out.println(valores.get(i));
            
        }
          
      

    }
}
