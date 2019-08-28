package banco;

public class Corrente extends Conta
{
	protected double limiteChEspecial;
	
	public double getLimite()
	{
		return this.limiteChEspecial;
	}
	
	public void setLimite(double limite)
	{
		this.limiteChEspecial = limite;
	}
}