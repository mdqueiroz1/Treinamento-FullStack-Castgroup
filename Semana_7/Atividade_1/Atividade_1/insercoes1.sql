#INSERÇÕES NO BD
#INSERT INTO usuario VALUES(idUsuario,matricula,nome, dataNascimento, nacionalidade, sexo, estadoCivil, cic, dataAdmicao);
INSERT INTO usuario VALUES
(default, 100, 'César Vicente Ricardo Pinto', '1983-03-19', 'brasileiro', 'masculino', 'solteiro', 1234, '2019-10-09');

#INSERT INTO endereco VALUES(idEndereco, idUsuario, logradouro, bairro, cidade, estado, cep);
INSERT INTO endereco VALUES
(default, 1, 'Rua Poente' , 'Rancho Alegre IV', 'Campo Grande', 'MS', 79096460);

#INSERT INTO documento VALUES(idDocumento, idUsuario, rg, dtExpedicao, orgaoExpedidor);
INSERT INTO documento VALUES
(default, 1, 287655696, '1990-07-01', 'SSP');

#INSERT INTO dependentes VALUES (idDependente, idUsuario, nome, dataNascimento);
INSERT INTO dependentes VALUES 
(default, 1, 'Isabela Alessandra Mariana', '1982-09-23');

#INSERT INTO telefone VALUES(idTelefone, idUsuario, telefone);
INSERT INTO telefone VALUES
(default, 1, 1599999999);

#INSERT INTO cargo VALUES(idCargo, idUsuario, descricaoCargo, dtInicio, dtFim);
INSERT INTO cargo VALUES
(default, 1, 'Vendedor', '2020-09-01', '0000-00-00');