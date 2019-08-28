package banco;

public class Poupanca extends Conta
{
	protected int diaAniversario;
	
	public int getDia()
	{
		return this.diaAniversario;
	}
	
	public void setDia(int diaAniversario)
	{
		this.diaAniversario = diaAniversario;
	}	
}