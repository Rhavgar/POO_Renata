package outros;

public class Conta 
{
	private double saldo;
	
	public double getSaldo()
	{
		return this.saldo;
	}
	
	public void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}
	
	public void depositar(double saldo)
	{
		this.saldo += saldo;
	}
	
	public void sacar(double saldo)
	{
		this.saldo -= saldo + (saldo * 0.05);
	}
	
	public double exibirExtrato()
	{
		return this.saldo;
	}
}