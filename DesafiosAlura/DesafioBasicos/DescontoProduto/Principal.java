package DescontoProduto;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.print("Qual o nome do produto: ");
        produto.setNome(sc.next());

        System.out.print("Qual o preço: ");
        produto.setPreco(sc.nextDouble());

        System.out.println("\n--- Aplicando desconto de 10% ---");
        produto.aplicarDesconto();

        sc.close();
    }
}