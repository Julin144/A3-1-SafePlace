INSERT INTO Condominio(nome,endereco) VALUES (?,?);

UPDATE  Condominio  SET     nome= ?, endereco= ? WHERE   idCondominio = ?;

DELETE FROM   Condominio WHERE  idCondominio = ?;

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

UPDATE Vacina SET     tipo = ?, qtdDose= ? WHERE   idVacina = ?;

DELETE FROM   Vacina WHERE  idVacina = ?;

###########################################

INSERT INTO Inquilino(tipo,qtdDose) VALUES (?,?);

UPDATE Inquilino 
SET   nome = ?,
      cpf= ?,
      aprtNumero= ?
WHERE   idInquilino = ;

DELETE 
FROM   Inquilino
WHERE  idInquilino = ?;



###########################################
