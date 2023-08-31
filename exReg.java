import java.util.Scanner;

class Curso {
    String matricula, nome;
    float n_1, n_2, n_3;

}

public class exReg {

    public static Scanner sc = new Scanner(System.in);

    public static Curso preencheCurso() {

        Curso c = new Curso();
        System.out.println("Digite a matrícula do aluno:");
        c.matricula = sc.next();
        System.out.println("Digite  o nome do aluno:");
        c.nome = sc.next();
        System.out.println("Digite a nota da primeira prova:");
        c.n_1 = sc.nextFloat();
        System.out.println("Digite a nota da segunda prova:");
        c.n_2 = sc.nextFloat();
        System.out.println("Digite a nota da terceira prova:");
        c.n_3 = sc.nextFloat();
        return c;
    }

    public static void CursoPrint(Curso curso) {
        float media = (curso.n_1 + curso.n_2 + curso.n_3)/3;
        
        System.out.println("matricula                 :" + curso.matricula);
        System.out.println("nome:     " + curso.nome);
        System.out.println("nota da primeira prova:     " + curso.n_1);
        System.out.println("nota da segunda prova     :" + curso.n_2);
        System.out.println("nota da terceira prova     " + curso.n_3);
        
        System.out.println("MÉDIA:" + media);
        
    }

    public static void main(String[] args) {

        int numeroAlunos = 2;
       
        Curso[] curso = new Curso[numeroAlunos];
        for (int i = 0; i < curso.length; i++) {
            System.out.println("## aluno numero " + i);
            curso[i] = preencheCurso();
            
        }
        for (int i = 0; i < curso.length; i++) {
            
            System.out.println("## aluno numero" + i);
            CursoPrint(curso[i]);
            
        }

    }
}
