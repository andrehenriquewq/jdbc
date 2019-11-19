package controle;

import bean.Pessoa;
import dao.PessoaDao;

public class Start {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("vitu homosex");
		p.setDdd("086");
		p.setEmail("Example@example.com");
		p.setCpf("1234567");
		p.setFone("4002-8922");
		
		PessoaDao pd = new PessoaDao();
		pd.salvar(p);
	}

}
