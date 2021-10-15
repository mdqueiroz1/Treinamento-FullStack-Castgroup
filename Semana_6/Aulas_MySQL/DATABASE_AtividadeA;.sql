CREATE DATABASE AtividadeA;

CREATE TABLE produtos(
	idProdutos INT NOT NULL AUTO_INCREMENT,
    descricao VARCHAR(45) NOT NULL,
    undMedida VARCHAR(45),
    vlrUnitario FLOAT NOT NULL
);

CREATE TABLE pessoa(
	CPF char(11) NOT NULL UNIQUE,
    primary key(CPF),
    
    nome varchar(45) NOT NULL,
    rg char(9) NOT NULL
);

CREATE TABLE endereco(
	idEndereco INT NOT NULL AUTO_INCREMENT,
	PRIMARY KEY(idEndereco),
    
    fk_CPF char(11) NOT NULL,
    foreign key(fk_CPF) references pessoa(CPF),
    
    cidade varchar(45) NOT NULL,
    uf char(2) NOT NULL,
    rua varchar(45) NOT NULL,
    numero int NOT NULL,
    bairro varchar(45) NOT NULL
);

CREATE TABLE notaFiscal(
	nf int NOT NULL UNIQUE,
    PRIMARY KEY(nf),
	
    fk_CPF int NOT NULL,
    foreign key(fk_CPF) references pessoa(CPF),
    
    fk_idEndereco int NOT NULL,
    foreign key(fk_idEndereco) references endereco(idEndereco),
	
    dataCompra DATE NOT NULL,
	vlrCompra FLOAT NOT NULL
);

CREATE TABLE compra(
	idCompra int NOT NULL AUTO_INCREMENT,
    primary key(idCompra),
    
    fk_idProduto int,
    foreign key(fk_idProduto) references produto(idProduto),
    
    qnt int,
    vlrTotal float
);

insert into produto values(default, 'Arroz', 'KG', 1.99);
insert into produto values(default, 'Sabonete', 'Unidade', 0.79);
insert into produto values(default, 'Leite', 'Litro', 2.12);
insert into produto values(default, 'Feijao', 'KG', 0.99);

insert into pessoa values('12345678910', 'Jose da Silva', '123456789');
insert into endereco values(default, '12345678910', 'Medianeira', 'PR', 'Rua Bahia', '1234', 'Centro');

insert into compra values(default, 1, 2, 3.98);
insert into compra values(default, 2, 1, 0.79);
insert into compra values(default, 3, 3, 6.36);


insert into notaFiscal values(123, '12345678910', 1, '01/01/01', 11.13);