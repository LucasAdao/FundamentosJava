public class Arrays {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Arrays são coleções predefinidas de valores, é muito comum na maioria das linguagens de programação! No meu ponto de vista são essências para armazenar valores inalteráveis, como dias da semana ou valores constantes!");
        Thread.sleep(2000);
        System.out.println("Alguns podem confundi-los com listas, porém as listas são dinâmicas, a única coisa que tem em comum são os indices, que começam na posição 0!");
        String diasDasemana[] = { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };
        Thread.sleep(2000);
        System.out.println("No exemplo acima foi criado um array com os dias da semana, iniciado pelo domingo! Como foi citado acima, as posições nos arrays começam no 0, logo se eu quiser acessar meu primeiro dia da semana, eu terei que usar a posição 0!");
        Thread.sleep(2000);
        System.out.println("Array na posição 0: " + diasDasemana[0]);
    }
}
