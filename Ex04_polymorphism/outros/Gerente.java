package outros;

public class Gerente extends Funcionario
{
	private String area;
	
	public Gerente(String nome, Data nascimento, float salario, String area)
	{
		super(nome, nascimento, salario);
		this.area = area;
	}
	
	@Override
	public double calculaImposto()
	{
		return super.salario * 0.5;
	}
	
	@Override
	public String imprimeDados() 
	{
		return "\nNome: " + super.nome + "\nNascimento: " + super.nascimento.imprimeData() + "\nSalario: " + this.salario + "\nArea: " + this.area;
	}
}
