CREATE DATABASE atividadeb;
USE atividadeb;

CREATE TABLE pessoa (
    CPF CHAR(11) NOT NULL UNIQUE,
    PRIMARY KEY (CPF),

    nome VARCHAR(45),
    nascimento DATE,
    naturalidade VARCHAR(45),
    nacionalidade VARCHAR(45),
    sexo VARCHAR(45),
    estadoCivil VARCHAR(45),
    etnia VARCHAR(45)
);

CREATE TABLE documentos (
    idDocumentos INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idDocumentos),

    fk_CPF CHAR(11) NOT NULL,
    FOREIGN KEY (fk_CPF) REFERENCES pessoa(CPF),

    rg VARCHAR(9) NOT NULL,
    emissor VARCHAR(10),
    uf CHAR(2),
    dataEmissao DATE,
    nTituloEleitor CHAR(12),
    secao VARCHAR(5),
    zona VARCHAR(5)
);

CREATE TABLE endereco (
    idendereco INT NOT NULL,
    PRIMARY KEY (idendereco),
    
    fk_CPF CHAR(11) NOT NULL,
    FOREIGN KEY (fk_CPF) REFERENCES pessoa(CPF),
    
    logradouro VARCHAR(45),
    numero DECIMAL,
    bairro VARCHAR(45)
);

CREATE TABLE Estudos (
    idEstudos INT NOT NULL,
    PRIMARY KEY (idEstudos),

    fk_CPF CHAR(11) NOT NULL,
    FOREIGN KEY (fk_CPF) REFERENCES pessoa(CPF),

    ondeEstuda VARCHAR(45),
    pretendeVoltar BOOLEAN,
    estudoPretendido VARCHAR(45)
);

CREATE TABLE dependentes (
    idDependentes INT NOT NULL,
    PRIMARY KEY (idDependentes),

    fk_CPF CHAR(11) NOT NULL,
    FOREIGN KEY (fk_CPF) REFERENCES pessoa(CPF),

    dependente VARCHAR(45)
);

CREATE TABLE telefone (
    idTelefone INT NOT NULL,
    PRIMARY KEY (idTelefone),
    
    telefone CHAR(12),
    
    fk_CPF CHAR(11) NOT NULL,
    FOREIGN KEY (fk_CPF) REFERENCES pessoa(CPF)
);

CREATE TABLE Formacao (
    idFormacao INT NOT NULL,
    PRIMARY KEY (idFormacao),
    
    Formacao VARCHAR(45),
    
    fk_CPF CHAR(11) NOT NULL,
    FOREIGN KEY (fk_CPF) REFERENCES pessoa(CPF)
);

CREATE TABLE Ocupacao (
    idOcupacao INT NOT NULL,
    PRIMARY KEY (idOcupacao),
    
    Ocupacao VARCHAR(45),
    
    fk_CPF CHAR(11) NOT NULL,
    FOREIGN KEY (fk_CPF) REFERENCES pessoa(CPF)
);

CREATE TABLE escolaridade (
    idEscolaridade INT NOT NULL,
    PRIMARY KEY (idEscolaridade),
    
    escolaridade VARCHAR(45),
    
    fk_CPF CHAR(11) NOT NULL,
    FOREIGN KEY (fk_CPF) REFERENCES pessoa(CPF)
);

CREATE TABLE PCD (
    idPCD INT NOT NULL,
    PRIMARY KEY (idPCD),
    
    PCD VARCHAR(45),
    
    fk_CPF CHAR(11) NOT NULL,
    FOREIGN KEY (fk_CPF) REFERENCES pessoa(CPF)
);

CREATE TABLE Associacao (
    idAssociacao INT NOT NULL,
    PRIMARY KEY (idAssociacao),
    
    Associacao VARCHAR(45),
    
    fk_CPF CHAR(11) NOT NULL,
    FOREIGN KEY (fk_CPF) REFERENCES pessoa(CPF)
);

CREATE TABLE Sindicato (
    idSindicato INT NOT NULL,
    PRIMARY KEY (idSindicato),
    
    Sindicato VARCHAR(45),
    
    fk_CPF CHAR(11) NOT NULL,
    FOREIGN KEY (fk_CPF) REFERENCES pessoa(CPF)
);

CREATE TABLE Clube (
    idClube INT NOT NULL,
    PRIMARY KEY (idClube),
    
    Clube VARCHAR(45),
    
    fk_CPF CHAR(11) NOT NULL,
    FOREIGN KEY (fk_CPF) REFERENCES pessoa(CPF)
);

CREATE TABLE Religiao (
    idReligiao INT NOT NULL,
    PRIMARY KEY (idReligiao),
    
    Religiao VARCHAR(45),
    
    fk_CPF CHAR(11) NOT NULL,
    FOREIGN KEY (fk_CPF) REFERENCES pessoa(CPF)
);