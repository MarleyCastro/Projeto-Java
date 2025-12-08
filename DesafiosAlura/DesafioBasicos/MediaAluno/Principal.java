package MediaAluno;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Qual o nome do aluno: ");
        aluno.setNome(sc.next());

        System.out.println("Digite a quantidade das notas: ");
        aluno.setNotas(sc.nextDouble());

        System.out.print("Quantas notas são: ");
        aluno.setNumNotas(sc.nextDouble());

        aluno.calcularMedia();

        sc.close();
    }
}