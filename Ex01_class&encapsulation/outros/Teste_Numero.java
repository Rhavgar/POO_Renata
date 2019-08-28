package outros;

public class Teste_Numero 
{

	public static void main(String[] args) 
	{
		Numero num = new Numero();
		
		num.setN1(3);
		num.setN2(7);
		
		System.out.println("N1 = " + num.getN1() + "\nN2 = " + num.getN2());

		num.troca();
		
		System.out.println("\nN1 = " + num.getN1() + "\nN2 = " + num.getN2());
	}
}