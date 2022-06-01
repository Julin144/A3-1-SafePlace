INSERT INTO Condominio(nome,endereco) VALUES (?,?);

UPDATE  Condominio 
SET     nome= ?,
      endereco= ?
WHERE   idCondominio = x;

DELETE
FROM   Condominio
WHERE  idCondominio = x;

###########################################

INSERT INTO Area(descriçao,dosesRequisitadas) VALUES (?,?);

UPDATE Area 
SET     descriçao = ?,
      dosesRequisitadas= ?
WHERE   idArea = x;

DELETE
FROM   Area
WHERE  idArea = x;

###########################################

INSERT INTO Vacina(tipo,qtdDose) VALUES (?,?);

UPDATE Vacina 
SET     tipo = ?,
      qtdDose= ?
WHERE   idVacina = x;

DELETE
FROM   Vacina
WHERE  idVacina = x;

###########################################

INSERT INTO Inquilino(tipo,qtdDose) VALUES (?,?);

UPDATE Inquilino 
SET   nome = ?,
      cpf= ?,
      aprtNumero= ?
WHERE   idInquilino = x;

DELETE 
FROM   Inquilino
WHERE  idInquilino = x;

###########################################
