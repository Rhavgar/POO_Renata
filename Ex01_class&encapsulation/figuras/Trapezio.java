package figuras;

public class Trapezio 
{
	private double baseM, basem, altura;
	
	public double getBaseM()
	{
		return this.baseM;
	}
	
	public void setBaseM(double baseM)
	{
		this.baseM = baseM;
	}
	
	public double getBasem()
	{
		return this.basem;
	}
	
	public void setBasem(double basem)
	{
		this.basem = basem;
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
		return ((this.baseM + this.basem) / 2) * this.altura;
	}	
}