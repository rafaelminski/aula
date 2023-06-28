public class Caracteres {

    public static boolean stringsIguais(String str1, String str2){
        int i;
        if(str1.length() != str2.length()){
            return false;
        }
        for(i=0;i<str1.length();i++){
            if(str1.charAt(i)!= str2.charAt(i)){
            return false;
                }
            }

        
        return true;
    }

    public static void stringLinhas(String str, int n){
        int i;
        i = str.length();
        if((i+1)%n == 0){

        }

    }


    public static String stringInverter(String str){
        
        
        return str;
    }




    public static void main(String[] args) {
        /*String palavra1 = "abacate";
        String palavra2 = "manga";
        System.out.println(stringsIguais(palavra1, palavra2));*/
        
        String palavra = "abacate";
        int n = 2;
        stringLinhas(palavra, n);      
        
        
        
        /*
         * char recebe apenas um caractere= comando char;
         * string recebe varios caracteres= comando string
         */
        /*char c;
        char d;
        String st,st1,st2;
        c= 'x';
        st = "olá";
        d = '$';
        st1 = "algoritmos";
        st2 = "estruturas de dados";


        System.out.println(st1);
        System.out.println(st1.equals(st2));
        System.out.println(st1.length());
        System.out.println(st1.toUpperCase());
        System.out.println(st1.concat(st2));
        System.out.println(st1.concat(" e ") .concat(st2));
        System.out.println(st1 + " e " + st2);




        System.out.println(c);
        System.out.println(st);
        System.out.println(d);*/



    }
    
}
