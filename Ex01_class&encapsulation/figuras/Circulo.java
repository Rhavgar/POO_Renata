package figuras;

public class Circulo 
{
		private double raio;
		
		public double getRaio()
		{
			return this.raio;
		}
		
		public void setRaio(double raio)
		{
			this.raio = raio;
		}
		
		public double calculaArea()
		{
			return (3.14 * this.raio * this.raio);
		}
}