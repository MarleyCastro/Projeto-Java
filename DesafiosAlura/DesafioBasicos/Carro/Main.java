import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro();
        System.out.print("Qual o nome modelo: ");
        carro.modelo = sc.nextLine();


        System.out.print("Qual a cor do carro: ");
        carro.cor = sc.nextLine();

        System.out.print("Qual o ano do carro: ");
        carro.ano = sc.nextInt();


        carro.exibirFixaTecnica();

        sc.close();
    }
}
