#INSERÇÕES NO BD

#Pacientes
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

#INSERT INTO paciente VALUES(idPaciente, idPessoa, convenio);
INSERT INTO paciente VALUES
(default, 1, 'Unimed'),
(default, 2, 'HapVida');


#Medicos
#INSERT INTO pessoa VALUES(idUsuario,nome, dataNascimento, sexo, estadoCivil);
INSERT INTO pessoa VALUES
(default, 'Jennifer Carolina Rocha', '1949-02-05', 'feminino', 'solteiro');

#INSERT INTO endereco VALUES(idEndereco, idUsuario, logradouro, bairro, cidade, estado, cep);
INSERT INTO endereco VALUES
(default, 1, 'Quadra QR 116 Conjunto 5' , 'Samambaia Sul', 'Brasília', 'DF', 72302706);

#INSERT INTO telefone VALUES(idTelefone, idUsuario, telefone);
INSERT INTO telefone VALUES
(default, 1, 6138367264);

#INSERT INTO medico VALUES(CRM, idPessoa, especialidade);
INSERT INTO medico VALUES
(123456, 2, 'Clinico Geral');


#Consultas
#INSERT INTO consulta VALUES(idConsulta, idPaciente, CRM, dataConsulta, diagnostico);
INSERT INTO consulta VALUES
(default, 1, 123456, now(), 'Cólica renal')
(default, 2, 123456, now(), 'Intoxicação Alimentar');


#Exames
#INSERT INTO exame VALUES(idExame, idPaciente, CRM, exame, data);
INSERT INTO exame VALUES
(default, 1, 123456, 'US Rins', now()),
(default, 1, 123456, 'EAS', now());

