package outros;

public class Hora 
{
	private int hora, minuto, segundo;
	
	public Hora(int hora)
	{
		this.hora = hora;
		this.minuto = 0;
		this.segundo = 0;		
	}
	
	public int getHora()
	{
		return this.hora;
	}
	
	public void setHora(int hora)
	{
		this.hora = hora;
	}
	
	public int getMinuto()
	{
		return this.minuto;
	}
	
	public void setMinuto(int minuto)
	{
		this.minuto = minuto;
	}
	
	public int getSegundo()
	{
		return this.segundo;
	}
	
	public void setSegundo(int segundo)
	{
		this.segundo = segundo;
	}
}