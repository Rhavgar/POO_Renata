package carro;

public class Veiculo 
{
	protected String placa, marca, modelo;
	protected int ano;
	protected double valor_km_rodado, km_inicial, km_final;
	
	public Veiculo(String placa, String marca, String modelo, int ano, double valor_km_rodado)
	{
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valor_km_rodado = valor_km_rodado;
		this.km_inicial = 0;
		this.km_final = 0;
	}
	
	public double valor_locacao()
	{
		return this.valor_km_rodado * (this.km_final - this.km_inicial);
	}
	
	public String getPlaca() 
	{
		return placa;
	}
	
	public void setPlaca(String placa) 
	{
		this.placa = placa;
	}
	
	public String getMarca() 
	{
		return this.marca;
	}
	
	public void setMarca(String marca) 
	{
		this.marca = marca;
	}
	
	public String getModelo() 
	{
		return this.modelo;
	}
	
	public void setModelo(String modelo) 
	{
		this.modelo = modelo;
	}
	
	public int getAno() 
	{
		return this.ano;
	}
	
	public void setAno(int ano) 
	{
		this.ano = ano;
	}
	
	public double getValor_km_rodado() 
	{
		return this.valor_km_rodado;
	}
	
	public void setValor_km_rodado(double valor_km_rodado) 
	{
		this.valor_km_rodado = valor_km_rodado;
	}
	
	public double getKm_inicial() 
	{
		return this.km_inicial;
	}
	
	public void setKm_inicial(double km_inicial) 
	{
		this.km_inicial = km_inicial;
	}
	
	public double getKm_final() 
	{
		return this.km_final;
	}
	
	public void setKm_final(double km_final) 
	{
		this.km_final = km_final;
	}
}