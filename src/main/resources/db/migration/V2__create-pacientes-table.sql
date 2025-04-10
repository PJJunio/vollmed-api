
CREATE TABLE pacientes (
    id bigint not null  auto_increment,
    nome varchar(100) not null,
    email varchar(255) not null unique,
    telefone varchar(11) not null unique,
    cpf varchar(11) not null unique,
    logradouro varchar(100) not null,
    bairro varchar(100) not null,
    cep varchar (9) not null,
    numero varchar(20),
    complemento varchar(100),
    cidade varchar(100) not null,
    uf varchar(2) not null,

    primary key (id)
);