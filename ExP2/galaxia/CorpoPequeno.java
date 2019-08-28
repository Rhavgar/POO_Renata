package galaxia;

public class CorpoPequeno extends Natural
{
	private String tipo;
	
	public CorpoPequeno(String nome, ValorAstro massa, String tipo)
	{
		super(nome, massa);
		this.tipo = tipo;
	}
	
	public String imprimirDados()
	{
		return (super.imprimirDados() + "\nTipo: " + this.tipo);
	}
}
