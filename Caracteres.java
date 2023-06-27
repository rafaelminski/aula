public class Caracteres {
    public static void main(String[] args) {
        /*
         * char recebe apenas um caractere= comando char;
         * string recebe varios caracteres= comando string
         */
        char c;
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
        System.out.println(d);



    }
    
}
