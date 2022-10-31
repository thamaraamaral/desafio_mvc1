create database bd_projeto_milhas;

use bd_projeto_milhas;

/* Lógico_1: */

CREATE TABLE evento (
    idevento int auto_increment PRIMARY KEY,
    nome varchar(50) NOT NULL,
    data_inicio date NOT NULL,
    data_final date NOT NULL
);

CREATE TABLE grupo (
    idgrupo int auto_increment PRIMARY KEY,
    nome varchar(30),
    quantidade_participantes int,
    fk_idevento int
);

CREATE TABLE participante (
    idparticipante int auto_increment PRIMARY KEY,
    nome varchar(30) NOT NULL,
    quatro_letras char(4) NOT NULL,
    nivel int NOT NULL,
    email varchar(100) NOT NULL UNIQUE,
    fk_idgrupo int
);

CREATE TABLE atividade (
    idatividade int auto_increment PRIMARY KEY,
    nome varchar(50),
    prazo_inicial date NOT NULL,
    prazo_final date NOT NULL,
    fk_idevento int
);
 
ALTER TABLE grupo ADD CONSTRAINT FK_grupo_2
    FOREIGN KEY (fk_idevento)
    REFERENCES evento (idevento);
 
ALTER TABLE participante ADD CONSTRAINT fk_grupo_participante
    FOREIGN KEY (fk_idgrupo)
    REFERENCES grupo (idgrupo);
 
ALTER TABLE atividade ADD CONSTRAINT fk_evento_atividade
    FOREIGN KEY (fk_idevento)
    REFERENCES evento (idevento);

select * from evento;

insert into evento(nome, data_inicio, data_final)values('Master Class', '2022-11-21', '2022-11-23');
select * from evento where data_inicio between '2022-11-31' and '2022-12-30';
update evento set nome='Seminário de planejamentos', data_inicio='2022-11-10', data_final='2022-11-17' where idevento=3;