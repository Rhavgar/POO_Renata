package galaxia;

public class ValorAstro 
{
	protected double valor;
	protected String unidade;
	
	public ValorAstro(double valor, String unidade)
	{
		this.valor = valor;
		this.unidade = unidade;
	}
	
	public String mostrarDado()
	{
		return (this.valor + " " + this.unidade);
	}
}
