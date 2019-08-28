package galaxia;
import java.util.ArrayList;

public class SistemaSolar 
{
	private ArrayList <Astro> sistema;
	
	public SistemaSolar()
	{
		sistema = new ArrayList <Astro>();
	}
	
	public void cadastrarAstro(Astro astro)
	{
		sistema.add(astro);
	}
	
	public String imprimirSistema()
	{
		String dados = "";
		
		for (Astro astro : sistema)
		{
			dados += astro.imprimirDados();
			dados += "\n";
		}
		
		return dados;
	}
}
