package Questao5;
public class Ingresso
{
    private double valor;
    private String setor;
    public Ingresso(double valor, String setor)
    {
        setValor(valor);
        this.setor = setor;
    }
    public double getValor()
    {
        return valor;
    }
    public void setValor(double valor)
    {
        if (valor >= 0)
        {
            this.valor = valor;
        }
        else
        {
            System.out.println("Valor inválido! Não pode ser negativo.");
            this.valor = 0;
        }
    }
    public String getSetor()
    {
        return setor;
    }
    public void setSetor(String setor)
    {
        this.setor = setor;
    }
}