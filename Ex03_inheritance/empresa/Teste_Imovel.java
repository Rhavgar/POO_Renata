package empresa;

public class Teste_Imovel 
{

	public static void main(String[] args) 
	{
		Imovel i1 = new Imovel();
		i1.setEndereco("Rua Alvarenga Pinto, 157");
		i1.setPreco(1700);
		
		Novo n1 = new Novo();
		n1.setAdicional(300);
		
		Velho v1 = new Velho();
		v1.setDesconto(200);
		
		n1.imprimeAdicional();
		
		v1.imprimeDesconto();
	}
}