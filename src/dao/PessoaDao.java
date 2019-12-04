package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import bean.Pessoa;
public class PessoaDao {
	public void salvar(Pessoa p) {
		String sql = "INSERT INTO Pessoa(nome, email, cpf, ddd, fone) values(?,?,?,?,?)";
		try {
			PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
			ps.setString(1, p.getNome());
			ps.setString(2, p.getEmail());
			ps.setString(3, p.getCpf());
			ps.setString(4, p.getDdd());
			ps.setString(5, p.getFone());
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}