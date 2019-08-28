package carro;

public class Teste_Locadora 
{

	public static void main(String[] args) 
	{
		Veiculo v1 = new Veiculo("ABC-1111", "Gurgel", "BR-800", 1983, 10.00);
		Veiculo_Carga v2 = new Veiculo_Carga("EFG-2222", "Gurgel", "Carajás", 1977, 10.00, 15);
		
		v1.setKm_inicial(5);
		v1.setKm_final(1000);
		System.out.println(v1.valor_locacao());
		
		v2.setKm_inicial(10);
		v2.setKm_final(500);
		System.out.println(v2.valor_locacao());
	}
}