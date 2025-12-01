import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        if (num1 % 2 == 0) System.out.println(num1 + " é um núemro Par");
        else System.out.println(num1 + " é um núemro Impar");
    }
}
