package relogio;

public class Contato 
{
	private String nome, telefone;
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getTelefone()
	{
		return this.telefone;
	}
	
	public void setTelefone(String telefone)
	{
		this.telefone = telefone;
	}	
	
	public String mostrarContato()
	{
		return (this.nome + "-" + this.telefone);
	}
}