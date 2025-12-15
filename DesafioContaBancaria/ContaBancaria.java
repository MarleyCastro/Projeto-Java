public class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private double saldo;
    private double sacar;

    public void sacar(double sacar) {
        saldo -= sacar;

        if (saldo < 0) {
            System.out.println("SALDO INDÍPONIVEL PARA O SAQUE");
            System.exit(0);
        }
    }

    public void depositar(double depositar) {
        saldo += depositar;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }
}
