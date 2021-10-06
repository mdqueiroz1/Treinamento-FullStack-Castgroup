CREATE DATABASE atividade4;

USE atividade4;

CREATE TABLE cliente(
    idCliente INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idCliente),
    
    nome VARCHAR(60),
    dataNascimento date,
    sexo VARCHAR(45)
);

CREATE TABLE documento(
    idDocumento INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idDocumento),
    
    fk_idCliente INT NOT NULL,
    FOREIGN KEY(fk_idCliente) REFERENCES cliente(idCliente),

    cpf CHAR(11),
    rg VARCHAR(12) NOT NULL,
    dtExpedicao date NOT NULL,
    orgaoExpedidor VARCHAR(5) NOT NULL
);

CREATE TABLE endereco (
    idEndereco INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idEndereco),
    
    fk_idCliente INT NOT NULL,
    FOREIGN KEY(fk_idCliente) REFERENCES cliente(idCliente),
    
    logradouro VARCHAR(45),
    numero DECIMAL,
    bairro VARCHAR(45),
    cidade VARCHAR(45),
    estado CHAR(2),
    CEP CHAR(8)
);

CREATE TABLE telefone (
    idTelefone INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idTelefone),
    
    fk_idCliente INT NOT NULL,
    FOREIGN KEY(fk_idCliente) REFERENCES cliente(idCliente),
    
    telefone CHAR(12)
);

CREATE TABLE eletronico(
    idEletronico INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(idEletronico),

    marca VARCHAR(45),
    modelo VARCHAR(45),
    dataEntrada date,
    dataSaida date
);

CREATE TABLE servico(
    idServico INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(idServico),

    fk_idCliente INT NOT NULL,
    FOREIGN KEY(fk_idCliente) REFERENCES cliente(idCliente),

    fk_idEletronico INT NOT NULL,
    FOREIGN KEY(fk_idEletronico) REFERENCES eletronico(idEletronico),

    diagnostico VARCHAR(100),
    valor float
);

CREATE TABLE pecas(
    idPecas INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idPecas),

    fk_idServico INT NOT NULL,
    FOREIGN KEY(fk_idServico) REFERENCES servico(idServico),

    descricaoPeca VARCHAR(100),
    valor float
);