import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno carro = new Aluno();
        System.out.print("Qual é seu nome: ");
        carro.nome = sc.nextLine();


        System.out.print("Qual é sua idade: ");
        carro.idade = sc.nextInt();

        carro.exibirFixaTecnica();

        sc.close();
    }
}
