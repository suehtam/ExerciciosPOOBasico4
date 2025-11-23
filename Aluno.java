package pessoas;
public class Aluno extends Pessoa
{
    private String matricula;
    public Aluno(String nome, int idade, String matricula)
    {
        super(nome, idade);
        this.matricula = matricula;
    }
    public String getMatricula()
    {
        return matricula;
    }
    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }
    public void exibirDados()
    {
        System.out.println("Dados do Aluno");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Matrícula: " + matricula);
    }
}