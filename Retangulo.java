package Questao4;
public class Retangulo extends FiguraGeometrica
{
    private double largura;
    private double altura;
    public Retangulo(double largura, double altura)
    {
        super("Retângulo");
        this.largura = largura;
        this.altura = altura;
    }
    public double calcularAreaRetangulo()
    {
        return largura * altura;
    }
    public double calcularPerimetroRetangulo()
    {
        return 2 * (largura + altura);
    }
    public void exibirDadosRetangulo()
    {
        System.out.println("Figura: " + getNome());
        System.out.println("Largura: " + largura + ", Altura: " + altura);
        System.out.println("Área: " + calcularAreaRetangulo());
        System.out.println("Perímetro: " + calcularPerimetroRetangulo());
    }
}