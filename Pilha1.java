import java.util.Stack;


public class Pilha1{




    public static void main(String[] args) {
        Stack <Integer> pilha = new Stack<Integer>();
        int i, op1, op2, res; 
        String expressao = "1  2 +";
        
        String[] vetor = expressao.split(" ");
        
        for(i=0; i<vetor.length;i++){

            
            switch(vetor[i]){
                case "+":
                    if(pilha.empty()){
                        System.out.println("Expressão inválida"); System.exit(1);
                    }
                    op2 = pilha.pop();
                    if(pilha.empty()){
                        System.out.println("Expressão inválida"); System.exit(1);
                    }
                    op1 = pilha.pop();
                    pilha.push(op1 + op2);
                    break;
                case "-":
                    if(pilha.empty()){
                        System.out.println("Expressão inválida"); System.exit(1);
                    }
                    op2 = pilha.pop();
                    if(pilha.empty()){
                        System.out.println("Expressão inválida"); System.exit(1);
                    }
                    op1 = pilha.pop();
                    pilha.push(op1 - op2);
                    break;
                case "*":
                    if(pilha.empty()){
                        System.out.println("Expressão inválida"); System.exit(1);
                    }
                    op2 = pilha.pop();
                    if(pilha.empty()){
                        System.out.println("Expressão inválida"); System.exit(1);
                    }
                    op1 = pilha.pop();
                    pilha.push(op1 * op2);
                    break;
                default:
                pilha.push(Integer.parseInt(vetor[i]));
            }
        }
        if(pilha.empty()){System.out.println("expressão inválida"); System.exit(1);}
        res = pilha.pop();
        if (!pilha.empty()){System.out.println("Expressão inválida"); System.exit(1);}
        if(pilha.empty()){
            System.out.println(res);
        }else{
            System.out.println("Expreção inválida");
        }
       


    }
}