package outros;

public class Aluno 
{
	private String nome, disciplina;
	private double notaFinal;
	
	public Aluno(String nome, String disciplina, double notaFinal)
	{
		this.nome = nome;
		this.disciplina = disciplina;
		this.notaFinal = notaFinal;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getDisciplina()
	{
		return this.disciplina;
	}
	
	public void setDisciplina(String disciplina)
	{
		this.disciplina = disciplina;
	}
	
	public double getNotaFinal()
	{
		return this.notaFinal;
	}
	
	public void setNotaFinal(double notaFinal)
	{
		this.notaFinal = notaFinal;
	}
	
	public String mostrarAluno()
	{
		return "\nAluno\n" + "Nome: " + this.nome + "\nDisciplina: " + this.disciplina + "\nNota Final: " + this.notaFinal;
	}
	
	public String mostrarSituacao()
	{
		if(this.notaFinal > 6.0)
		{
			return "Aluno aprovado em " + this.disciplina;
		}
		else
		{
			return "Aluno reprovado em " + this.disciplina;
		}
	}
}