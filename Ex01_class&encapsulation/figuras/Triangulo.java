package figuras;

public class Triangulo 
{
	private double base, altura;
	
	public double getBase()
	{
		return this.base;
	}
	
	public void setBase(double base)
	{
		this.base = base;
	}
	
	public double getAltura()
	{
		return this.altura;
	}
	
	public void setAltura(double altura)
	{
		this.altura = altura;
	}
	
	public double calcularArea()
	{
		return this.base * this.altura;
	}
}