package outros;

public class Funcionario extends Pessoa
{
	protected float salario;
	
	public Funcionario(String nome, Data nascimento, float salario)
	{
		super.nome = nome;
		super.nascimento = nascimento;
		this.salario = salario;
	}
	
	public double calculaImposto()
	{
		return this.salario * 0.3;
	}

	@Override
	public String imprimeDados() 
	{
		return "\nNome: " + super.nome + "\nNascimento: " + super.nascimento.imprimeData() + "\nSalario: " + this.salario;
	}
}