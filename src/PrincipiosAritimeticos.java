import java.util.Scanner;

public class PrincipiosAritimeticos {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("O sistema matemático no Java respeita o sistema matemático universal!");
        Thread.sleep(2000);
        System.out.println(
                "Nas equações divisão e multiplicação tem precedência, porém se a operação estiver entre parênteses ela é executada primeiro! Veja abaixo:");
        Thread.sleep(2000);
        int a = 2;
        int b = 3;
        int equacao = (a + b) * 5;
        System.out.println(
                "O resultado dessa soma é 25, repare que não temos b x 5 e sim resultado de a + b = 5 x 5! Veja abaixo o resultado da equação!");
        Thread.sleep(2000);
        System.out.println(equacao);
        System.out.println("-------------------------------------------------");

        System.out.println(
            "Também temos que ter cuidado já que o sinal de adição (+) também é usado para concatenar textos e variáveis!");
            
        System.out.println("-------------------------------------------------");
        System.out.println(
                "Também temos bibliotecas que nos auxiliam a fazer problemas matemáticos mais complexos que é a Math, ela ajuda desde a resolver raizes quadradas como multiplicar potências!");
        Thread.sleep(2000);
        System.out.println("Digite um número e ele irá ser elevado a potência de 5!");
        int numero = sc.nextInt();        
        System.out.println("O seu número escolhido foi: " + numero + ". E o resultado de "+ " elevado a 5 é:" +  Math.pow(numero, 5));
    }
}
