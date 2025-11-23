package Questao8;
public class Produto
{
    private String nome;
    private double preco;
    public Produto(String nome, double preco)
    {
        this.nome = nome;
        setPreco(preco);
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public double getPreco()
    {
        return preco;
    }
    public void setPreco(double preco)
    {
        if (preco >= 0)
        {
            this.preco = preco;
        }
        else
        {
            System.out.println("Preço inválido! Não pode ser negativo.");
            this.preco = 0;
        }
    }
    public void aplicarDesconto(double percentual)
    {
        if (percentual > 0)
        {
            preco -= preco * (percentual / 100);
            System.out.println("Desconto aplicado! Novo preço: R$ " + preco);
        }
        else
        {
            System.out.println("Percentual inválido! Deve ser maior que 0.");
        }
    }
}