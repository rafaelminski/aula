import java.util.HashMap;




public class Palavras{

   

    public static void main(String[] args){

        String texto = "outro rato roeu a roupa de outro rato outro rato rato";
        String [] palavras = texto.split(" ");
        HashMap <String, Integer> base = new HashMap<String, Integer>();
        for(int i = 0; i<palavras.length;i++){
            if(base.containsKey(palavras[i])){
                base.put(palavras[i],base.get(palavras[i]) +1);
            }else{
                base.put(palavras[i],1);
            }
        }

        for (String pal : base.keySet()) {
            System.out.println(pal + " " + base.get(pal));
        }


       
      /*  base.put("Cascavel", 45);
        base.put("Sao Paulo",11);
        base.put("Alto Piquiri",44);
        base.put("Assis Chateaubriand",44);

        System.out.printf("está vazio? %b \n", base.isEmpty());
        System.out.printf("contém Cascavel? %b \n", base.containsKey("Cascavel"));
        System.out.printf("contém rio de janeiro? %b \n", base.containsKey("rio de janeiro"));*/
    }
}