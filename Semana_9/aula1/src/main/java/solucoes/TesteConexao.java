package solucoes;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.ClienteDao;
import dao.PlantacaoDao;
import dao.FornecedorDao;
import dao.CarroDao;

import modelo.Cliente;
import modelo.Fornecedor;
import modelo.Carro;
import modelo.Plantacao;

public class TesteConexao {
    public static void main(String[] args) {
        testar();
        int menu;
        do {
            System.out.println("Menu" + "\n1- Inserir dados" + "\n2- Deletar dados" + "\n3- Alterar dados"
                    + "\n4- Listar dados" + "\n10- Sair do programa");

            menu = leia.nextInt();
            switch (menu) {
            case 1: {
                inserirDados();
                break;
            }
            case 2: {
                deletarDados();
                break;
            }
            case 3: {
                alterarDados();
                break;
            }
            case 4: {
                listarDados();
                break;
            }
            }
        } while (menu != 10);

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

        System.out.println("Inserir dados em:" + "\n1-Fornecedores" + "\n2-Clientes" + "\n3-Plantacao" + "\n4-Carro");

        int menu = leia.nextInt();
        switch (menu) {
        case 1: {
            FornecedorDao daoFornecedor = new FornecedorDao();
            Fornecedor f = new Fornecedor();
            int distribuidora;

            System.out.println("Quantos fornecedores serão cadastrados?");
            distribuidora = leia.nextInt();
            clearBuffer(leia);

            for (int i = 0; i < distribuidora; i++) {
                System.out.println("Informe o nome do Fornecedor");
                f.setNome(leia.nextLine());

                System.out.println("Informe o CNPJ");
                f.setCNPJ(leia.nextLine());

                System.out.println("Informe a distribuidora do Fornecedor");
                f.setDistribuidora(leia.nextLine());

                System.out.println("Informe o telefone do telefone do Fornecedor");
                f.setDDD(leia.nextLine());

                System.out.println("Informe o Telefone do Fornecedor");
                f.setTelefone(leia.nextLine());

                System.out.println("Informe a data de entrega formato aaaa-mm-dd");
                String dataEntrega = leia.nextLine();
                Date dataE = Date.valueOf(dataEntrega);
                f.setDataEntrega(dataE);

                daoFornecedor.inserirFornecedor(f);
            }

            break;
        }
        case 2: {
            ClienteDao daoC = new ClienteDao();
            Cliente c = new Cliente();

            int distribuidora;

            System.out.println("Quantos clientes seráo cadastrados?");
            distribuidora = leia.nextInt();
            clearBuffer(leia);

            for (int i = 0; i < distribuidora; i++) {
                System.out.println("Informe o CPF do clientes");
                c.setCPF(leia.nextLine());

                System.out.println("Informe o nome do clientes");
                c.setNome(leia.nextLine());

                System.out.println("Informe a data de nascimento do clientes formato aaaa-mm-dd");
                String DN = leia.nextLine();
                Date DataN = Date.valueOf(DN);
                c.setDataNascimento(DataN);

                System.out.println("Informe o sexo do clientes");
                c.setSexo(leia.nextLine());

                System.out.println("Informe o telefone do clientes");
                c.setDDD(leia.nextLine());

                System.out.println("Informe o telefone do clientes");
                c.setTelefone(leia.nextLine());

                daoC.inserirCliente(c);
            }
            break;
        }
        case 3: {
            PlantacaoDao daoP = new PlantacaoDao();
            Plantacao f = new Plantacao();

            int distribuidora;

            System.out.println("Quantas plantações serão cadastradas?");
            distribuidora = leia.nextInt();
            clearBuffer(leia);

            for (int i = 0; i < distribuidora; i++) {
                System.out.println("Informe o proprietario da fazenda");
                f.setProprietario(leia.nextLine());

                System.out.println("Informe o nome da fazenda");
                f.setFazenda(leia.nextLine());

                System.out.println("Informe o tipo de plantação");
                f.setTipoPlantacao(leia.nextLine());

                System.out.println("Informe a data de plantio. Formato aaaa-mm-dd");
                String DN = leia.nextLine();
                Date DataN = Date.valueOf(DN);
                f.setDataPlantio(DataN);

                System.out.println("Informe a data estimada de colheita. Formato aaaa-mm-dd");
                DN = leia.nextLine();
                DataN = Date.valueOf(DN);
                f.setDataColheita(DataN);

                daoP.inserirPlantacao(f);
            }
            break;
        }
        case 4: {
            CarroDao daoC = new CarroDao();
            Carro c = new Carro();

            int distribuidora;

            System.out.println("Quantos carros serão cadastradas?");
            distribuidora = leia.nextInt();
            clearBuffer(leia);

            for (int i = 0; i < distribuidora; i++) {
                System.out.println("Informe o nome do veiculo");
                c.setModelo(leia.nextLine());

                System.out.println("Informe a marca do veiculo");
                c.setMarca(leia.nextLine());

                System.out.println("Informe a placa do veiculo");
                c.setPlaca(leia.nextLine());

                System.out.println("Informe o chassi do veiculo");
                c.setChassi(leia.nextLine());

                System.out.println("Informe o renavam");
                c.setRenavam(leia.nextInt());
				clearBuffer(leia);

                daoC.inserirCarro(c);
            }
            break;
        }
        }
    }

