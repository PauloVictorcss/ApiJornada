create table turistas(

   id bigint not null auto_increment,
   nome varchar(100) not null,
   comentario varchar(100) not null,
   rua varchar(100) not null,
   cep varchar(9) not null,

   primary key(id)

);