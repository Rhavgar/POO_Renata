package outros;

public class Teste_Cadastro 
{

	public static void main(String[] args) 
	{
		Gerente g1 = new Gerente("Sidney", new Data(26, 10, 1993), 1500, "A1");
		Funcionario f1 = new Funcionario("Lucas", new Data(9, 10, 1993), 2000);
		Cliente c1 = new Cliente("Renata", new Data(27, 3, 1982), 1);
		
		CadastroPessoas cad1 = new CadastroPessoas();
		
		cad1.cadastraPessoa(g1);
		cad1.cadastraPessoa(f1);
		cad1.cadastraPessoa(c1);
		
		System.out.println(cad1.imprimeCadastro());
	}
}