package Biblioteca;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Livro livro = new Livro();
        System.out.print("Digite o titulo: ");
        livro.setTitulo(sc.nextLine().toUpperCase());

        System.out.print("Digite o autor: ");
        livro.setAutor(sc.nextLine().toUpperCase());

        String traco = String.format("=".repeat(40));
        System.out.println(traco);

        livro.exibirDetalhes();
        System.out.println(traco);
    }
}