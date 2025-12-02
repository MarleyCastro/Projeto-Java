package Program;
import application.Conta;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta acount = new Conta();
        System.out.println("DIgite seu nome: ");
        acount.nome = sc.nextLine();
        acount.Padrao();

        System.out.println("****************************");
        System.out.println("Dados iniciais do cliente");
        System.out.println();
        System.out.println("Nome: " + acount.nome);
        System.out.println("Tipo conta: " + acount.tipo);
        System.out.println("Saldo inicial : " + acount.saldo);
        System.out.println("****************************");


        int opcoes = 0;
        while (opcoes != 4) {
            acount.Exibir();
            opcoes = sc.nextInt();

            if (opcoes == 1) {
                System.out.println("Seu saldo atual é: " + acount.saldo);
            } else if (opcoes == 2) {
                System.out.println("Qual o valor a transferir: ");
                acount.valor = sc.nextDouble();
                if (acount.valor > acount.saldo) {
                    System.out.println("SALDO INSUFICIENTE !!");
                } else {
                    acount.TransferirValor();
                    System.out.println("SALDO ATUALIZADO !!" + acount.saldo);
                }
            } else if (opcoes == 3) {
                System.out.println("Qual o valor a receber: ");
                acount.valor = sc.nextDouble();
                acount.ReceberValor();
                System.out.println("RECEBIMENTO ENVIADO COM SUCESSO !!");
                System.out.println("Seu saldo atual é: " + acount.saldo);
            }
        }
    }
}
