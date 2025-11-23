package transporte;
public class Carro extends Veiculo
{
    private String modelo;
    public Carro(String modelo, int velocidadeMaxima)
    {
        super(velocidadeMaxima);
        this.modelo = modelo;
    }
    public String getModelo()
    {
        return modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    public void exibirDetalhes()
    {
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade Máxima: " + getVelocidadeMaxima() + " km/h");
    }
}