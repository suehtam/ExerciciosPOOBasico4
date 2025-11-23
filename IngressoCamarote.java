package Questao5;
public class IngressoCamarote extends Ingresso
{
    private String localizacao;
    public IngressoCamarote(double valor, String setor, String localizacao)
    {
        super(valor, setor);
        this.localizacao = localizacao;
    }
    public void mostrarInfoCamarote()
    {
        System.out.println("Ingresso Camarote");
        System.out.println("Setor: " + getSetor());
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Localização: " + localizacao);
    }
}