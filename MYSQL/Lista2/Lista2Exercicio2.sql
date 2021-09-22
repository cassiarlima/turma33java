create database db_pizzaria_legal;
use db_pizzaria_legal;

create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria (
id bigint auto_increment,
nome varchar (200),
produto varchar (20),
borda boolean,
primary key (id)
);

select * from tb_categoria;

-- Popule esta tabela Categoria com até 5 dados.
insert into tb_categoria (nome, produto, borda) values (" Pizza doce ", "caixa para 6", true);
insert into tb_categoria (nome, produto, borda) values (" Pizza salgada ", "caixa para 8", true);
insert into tb_categoria (nome, produto, borda) values (" Pizza metro ", "caixa para 30", true);
insert into tb_categoria (nome, produto, borda) values (" Pizza broto ", "caixa para 4", true);
insert into tb_categoria (nome, produto, borda) values (" Pizza familia ", "caixa para 16", true);


-- Crie uma tabela de tb_pizza e utilizando a habilidade de abstração e determine 5 atributos 
-- relevantes dos tb_produto para se trabalhar com o serviço dessa pizzaria(não esqueça de criar 
-- a foreign key de tb_categoria nesta tabela).

create table tb_pizza (
id bigint auto_increment,
nome varchar (100),
recheio varchar (100),
molho varchar (100),
borda varchar (50),
preco decimal (10,2),
primary key (id),
fk_id_categoria bigint,
foreign key (fk_id_categoria) references tb_categoria(id)
);
-- Popule esta tabela pizza com até 8 dados.
insert into tb_pizza (nome, recheio, molho, especial, preco, fk_id_categoria ) 
	values ("Mussarelinda", "queijo", "molho de tomate", "com catupiry", 29.50, 4);
    insert into tb_pizza (nome, recheio, molho, especial, preco, fk_id_categoria) 
	values ("NoVeggie", "carne", "molho de tomate", " com cheddar", 48.50, 2);
    insert into tb_pizza (nome, recheio, molho, especial, preco, fk_id_categoria) 
	values ("YesVeggie", "brocolis", "molho branco", " com catupiry", 85.20, 3);
    insert into tb_pizza (nome, recheio, molho, especial, preco, fk_id_categoria) 
	values ("Nordestina", "carneseca", "molho de pimenta", "sem borda", 75.50, 5);
    insert into tb_pizza (nome, recheio, molho, especial, preco, fk_id_categoria) 
	values ("Franguinho", "frango", "molho de tomate", "sem cheddar", 55.60, 4);
    insert into tb_pizza (nome, recheio, molho, especial, preco, fk_id_categoria) 
	values ("ToDeDieta", "ricota com peito de peru", "molho branco", "mussarela", 150.00, 3);
    insert into tb_pizza (nome, recheio, molho, especial, preco, fk_id_categoria) 
	values ("chocotine", "chocolate", "sem molho de tomate", "com pó de ovomaltine", 98.00, 1);
    insert into tb_pizza (nome, recheio, molho, especial, preco, fk_id_categoria) 
	values ("Moranguetes", "morango", "sem molho", "com chocolate", 95.00, 1);
    
    select * from tb_pizza;
    
   -- Faça um select que retorne os Produtos com o valor maior do que 45 reais.
   
   select * from tb_pizza where preco > 45;
   
   -- Faça um select trazendo  os Produtos com valor entre 29 e 60 reais.
select * from tb_pizza where preco between 29 and 60;

-- Faça um select  utilizando LIKE buscando os Produtos com a letra C.
select * from tb_pizza where nome like "%c%";

-- Faça um um select com Inner join entre  tabela categoria e pizza.
select * from tb_pizza inner join tb_categoria 
on tb_categoria.id = tb_pizza.fk_id_categoria;

-- Faça um select onde traga todos os Produtos de uma categoria específica 
-- (exemplo todos os produtos que são pizza doce).

select * from tb_pizza inner join tb_categoria
on tb_categoria.id = tb_pizza.fk_id_categoria
where fk_id_categoria = 1