    public static void deletarDados() {
        System.out.println("Deletar dados em:" + "\n1-Fornecedores" + "\n2-Clientes" + "\n3-Plantacao" + "\n4-Carro");

        int menu = leia.nextInt();
        switch (menu) {
        case 1: {
            FornecedorDao daoPlantacao = new FornecedorDao();

            String teste = "";
            int id;

            do {
                System.out.println("Qual o id do fornecedor vocá deseja deletar?");
                id = leia.nextInt();
                clearBuffer(leia);

                System.out.println("Você tem certeza que quer deletar o fornecedor:");
                // dao.buscar a row

                System.out.println("Confirmar: (S/N)");
                teste = leia.nextLine();
                teste = teste.toUpperCase();
            } while (!teste.equals("S"));

            daoPlantacao.deletarFornecedor(id);
            break;
        }
        case 2: {
            ClienteDao daoPlantacao = new ClienteDao();

            String teste = "";
            int id;

            do {
                System.out.println("Qual o id do Cliente vocá deseja deletar?");
                id = leia.nextInt();
                clearBuffer(leia);

                System.out.println("Você tem certeza que quer deletar o Cliente:");
                // dao.buscar a row

                System.out.println("Confirmar: (S/N)");
                teste = leia.nextLine();
                teste = teste.toUpperCase();
            } while (!teste.equals("S"));

            daoPlantacao.deletarCliente(id);
            break;
        }
        case 3: {
            PlantacaoDao daoPlantacao = new PlantacaoDao();

            String teste = "";
            int id;

            do {
                System.out.println("Qual o id do Plantacao vocá deseja deletar?");
                id = leia.nextInt();
                clearBuffer(leia);

                System.out.println("Você tem certeza que quer deletar o Plantacao:");
                // dao.buscar a row

                System.out.println("Confirmar: (S/N)");
                teste = leia.nextLine();
                teste = teste.toUpperCase();
            } while (!teste.equals("S"));

            daoPlantacao.deletarPlantacao(id);
            break;
        }
        case 4: {
            CarroDao daoPlantacao = new CarroDao();

            String teste = "";
            int id;

            do {
                System.out.println("Qual o id do Carro vocá deseja deletar?");
                id = leia.nextInt();
                clearBuffer(leia);

                System.out.println("Você tem certeza que quer deletar o Carro:");
                // dao.buscar a row

                System.out.println("Confirmar: (S/N)");
                teste = leia.nextLine();
                teste = teste.toUpperCase();
            } while (!teste.equals("S"));

            daoPlantacao.deletarCarro(id);
            break;
        }
        }
    }

