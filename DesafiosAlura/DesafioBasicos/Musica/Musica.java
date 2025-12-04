public class Musica {
    public String titulo;
    public String artista;
    public int anoLancamento;
    public double avaliacao;
    public double numAvaliacoes;


    void exibirFixaTecnica() {
        System.out.println("=".repeat(50));
        System.out.println("Título: " + titulo );
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Número de avaliaçãoes: " + numAvaliacoes);
    }

    void avalia(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }



}
