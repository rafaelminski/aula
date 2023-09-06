import java.io.PrintWriter;



public class arquivo {
    public static void main(String[] args) {

         int i;

        try{
        PrintWriter saida_pares = new PrintWriter("pares.txt");
        PrintWriter saida_impares = new PrintWriter("impares.txt");
        for(i = 0;i<=10;i++){
            if(i%2 ==0){
                
             saida_pares.println(i);
             
            }else{

                saida_impares.println(i);
                
            }
        }
       
         saida_pares.close();
         saida_impares.close();
       
        
        }catch(Exception e){
            System.out.println("Erro no arquivo.");
        }
        
    }
}

