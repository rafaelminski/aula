public class Exvetores {


    public static int BuscaBinaria (int [] valores, int x){
        int ini = 0, fim = valores.length -1, meio;
        while(ini <=fim){
            meio = ini +(fim - ini)/2;
            if(valores[meio] == x) return meio;
            if(x > valores[meio]) ini = meio +1;
            else{
                fim = meio -1;
            }
        }
        return -1;

    }




    public static void main(String[] args) {
        int [] valores = {10,20,30,40,50,60,70,80,90,100};
        int x = 10;
        System.out.println(BuscaBinaria(valores, x));
    }
}
