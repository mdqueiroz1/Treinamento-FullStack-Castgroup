package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import modelo.Carro;
import solucoes.Conexao;

public class CarroDao {

	public void inserirCarro(Carro c) {
		try {
			Conexao conexao = new Conexao();
			
			String sql = "INSERT INTO carro (modelo, marca, placa, chassi, renavam, precoTabela) VALUES (?,?,?,?,?,?)";
			
			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);		
			
			ps.setString(1, c.getModelo());
			ps.setString(2, c.getMarca());
			ps.setString(3, c.getPlaca());
			ps.setString(4, c.getChassi());
			ps.setInt(5, c.getRenavam());
			ps.setDouble(6, c.getPrecoTabela());
			
			ps.execute();
			
			System.out.println("Carro cadastrado!");
			
		} catch (Exception e) {
			System.out.println("Erro "+e.getMessage());
		}
	}
	
	public List<Carro> buscarCarros(String coluna, String strPesquisa) {
		List<Carro> carros = new ArrayList<>();

		try {
			Conexao conexao = new Conexao();
			String sql;

			if(coluna.equals("id")){
				sql = "SELECT * FROM carro WHERE id = "+strPesquisa+" ;";
			}else{
				sql = "SELECT * FROM carro WHERE " +coluna+ " LIKE '" + strPesquisa + "%'";
			}

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			// https://pt.stackoverflow.com/questions/272747/usar-um-resultset-em-java-pra-imprimir-na-tela-toda-uma-tabela-qualquer

			while(rs.next()){
				Carro c = new Carro();
				c.setModelo(rs.getString("modelo"));
				c.setMarca(rs.getString("marca"));
				c.setPlaca(rs.getString("placa"));
				c.setChassi(rs.getString("chassi"));
				c.setRenavam(rs.getInt("renavam"));
				c.setPrecoTabela(rs.getDouble("precoTabela"));
				
				carros.add(c);
			}
			
		}catch(Exception e) {
			System.out.println("Erro ao listar carros "+e.getMessage());
		}

		return carros;
	}
	
	public void deletarCarro(int id) {
		try {
			Conexao conexao = new Conexao();

			String sql = "DELETE FROM carro WHERE (id = ?);";

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();

			System.out.println("Registro " + id + " excluido");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void alterarCarro(Carro c, int id) {

		try {
			Conexao conexao = new Conexao();

			String sql = "UPDATE carro SET modelo = ?, marca = ?, placa = ?, chassi = ?, renavam = ?, precoTabela = ? WHERE (id = ?);";

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);

			ps.setString(1, c.getModelo());
			ps.setString(2, c.getMarca());
			ps.setString(3, c.getPlaca());
			ps.setString(4, c.getChassi());
			ps.setInt(5, c.getRenavam());
			ps.setDouble(6, c.getPrecoTabela());
			ps.setInt(7, id);
			
			ps.execute();

			System.out.println("Registro " + id + " alterado");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}