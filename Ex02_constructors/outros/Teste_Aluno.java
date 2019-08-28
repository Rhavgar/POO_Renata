package outros;

public class Teste_Aluno 
{

	public static void main(String[] args) 
	{
		Aluno a1 = new Aluno("Sidney", "POO", 5.9);
		Aluno a2 = new Aluno("Lucas", "BD", 6.1);
		
		System.out.println(a1.mostrarAluno());
		System.out.println(a1.mostrarSituacao());
		
		System.out.println(a2.mostrarAluno());
		System.out.println(a2.mostrarSituacao());
	}
}