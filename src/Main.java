import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Perfil perfil = new Perfil();

        System.out.println("Olá qual o seu nome: ");
        perfil.nome = sc.next();
        perfil.Comprimento();

        System.out.println("===== SOMA =======");
        double num1 = 0, num2=0;
        Soma soma = new Soma();
        soma.num1 = sc.nextDouble();
        soma.num2 = sc.nextDouble();
        soma.Exibir();

        System.out.println("===== SUBTRAÇÃO =======");
        Subtrcao sub = new Subtrcao();
        sub.num1 = sc.nextDouble();
        sub.num2 = sc.nextDouble();
        sub.Exibir();

    }
}