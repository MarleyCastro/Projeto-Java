package IdadePessoa;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void verificarIdade() {
        if (idade < 18) {
            System.out.println(nome + " Você é menor de idade");
        } else {
            System.out.println(nome + " Você é maior de idade");
        }
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
