public class Main {
    public static void main(String[] args) {

        double precoOriginal = 510.00;
        double percentualProduto = 0.10;

        double desconto = precoOriginal * percentualProduto;
        desconto -= precoOriginal;
        
        System.out.println(desconto);
    }
}
