package outros;

public class Teste_Conta 
{

	public static void main(String[] args) 
	{
		Conta c1 = new Conta();
		
		c1.depositar(1000);
		
		System.out.println(c1.exibirExtrato());
		
		c1.sacar(500);
		
		System.out.println(c1.exibirExtrato());
	}
}