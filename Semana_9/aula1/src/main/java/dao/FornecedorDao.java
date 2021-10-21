package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import modelo.Fornecedor;
import solucoes.Conexao;

public class FornecedorDao {

	public void inserirFornecedor(Fornecedor f) {
		try {
			Conexao conexao = new Conexao();
			
			String sql = "INSERT INTO fornecedor(CNPJ, nome, dataEntrega, distribuidora, DDD, telefone) VALUES (?,?,?,?,?,?)";
			
			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);		
			
			ps.setString(1, f.getCNPJ());
			ps.setString(2, f.getNome());
			ps.setDate(3, f.getDataEntrega());
			ps.setString(4, f.getDistribuidora());
			ps.setString(5, f.getDDD());
			ps.setString(6, f.getTelefone());
			
			ps.execute();
			
			System.out.println("Fornecedor cadastrado!");
			
		} catch (Exception e) {
			System.out.println("Erro "+e.getMessage());
		}
	}
	
	public List<Fornecedor> buscarTodosFornecedores(){
		List<Fornecedor> clientes = new ArrayList<>();
		
		try {
			Conexao conexao = new Conexao();
			
			String sql = "SELECT * FROM fornecedor";
			
			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			//https://pt.stackoverflow.com/questions/272747/usar-um-resultset-em-java-pra-imprimir-na-tela-toda-uma-tabela-qualquer
			
			while(rs.next()){
				Fornecedor f = new Fornecedor();
				f.setCNPJ(rs.getString("CNPJ"));
				f.setNome(rs.getString("nome"));
				f.setDataEntrega(rs.getDate("entrega"));
				f.setDDD(rs.getString("DDD"));
				f.setTelefone(rs.getString("telefone"));
				
				clientes.add(f);
			}
			
		}catch(Exception e) {
			System.out.println("Erro ao listar fornecedores "+e.getMessage());
		}

		return clientes;

	}
	
	public void alterarColuna(String coluna, String id, String valor) {
		try {
			Conexao conexao = new Conexao();

			String sql = "UPDATE fornecedor SET " + coluna + " = \"" + valor + "\" WHERE (id = " + id + ");";

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);

			ps.execute();

			System.out.println("Coluna " + coluna + " alterado");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void alterarFornecedor(Fornecedor f, int id) {

		try {
			Conexao conexao = new Conexao();

			String sql = "UPDATE fornecedor SET CNPJ = ?, nome = ?, distribuidora  = ? , dataEntrega = ? WHERE (id = ?);";

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);

			ps.setString(1, f.getCNPJ());
			ps.setString(2, f.getNome());
			ps.setString(3, f.getDistribuidora());
			ps.setString(4, f.getDDD());
			ps.setString(5, f.getTelefone());
			ps.setDate(6, f.getDataEntrega());
			ps.setInt(7, id);
			
			ps.execute();

			System.out.println("Registro " + id + " alterado");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public void deletarFornecedor(int id) {
		try {
			Conexao conexao = new Conexao();

			String sql = "DELETE FROM fornecedor WHERE (id = ?);";

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();

			System.out.println("Registro " + id + " excluido");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Fornecedor> buscarFornecedores(String coluna, String strPesquisa) {
		List<Fornecedor> fornecedores = new ArrayList<>();

		try {
			Conexao conexao = new Conexao();
			String sql;

			if(coluna.equals("id")){
				sql = "SELECT * FROM fornecedor WHERE id = "+strPesquisa+" ;";
			}else{
				sql = "SELECT * FROM fornecedor WHERE " +coluna+ " LIKE '" + strPesquisa + "%'";
			}
			
			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			// https://pt.stackoverflow.com/questions/272747/usar-um-resultset-em-java-pra-imprimir-na-tela-toda-uma-tabela-qualquer

			while (rs.next()) {
				Fornecedor f = new Fornecedor();
				f.setCNPJ(rs.getString("CNPJ"));
				f.setNome(rs.getString("nome"));
				f.setDistribuidora(rs.getString("Distribuidora"));
				f.setDataEntrega(rs.getDate("dataEntrega"));
				f.setDDD(rs.getString("DDD"));
				f.setTelefone(rs.getString("telefone"));

				fornecedores.add(f);
			}

		} catch (Exception e) {
			System.out.println("Erro ao listar fornecedores " + e.getMessage());
		}
		return fornecedores;
	}
}

