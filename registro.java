
import java.util.Scanner;
 


class Produto{
    String descricao;
    int lote;
    float peso;
}
class Cartao{
    String nome;
    String num_card;
    int ag;

}
class Pessoa{
    String nome, data_nasc, email;

}






public class registro{
    static Scanner sc ;
public static void registroCartaoPreenche(Cartao card_1){
    sc =new Scanner(System.in);
    card_1 =new Cartao();
      System.out.println("digite o nome do cartão:");
        card_1.nome = sc.nextLine();
    System.out.println("digite o número do cartão:");
        card_1.num_card = sc.nextLine();
    System.out.println("digite a agencia:");
        card_1.ag = sc.nextInt();
}
public static void registroCartaoPrint(Cartao card_1){
    System.out.println("nome:"+card_1.nome);
    System.out.println("número:"+card_1.num_card);
    System.out.println("agência:"+card_1.ag);
}


    public static void main(String[]args){
        //variáveis
       Pessoa humano_1 = new Pessoa();
        System.out.println("nome:");
        humano_1.nome = sc.nextLine();
        System.out.println("Data de nascimento");
        humano_1.data_nasc = sc.nextLine();
        System.out.println("E-mail:");
        humano_1.email = sc.nextLine();

        System.out.println("nome:"+humano_1.nome);
        System.out.println("data nascimento:"+humano_1.data_nasc);
        System.out.println("email:"+humano_1.email);

        
        

        //entradas
  

    //saída

   // System.out.printf("seu cartão é :nome %s número %s agência %d\n",card_1.nome, card_1.num_card, card_1.ag); ou
    




        //variáveis
       /* Produto prod_1, prod_2;
        prod_1 = new Produto();
        prod_2 = new Produto();


        prod_1.descricao = "arroz";
        prod_1.lote = 100;
        prod_1.peso = 5;

        prod_2.descricao = "feijão";
        prod_2.lote = 38;
        prod_2.peso = 1;

        System.out.printf("produto: %d %s %.2f\n", prod_1.lote, prod_1.descricao, prod_1.peso);*/




    }
}