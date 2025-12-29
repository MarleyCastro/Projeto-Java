import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produto = new ArrayList<>();

        System.out.println("BEM VINDO AO SUPERMERCADO");
        System.out.print("Quantidade de itens: ");

        int n = sc.nextInt();
        String nome = "";
        double preco = 0;
        int quantidade = 0;
        int i = 0;
        while (i < n) {
            System.out.printf("Digite nome do produto: ");
            nome = sc.nextLine();
            System.out.print("");
            sc.next();
            System.out.printf("Digite o preço: ");
            preco = sc.nextDouble();
            System.out.printf("Digite a quantidade: ");
            quantidade = sc.nextInt();
            i++;
        }

        Produto produto1 = new Produto(nome,preco, quantidade);
        System.out.println(produto1.toString());

        }

    }

