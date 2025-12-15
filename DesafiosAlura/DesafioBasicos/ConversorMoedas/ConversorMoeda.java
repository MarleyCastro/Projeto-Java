public class ConversorMoeda implements ConversaoFinanceira{
    private double dolar;

    @Override
    public double converterDolarParaReal() {
        return this.dolar * 5.42 ;
    }

    public String exibirMenssagem() {
        System.out.println("=".repeat(40));
        System.out.println("Conversor de Moedas");
        System.out.println("=".repeat(40));
        System.out.print("Digite um valor: ");
        return "";
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }
}
