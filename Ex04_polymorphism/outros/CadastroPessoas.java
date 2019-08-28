package outros;
import java.util.ArrayList;

public class CadastroPessoas 
{
	private ArrayList <Pessoa> cadastro;
	
	public CadastroPessoas()
	{
		cadastro = new ArrayList <Pessoa>();
	}
	
	public void cadastraPessoa(Pessoa pessoa)
	{
		cadastro.add(pessoa);
	}
	
	public String imprimeCadastro()
	{
		String dados = "";
		
		for (Pessoa pessoa: cadastro)
		{
			dados += pessoa.imprimeDados();
			dados += "\n";
		}
		
		return dados;
	}
}