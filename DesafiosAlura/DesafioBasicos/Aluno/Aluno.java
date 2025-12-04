public class Aluno {
    public String nome;
    public int idade;


    void exibirFixaTecnica() {
        System.out.println("=".repeat(50));
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Idade Atual: " + calcularIdade());
    }

    int calcularIdade() {
        return 2025 - idade ;
    }

}
