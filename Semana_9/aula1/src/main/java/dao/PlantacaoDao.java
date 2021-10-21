package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import modelo.Plantacao;
import solucoes.Conexao;

public class PlantacaoDao {

	public void inserirPlantacao(Plantacao p) {
		try {
			Conexao conexao = new Conexao();

			String sql = "INSERT INTO plantacao (proprietario, fazenda, TipoPlantacao, dataPlantio, DataColheita) VALUES (?,?,?,?,?)";

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);

			ps.setString(1, p.getProprietario());
			ps.setString(2, p.getFazenda());
			ps.setString(3, p.getTipoPlantacao());
			ps.setDate(4, p.getDataPlantio());
			ps.setDate(5, p.getDataColheita());

			ps.execute();

			System.out.println("Plantacao cadastrada!");

		} catch (Exception e) {
			System.out.println("Erro " + e.getMessage());
		}
	}

	public void deletarPlantacao(int id) {
		try {
			Conexao conexao = new Conexao();

			String sql = "DELETE FROM plantacao WHERE (id = ?);";

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();

			System.out.println("Registro " + id + " excluido");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void alterarPlantacao(Plantacao p, int id) {

		try {
			Conexao conexao = new Conexao();

			String sql = "UPDATE plantacao SET proprietario= ?, fazenda= ?, tipoPlantacao= ?, dataPlantio= ?, dataColheita = ? WHERE (id = ?);";

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);

			ps.setString(1, p.getProprietario());
			ps.setString(2, p.getFazenda());
			ps.setString(3, p.getTipoPlantacao());
			ps.setDate(4, p.getDataPlantio());
			ps.setDate(5, p.getDataColheita());

			ps.execute();

			System.out.println("Registro " + id + " alterado");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<Plantacao> buscarPlantacoes(String coluna, String strPesquisa) {
		List<Plantacao> plantacoes = new ArrayList<>();

		try {
			Conexao conexao = new Conexao();
			String sql;

			if (coluna.equals("id")) {
				sql = "SELECT * FROM plantacao WHERE id = " + strPesquisa + " ;";
			} else {
				sql = "SELECT * FROM plantacao WHERE " + coluna + " LIKE '" + strPesquisa + "%'";
			}

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			// https://pt.stackoverflow.com/questions/272747/usar-um-resultset-em-java-pra-imprimir-na-tela-toda-uma-tabela-qualquer

			while (rs.next()) {
				Plantacao p = new Plantacao();
				p.setProprietario(rs.getString("proprietario"));
				p.setFazenda(rs.getString("fazenda"));
				p.setTipoPlantacao(rs.getString("tipoPlantacao"));
				p.setDataPlantio(rs.getDate("dataPlantio"));
				p.setDataColheita(rs.getDate("dataColheita"));

				plantacoes.add(p);
			}

		} catch (Exception e) {
			System.out.println("Erro ao listar Plantacaoes " + e.getMessage());
		}
		return plantacoes;
	}
}
