public class Main {
    public static void main(String[] args) {

        System.out.println("=".repeat(50));
        System.out.println("CACHORRO");
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        System.out.println("=".repeat(50));
        System.out.println("GATO");
        Gato gato = new Gato();
        gato.arranharMoveis();
        gato.emitirSom();
    }
}
