#Clientes
#INSERT INTO cliente VALUES(idUsuario,nome, dataNascimento, sexo);
INSERT INTO cliente VALUES
(default, 'César Vicente Ricardo Pinto', '1983-03-19', 'masculino'),
(default, 'Ruan Sebastião Bernardes', '1992-12-09', 'masculino');

#INSERT INTO endereco VALUES(idEndereco, idUsuario, logradouro, bairro, cidade, estado, cep);
INSERT INTO endereco VALUES
(default, 1, 'Rua Poente' , 'Rancho Alegre IV', 'Campo Grande', 'MS', 79096460),
(default, 2, 'Rua Ágata' , 'Chácaras Fernão Dias', 'Atibaia', 'SP', 12954647);

#INSERT INTO telefone VALUES(idTelefone, idUsuario, telefone);
INSERT INTO telefone VALUES
(default, 1, 6727566525),
(default, 1, 11999116535);

#INSERT INTO documento VALUES(idDocumento, idUsuario, cpf, rg, dtExpedicao, orgaoExpedidor);
INSERT INTO documento VALUES
(default, 1, 07693776028, 287655696, '1990-07-01', 'SSP'),
(default, 1, 29761085015, 469172333, '2015-02-05', 'SSP');

#Eletronico
#INSERT INTO eletronico VALUES(idEletronico, marca, modelo, dataEntrada, dataSaida);
INSERT INTO eletronico VALUES(default, 'Samsung', 'S9', '2021-10-01', '2021-10-05'),
INSERT INTO eletronico VALUES(default, 'Apple', 'IPhone XR', '2021-09-30', '2021-10-04');

#Servicos
#INSERT INTO servico VALUES(idServico, idCliente, idEletronico, diagnostico, valor);
INSERT INTO servico VALUES(default, 1, 2, 'Troca de bateria');
INSERT INTO servico VALUES(default, 2, 1, 'Troca de tela', valor);

#Pecas
#INSERT INTO pecas VALUES(idPecas, idServico, descricaoPeca, valor);
INSERT INTO pecas VALUES(default, 1, 'Bateria Litio 5300mph', 230.50),
INSERT INTO pecas VALUES(default, 2, 'Touch + LCD S9', 580.90);