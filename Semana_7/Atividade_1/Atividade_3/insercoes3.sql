
#Pessoas
#INSERT INTO pessoa VALUES(idUsuario,nome, dataNascimento, sexo, estadoCivil);
INSERT INTO pessoa VALUES
(default, 'César Vicente Ricardo Pinto', '1983-03-19', 'masculino', 'solteiro'),
(default, 'Ruan Sebastião Bernardes', '1992-12-09', 'masculino', 'solteiro');

#INSERT INTO endereco VALUES(idEndereco, idUsuario, logradouro, bairro, cidade, estado, cep);
INSERT INTO endereco VALUES
(default, 1, 'Rua Poente' , 'Rancho Alegre IV', 'Campo Grande', 'MS', 79096460),
(default, 2, 'Rua Ágata' , 'Chácaras Fernão Dias', 'Atibaia', 'SP', 12954647);

#INSERT INTO telefone VALUES(idTelefone, idUsuario, telefone);
INSERT INTO telefone VALUES
(default, 1, 6727566525),
(default, 1, 11999116535);

#INSERT INTO documento VALUES(idDocumento, idUsuario, rg, dtExpedicao, orgaoExpedidor);
INSERT INTO documento VALUES
(default, 1, 287655696, '1990-07-01', 'SSP'),
(default, 1, 469172333, '2015-02-05', 'SSP');

#Marcas
#INSERT INTO marca VALUES(default, marca);
INSERT INTO marca VALUES
(default, 'Toyota'),
(default, 'Volkswagen'),
(default, 'Ford'),
(default, 'Honda'),
(default, 'Hyundai'),
(default, 'Nissan'),
(default, 'Chevrolet'),
(default, 'Kia');

#Carros
#INSERT INTO carros VALUES(default, marca, modelo, ano, cor, placa, renavam, valorDiario);
INSERT INTO carros VALUES
(default, 1, 'ETIOS XLS Sedan 1.5 Flex 16V 4p Mec.', 2013, 'Prata', 'LVW1802', 96098685397, 183.82),
(default, 2, 'Gol 1.6 I MOTI.Power/Highli T.Flex 8V 4p', 2010, 'Prata', 'KGL5826', 50192087092, 140.78),
(default, 3, 'Ranger TROPIVAN 2.5 16V 4X2 Flex', 2013, 'Preta', 'IAC0257', 59035970987, 440.29),
(default, 4, 'Honda Fit 1.5 Exl 16v Flex 4p Aut',2019 , 'Prata', 'HPY-5971', 11936505546, 474.00),
(default, 5, 'HB20S Comfort Plus 1.0 TB Flex 12V Mec.', 2017, 'Prata', 'NDF6419', 06102064678, 245.05),
(default, 6, 'Frontier 2.3 TD CD LE 4x4 Diesel Aut. 4p', 2016, 'Preta', 'AKS3096', 42147103865, 800.00),
(default, 7, 'COBALT ADVANTAGE 1.4 MPFI 8V F.Power 4p', 2014, 'Vermelho', 'HLA4128', 24651060408,217.22),
(default, 8, 'OPTIMA 2.4 16V 180cv Aut.', 2013, 'Branco', 'NES4093', 40053326546, 312.58);

#Alugueis
#INSERT INTO aluguel VALUES(default, idPessoa, idCarro, dataAluguel, dataDevolucao, valorTotal);
INSERT INTO aluguel VALUES
(default, 1 , 2, now(), '2021-11-06', (140.78*30))
(default, 2 , 6, now(), '2021-10-26', (800*20));
