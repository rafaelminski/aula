
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class exarquivo {
    public static void main(String[] args) {

       

      char [] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','w','x','y','z'};
        int i;
       try{
       PrintWriter saida_texto = new PrintWriter("texto.txt");
       for(i=0;i<=24;i++){
      saida_texto.printf("%s\n",alfabeto[i]);
       
       }

        saida_texto.close();

       }catch(Exception e){
           System.out.println("Erro no arquivo.");
       }
       Scanner ler = new Scanner(System.in);

    System.out.printf("Informe o nome de arquivo texto:\n");
    String nome = ler.nextLine();

    System.out.printf("\nConteúdo do arquivo texto:\n");
       try {
      FileReader arq = new FileReader(nome);
      BufferedReader lerArq = new BufferedReader(arq);

      String linha = lerArq.readLine(); // lê a primeira linha
// a variável "linha" recebe o valor "null" quando o processo
// de repetição atingir o final do arquivo texto
      while (linha != null) {
        System.out.printf("%s\n", linha);

        linha = lerArq.readLine(); // lê da segunda até a última linha
      }

      arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }

    System.out.println();

       
   }
}
