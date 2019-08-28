package empresa;

public class CamaroteSuperior extends VIP
{
	protected String localizacao;
	
	public CamaroteSuperior(String localizacao)
	{
		this.localizacao = localizacao;
	}
	
	public void imprimeCamoroteSuperior()
	{
		System.out.println(this.localizacao);
	}
	
	public double getValorIngresso()
	{
		return super.getIngresso();
	}
}