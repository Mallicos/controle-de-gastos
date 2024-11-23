create table compra (
    id bigint not null auto_increment,
    nomeProduto varchar(50) not null,
    nomeLoja varchar(50) not null,
    preco decimal (10,2) not null,
    parcelas int not null,
    dataCompra date not null,

    primary key (id)
)