package empresa;

public class Velho extends Imovel
{
	protected double desconto;
	
	public double getDesconto()
	{
		return this.desconto;
	}
	
	public void setDesconto(double desconto)
	{
		this.desconto = desconto;
	}
	
	public void imprimeDesconto()
	{
		System.out.println(this.desconto);
	}
}