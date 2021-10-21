package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import modelo.Produto;
import solucoes.Conexao;

public class ProdutoDao {

	public void inserirProduto(Produto p) {
		try {
			Conexao conexao = new Conexao();

			String sql = "INSERT INTO produto(nome, quantidade, preco, dataValidade, dataCadastro) VALUES (?,?,?,?,?)";

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);

			ps.setString(1, p.getNome());
			ps.setInt(2, p.getQuantidade());
			ps.setDouble(3, p.getPreco());
			ps.setDate(4, p.getDataValidade());
			ps.setDate(5, p.getDataCadastro());

			ps.execute();

			System.out.println("Produto cadastrado!");

		} catch (Exception e) {
			System.out.println("Erro " + e.getMessage());
		}
	}

	public void inserirColuna(String coluna, String tipo) {
		try {
			Conexao conexao = new Conexao();

			String sql = "ALTER TABLE produto ADD COLUMN " + coluna + " " + tipo + " ;";

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);

			ps.execute();

			System.out.println("Produto alterado");

		} catch (Exception e) {
			System.out.println("Erro " + e.getMessage());
		}
	}

	public void alterarColuna(String coluna, String id, String valor) {
		try {
			Conexao conexao = new Conexao();

			String sql = "UPDATE produto SET " + coluna + " = \"" + valor + "\" WHERE (id = " + id + ");";

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);

			ps.execute();

			System.out.println("Coluna " + coluna + " alterado");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void alterarRegistro(Produto p, int id) {

		try {
			Conexao conexao = new Conexao();

			String sql = "UPDATE produto SET nome = ?, preco = ?, quantidade = ? , dataValidade = ? WHERE (id = ?);";

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);

			ps.setString(1, p.getNome());
			ps.setDouble(2, p.getPreco());
			ps.setInt(3, p.getQuantidade());
			ps.setDate(4, p.getDataValidade());
			ps.setInt(5, id);
			
			ps.execute();

			System.out.println("Registro " + id + " alterado");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public void deletarProduto(int id) {
		try {
			Conexao conexao = new Conexao();

			String sql = "DELETE FROM produto WHERE (id = ?);";

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();

			System.out.println("Registro " + id + " excluido");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Produto> buscarProdutos(String coluna, String strPesquisa) {
		List<Produto> produtos = new ArrayList<>();

		try {
			Conexao conexao = new Conexao();
			String sql;

			if(coluna.equals("id")){
				sql = "SELECT * FROM produto WHERE id = "+strPesquisa+" ;";
			}else{
				sql = "SELECT * FROM produto WHERE " +coluna+ " LIKE '" + strPesquisa + "%'";
			}
			// String sql = "SELECT * FROM produto WHERE nome LIKE ?";

			PreparedStatement ps = conexao.getConexao().prepareStatement(sql);

			// ps.setString(1, strPesquisa+"%");

			ResultSet rs = ps.executeQuery();
			// https://pt.stackoverflow.com/questions/272747/usar-um-resultset-em-java-pra-imprimir-na-tela-toda-uma-tabela-qualquer

			while (rs.next()) {
				Produto p = new Produto();
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				p.setQuantidade(rs.getInt("quantidade"));
				p.setPreco(rs.getDouble("preco"));
				p.setDataValidade(rs.getDate("dataValidade"));
				p.setDataCadastro(rs.getDate("dataCadastro"));

				produtos.add(p);
			}

		} catch (Exception e) {
			System.out.println("Erro ao listar produtos " + e.getMessage());
		}
		return produtos;
	}

}

/*
	public static void main(String[] args) {
		testar();

		int menu;

		do {
			System.out.println("\n\nMenu\n1-Mostrar os dados da tabela"+
								"\n2-Inserir dados na tabela"+
								"\n3-Adicionar coluna"+
								"\n4-Alterar coluna"+
								"\n5-Alterar registro"+
								"\n6-Deletar produto");

			menu = leia.nextInt();
			clearBuffer(leia);
			switch (menu) {
				case 1: {
					mostrar("todos", 0);
					break;
				}
				case 2: {
					inserirDados();
					break;
				}
				case 3: {
					inserirColuna();
					break;
				}
				case 4: {
					alterarColuna();
					break;
				}
				case 5:{
					alterarRegistro();
				}
				case 6:{
					deletarProduto();
				}
			}
		} while (menu != 10);

		leia.close();
	}

	static Scanner leia = new Scanner(System.in);
	
	public static void testar() {
		try {
			Conexao conexao = new Conexao();

			conexao.getConexao();

			System.out.println("Conexão com DB efetuada.");
		} catch (Exception e) {
			System.out.println("Erro de conexáo com o DB " + e.getMessage());
		}
	}

	public static void inserirDados() {
		int menu;
		System.out.println("Menu:\n1- Cliente"+
							"\n2-Produto"+
							"\n3-Carro"+
							"\n4-Plantacao"+
							"\n5-Fornecedor"
		);

		menu = leia.nextInt();
		clearBuffer(leia);

		switch (menu) {
			case 1: {
				ClienteDao daoC = new ClienteDao();
				Cliente c = new Cliente();
	
				int qnt;
	
				System.out.println("Quantos clientes seráo cadastrados?");
				qnt = leia.nextInt();
				clearBuffer(leia);
	
				for (int i = 0; i < qnt; i++) {
					System.out.println("Informe o CPF do cliente");
					c.setCPF(leia.nextLine());
	
					System.out.println("Informe o nome do cliente");
					c.setNome(leia.nextLine());
	
					System.out.println("Informe a data de nascimento do cliente formato aaaa-mm-dd");
					String DN = leia.nextLine();
					Date DataN = Date.valueOf(DN);
					c.setDataNascimento(DataN);
	
					System.out.println("Informe o sexo do cliente");
					c.setSexo(leia.nextLine());
	
					System.out.println("Informe o DDD do cliente");
					c.setDDD(leia.nextLine());
	
					System.out.println("Informe o telefone do cliente");
					c.setTelefone(leia.nextLine());
	
					daoC.inserirCliente(c);
				}
				break;
			}
			case 2: {	
				ProdutoDao daoP = new ProdutoDao();
				Produto p = new Produto();
				int qnt;
	
				System.out.println("Quantos produtos seráo cadastrados?");
				qnt = leia.nextInt();
				clearBuffer(leia);
	
				for (int i = 0; i < qnt; i++) {
					System.out.println("Informe o nome do Produto");
					p.setNome(leia.nextLine());
	
					System.out.println("Informe o preáo do Produto");
					p.setPreco(leia.nextDouble());
					clearBuffer(leia);
	
					System.out.println("Informe a quantidade do Produto");
					p.setQuantidade(leia.nextInt());
					clearBuffer(leia);
	
					System.out.println("Informe a data de validade do Produto formato aaaa-mm-dd");
					String dataValidade = leia.nextLine();
					Date dataV = Date.valueOf(dataValidade);
					p.setDataValidade(dataV);
	
					p.setDataCadastro(new Date(System.currentTimeMillis()));
	
					daoP.inserirProduto(p);
				}
				break;
			}
			case 3:{
				FornecedorDao daoFornecedor = new FornecedorDao();
				Fornecedor f = new Fornecedor();
				int qnt;
				
				System.out.println("Quantos fornecedores seráo cadastrados?");
				qnt = leia.nextInt();
				clearBuffer(leia);
	
				for (int i = 0; i < qnt; i++) {
					System.out.println("Informe o nome do Fornecedor");
					f.setNome(leia.nextLine());
	
					System.out.println("Informe o CNPJ");
					f.setCNPJ(leia.nextLine());

					System.out.println("Informe a distribuidora do Fornecedor");
					f.setDistribuidora(leia.nextLine());
					clearBuffer(leia);

					System.out.println("Informe o DDD do telefone do Fornecedor");
					f.setDDD(leia.nextLine());
					
					System.out.println("Informe o Telefone do Fornecedor");
					f.setTelefone(leia.nextLine());
					clearBuffer(leia);
	
					System.out.println("Informe a data de entrega formato aaaa-mm-dd");
					String dataEntrega = leia.nextLine();
					Date dataE = Date.valueOf(dataEntrega);
					f.setDataEntrega(dataE);
	
					daoFornecedor.inserirFornecedor(f);
				}
				break;
			}
		}
	}
*/
	/*
	 * mostrar segue a sintaxe:
	 * mostrar(opções_de_pesquisa, id_especifico);
	 * As opáes de pesquisa sáo:
	 * todos - Listando todos os registros na tabela.
	 * pesquisa - irá perguntar por qual dado da tabela irá pesquisar, podendo retornar 0 ou mais registros.
	 * registro - irá pesquisar unicamente pela chave primária retornando apenas um registro.
	 * */
/*
	public static void mostrar(String menu, int id) {
		List<Produto> produtos = new ArrayList<Produto>();

		ProdutoDao dao = new ProdutoDao();
		String strColuna = "",strPesquisa = "";

		switch (menu) {
			case "todos":{
				strColuna = "id";
				break;
			}
	
			case "pesquisa":{
				System.out.println("Informe a coluna a ser pesquisada");
				strColuna = leia.nextLine();
				
				System.out.println("Informe o produto a ser pesquisado na coluna "+strColuna);
				strPesquisa = leia.nextLine();
				break;
			}
			case "registro":{
				strColuna = "id";
				strPesquisa = Integer.toString(id);
				break;
			}
		}
		
		strPesquisa = strPesquisa.toUpperCase();
		produtos = dao.buscarProdutos(strColuna, strPesquisa);

		int qnt = produtos.size();

		for (int i = 0; i < qnt; i++) {
			System.out.println("\nId do produto: " + produtos.get(i).getId());
			System.out.println("Nome do produto: " + produtos.get(i).getNome());
			System.out.println("Preco do produto: " + produtos.get(i).getPreco());
			System.out.println("Quantidade do produto: " + produtos.get(i).getQuantidade());
			System.out.println("Data de Validade do produto: " + produtos.get(i).getDataValidade());
			System.out.println("Data do Cadastro do produto: " + produtos.get(i).getDataCadastro());
		}
	}
	
	public static void inserirColuna() {
		ProdutoDao dao = new ProdutoDao();
		
		System.out.println("Qual a coluna a ser adicionada?");
		String coluna = leia.nextLine();

		System.out.println("Qual o tipo dessa coluna?");
		String tipo = leia.nextLine();
		
		dao.inserirColuna(coluna, tipo);
	}
	
	public static void alterarColuna() {
		ProdutoDao dao = new ProdutoDao();
		
		System.out.println("Informe a coluna a ser modificada");
		String coluna = leia.nextLine();
		
		System.out.println("Informe o id da coluna a ser modificada");
		String id = leia.nextLine();
		
		System.out.println("Informe o valor a ser modificado na coluna " + coluna);
		String valor = leia.nextLine();
		
		dao.alterarColuna(coluna, id, valor);
	}
	
	public static void alterarRegistro() {
		List<Produto> produtos = new ArrayList<Produto>();
		ProdutoDao dao = new ProdutoDao();
		Produto p = new Produto();

		System.out.println("Informe o id do Produto");
		int id = leia.nextInt();
		clearBuffer(leia);
		
		produtos = dao.buscarProdutos("id", String.valueOf(id));
		
		System.out.println("O nome do produto  "+produtos.get(0).getNome()+
							" para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
		String nome = leia.nextLine();
		if(nome.equals("")) {
			p.setNome(produtos.get(0).getNome());
		}else {
			p.setNome(nome);
		}
		
		System.out.println("O preço do produto  "+produtos.get(0).getPreco()+
							" para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
		String preco = leia.nextLine();
		if(preco.equals("")) {
			p.setPreco(produtos.get(0).getPreco());
		}else {
			p.setPreco(Double.valueOf(preco).doubleValue());
		}
		
		System.out.println("A quantidade do produto  "+produtos.get(0).getQuantidade()+
							" para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
		String qnt = leia.nextLine();
		if(qnt.equals("")) {
			p.setQuantidade(produtos.get(0).getQuantidade());
		}else {
			p.setQuantidade(Integer.valueOf(qnt).intValue());			
		}
		
		System.out.println("A data de validade do produto  "+produtos.get(0).getDataValidade()+
							" para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
		String dataValidade = leia.nextLine();
		if(dataValidade.equals("")) {
			p.setDataValidade(produtos.get(0).getDataValidade());
		}else {
			Date dataV = Date.valueOf(dataValidade);
			p.setDataValidade(dataV);
		}
		
		dao.alterarRegistro(p, id);
	}
	
	public static void deletarProduto(){
		ProdutoDao dao = new ProdutoDao();
		
		String teste = "";
		int id;
		
		do {
			System.out.println("Qual o id do produto voce deseja deletar?");
			id = leia.nextInt();
			clearBuffer(leia);
			
			System.out.println("Vocá tem certeza que quer deletar o produto");
			mostrar("registro", id);
			
			System.out.println("Confirmar: (S/N)");
			teste = leia.nextLine();
			teste = teste.toUpperCase();
		}while(!teste.equals("S"));		
		
		dao.deletarProduto(id);
	}
*/