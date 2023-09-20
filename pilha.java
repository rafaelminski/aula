import java.util.Stack;

public class pilha {

    public static void main(String[] args) {
         // Stack <Integer> pilha = new Stack<Integer>();
       // int x;
       
        String expressão = "[](}{})";
        Stack<Character> pilha = new Stack<Character>();
        
        int i;
        char c;
        boolean erro;

        for (i = 0; i < expressão.length(); i++) {
            c = expressão.charAt(i);
            switch (c) {
                case '[':
                    pilha.push(c);
                    break;
                case ']':
                    if (pilha.isEmpty()) {
                        erro = true;
                    } else {
                        if (pilha.pop() != '(') {
                            erro = true;
                        }
                    }
                    break;
                case '(':
                    pilha.push(c);
                    break;
                case ')':
                    if (pilha.isEmpty()) {
                        erro = true;
                    } else {
                        if (pilha.pop() != '(') {
                            erro = true;
                        }
                    }
                    break;    
                case '{':
                    pilha.push(c);
                    break;
                case '}':
                    if (pilha.isEmpty()) {
                        erro = true;
                    } else {
                        if (pilha.pop() != '(') {
                            erro = true;
                        }
                    }
                    break;    
                    
            }
            if(erro){
                break;
            }
        }
        if (erro || !pilha.isEmpty()) {
            System.out.println("expressão inválida");
        } else {
            System.out.println("expressão válida");
        }

        // pilha é uma estrutura que opera de forma filo = first in lost out = primeiro
        // a entrar último a sair.
        /*
         * pilha.push(10);
         * pilha.push(20);
         * pilha.push(30);
         * pilha.push(40);
         * pilha.push(50);
         */

        // emquanto a pilha não estiver vazia, vai retirar um elemento da lista e
        // mostrar na tela, comandos pop = retira; push = adiciona ; isEmpty = verifica
        // se está vazia.
        /*
         * while(! pilha.isEmpty()){
         * x = pilha.pop();
         * System.out.println(x);
         * }
         */

        /*
         * x = pilha.pop();
         * System.out.println(x);
         * x = pilha.pop();
         * System.out.println(x);
         * x = pilha.pop();
         * System.out.println(x);
         * x = pilha.pop();
         * System.out.println(x);
         * x = pilha.pop();
         * System.out.println(x);
         */

    }
}
