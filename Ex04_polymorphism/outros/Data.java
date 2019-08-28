package outros;

public class Data 
{
	private int dia, mes, ano;

	public Data(int dia, int mes, int ano)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String imprimeData()
	{
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}