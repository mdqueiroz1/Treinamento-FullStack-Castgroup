package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import solucoes.Conexao;

public class ClienteDao {

	public void inserirCliente(Cliente c) {
		try {
			Conexao conexao = new Conexao();
			
			String sql = "INSERT INTO cliente(CPF, nome, dataNascimento, sexo, DDD, telefone) VALUES (?,?,?,?,?,?)";
			
			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);		
			
			ps.setString(1, c.getCPF());
			ps.setString(2, c.getNome());
			ps.setDate(3, c.getDataNascimento());
			ps.setString(4, c.getSexo());
			ps.setString(5, c.getDDD());
			ps.setString(6, c.getTelefone());
			
			ps.execute();
			
			System.out.println("Cliente cadastrado!");
			
		} catch (Exception e) {
			System.out.println("Erro "+e.getMessage());
		}
	}
	
	public void alterarCliente(Cliente c, int id) {

		try {
			Conexao conexao = new Conexao();

			String sql = "UPDATE cliente SET CPF = ?, nome = ?, sexo = ? , dataNascimento = ? ddd = ?, telefone = ? WHERE (id = ?);";

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);

			ps.setString(1, c.getCPF());
			ps.setString(2, c.getNome());
			ps.setString(3, c.getSexo());
			ps.setDate(4, c.getDataNascimento());
			ps.setString(5, c.getDDD());
			ps.setString(6, c.getTelefone());
			ps.setInt(7, id);
			
			ps.execute();

			System.out.println("Registro " + id + " alterado");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public void deletarCliente(int id) {
		try {
			Conexao conexao = new Conexao();

			String sql = "DELETE FROM cliente WHERE (id = ?);";

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();

			System.out.println("Registro " + id + " excluido");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Cliente> buscarClientes(String coluna, String strPesquisa) {
		List<Cliente> clientes = new ArrayList<>();

		try {
			Conexao conexao = new Conexao();
			String sql;
			if(!(strPesquisa.equals("0"))){
				if(coluna.equals("id")){
					sql = "SELECT * FROM cliente WHERE id =" +strPesquisa+ ";";
				}else{
					sql = "SELECT * FROM cliente WHERE " +coluna+ " LIKE '" + strPesquisa + "%'";
				}
			}else{
				sql = "SELECT * FROM cliente;";
			}


			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			// https://pt.stackoverflow.com/questions/272747/usar-um-resultset-em-java-pra-imprimir-na-tela-toda-uma-tabela-qualquer

			while (rs.next()) {
				Cliente c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setCPF(rs.getString("CPF"));
				c.setNome(rs.getString("nome"));
				c.setDataNascimento(rs.getDate("dataNascimento"));
				c.setSexo(rs.getString("sexo"));
				c.setDDD(rs.getString("DDD"));
				c.setTelefone(rs.getString("telefone"));

				clientes.add(c);
			}

		} catch (Exception e) {
			System.out.println("Erro ao listar Plantacaoes " + e.getMessage());
		}
		return clientes;
	}
	
}