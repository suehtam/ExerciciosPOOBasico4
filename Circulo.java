package Questao4;
public class Circulo extends FiguraGeometrica
{
    private double raio;
    public Circulo(double raio)
    {
        super("Círculo");
        this.raio = raio;
    }
    public double calcularAreaCirculo()
    {
        return Math.PI * raio * raio;
    }
    public double calcularPerimetroCirculo()
    {
        return 2 * Math.PI * raio;
    }
    public void exibirDadosCirculo() {
        System.out.println("Figura: " + getNome());
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcularAreaCirculo());
        System.out.println("Perímetro: " + calcularPerimetroCirculo());
    }
}