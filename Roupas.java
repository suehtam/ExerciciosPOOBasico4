package Questao8;
public class Roupas extends Produto
{
    private String tamanho;
    public Roupas(String nome, double preco, String tamanho)
    {
        super(nome, preco);
        this.tamanho = tamanho;
    }
    public void exibirDadosRoupas()
    {
        System.out.println("Roupas");
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Tamanho: " + tamanho);
    }
}