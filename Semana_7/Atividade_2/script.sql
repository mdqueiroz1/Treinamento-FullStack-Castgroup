CREATE DATABASE ATIVIDADE_08;

USE ATIVIDADE_08;

CREATE TABLE endereco(
    idEndereco INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idEndereco),
    descricao VARCHAR(60),
    CEP int
);

CREATE TABLE Cidade(
    idCidade INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idCidade),
    descricao VARCHAR(60)
);

CREATE TABLE Estado(
    idEstado INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idEstado),
    descricao VARCHAR(60)
);

CREATE TABLE sexo(
    idSexo INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idSexo),
    descricao VARCHAR(60)
);

CREATE TABLE bairro(
    idBairro INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idBairro),
    descricao VARCHAR(60)
);

CREATE TABLE Tipo_nota(
    idTipo_nota INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idTipo_nota),
    descricao VARCHAR(60)
);

CREATE TABLE Tipo_pagamento(
    idTipo_pagamento INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idTipo_pagamento),
    descricao VARCHAR(60)
);

CREATE TABLE Tipo_prod(
    idTipo_prod INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idTipo_prod),
    descricao VARCHAR(60)
);

CREATE TABLE Funcionario(
    idFuncionario INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idFuncionario),

    nome VARCHAR(60),
    CPF CHAR(11) UNIQUE NOT NULL,

    fk_idSexo INT NOT NULL,
    FOREIGN KEY (fk_idSexo) REFERENCES sexo(idSexo),

    data_nasc DATE,

    fk_idEndereco INT NOT NULL,
    FOREIGN KEY(fk_idEndereco) REFERENCES endereco(idEndereco),

    numero int,
    
    fk_idBairro INT NOT NULL,
    FOREIGN KEY(fk_idBairro) REFERENCES Bairro(idBairro),

    fk_idCidade INT NOT NULL,
    FOREIGN KEY(fk_idCidade) REFERENCES Cidade(idCidade),

    fk_idEstado INT NOT NULL,
    FOREIGN KEY(fk_idEstado) REFERENCES Estado(idEstado),

    ddd VARCHAR(3),
    telefone VARCHAR(9)
);

CREATE TABLE Cliente(
    idCliente INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idCliente),

    nome VARCHAR(50),
    CPF_CNPJ VARCHAR(14) UNIQUE,

    fk_idSexo INT NOT NULL,
    FOREIGN KEY (fk_idSexo) REFERENCES sexo(idSexo),

    data_nasc DATE,

    fk_idEndereco INT NOT NULL,
    FOREIGN KEY(fk_idEndereco) REFERENCES endereco(idEndereco),

    numero int,
    
    fk_idBairro INT NOT NULL,
    FOREIGN KEY(fk_idBairro) REFERENCES Bairro(idBairro),

    fk_idCidade INT NOT NULL,
    FOREIGN KEY(fk_idCidade) REFERENCES Cidade(idCidade),

    fk_idEstado INT NOT NULL,
    FOREIGN KEY(fk_idEstado) REFERENCES Estado(idEstado),

    ddd VARCHAR(3),
    telefone VARCHAR(9)
);

CREATE TABLE Fornecedor(
    idFornecedor INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idFornecedor),

    nome VARCHAR(50),
    CPF_CNPJ VARCHAR(14) UNIQUE,

    fk_idEndereco INT NOT NULL,
    FOREIGN KEY(fk_idEndereco) REFERENCES endereco(idEndereco),

    numero int,
    
    fk_idBairro INT NOT NULL,
    FOREIGN KEY(fk_idBairro) REFERENCES Bairro(idBairro),

    fk_idCidade INT NOT NULL,
    FOREIGN KEY(fk_idCidade) REFERENCES Cidade(idCidade),

    fk_idEstado INT NOT NULL,
    FOREIGN KEY(fk_idEstado) REFERENCES Estado(idEstado),

    ddd VARCHAR(3),
    telefone VARCHAR(9)
);

