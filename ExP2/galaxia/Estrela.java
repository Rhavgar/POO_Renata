package galaxia;

public class Estrela extends Natural
{
	private String tipo;
	private ValorAstro idade;

	public Estrela(String nome, ValorAstro massa, String tipo, ValorAstro idade) 
	{
		super(nome, massa);
		this.tipo = tipo;
		this.idade = idade;
	}

	public String imprimirDados() 
	{
		return (super.imprimirDados() + "\nTipo: " + this.tipo + "\nIdade: " + this.idade.mostrarDado());
	}
}
