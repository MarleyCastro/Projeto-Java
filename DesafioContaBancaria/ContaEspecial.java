public class ContaEspecial extends ContaBancaria{
    public int limite ;

    @Override
    public void sacar(double sacar) {
        if (limite < sacar) {
            System.out.println("SALDO INDÍPONIVEL PARA O SAQUE");
            return;
        } else {
            System.out.println("SAQUE DE " + sacar + "REALIZADO COM SUCESSO !!");
        }
    }
}
