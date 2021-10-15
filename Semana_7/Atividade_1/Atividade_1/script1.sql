CREATE DATABASE atividade1;

USE atividade1;

CREATE TABLE usuario(
    idUsuario INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idUsuario),
    
    matricula INT NOT NULL UNIQUE,
    nome VARCHAR(60),
    dataNascimento DATE,
    nacionalidade VARCHAR(45),
    sexo VARCHAR(45),
    estadoCivil VARCHAR(45),
    cic INT,
    dataAdmicao DATE
);

CREATE TABLE documento(
    idDocumento INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idDocumento),
    
    fk_idUsuario INT NOT NULL,
    FOREIGN KEY(fk_idUsuario) REFERENCES usuario(idUsuario),

    rg VARCHAR(12) NOT NULL,
    dtExpedicao date NOT NULL,
    orgaoExpedidor VARCHAR(5) NOT NULL
);

CREATE TABLE dependentes(
    idDependente INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY(idDependente),

    fk_idUsuario INT NOT NULL,
    FOREIGN KEY(fk_idUsuario) REFERENCES usuario(idUsuario),

    nome VARCHAR(45),
    dataNascimento DATE
);

CREATE TABLE endereco (
    idEndereco INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idEndereco),
    
    fk_idUsuario INT NOT NULL,
    FOREIGN KEY (fk_idUsuario) REFERENCES usuario(idUsuario),
    
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
    
    fk_idUsuario INT NOT NULL,
    FOREIGN KEY (fk_idUsuario) REFERENCES usuario(idUsuario),

    telefone CHAR(12)
);

CREATE TABLE cargo(
    idCargo INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idCargo),
    
    fk_idUsuario INT NOT NULL,
    FOREIGN KEY (fk_idUsuario) REFERENCES usuario(idUsuario),

    descricaoCargo VARCHAR(45),
    dtInicio DATE,
    dtFim DATE
);