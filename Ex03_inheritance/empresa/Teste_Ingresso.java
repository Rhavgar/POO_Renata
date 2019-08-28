package empresa;

public class Teste_Ingresso 
{

	public static void main(String[] args) 
	{
		Ingresso i1 = new Ingresso();
		i1.setValor(15);
		
		VIP v1 = new VIP();
		v1.setValor(10);
		
		Normal n1 = new Normal();
		
		CamaroteInferior ci1 = new CamaroteInferior("A");
		CamaroteSuperior cs1 = new CamaroteSuperior("B");
		
		ci1.imprimeCamoroteInferior();
		
		cs1.imprimeCamoroteSuperior();
		System.out.println(cs1.getValorIngresso());
		
		n1.imprimeNormal();
		
		i1.imprimeValor();
	}
}