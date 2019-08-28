package relogio;

public class Hora 
{
	private int hora, minuto, segundo;
	
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
	
	public String mostrarHora()
	{
		return (this.hora + ":" + this.minuto + ":" + this.segundo);
	}
}