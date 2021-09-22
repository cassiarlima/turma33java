-- cria banco de dados
create database db_jogo_gen33;

-- Selecionar o banco de dados
use db_jogo_gen33;

-- Criar primeira tabela classe
create table tb_classes(
	id bigint auto_increment,
    nome varchar(255),
    poder varchar(255),
    energia int,
    primary key (id) 
);
-- Popular dados na tabela
insert into tb_classes (nome, poder, energia) values ("maga", "bola de fogo", 90);
insert into tb_classes (nome, poder, energia) values ("arqueira", "chuva de flechas", 100);
insert into tb_classes (nome, poder, energia) values ("sereia", "agua transbordante", 120);
insert into tb_classes (nome, poder, energia) values ("morte", "sugadora de almas", 150);

select * from tb_classes;

-- criar tabela personagens
create table tb_personagens(
id bigint auto_increment,
nome varchar(20),
genero varchar(20),
raça varchar(20),
ataque int,
defesa int,
primary key (id),
fk_id_classe bigint,
foreign key (fk_id_classe) references tb_classes(id)
);

-- Inserir/popular dados na tabela personagem
insert into  tb_personagens (nome, genero, raça, ataque, defesa, fk_id_classe) 
values ("Fernando","ele", "Jacaré", 20, 350, 1);
insert into  tb_personagens (nome, genero, raça, ataque, defesa, fk_id_classe) 
values ("Maria","ela", "humana", 20, 150, 3);
insert into  tb_personagens (nome, genero, raça, ataque, defesa, fk_id_classe) 
values ("Juanito","elu", "bullywug", 8, 5500, 4);
insert into tb_personagens (nome, genero,raça, ataque, defesa, fk_id_classe)
values ("Cássia", "Menine", "Cobra", 22, 1000, 2);

select * from tb_personagens;

select * from tb_personagens where ataque > 2000;

select * from tb_personagens where vida between 40 and 101;

select * from tb_personagens where nome like "%c%";

-- Um select com inner join entre a tabela classe e personagens 
select * from tb_personagens inner join tb_classes 
on tb_classes.id = tb_personagens.fk_id_classe;

-- Um select onde traga todes os personagens de uma classe especifica ()
select * from tb_personagens inner join tb_classes
on tb_classes.id = tb_personagens.fk_id_classe
where fk_id_classe = 2

