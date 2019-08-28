package empresa;

public class VIP extends Ingresso
{
	protected double adicional;
	
	public double getAdicional()
	{
		return this.adicional;
	}
	
	public void setAdicional(double a)
	{
		this.adicional = a;
	}
	
	public double getIngresso()
	{
		return super.getValor() + this.adicional;
	}
}