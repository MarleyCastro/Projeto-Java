package MediaAluno;

public class Aluno {
    private String nome;
    private double notas;
    private double numNotas;

    public void calcularMedia() {
        double media = (notas += notas) / numNotas;
        System.out.println("Media da nota do " + String.format("%s : %.2f", nome, media));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public double getNumNotas() {
        return numNotas;
    }

    public void setNumNotas(double numNotas) {
        this.numNotas = numNotas;
    }
}
