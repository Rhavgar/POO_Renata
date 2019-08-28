package empresa;

public class Ingresso 
{
	protected double valor;
	
	public double getValor()
	{
		return this.valor;
	}
	
	public void setValor(double valor)
	{
		this.valor = valor;
	}
	
	public void imprimeValor()
	{
		System.out.println(this.valor);
	}
}