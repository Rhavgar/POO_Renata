package empresa;

public class Novo extends Imovel
{
	protected double adicional;
	
	public double getAdicional()
	{
		return this.adicional;
	}
	
	public void setAdicional(double adicional)
	{
		this.adicional = adicional;
	}
	
	public void imprimeAdicional()
	{
		System.out.println(this.adicional);
	}
}