package Questao2;
public class Carro extends Veiculo
{
    private boolean ligado;
    private int combustivel;
    public Carro()
    {
        super();
        this.ligado = false;
        this.combustivel = 0;
    }
    public void ligar()
    {
        if (combustivel > 0)
        {
            ligado = true;
            System.out.println("Carro ligado!");
        } else
        {
            System.out.println("Não há combustível para ligar o carro.");
        }
    }
    public void desligar()
    {
        ligado = false;
        System.out.println("Carro desligado.");
    }
    public void abastecer(int qtd)
    {
        combustivel += qtd;
        System.out.println("Carro abastecido. Combustível atual: " + combustivel);
    }
    public void acelerarCarro()
    {
        if (ligado && combustivel > 0)
        {
            super.acelerar();
            combustivel--;
        }
        else
        {
            System.out.println("Não é possível acelerar. Carro desligado ou sem combustível.");
        }
    }
}