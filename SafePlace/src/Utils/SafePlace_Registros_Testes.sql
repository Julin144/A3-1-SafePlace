INSERT INTO Condominio(nome,endereco) VALUES ('Abacaxi freestyle', 'Avenida marginal pinheiros, N87');
INSERT INTO Area(descricao,dosesRequisitadas,idCondominio) VALUES ('Baile', 2, 1), ('Parquinho', 6, 1);

INSERT INTO Condominio(nome,endereco) VALUES ('Parque dos bambu', 'Rua estrada do panda, 34');
INSERT INTO Area(descricao,dosesRequisitadas,idCondominio) VALUES ('Hall principal', 2, 2), ('Sala de filmes', 6, 2);
INSERT INTO Area(descricao,dosesRequisitadas,idCondominio) VALUES ('Piscina', 1, 1), ('Parquinho', 2, 1);

INSERT INTO USUARIO (LOGIN, SENHA, TIPO) VALUES ('REI', '123', 'USER');
INSERT INTO USUARIO (LOGIN, SENHA, TIPO) VALUES ('ADMIN', 'ADMIN', 'ADMIN');

INSERT INTO INQUILINO (nome, cpf,aprtNumero) values ('Reginaldo', 432123242,19), ('Sarah Ponto', 12324232, 11), ('Alahub Kebab', 22132232, 45);

INSERT INTO AcessoArea(idInquilino,idArea,hrIni,hrFim) VALUES (1, 1, '2022/05/06 17:36','2022/05/05 17:30');
INSERT INTO AcessoArea(idInquilino,idArea,hrIni,hrFim) VALUES (2, 1, '2022/05/06 17:36','2022/05/05 17:30');
INSERT INTO AcessoArea(idInquilino,idArea,hrIni,hrFim) VALUES (3, 1, '2022/05/06 17:36','2022/05/05 17:30');

INSERT INTO VACINA(idInquilino, tipo, qtdDose) values (1, 'CoronaVac', 2);