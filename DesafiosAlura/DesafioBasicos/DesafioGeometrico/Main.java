import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CalculadoraSalaRetangular r = new CalculadoraSalaRetangular();
        System.out.print("Digite o valor da base: ");
        r.base = sc.nextDouble();

        System.out.print("Digite a altura: " );
        r.altura = sc.nextDouble();

        r.calcularArea();
        r.calcularPerimetro();
    }
}