CREATE TABLE Marca(
    idMarca INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idMarca),

    fk_idFornecedor INT NOT NULL,
    FOREIGN KEY(fk_idFornecedor) REFERENCES Fornecedor(idFornecedor),

    nome VARCHAR(50)
);

CREATE TABLE Produto(
    idProduto INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idProduto),
    
    fk_idTipo_Prod INT NOT NULL,
    FOREIGN KEY(fk_idTipo_Prod) REFERENCES Tipo_Prod(idTipo_Prod),

    fk_idMarca INT NOT NULL,
    FOREIGN KEY(fk_idMarca) REFERENCES Marca(idMarca),

    nome VARCHAR(50),
    qnt INT,
    preco FLOAT
);

CREATE TABLE Nota(
    idNota INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idNota),

    fk_idCliente INT NOT NULL,
    FOREIGN KEY(fk_idCliente) REFERENCES Cliente(idCliente),

    fk_idFuncionario INT NOT NULL,
    FOREIGN KEY(fk_idFuncionario) REFERENCES Funcionario(idFuncionario),

    fk_idTipo_nota INT NOT NULL,
    FOREIGN KEY(fk_idTipo_nota) REFERENCES Tipo_nota(idTipo_nota),

    dataNota date
);

CREATE TABLE Pagamento(
    idPagamento INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idPagamento),

    fk_idNota INT NOT NULL,
    FOREIGN KEY(fk_idNota) REFERENCES Nota(idNota),
    
    fk_idTipo_pagamento INT NOT NULL,
    FOREIGN KEY(fk_idTipo_pagamento) REFERENCES Tipo_pagamento(idTipo_pagamento)
);

CREATE TABLE Item(
    idItem INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idItem),

    fk_idNota INT NOT NULL,
    FOREIGN KEY(fk_idNota) REFERENCES Nota(idNota),

    fk_idProduto INT NOT NULL,
    FOREIGN KEY(fk_idProduto) REFERENCES Produto(idProduto),    

    qtd INT
);


INSERT INTO sexo VALUES
(default,'masculino'),
(DEFAULT, 'feminino');

INSERT INTO endereco VALUES
(default,'Rua 1',58000000),
(DEFAULT, 'Rua 2',59000000),
(default, 'Rua 3', 60000000),
(default,'Rua 4',18000000),
(DEFAULT, 'Rua 5',19000000),
(default, 'Rua 6', 20000000);

INSERT INTO bairro VALUES
(default,'bairro 1'),
(DEFAULT, 'bairro 2'),
(default, 'bairro 3'),
(default,'bairro 4');

INSERT INTO cidade VALUES
(default, 'Cidade 1'),
(default, 'Cidade 2'),
(default, 'Cidade 3');

INSERT INTO estado VALUES
(default, 'São Paulo'),
(default, 'Minas Gerais'),
(default, 'Pernambuco');

INSERT INTO tipo_pagamento VALUES
(default, 'dinheiro'),
(default, 'cartão crédito'),
(default, 'cartão débito'),
(default, 'pix');

INSERT INTO tipo_prod VALUES
(default, 'cama'),
(default, 'produto de beleza'),
(default, 'vestimenta');

#INSERT INTO Funcionario VALUES 
#(idFuncionario, nome, CPF, idSexo,data_nasc, idEndereco, numero, idBairro, idCidade, idEstado, ddd, tel)
INSERT INTO Funcionario VALUES 
(default, 'José Vicente Silveira','92630272850' , 1, '1982-08-13', 1, 123, 1, 3, 3, '81', '992223196'),
(default, 'Isis Francisca dos Santos','15206645591', 2, '1981-06-06', 2, 543, 1, 2, 2, '31', '993867170'),
(default, 'Francisco Kauê das Neves','31930302444' , 1, '1987-11-30', 3, 565, 3, 3, 3, '15', '989617669'),
(default, 'Marli Maya da Mata','44911625902' , 2, '1999-05-08', 4, 235, 2, 1, 1, '15', '998437718'),
(default, 'Roberto Emanuel Manuel Mendes','69686639616' , 1, '1996-02-04', 5, 756, 4, 1, 1, '81', '982646619');

