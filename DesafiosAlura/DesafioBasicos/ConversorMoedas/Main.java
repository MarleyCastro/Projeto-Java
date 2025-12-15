import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.exibirMenssagem();
        conversorMoeda.setDolar(sc.nextDouble());

        System.out.println("=".repeat(40));
        System.out.println("Valor Digitado: " + conversorMoeda.getDolar());
        System.out.println("Valor Convertido para REAL: " + conversorMoeda.converterDolarParaReal());
        System.out.println("=".repeat(40));
    }
}
