CREATE DATABASE atividade4;

USE atividade4;

CREATE TABLE cliente(
    idCliente INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idCliente),
    
    nome VARCHAR(60),
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

CREATE TABLE pecas(
    idPecas INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idPecas),

    descricaoPeca VARCHAR(100),
    valor float
);

CREATE TABLE servico(
    idServico INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(idServico),

    fk_idPecas INT NOT NULL,
    FOREIGN KEY(fk_idPecas) REFERENCES pecas(idPecas),

    diagnostico VARCHAR(100),
    valor float
);

CREATE TABLE eletronico(
    idEletronico INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(idEletronico),

    fk_idServico INT NOT NULL,
    FOREIGN KEY(fk_idServico) REFERENCES servico(idServico),

    marca VARCHAR(45),
    modelo VARCHAR(45),
    dataEntrada date,
    dataSaida date
);
