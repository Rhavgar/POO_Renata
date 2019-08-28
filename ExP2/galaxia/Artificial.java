package galaxia;

public class Artificial implements Astro
{
	private String nome, tipo, localizacao;
	
	public Artificial(String nome, String tipo, String localizacao)
	{
		this.nome = nome;
		this.tipo = tipo;
		this.localizacao = localizacao;
	}
	
	public String imprimirDados()
	{
		return ("\n" + this.getClass().getSimpleName() + "\nNome: " + this.nome + "\nTipo: " + this.tipo 
				+ "\nAltitude: " + "\nLocalizacao: " + this.localizacao);
	}
}
