import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro("gol", 1800, 1500, 1600);
        carro.media();
        carro.definirModelo("sedan");
        carro.exibirInfo();
    }
}