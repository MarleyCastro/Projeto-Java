package IdadePessoa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IdadePessoa idadePessoa = new IdadePessoa();

        System.out.print("Qual seu nome: ");
        idadePessoa.setNome(sc.nextLine());

        System.out.print("Qual sua idade: ");
        idadePessoa.setIdade(sc.nextInt());

        idadePessoa.verificarIdade();
    }
}
