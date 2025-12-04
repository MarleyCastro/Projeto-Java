import java.util.Date;

public class Carro {
    public String modelo;
    public String cor;
    public int ano;


    void exibirFixaTecnica() {
        System.out.println("=".repeat(50));
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Idade do carro: " + calcularIdade());
    }

    int calcularIdade() {
        return 2025 - ano ;
    }

}
