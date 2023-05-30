import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtd, matricula, maior_matricula;
        float nota, maior_nota;
        qtd = entrada.nextInt();
        maior_nota = -1;
        
        while(qtd>0){
            matricula = entrada.nextInt();
            nota = entrada.nextFloat();
            if(nota>maior_nota){
                maior_nota=nota;
                maior_matricula= matricula;
            }
            qtd--;
        }
        //incompleto
    }
}
