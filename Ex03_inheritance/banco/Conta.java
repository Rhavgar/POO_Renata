package banco;

public class Conta 
{
	protected String numero, titular;
	
	public String getNumero()
	{
		return this.numero;
	}
	
	public void setNumero(String numero)
	{
		this.numero = numero;
	}
	
	public String getTitular()
	{
		return this.titular;
	}
	
	public void setTitular(String titular)
	{
		this.titular = titular;
	}
	
	public String mostrarDados()
	{
		return this.numero + " - " + this.titular;
	}
}