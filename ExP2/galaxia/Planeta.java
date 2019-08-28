package galaxia;

public class Planeta extends Natural
{
	private String tipo;
	private ValorAstro rotacao, translacao;
	private int qtd_lua;

	public Planeta(String nome, ValorAstro massa, String tipo, ValorAstro rotacao, ValorAstro translacao, int qtd_lua) 
	{
		super(nome, massa);
		this.tipo = tipo;
		this.rotacao = rotacao;
		this.translacao = translacao;
		this.qtd_lua = qtd_lua;
	}

	public String imprimirDados() 
	{
		return (super.imprimirDados() + "\nTipo: " + this.tipo + "\nPeriodo de Rotacao: " + this.rotacao.mostrarDado() 
				+ "\nPeriodo de Translacao: " + this.translacao.mostrarDado() + "\nQuantidade de Lua(s): " + this.qtd_lua);
	}
}
