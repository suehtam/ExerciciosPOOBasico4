package Questao2;
public class Veiculo
{
    protected int velocidade;
    public Veiculo()
    {
        this.velocidade = 0;
    }
    public void acelerar() {
        if (velocidade < 200)
        {
            velocidade += 10;
            System.out.println("Acelerando... Velocidade atual: " + velocidade);
        }
        else
        {
            System.out.println("Velocidade máxima atingida!");
        }
    }
    public void frear()
    {
        if (velocidade > 0) {
            velocidade -= 10;
            if (velocidade < 0)
            {
                velocidade = 0;
            }
            System.out.println("Freando... Velocidade atual: " + velocidade);
        }
        else
        {
            System.out.println("O veículo já está parado.");
        }
    }
}