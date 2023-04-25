import java.util.Scanner;


public class Estado {
     public static void main(String[] args) {
        //variáveis
        Scanner entrada;
        String estado;
        //entradas
        entrada = new Scanner(System.in);
        System.out.println("Digite a sigla do estado:");
        estado = entrada.next();
        
        
        entrada.close();
        //processamento e saída
        switch (estado) {
            case "pr":
            case "PR":
                System.out.println("Sigla:PR, código: 41, Estado: PARANÁ, região sul");
                break;
            case "sc":    
            case "SC":
                System.out.println("Sigla:SC, código: 42, Estado: SANTA CATARINA, região sul");
                break;
            case "rs":    
            case "RS":
                System.out.println("Sigla:RS, código: 43, Estado: RIO GRANDE DO SUL, região sul");
                break;
            case "mg":
            case "MG":
                System.out.println("Sigla:MG, código: 31, Estado: MINAS GERAIS, região sudeste");
                break;
            case "es":
            case "ES":
                System.out.println("Sigla:ES, código: 32, Estado: ESPÍRITO SANTO, região sudeste");
                break;
            case "rj":
            case "RJ":
                System.out.println("Sigla:RJ, código: 33, Estado: RIO DE JANEIRO, região sudeste");
                break;
            case "sp":
            case "SP":
                System.out.println("Sigla:SP, código: 35, Estado: SÃO PAULO, região sudeste");
                break;
                case "ms":
                case "MS":
                    System.out.println("Sigla:MS, código: 50, Estado: MATO GROSSO DO SUL, região centro-oeste");
                    break;
                case "mt":
                case "MT":
                    System.out.println("Sigla:MT, código: 51, Estado: MATO GROSSO, região centro-oeste");
                    break;
                case "go":
                case "GO":
                    System.out.println("Sigla:GO, código: 52, Estado: GOIÁS, região centro-oeste");
                    break; 
                case "df":
                case "DF":
                    System.out.println("Sigla:DF, código: 53, Estado: DISTRITO FEDERAL,região centro-oeste");
                    break;                           
            default:
                System.out.println("Estado não cadastrado");
        }

        
        



    }
    
}