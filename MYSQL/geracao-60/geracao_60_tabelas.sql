create database db_geracao_60;

CREATE TABLE `tb_user` (
	`id_user` bigint NOT NULL AUTO_INCREMENT,
	`user_name` varchar(50) NOT NULL,
	`pass_word` varchar(50) NOT NULL,
	`email` varchar(50) NOT NULL,
	PRIMARY KEY (`id_user`)
);

CREATE TABLE `tb_post` (
	`id_post` bigint NOT NULL AUTO_INCREMENT,
	`title` varchar(255) NOT NULL,
	`description` varchar(255) NOT NULL,
	`date` date  NOT NULL,
	`author` varchar(100) NOT NULL,
	`fk_id_user` bigint NOT NULL,
	`fk_id_theme` bigint NOT NULL,
	PRIMARY KEY (`id_post`)
);

CREATE TABLE `tb_theme` (
	`id_theme` bigint NOT NULL AUTO_INCREMENT,
	`tutorial` varchar(255) NOT NULL,
	`events` varchar(255) NOT NULL,
	`health` varchar(255) NOT NULL,
	PRIMARY KEY (`id_theme`)
);

ALTER TABLE `tb_post` ADD CONSTRAINT `tb_post_fk0` FOREIGN KEY (`fk_id_user`) REFERENCES `tb_user`(`id_user`);

ALTER TABLE `tb_post` ADD CONSTRAINT `tb_post_fk1` FOREIGN KEY (`fk_id_theme`) REFERENCES `tb_theme`(`id_theme`);

insert into tb_user (user_name, pass_word, email)values
("Paulo","velhodocafe","paulo@generation.com.br"),
("Matheus","telepizza","matheus@generation.com.br"),
("Cassia","paodeleite","cassia@generation.com,br"),
("Joice","soulinda123","joice@generation.com.br"),
("Felipe","rocambole","felipe@generation.com.br");

select * from tb_user;


