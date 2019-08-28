package carro;

public class Veiculo_Carga extends Veiculo 
{
	protected double capacidade;
	
	public Veiculo_Carga(String placa, String marca, String modelo, int ano, double valor_km_rodado, double capacidade) 
	{
		super(placa, marca, modelo, ano, valor_km_rodado);
		this.capacidade = capacidade;
	}	
	
	public double valor_locacao()
	{
		return (super.valor_km_rodado * (super.km_final - super.km_inicial)) * 1.1;
	}

	public double getCapacidade() 
	{
		return capacidade;
	}

	public void setCapacidade(double capacidade) 
	{
		this.capacidade = capacidade;
	} 
}