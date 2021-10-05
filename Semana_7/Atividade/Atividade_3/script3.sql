CREATE DATABASE atividade3;

USE atividade3;

CREATE TABLE pessoa(
    idPessoa INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idPessoa),
    
    nome VARCHAR(60),
    cpf CHAR(11),
    dataNascimento DATE,
    sexo VARCHAR(45),
    estadoCivil VARCHAR(45)
);

CREATE TABLE documento(
    idDocumento INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idDocumento),
    
    fk_idPessoa INT NOT NULL,
    FOREIGN KEY(fk_idPessoa) REFERENCES pessoa(idPessoa),

    rg VARCHAR(12) NOT NULL,
    dtExpedicao date NOT NULL,
    orgaoExpedidor VARCHAR(5) NOT NULL
);

CREATE TABLE endereco (
    idEndereco INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idEndereco),
    
    fk_idPessoa INT NOT NULL,
    FOREIGN KEY(fk_idPessoa) REFERENCES pessoa(idPessoa),
    
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
    
    fk_idPessoa INT NOT NULL,
    FOREIGN KEY(fk_idPessoa) REFERENCES pessoa(idPessoa),
    
    telefone CHAR(12)
);

CREATE TABLE marca(
    idMarca INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(idMarca),

    marca VARCHAR(45)
);

CREATE TABLE carros(
    idCarro INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(idCarro),

    fk_idMarca INT NOT NULL,
    FOREIGN KEY(fk_idMarca) REFERENCES marca(idMarca),

    modelo VARCHAR(45),
    ano decimal,
    placa char(7),
    renavam char(11)
);

CREATE TABLE aluguel(
    idAluguel INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(idAluguel),

    fk_idPessoa INT NOT NULL,
    FOREIGN KEY(fk_idPessoa) REFERENCES pessoa(idPessoa),

    fk_idCarro INT NOT NULL,
    FOREIGN KEY(fk_idCarro) REFERENCES carro(idCarro),

    dataAluguel date,
    dataDevolucao date,
    valorDiario float
);


