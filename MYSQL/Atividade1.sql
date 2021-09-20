create database db_rh1;
use db_rh1;
create table tb_funcionaries(
id bigint (5) auto_increment,
nome varchar (40) not null,
cargo varchar(40) not null,
idade bigint(2) not null,
salario decimal (7,2),
filhos bigint(2),
primary key (id)
);


insert into tb_funcionaries(nome, cargo, idade, salario, filhos) values ("Cássia","Desenvolvedora Full Stack", 25, 4.200, 0);
insert into tb_funcionaries(nome, cargo, idade, salario, filhos) values ("Larissa","Diretora de marketing", 30, 14.200, 2);
insert into tb_funcionaries(nome, cargo, idade, salario, filhos) values ("Abel","Gerente de RH", 46, 8.600, 0);
insert into tb_funcionaries(nome, cargo, idade, salario, filhos) values ("Fernando","Engenheiro Jr",39, 5.200, 3);
insert into tb_funcionaries(nome, cargo, idade, salario, filhos) values ("João","Assistente de financeiro",19, 1.800, 1);

select * from tb_funcionaries where salario < 2.000;
select * from tb_funcionaries where salario > 2.000;
