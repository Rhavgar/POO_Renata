package outros;

public class Teste_Contador 
{

	public static void main(String[] args) 
	{
		Contador c1 = new Contador();
		
		c1.setNumero(5);
		
		c1.incrementarNumero();
		
		System.out.println(c1.getNumero());
		
		c1.decrementarNumero();
		
		System.out.println(c1.getNumero());
	}
}