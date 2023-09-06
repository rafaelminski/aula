import java.io.PrintWriter;

public class arquivos {





     public static void main(String[] args) {

        String mensagem = "busquem conhecimento";
         int resposta = 42;

        try{
        PrintWriter saida = new PrintWriter("saida.txt");
        saida.println(mensagem);
        saida.printf("A resposta para ..... é %d",resposta);
        saida.close();
        }catch(Exception e){
            System.out.println("Erro no arquivo.");
        }
        
    }
    
}
