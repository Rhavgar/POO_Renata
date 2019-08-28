package galaxia;

public abstract class Natural implements Astro
{
	protected String nome;
	protected ValorAstro massa;

	protected Natural(String nome, ValorAstro massa) 
	{
		this.nome = nome;
		this.massa = massa;
	}
	
	public String imprimirDados()
	{
		return ("\n" + this.getClass().getSimpleName() + "\nNome: " + this.nome + "\nMassa: " + this.massa.mostrarDado());
	}
}
