package outros;

public class Cliente extends Pessoa 
{
	private int codigo;
	
	public Cliente(String nome, Data nascimento, int codigo)
	{
		super.nome = nome;
		super.nascimento = nascimento;
		this.codigo = codigo;
	}
	
	@Override
	public String imprimeDados()
	{
		return "\nNome: " + super.nome + "\nNascimento: " + super.nascimento.imprimeData() + "\nCodigo: " + this.codigo;
	}
}