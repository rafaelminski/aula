import java.util.HashSet;
import java.util.LinkedList;

public class conjunto {
    public static int [] elementos_unicos_int(int [] valores){
       int [] unicos ;
       int i;
        HashSet<Integer> conjunto = new HashSet<Integer>();
        for(i=0;i<valores.length;i++){
            conjunto.add(valores[i]);
        }
       
        unicos = new int[conjunto.size()];
        i=0;
        for(Integer u : conjunto){
            unicos[i] = u;
            i++;
        }
      
      return unicos;
    }




    public static void main(String [] args){
        LinkedList<String> roteiro = new LinkedList<String>();
        HashSet<String> cidades = new HashSet<String>();

        roteiro.add("cascavel");
        roteiro.add("toledo");
        roteiro.add("gramado");
        roteiro.add("jaraguá do sul");
        roteiro.add("joinville");
        roteiro.add("campo grande");
        roteiro.add("joinville");
        roteiro.add("cascavel");
        roteiro.add("joinville");
        roteiro.add("guarulhos");

        for (String i : roteiro){
            cidades.add(i);
        }

        System.out.printf("Foram encontradas %d cidades distintas.\n", cidades.size());

       int i;
       int [] valores = {10,9,9,7,9,10,7,8};
       int [] unicos = elementos_unicos_int(valores);

       System.out.println("Valores : \n[ ");
       for (i=0;i<valores.length;i++){
        System.out.printf("%d ", valores[i]);
       }
       System.out.println("]");
       System.out.println("Elementos unicos: \n[ ");
       for(i=0;i<unicos.length;i++){
        System.out.printf("%d ", unicos[i]);
       }
       System.out.println("]");









    }
}
