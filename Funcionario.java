package Questao3;
public class Funcionario extends Pessoa
{
    private double salario;
    public Funcionario(String nome, int idade, double salario)
    {
        super(nome, idade);
        setSalario(salario);
    }
    public double getSalario()
    {
        return salario;
    }
    public void setSalario(double salario)
    {
        if (salario >= 0)
        {
            this.salario = salario;
        } else
        {
            System.out.println("Salário inválido! Não pode ser negativo.");
        }
    }
    public void aplicarAumento(double percentual)
    {
        if (percentual > 0)
        {
            salario += salario * (percentual / 100);
            System.out.println("Aumento aplicado! Novo salário: " + salario);
        }
        else
        {
            System.out.println("Percentual inválido! Deve ser maior que 0.");
        }
    }
}