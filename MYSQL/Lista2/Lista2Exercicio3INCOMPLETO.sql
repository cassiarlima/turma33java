create database db_cidade_das_frutas;
use db_cidade_das_frutas;

create table tb_categoria (
id bigint auto_increment,
nome varchar(255),
categoria varchar (250),
ativo boolean,
primary key (id)
);


insert into tb_categoria (nome, categoria, ativo) values ("CategoriaRuim","1",true);
insert into tb_categoria (nome, categoria, ativo) values ("CategoriaBomRuim","2",true);
insert into tb_categoria (nome, categoria, ativo) values ("CategoriaBom","3",true);
insert into tb_categoria (nome, categoria, ativo) values ("CategoriaBomBom","4",false);
insert into tb_categoria (nome, categoria, ativo) values ("CategoriaMaisQueBom","5",true);
select * from tb_categoria;

create table tb_produto1 (
id bigint auto_increment,
nome varchar(255) not null,
fornecedor varchar (255) not null,
preco decimal (10.2) not null,

primary key(id),
fk_id_categoria bigint,
foreign key (fk_id_categoria) references tb_categoria(id)
);

insert into tb_produto1 (nome, fornecedor, preco, id_categoria) values ("Mamão","seu Zé", 12.50, 5);
insert into tb_produto1 (nome, fornecedor, preco, id_categoria) values ("Pitaya","Dona Zenilda", 50.55,5);
insert into tb_produto1 (nome, fornecedor, preco, id_categoria)  values ("Maça", "FrutasMonica", 28.00, 4);
insert into tb_produto1 (nome, fornecedor, preco, id_categoria)  values ("Banana","LalaLand", 3.00, 3);
insert into tb_produto1 (nome, fornecedor, preco, id_categoria)  values ("Kiwi","FrutasMeM", 2.50, 1);
insert into tb_produto1 (nome, fornecedor, preco, id_categoria)  values ("Limão","NSN", 12.50,3);
insert into tb_produto1 (nome, fornecedor, preco, id_categoria)  values ("Laranja","0PM", 65.28,5);
insert into tb_produto1 (nome, fornecedor, preco, id_categoria)  values ("Abacate","FrutinhasDelicia", 60.00,5);

select* from tb_produto1;

select* from tb_produtos1 where preco > 50;





