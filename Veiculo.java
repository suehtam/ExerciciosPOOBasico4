package transporte;
public class Veiculo
{
    protected int velocidadeMaxima;
    public Veiculo(int velocidadeMaxima)
    {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public int getVelocidadeMaxima()
    {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima)
    {
        if (velocidadeMaxima > 0) {
            this.velocidadeMaxima = velocidadeMaxima;
        }
        else
        {
            System.out.println("Velocidade máxima inválida!");
        }
    }
}