    public static void alterarDados() {
        System.out.println("Alterar dados em:" + "\n1-Fornecedores" + "\n2-Clientes" + "\n3-Plantacao" + "\n4-Carro");

        int menu = leia.nextInt();
        switch (menu) {
        case 1: {
            List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
            FornecedorDao daoFornecedor = new FornecedorDao();
            Fornecedor f = new Fornecedor();

            System.out.println("Informe o id do Fornecedor");
            int id = leia.nextInt();
            clearBuffer(leia);

            fornecedores = daoFornecedor.buscarFornecedores("id", String.valueOf(id));

            System.out.println("O nome do Fornecedor  " + fornecedores.get(0).getNome()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String nome = leia.nextLine();
            if (nome.equals("")) {
                f.setNome(fornecedores.get(0).getNome());
            } else {
                f.setNome(nome);
            }

            System.out.println("O CNPJ do Fornecedor  " + fornecedores.get(0).getCNPJ()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String CNPJ = leia.nextLine();
            if (CNPJ.equals("")) {
                f.setCNPJ(fornecedores.get(0).getCNPJ());
            } else {
                f.setCNPJ(CNPJ);
            }

            System.out.println("A distribuidora do Fornecedor  " + fornecedores.get(0).getDistribuidora()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String distribuidora = leia.nextLine();
            if (distribuidora.equals("")) {
                f.setDistribuidora(fornecedores.get(0).getDistribuidora());
            } else {
                f.setDistribuidora(distribuidora);
            }

            System.out.println("O telefone do Fornecedor  " + fornecedores.get(0).getDDD()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String DDD = leia.nextLine();
            if (DDD.equals("")) {
                f.setDDD(fornecedores.get(0).getDDD());
            } else {
                f.setDDD(DDD);
            }

            System.out.println("O telefone do Fornecedor  " + fornecedores.get(0).getTelefone()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String telefone = leia.nextLine();
            if (telefone.equals("")) {
                f.setTelefone(fornecedores.get(0).getTelefone());
            } else {
                f.setTelefone(telefone);
            }

            daoFornecedor.alterarFornecedor(f, id);

            break;
        }
        case 2: {
            List<Cliente> clientes = new ArrayList<Cliente>();
            ClienteDao dao = new ClienteDao();
            Cliente c = new Cliente();

            System.out.println("Informe o id do Cliente");
            int id = leia.nextInt();
            clearBuffer(leia);

            clientes = dao.buscarClientes("id", String.valueOf(id));

            System.out.println("O nome do clientes  " + clientes.get(0).getNome()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String nome = leia.nextLine();
            if (nome.equals("")) {
                c.setNome(clientes.get(0).getNome());
            } else {
                c.setNome(nome);
            }

            System.out.println("O CPF do cliente  " + clientes.get(0).getCPF()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String CPF = leia.nextLine();
            if (CPF.equals("")) {
                c.setCPF(clientes.get(0).getCPF());
            } else {
                c.setCPF(CPF);
            }

            System.out.println("O sexo do cliente  " + clientes.get(0).getSexo()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String sexo = leia.nextLine();
            if (sexo.equals("")) {
                c.setSexo(clientes.get(0).getSexo());
            } else {
                c.setSexo(sexo);
            }

            System.out.println("A data de nascimento do clientes  " + clientes.get(0).getDataNascimento()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String dataNascimento = leia.nextLine();
            if (dataNascimento.equals("")) {
                c.setDataNascimento(clientes.get(0).getDataNascimento());
            } else {
                Date dataNS = Date.valueOf(dataNascimento);
                c.setDataNascimento(dataNS);
            }

            dao.alterarCliente(c, id);
            break;
        }
        case 3: {
            List<Plantacao> plantacoes = new ArrayList<Plantacao>();
            PlantacaoDao dao = new PlantacaoDao();
            Plantacao p = new Plantacao();

            System.out.println("Informe o id do Plantacao");
            int id = leia.nextInt();
            clearBuffer(leia);

            plantacoes = dao.buscarPlantacoes("id", String.valueOf(id));

            System.out.println("O nome do proprietario  " + plantacoes.get(0).getProprietario()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String proprietario = leia.nextLine();
            if (proprietario.equals("")) {
                p.setProprietario(plantacoes.get(0).getProprietario());
            } else {
                p.setProprietario(proprietario);
            }

            System.out.println("O nome da Fazenda  " + plantacoes.get(0).getFazenda()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String fazenda = leia.nextLine();
            if (fazenda.equals("")) {
                p.setFazenda(plantacoes.get(0).getFazenda());
            } else {
                p.setFazenda(fazenda);
            }

            System.out.println("O tipo de plantacao  " + plantacoes.get(0).getTipoPlantacao()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String tipoPlantacao = leia.nextLine();
            if (tipoPlantacao.equals("")) {
                p.setTipoPlantacao(plantacoes.get(0).getTipoPlantacao());
            } else {
                p.setTipoPlantacao(tipoPlantacao);
            }

            System.out.println("A data de plantio " + plantacoes.get(0).getDataPlantio()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String dataPlantio = leia.nextLine();
            if (dataPlantio.equals("")) {
                p.setDataPlantio(plantacoes.get(0).getDataPlantio());
            } else {
                Date dataP = Date.valueOf(dataPlantio);
                p.setDataPlantio(dataP);
            }

            System.out.println("A data estimada de colheita  " + plantacoes.get(0).getDataColheita()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String dataColheita = leia.nextLine();
            if (dataColheita.equals("")) {
                p.setDataColheita(plantacoes.get(0).getDataColheita());
            } else {
                Date dataC = Date.valueOf(dataColheita);
                p.setDataColheita(dataC);
            }

            dao.alterarPlantacao(p, id);
            break;
        }
        case 4: {
            List<Carro> carros = new ArrayList<Carro>();
            CarroDao dao = new CarroDao();
            Carro p = new Carro();

            System.out.println("Informe o id do Carro");
            int id = leia.nextInt();
            clearBuffer(leia);

            carros = dao.buscarCarros("id", String.valueOf(id));

            System.out.println("O nome do carro  " + carros.get(0).getModelo()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String nome = leia.nextLine();
            if (nome.equals("")) {
                p.setModelo(carros.get(0).getModelo());
            } else {
                p.setModelo(nome);
            }

            System.out.println("O preço do carro  " + carros.get(0).getPrecoTabela()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String preco = leia.nextLine();
            if (preco.equals("")) {
                p.setPrecoTabela(carros.get(0).getPrecoTabela());
            } else {
                p.setPrecoTabela(Double.valueOf(preco).doubleValue());
            }

            System.out.println("O marca do carro  " + carros.get(0).getMarca()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String marca = leia.nextLine();
            if (marca.equals("")) {
                p.setMarca(carros.get(0).getMarca());
            } else {
                p.setMarca(marca);
            }

            System.out.println("A placa do carro  " + carros.get(0).getPlaca()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String placa = leia.nextLine();
            if (placa.equals("")) {
                p.setPlaca(carros.get(0).getPlaca());
            } else {
                p.setPlaca(placa);
            }

            System.out.println("O chassi do carro  " + carros.get(0).getChassi()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String chassi = leia.nextLine();
            if (chassi.equals("")) {
                p.setChassi(carros.get(0).getChassi());
            } else {
                p.setChassi(chassi);
            }

            System.out.println("O renavam do carro  " + carros.get(0).getRenavam()
                    + " para alterar, digite o novo valor.\nCaso náo queira alterar, tecle ENTER.");
            String renavam = leia.nextLine();
            if (renavam.equals("")) {
                p.setRenavam(carros.get(0).getRenavam());
            } else {
                p.setRenavam(Integer.valueOf(renavam).intValue());
            }

            break;
        }
        }
    }

    public static void listarDados() {

        System.out.println("Listar dados em:" + 
							"\n1-Fornecedores" + 
							"\n2-Clientes" + 
							"\n3-Plantacao" + 
							"\n4-Carro"
		);
        int menu = leia.nextInt();
        clearBuffer(leia);

        switch (menu) {
        case 1: {
            List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

            FornecedorDao dao = new FornecedorDao();
            String strColuna = "", strPesquisa = "";
            System.out.println("Listar:" + "1- Todos" + "2- Procurar por ID" + "3- Fazer pesquisa por coluna");
            int menu2 = leia.nextInt();
            switch (menu2) {
            case 1: {
                strColuna = "id";
				strPesquisa = "0";
                break;
            }

            case 2: {
                System.out.println("Informe a coluna a ser pesquisada");
                strColuna = leia.nextLine();

                System.out.println("Informe o fornecedor a ser pesquisado na coluna " + strColuna);
                strPesquisa = leia.nextLine();
                break;
            }
            case 3: {
                strColuna = "id";
				System.out.println("Informe o id");
				int id = leia.nextInt();
				clearBuffer(leia);
				strPesquisa = Integer.toString(id);
                break;
            }
            }

            strPesquisa = strPesquisa.toUpperCase();
            fornecedores = dao.buscarFornecedores(strColuna, strPesquisa);

            int qnt = fornecedores.size();

            for (int i = 0; i < qnt; i++) {
                System.out.println("\nId do fornecedor: " + fornecedores.get(i).getId());
                System.out.println("Nome do fornecedor: " + fornecedores.get(i).getNome());
                System.out.println("CNPJ do fornecedor: " + fornecedores.get(i).getCNPJ());
                System.out.println("Distribuidora do fornecedor: " + fornecedores.get(i).getDistribuidora());
                System.out.println("Data de Entrega do fornecedor: " + fornecedores.get(i).getDataEntrega());
                System.out.println(
                        "Telefone do fornecedor: " + fornecedores.get(i).getDDD() + fornecedores.get(i).getTelefone());
            }
            break;
        }

        case 2: {
            List<Cliente> clientes = new ArrayList<Cliente>();

            ClienteDao dao = new ClienteDao();
            String strColuna = "", strPesquisa = "";
            System.out.println("Listar:" + "1- Todos" + "2- Procurar por ID" + "3- Fazer pesquisa por coluna");
            int menu2 = leia.nextInt();
            switch (menu2) {
            case 1: {
                strColuna = "id";
				strPesquisa = "0";
                break;
            }

            case 3: {
                System.out.println("Informe a coluna a ser pesquisada");
                strColuna = leia.nextLine();

                System.out.println("Informe o Cliente a ser pesquisado na coluna " + strColuna);
                strPesquisa = leia.nextLine();
                break;
            }
            case 2: {
                strColuna = "id";
				System.out.println("Informe o id");
				int id = leia.nextInt();
				clearBuffer(leia);
                strPesquisa = Integer.toString(id);
                break;
            }
            }

            strPesquisa = strPesquisa.toUpperCase();
            clientes = dao.buscarClientes(strColuna, strPesquisa);

            int qnt = clientes.size();

            for (int i = 0; i < qnt; i++) {
                System.out.println("\nId do Cliente: " + clientes.get(i).getId());
                System.out.println("Nome do Cliente: " + clientes.get(i).getNome());
                System.out.println("Data de nascimento do Cliente: " + clientes.get(i).getDataNascimento());
                System.out.println("Sexo do Cliente: " + clientes.get(i).getSexo());
                System.out.println("Telefone do Cliente: " + clientes.get(i).getDDD() + clientes.get(i).getTelefone());
            }
        }
        case 3: {
            List<Plantacao> pantacoes = new ArrayList<Plantacao>();

            PlantacaoDao dao = new PlantacaoDao();
            String strColuna = "", strPesquisa = "";
            System.out.println("Listar:" + "1- Todos" + "2- Procurar por ID" + "3- Fazer pesquisa por coluna");
            int menu2 = leia.nextInt();
            switch (menu2) {
            case 1: {
                strColuna = "id";
				strPesquisa = "0";
                break;
            }

            case 3: {
                System.out.println("Informe a coluna a ser pesquisada");
                strColuna = leia.nextLine();

                System.out.println("Informe a plantacao a ser pesquisado na coluna " + strColuna);
                strPesquisa = leia.nextLine();
                break;
            }
            case 2: {
                strColuna = "id";
				System.out.println("Informe o id");
				int id = leia.nextInt();
				clearBuffer(leia);
                strPesquisa = Integer.toString(id);
                break;
            }
            }

            strPesquisa = strPesquisa.toUpperCase();
            pantacoes = dao.buscarPlantacoes(strColuna, strPesquisa);

            int qnt = pantacoes.size();

            for (int i = 0; i < qnt; i++) {
                System.out.println("\nId da plantacao: " + pantacoes.get(i).getId());
                System.out.println("Proprietario da plantacao: " + pantacoes.get(i).getProprietario());
                System.out.println("Fazenda da plantacao: " + pantacoes.get(i).getFazenda());
                System.out.println("Tipo de plantacao: " + pantacoes.get(i).getTipoPlantacao());
                System.out.println("Data de plantio: " + pantacoes.get(i).getDataPlantio());
                System.out.println("Data esperada de colheita: " + pantacoes.get(i).getDataColheita());
            }
        }
        case 4: {
            List<Carro> carros = new ArrayList<Carro>();

            CarroDao dao = new CarroDao();
            String strColuna = "", strPesquisa = "";
            System.out.println("Listar:" + "1- Todos" + "2- Procurar por ID" + "3- Fazer pesquisa por coluna");
            int menu2 = leia.nextInt();
            switch (menu2) {
            case 1: {
                strColuna = "id";
				strPesquisa = "0";
                break;
            }

            case 3: {
                System.out.println("Informe a coluna a ser pesquisada");
                strColuna = leia.nextLine();

                System.out.println("Informe o carro a ser pesquisado na coluna " + strColuna);
                strPesquisa = leia.nextLine();
                break;
            }
            case 2: {
                strColuna = "id";
				System.out.println("Informe o id");
				int id = leia.nextInt();
				clearBuffer(leia);
                strPesquisa = Integer.toString(id);
                break;
            }
            }

            strPesquisa = strPesquisa.toUpperCase();
            carros = dao.buscarCarros(strColuna, strPesquisa);

            int qnt = carros.size();

            for (int i = 0; i < qnt; i++) {
                System.out.println("\nId do carro: " + carros.get(i).getId());
                System.out.println("Placa do carro: " + carros.get(i).getPlaca());
                System.out.println("Modelo do carro: " + carros.get(i).getModelo());
                System.out.println("Marca do carro: " + carros.get(i).getMarca());
                System.out.println("Preco do carro: " + carros.get(i).getPrecoTabela());
                System.out.println("Chassi do carro: " + carros.get(i).getChassi());
                System.out.println("Renavam do carro: " + carros.get(i).getRenavam());
            }
        }
        }

    }

    private static void clearBuffer(Scanner scanner) {
		if (scanner.hasNextLine()) {
			scanner.nextLine();
		}
	}

}