#INSERT INTO Cliente VALUES 
#(idCliente, nome, CPF, idSexo,data_nasc, idEndereco, numero, idBairro, idCidade, idEstado, ddd, tel)
INSERT INTO Cliente VALUES
(default, 'Thomas Oliver Benedito da Luz','21133166687', 1, '1993-9-6', 1, 544, 2, 2, 2, '47', '995204694'),
(default, 'Nathan Theo Gomes','36347251680', 1, '1993-4-9', 5, 529, 2, 2, 2, '61', '987015141'),
(default, 'Marcela Vanessa Santos','11120453682', 2, '1992-11-23', 4, 882, 1, 3, 3, '31', '981236351'),
(default, 'Carlos Matheus Tiago Porto','064.109.766-23', 1, '1999-8-16', 1, 90, 1, 1, 1, '34', '993229368'),
(default, 'Sophie Allana Sebastiana da Cruz','675.930.436-57', 2, '1986-10-11', 1, 847, 2, 2, 2, '62', '999830278'),
(default, 'Julia Lorena Campos','028.741.358-60', 2, '1977-2-27', 3, 952, 1, 1, 1, '91', '991952375'),
(default, 'Benedito Benício Castro','424.025.574-00', 1, '1973-1-16', 1, 73, 1, 2, 2, '83', '998672409'),
(default, 'Caleb Kaique Farias','074.198.075-40', 1, '1981-1-24', 5, 760, 3, 1, 1, '91', '982239338'),
(default, 'Agatha Betina Jaqueline da Silva','906.544.835-74', 2, '1986-2-11', 1, 512, 2, 1, 1,'92', '996302869'),
(default, 'Maria Giovanna da Rocha','447.106.048-19', 2, '1985-5-15', 1, 947, 1, 1, 1,'65' ,'984960391');

#INSERT INTO Cliente VALUES 
#(idCliente, nome, CPF, idEndereco, numero, idBairro, idCidade, idEstado, ddd, tel)
INSERT INTO Fornecedor VALUES 
(default, 'Analu e Enzo Padaria ME','59318891000171', 1, 622, 1, 1, 1, '12', '26883516'),
(default, 'Fernando e Maitê Adega Ltda','97832511000101', 5, 903, 2, 1, 1, '14', '29861469'),
(default, 'Nicolas e Kamilly Informática Ltda','74280116000168', 3, 36, 0, 3, 3, '12', '27327867'),
(default, 'Rosa Publicidade e Propaganda Ltda','61633898000120', 4, 133, 3, 2, 2, '31','36928189'),
(default, 'Henry e Francisca Alimentos ME','48613929000112', 3, 64, 0, 1, 1, '34','27067836'),
(default, 'Levi e Renan Telecomunicações ME','19150089000109', 3, 836, 1, 1, 1, '67','29016727');

INSERT INTO marca VALUE
(default, 1, 'Marca 1'),
(default, 1, 'Marca 2'),
(default, 1, 'Marca 10'),
(default, 1, 'Marca 11'),
(default, 2, 'Marca 3'),
(default, 2, 'Marca 12'),
(default, 2, 'Marca 13'),
(default, 2, 'Marca 14'),
(default, 2, 'Marca 15'),
(default, 3, 'Marca 4'),
(default, 3, 'Marca 5'),
(default, 4, 'Marca 6'),
(default, 5, 'Marca 7'),
(default, 5, 'Marca 16'),
(default, 5, 'Marca 17'),
(default, 6, 'Marca 8'),
(default, 6, 'Marca 9');

