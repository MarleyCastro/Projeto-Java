import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        System.out.print("Digite um número: ");
        tabuada.num = sc.nextInt();
        tabuada.mostrarTabuada();
    }
}
