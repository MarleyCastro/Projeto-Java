package DescontoProduto;

public class Produto {
    private String nome;
    private double preco;

    public void aplicarDesconto() {
        double valorDesconto = preco * 0.10;
        double precoComDesconto = preco - valorDesconto;

        System.out.println("Valor sem desconto: R$ " + String.format("%.2f", preco));
        System.out.println("Valor do desconto: R$ " + String.format("%.2f", valorDesconto));
        System.out.println("Valor com desconto: R$ " + String.format("%.2f", precoComDesconto));
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
