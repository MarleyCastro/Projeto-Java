public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.nome = "Prova de fogo";
        filme.anoDeLancamento = 2000;

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(5);
        filme.avalia(10);
        System.out.println(filme.somaDasAvaliacoes);
        System.out.println(filme.totalAvaliacoes);
        System.out.println(filme.pegaMedia());
    }
}
