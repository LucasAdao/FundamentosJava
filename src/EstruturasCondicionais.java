import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("As estruturas condicionais são partes fundamentais de toda linguagem back end, elas podem ser auxiliadas de valores booleanos para ter suas funções mais assertivas. Veja o Exemplo abaixo:");
        Thread.sleep(2000);
        boolean isMan;
        System.out.println("Agora digite apenas números, você é homem? 1-Sim 2-Não");
        int number = sc.nextInt();
        if (number == 1) {
            isMan = true;
        } else {
            isMan = false;
        }
        Thread.sleep(2000);
        if (isMan) {
            System.out.println("Isso quer dizer que você deve ir ao banheiro masculino!");
        } else {
            System.out.println("O toalete Feminino fica à direita!");
        }
        Thread.sleep(2000);
        System.out.println("Falaremos sobre tratamento de exceções e estruturas de repetição em outra classe, sabemos que se você tentou digitar um valor diferente de 1 ou 2 quando foi solicitado, provavelmente o programa quebrou! kkkkkkk Tente novamente inserindo 1-para homem ou 2-para mulher, mas caso deu tudo certo espero que tenha curtido!");
    }
}
