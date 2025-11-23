package Questao5;
public class IngressoVip extends Ingresso
{
    private String beneficios;
    public IngressoVip(double valor, String setor, String beneficios)
    {
        super(valor, setor);
        this.beneficios = beneficios;
    }
    public void mostrarInfoVip()
    {
        System.out.println("Ingresso VIP");
        System.out.println("Setor: " + getSetor());
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Benefícios: " + beneficios);
    }
}