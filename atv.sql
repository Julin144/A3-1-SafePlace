CREATE DATABASE SGE;

USE SGE;

Select * from tb_empresa;

CREATE TABLE tb_empresa(
	idEmpresa INT PRIMARY KEY AUTO_INCREMENT,
    nomeEmpresa VARCHAR(100),
    CNPJ int unique not null,
    CEP int,
	IE int
);

CREATE TABLE tb_local(
	idLocal INT PRIMARY KEY AUTO_INCREMENT,
    nomeLocal VARCHAR(100),
    CEP int,
	metragem int,
    setor varchar(100)
);  

CREATE TABLE tb_fileiras(
	idFileira INT PRIMARY KEY AUTO_INCREMENT,
    idLocal int not null,
    limiteProdutos VARCHAR(100),
    largura double(10,2),
	altura double(10,2),
    disponivel boolean,
    foreign key (idLocal) references tb_local(idLocal) on delete cascade
);

CREATE TABLE tb_produto(
	idProduto INT PRIMARY KEY AUTO_INCREMENT,
    idFileira int not null,
    nomeProduto VARCHAR(100),
    modeloProduto VARCHAR(100),
    pesoProduto VARCHAR(100),
    codigoEAN long,
    foreign key (idFileira) references tb_fileiras(idFileira) on delete cascade
);


INSERT into tb_empresa (nomeEmpresa,CNPJ,CEP,IE) values ('julincorp',143223,234123,12341234),

('vitincorp',143242412,1774234343,123356),

('ericuzincorp',14362786412,17742343,12339546),

('vitincorp',1432587572,178343,1267867856),

('igridincorp',14389762412,1743987343,568356),

('vitincorp',143242666,1774234343,123356),

('erizincorp',14327864330,17742343,12339546),

('vitincorp',1432585678,178343,1267867856),

('igridincorp',1438972415,1743987343,568356),

('igridincorp',143896895,1743987343,568356);


INSERT into tb_local (nomeLocal,CEP,metragem,setor) values ('julincorp',143223,5,1),

('vitincorp',143242412,6,2),

('ericuzincorp',1432786412,7,3),

('vitincorp',143258572,8,4),

('igridincorp',1438972412,9,5),

('vitincorp',1432428412,10,6),

('ericuzincorp',14732786412,11,7),

('vitincorp',1432458572,12,8),

('igridincorp',14389721412,13,9),

('vitincorp',143242412,14,10);


INSERT into tb_fileiras (limiteProdutos,largura,altura,disponivel,idLocal) values ('julincorp',1,5,1,4),

('vitincorp',14,6,0,6),

('ericuzincorp',143,7,1,7),

('vitincorp',72,8,0,8),

('igridincorp',12,9,0,2),

('vitincorp',1,10,1,6),

('ericuzincorp',54,11,1,7),

('vitincorp',12,12,1,9),

('igridincorp',72,13,0,4),

('vitincorp',10,14,1,6);

INSERT into tb_produto (nomeProduto, modeloProduto, pesoProduto, codigoEAN,idFileira ) values ('Chocolate', 'bis', 100, 10000,1),

('Processador', 'intel', 50, 10001,1),

('Placa de Video', '1050 ti', 500, 10002,2),

('Cooler', 'Cool', 10, 10003,2),

('Gabinete', 'AVG100', 700, 10004,3),

('Monitor', 'Samsung', 900, 10005,3),

('Viagra', 'Azul', 1, 10006,4),

('Pilula', 'Vermelha', 2, 10007,4),

('Camisa', 'Nike', 20, 10008,5),

('Jogo', 'FromSoftware', 100, 10009,5);


