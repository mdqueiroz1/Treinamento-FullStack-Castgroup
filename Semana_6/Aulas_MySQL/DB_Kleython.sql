CREATE DATABASE IF NOT EXISTS a_kleython;

use a_kleython;

CREATE TABLE cliente(
    idCliente INT AUTO_INCREMENT NOT NULL,
    PRIMARY KEY (idCliente),
    
    cpf char(11) UNIQUE NOT NULL,
    nome VARCHAR(70) NOT NULL,
    rg VARCHAR(13)
);

CREATE TABLE cidade(
    idCidade INT AUTO_INCREMENT NOT NULL,
    PRIMARY KEY(idCidade),

    nomeCidade VARCHAR(45) NOT NULL,
    uf CHAR(2) NOT NULL,
    pais CHAR(2)
);

CREATE TABLE produto(
    idProduto INT AUTO_INCREMENT NOT NULL,
    descricao VARCHAR(45),
    undMedida VARCHAR(20),
    vlrUnitario float
);

CREATE TABLE itensNota(
    idItensNota INT AUTO_INCREMENT NOT NULL,
    fk_idProduto INT NOT NULL,
    FOREIGN KEY(fk_idProduto) REFERENCES produto(idProduto),
    qnt int
);

CREATE TABLE nota(
    nf INT NOT NULL UNIQUE,
    PRIMARY KEY (nf),
    
    fk_idCliente INT NOT NULL,
    FOREIGN KEY(fk_idCliente) REFERENCES cliente(idCliente),

    data date NOT NULL
);