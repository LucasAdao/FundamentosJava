import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Principios Aritiméticos
        int a = 3;
        int b = 5;
        int c = (a + b) * 5;
        System.out.println(
                "O sistema matemático em Java respeita o sistema universal da matemática, logo o resultado será A+B e depois mutiplicará por 5, A vale 3 e B vale 5, logo da 8, 8x5=40, logo C="
                        + c);
        System.out.println("-----------------------------------------------------------------------------");

        //Operador Booleano, Invocando a classe Scanner, Estrutura condicional e Estrutura de Repetição
        boolean passa = false;
        Scanner sc = new Scanner(System.in);
        while (passa == false) {
            System.out.println("Digite um número maior que 10!");
            int numero = sc.nextInt();
            if (numero > 10) {
                passa = true;
                System.out.println("Parabéns, você passou!");
            } else {
                System.err.println("Enquanto você não digitar um número maior que 10, permanecerá aqui!");
            }
        }
        System.out.println(
                "Se você chegou até aqui significa que você inseriu um número maior que 10! E você conseguiu sair da minha estrutura while, que recebe um valor booleano true, quando você insere um valor maior que 10, dando assim fim ao loop!");
        System.out.println("-----------------------------------------------------------------------------");
        //Arrays
        String[] diasDaSemana = { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };
        System.out.println(
                "Arrays e Listas no Java são estruturas de armazenamento em memória, existem diferenças entre arrays e listas, mas a primordial é que os arrays tem tamanho definido e inalteravél, ele é bom para armazenar valores constantes, como os dias da semana!");
        
        System.out.println(
                "Uma coisa que os arrays tem em comum das listas, são os indices das posições! Eles começam sempre na posição 0");
        System.out.println(diasDaSemana[0]);
        System.out.println("-----------------------------------------------------------------------------");
        //Tratamentos de Exceções
        //Bibliotecas(usar random como exemplo)
        //Date
    }
    }