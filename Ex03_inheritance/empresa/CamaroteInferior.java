package empresa;

public class CamaroteInferior extends VIP
{
	protected String localizacao;
	
	public CamaroteInferior(String localizacao)
	{
		this.localizacao = localizacao;
	}
	
	public void imprimeCamoroteInferior()
	{
		System.out.println(this.localizacao);
	}
}