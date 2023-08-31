
import java.util.Scanner;
 


class Produto{
    String descricao;
    int lote;
    float peso;
}

class Cartao {
    String nome;
    String numero;
    String bandeira;
    int cvv;
    int vencimento_mes;
    int vencimento_ano;
}

public class registro {
    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroClients = 1;

        Cartao[] cartoes = new Cartao[numeroClients];
        for (int i = 0; i < cartoes.length; i++) {
            System.out.println("## cliente numero " + i);
            cartoes[i] = registroPreencherCartao();
        }

        for (int i = 0; i < cartoes.length; i++) {
            System.out.println("## cliente numero" + i);
            registroCartaoPrint(cartoes[i]);
        }

    }

    public static void registroCartaoPrint(Cartao cartao) {
        System.out.println("nome                 :" + cartao.nome);
        System.out.println("numero:     " + cartao.numero);
        System.out.println("bandeira:     " + cartao.bandeira);
        System.out.println("cvv     :" + cartao.cvv);
        System.out.println("mes/ano     " + cartao.vencimento_mes + "/" + cartao.vencimento_ano);

    }

    public static Cartao registroPreencherCartao() {
        Cartao c = new Cartao();

        System.out.println("dados do cartao");
        System.out.print("nome: ");
        c.nome = teclado.nextLine();
        System.out.print("numero: ");
        c.numero = teclado.nextLine();
        System.out.print("bandeira: ");
        c.bandeira = teclado.nextLine();
        System.out.println("cvv: ");
        c.cvv = teclado.nextInt();
        System.out.println("mes e ano de vencimento(separados por espço)");
        c.vencimento_mes = teclado.nextInt();
        c.vencimento_ano = teclado.nextInt();

        return c;
    }
}


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