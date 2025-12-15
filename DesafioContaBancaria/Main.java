import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNomeCliente(sc.nextLine());
        contaBancaria.depositar(1500);
        contaBancaria.sacar(1600);

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.sacar(5202);

        System.out.println(contaBancaria.getSaldo());


        }
    }

