public class Strin {

    public static String inverteString(String st){
        String result = "";
        int i;

        for (i=st.length()-1;i>=0;i--){
            result += st.charAt(i);

        }
        return result;
    }
    public static int char2dec(char c){
        int dec;
        switch(c){
            case 'A':
            case 'a':
                return 10;
            case 'B':
            case 'b':
                return 11;
            case 'C':
            case 'c':
                return 10; 
            case 'D':
            case 'd':
                return 10; 
            case 'E':
            case 'e':
                return 10;
            case 'F':
            case 'f':
                return 10;
            default:
                return Integer.parseInt("" + c);


        }

       

    }
    

    public static int potencia(int bas, int exp){
        if(exp == 0){
            return 1;
        }else{
            return bas * potencia(bas, exp-1);
        }
    }






    public static int bin2dec(String bin, int base){
        int dec = 0;
        String bin_invert = inverteString(bin);
        int i; 
        for(i=0;i<bin_invert.length();i++){
            dec+= Integer.parseInt("" +bin_invert.charAt(i))* (int) Math.pow(base, i);
            
        }
        return dec;

    }


    public static void main(String[] args) {
        
    // System.out.println(bin2dec("11",16));
    System.out.println(potencia(2, 8));
        
    }
}