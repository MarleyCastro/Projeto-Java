import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Musica musica = new Musica();
        System.out.print("Qual o nome da música: ");
        musica.titulo = sc.nextLine();


        System.out.print("Qual o nome do artista: ");
        musica.artista = sc.nextLine();

        System.out.print("Qual o ano do laçamento: ");
        musica.anoLancamento = sc.nextInt();

        System.out.print("Quantas vezes você quer avaliar: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Digite sua nota de avaliação: ");
            musica.avalia(sc.nextDouble());
        }

        musica.exibirFixaTecnica();

        sc.close();
    }
}
