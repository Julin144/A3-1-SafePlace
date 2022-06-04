CREATE DATABASE SAFEPLACE;
#DROP DATABASE SAFEPLACE;

USE SAFEPLACE;

#DROP TABLE Condominio;
CREATE TABLE Condominio(
    idCondominio INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    endereco VARCHAR(200) UNIQUE NOT NULL
);

#DROP TABLE Usuario;
CREATE TABLE Usuario(
    idUsuario INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    login VARCHAR(100) UNIQUE NOT NULL,
    senha VARCHAR(50) NOT NULL,
    tipo  VARCHAR(20) NULL,
    
    CONSTRAINT CHK_Person CHECK (tipo='ADMIN' OR tipo='USER')
);

#DROP TABLE Area;
CREATE TABLE Area(
  idArea INT PRIMARY KEY AUTO_INCREMENT,
  idCondominio INT NOT NULL,
  descricao VARCHAR(200),
  dosesRequisitadas INT,
  
  FOREIGN KEY (idCondominio) REFERENCES Condominio (idCondominio)
);

#DROP TABLE Inquilino;
CREATE TABLE Inquilino(
    idInquilino INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    cpf VARCHAR(14) UNIQUE NOT NULL,
    aprtNumero INT
);

#DROP TABLE Vacina;
CREATE TABLE Vacina(
    idVacina INT PRIMARY KEY AUTO_INCREMENT,
    idInquilino INT NOT NULL,
    tipo VARCHAR(19),
    qtdDose INT,
    
    FOREIGN KEY (idInquilino) REFERENCES Inquilino (idInquilino)
);

#DROP TABLE AcessoArea;
CREATE TABLE AcessoArea(
    idAcesso INT PRIMARY KEY AUTO_INCREMENT,
    idInquilino INT,
    idArea INT,
    hrIni DATETIME,
    hrFim DATETIME,
    FOREIGN KEY (idInquilino) REFERENCES inquilino (idInquilino),
    FOREIGN KEY (idArea) REFERENCES Area (idArea)
);