package application;

public class Conta {
    public String nome;
    public String tipo;
    public double saldo;
    public double valor;


    public void Padrao() {
        tipo = "Corrente";
        saldo = 1800;
    }

    public void ReceberValor() {
        saldo += valor;
    }

    public void TransferirValor() {
        saldo -= valor;
    }

    public void Exibir(){
        String name = """
                    1 - Consultar saldo
                    2 - Transferir valor
                    3 - Receber valor
                    4 -Sair
                    """;
        System.out.println(name);
    }

}
