package galaxia;

public class Lua extends Natural
{
	private String planeta;
	
	public Lua(String nome, ValorAstro massa, String planeta)
	{
		super(nome, massa);
		this.planeta = planeta;
	}
	
	public String imprimirDados()
	{
		return (super.imprimirDados() + "\nOrbita: " + this.planeta);
	}
}
