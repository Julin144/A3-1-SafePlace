INSERT INTO Condominio(nome,endereco) VALUES ('Com dó minio', 'Em baixo da tua mãe');
INSERT INTO Area(descricao,dosesRequisitadas,idCondominio) VALUES ('Baile', 2, 1), ('Parquinho', 6, 1);

INSERT INTO Condominio(nome,endereco) VALUES ('Predio gigante', 'Em baixo da teu pai');
INSERT INTO Area(descricao,dosesRequisitadas,idCondominio) VALUES ('Hall principal', 2, 2), ('Sala de filmes', 6, 2);

INSERT INTO Area(descricao,dosesRequisitadas,idCondominio) VALUES ('Escorregador', 1, 1), ('Cozinha', 2, 1);

INSERT INTO USUARIO (LOGIN, SENHA, TIPO) VALUES ('REI', '123', 'USER');
INSERT INTO USUARIO (LOGIN, SENHA, TIPO) VALUES ('ADMIN', 'ADMIN', 'ADMIN');

select * from usuario;