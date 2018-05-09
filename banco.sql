CREATE SCHEMA  JaoandMary;

use JaoandMary;

create table Localizacao(
	
    id_localizacao int auto_increment not null,
    endereco Varchar(250),
    cidade varchar (150),
    estado varchar (150),
    pais varchar (150),
    numero int (12),
		
	primary key (id_localizacao)
);

create table Cadastro (

	id_cadastro int auto_increment not null,
    nome varchar(100),
	telefone varchar(12),
	email varchar(50),
    dataAtualizacao date,
    
    primary key (id_cadastro)
);

create table CadastroPJ (

	id_cadastroPJ int auto_increment not null,
    id_cad int,
    cnpj varchar(20),
    razao_social varchar(150),
    
    primary key (id_cadastroPJ),
    foreign key (id_cad) references  cadastro (id_cadastro)
);

create table Lugar(

	id_lugar int auto_increment not null,
    id_cadPJ int,
    id_localizacao int,
    custo double,
    maxPessoas int,
    
    primary key (id_lugar),
    foreign key (id_cadPJ) references cadastroPJ (id_cadastroPJ),
    foreign key (id_localizacao) references localizacao (id_localizacao)
);

create table estrutura(

	id_estrutura int auto_increment not null,
    id_lugar int,
    estrutura varchar (100),
    
    primary key (id_estrutura),
    foreign key (id_lugar) references lugar (id_lugar)
);