package Questao1;
public class Cachorro extends Animal
{
    private String raca;
    public Cachorro(String nome, int idade, String raca)
    {
        super(nome, idade);
        this.raca = raca;
    }
    public String getRaca()
    {
        return raca;
    }
    public void setRaca(String raca)
    {
        this.raca = raca;
    }
    public void exibirInformacoes()
    {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Raça: " + getRaca());
    }
}