import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> pessoas = new ArrayList<>();
        pessoas.add("JESUS");
        pessoas.add("Marley");
        pessoas.add("Vera");
        pessoas.add("Patrícia");
        pessoas.add("Claudio");

        System.out.println("Tamanho da lista de pessoas: " + pessoas.size());
        System.out.println("Primeira pessoa da lista: " + pessoas.get(0));

        System.out.println("=".repeat(50));
        System.out.println("LISTA DE PESSOAS");
        for (String x : pessoas) {
            System.out.println(x);
        }
    }
}
