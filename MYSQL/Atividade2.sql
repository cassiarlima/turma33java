create database db_ecommerce;
use db_ecommerce;

create table tb_produtosComesticos(
	id bigint(5) auto_increment,
	nome varchar (30) not null,
	marca varchar (15) not null,
	preco decimal (7,2) not null,
	primary key (id)

);

 insert into tb_produtosComesticos(nome, marca, preco) values ("Base matte","Boca Rosa", 50.00);
 insert into tb_produtosComesticos(nome, marca, preco) values ("Base matte caixa 10 un","Mary Kay", 1000.00);
 insert into tb_produtosComesticos(nome, marca, preco) values ("Batom Vermelho caixa 15 un","Boca Rosa", 1550.00);
 insert into tb_produtosComesticos(nome, marca, preco) values ("Gloss un","Chanel", 500.50);
 insert into tb_produtosComesticos(nome, marca, preco) values ("Rímel golden","M.A.C", 3550.99);
 insert into tb_produtosComesticos(nome, marca, preco) values ("Lápis de olho caixa 50 un","Urban Decay", 8550.62);
 insert into tb_produtosComesticos(nome, marca, preco) values ("Pó compacto cor 2 un","Yves", 50.00);
 insert into tb_produtosComesticos(nome, marca, preco) values ("Base matte cor 1 promoção","lancome", 10.50);
 
 select * from tb_produtosComesticos where preco > 500;
 select * from tb_produtosComesticos where preco <  500;
 
 update tb_produtosComesticos set id =2
	where id = 5;

    
    

 