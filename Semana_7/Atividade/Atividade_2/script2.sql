CREATE DATABASE atividade2;

USE atividade2;

CREATE TABLE pessoa(
    idPessoa INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idPessoa),
    
    nome VARCHAR(60),
    dataNascimento DATE,
    sexo VARCHAR(45),
    estadoCivil VARCHAR(45)
);

CREATE TABLE paciente (
    idPaciente INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idPaciente),

    fk_idPessoa INT NOT NULL,
    FOREIGN KEY(fk_idPessoa) REFERENCES pessoa(idPessoa),

    convenio VARCHAR(45)
);

CREATE TABLE medico(
    CRM INT NOT NULL,
    PRIMARY KEY (CRM),

    fk_idPessoa INT NOT NULL,
    FOREIGN KEY(fk_idPessoa) REFERENCES pessoa(idPessoa),

    especialidade VARCHAR(60)
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

CREATE TABLE consulta(
    idConsulta INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idConsulta),
    
    fk_idPessoa INT NOT NULL,
    FOREIGN KEY(fk_idPessoa) REFERENCES pessoa(idPessoa),

    fk_CRM INT NOT NULL,
    FOREIGN KEY(fk_CRM) REFERENCES medico(CRM),

    dataConsulta date,
    diagnostico VARCHAR(100)
);

CREATE TABLE exame(
    idExame INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idExame),
    
    fk_idPessoa INT NOT NULL,
    FOREIGN KEY(fk_idPessoa) REFERENCES pessoa(idPessoa),

    fk_CRM INT NOT NULL,
    FOREIGN KEY(fk_CRM) REFERENCES medico(CRM),

    descricaoExame VARCHAR(100),
    dataExame date
);