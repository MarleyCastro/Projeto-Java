public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.depositar(5500);
        contaBancaria.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(5520);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.sacar(1500);
        contaBancaria.consultarSaldo();
    }
}
