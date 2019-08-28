package outros;

public class Numero 
{
	private int n1, n2;
	
	public int getN1()
	{
		return this.n1;
	}
	
	public void setN1(int n1)
	{
		this.n1 = n1;
	}
	
	public int getN2()
	{
		return this.n2;
	}
	
	public void setN2(int n2)
	{
		this.n2 = n2;
	}
	
	public void troca()
	{
		int aux;
		
		aux = this.n1;
		this.n1 = this.n2;
		this.n2 = aux;
	}
}