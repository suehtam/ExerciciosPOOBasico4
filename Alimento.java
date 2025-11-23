package Questao8;
public class Alimento extends Produto
{
    private String dataValidade;
    public Alimento(String nome, double preco, String dataValidade)
    {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }
    public void exibirDadosAlimento()
    {
        System.out.println("Alimento");
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Data de Validade: " + dataValidade);
    }
}