INSERT INTO produto VALUES
(DEFAULT, 1,1,'prod1',100,35.50),
(DEFAULT, 1,2,'prod2',200,102.25),
(DEFAULT, 1,3,'prod3',50,135.50),
(DEFAULT, 1,4,'prod4',200,205.20),
(DEFAULT, 2,5,'prod5',100,35.50),
(DEFAULT, 2,6,'prod6',200,102.25),
(DEFAULT, 2,7,'prod7',50,135.50),
(DEFAULT, 2,8,'prod8',200,205.20),
(DEFAULT, 2,9,'prod9',200,205.20),
(DEFAULT, 2,10,'prod10',100,35.50),
(DEFAULT, 2,11,'prod11',200,102.25),
(DEFAULT, 3,12,'prod12',50,135.50),
(DEFAULT, 3,13,'prod13',200,205.20),
(DEFAULT, 3,14,'prod14',50,135.50),
(DEFAULT, 3,15,'prod15',200,255.20),
(DEFAULT, 3,16,'prod16',500,35.50),
(DEFAULT, 3,17,'prod17',200,25.20);

INSERT INTO tipo_nota VALUES
(default, 'NF-e'),
(default, 'NFS-e'),
(default, 'NFC-e'),
(default, 'CT-e'),
(default, 'MDF-e');

select * from nota;
INSERT INTO nota VALUES
(default, 1, 1, 1, '2021-09-1'),
(default, 2, 2, 1, '2021-09-1'),
(default, 3, 3, 1, '2021-09-10'),
(default, 1, 4, 2, '2021-09-15'),
(default, 4, 5, 2, '2021-09-30'),
(default, 5, 5, 2, '2021-09-12'),
(default, 4, 4, 2, '2021-09-20'),
(default, 3, 5, 3, '2021-09-13'),
(default, 7, 1, 3, '2021-09-11'),
(default, 3, 2, 3, '2021-09-07'),
(default, 1, 3, 3, '2021-09-03'),
(default, 4, 5, 2, '2021-08-15'),
(default, 5, 2, 2, '2021-08-1'),
(default, 6, 1, 2, '2021-08-1'),
(default, 7, 3, 2, '2021-08-10'),
(default, 8, 4, 3, '2021-08-15'),
(default, 8, 5, 3, '2021-08-30'),
(default, 9, 3, 3, '2021-08-12'),
(default, 10,1, 3, '2021-08-20'),
(default, 3, 2, 3, '2021-08-13'),
(default, 7, 2, 3, '2021-08-11'),
(default, 2, 2, 3, '2021-08-07'),
(default, 3, 3, 3, '2021-08-03'),
(default, 1, 4, 3, '2021-08-15');

INSERT INTO item VALUES
(default, 1, 1, 5),
(default, 1, 3, 10),
(default, 2, 1, 5),
(default, 3, 2, 10),
(default, 4, 10, 5),
(default, 4, 17, 10),
(default, 5, 10, 5),
(default, 5, 13, 10),
(default, 6, 11, 5),
(default, 6, 12, 10),
(default, 6, 11, 5),
(default, 7, 1, 10),
(default, 8, 9, 5),
(default, 9, 9, 10),
(default, 10, 9, 5),

(default, 11, 9, 10),
(default, 12, 5, 10),
(default, 13, 3, 5),
(default, 13, 3, 10),
(default, 13, 1, 5),
(default, 14, 7, 10),
(default, 15, 1, 5),
(default, 16, 9, 10),
(default, 17, 7, 5),
(default, 18, 3, 10),
(default, 19, 10, 5),
(default, 20, 11, 10),
(default, 20, 16, 5),
(default, 20, 12, 10),
(default, 20, 15, 5),
(default, 21, 12, 10),
(default, 22, 12, 10),
(default, 23, 13, 5),
(default, 24, 2, 10),
(default, 24, 12, 10),
(default, 24, 16, 5),
(default, 24, 17, 10);

INSERT INTO pagamento VALUES
(default, 1, 1),
(default, 2, 2),
(default, 3, 2),
(default, 4, 1),
(default, 5, 4),
(default, 6, 1),
(default, 7, 4),
(default, 8, 3),
(default, 9, 1),
(default, 10, 1),
(default, 11, 1),
(default, 12, 1),
(default, 13, 2),
(default, 14, 2),
(default, 15, 2),
(default, 16, 4),
(default, 17, 3),
(default, 18, 1),
(default, 19, 1),

(default, 20, 1),
(default, 21, 4),
(default, 22, 3),
(default, 23, 3),
(default, 24, 1);