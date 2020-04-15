create database libros;
use libros;

create table autores(
codigo_autor int(5) not null,
nombre varchar(80) not null,
direccion varchar(80) not null,
telefono varchar(20) not null,
primary key (codigo_autor) );


create table libros(
codigo_libro int (5) not null,
isbn varchar(20) not null,
titulo varchar(80) not null,
editorial varchar(20) not null,
fecha date,
primary key(codigo_libro));

create table autor_libro(
codigo_autor int(5) not null,
codigo_libro int(5) not null,
primary key(codigo_autor, codigo_libro),
foreign key (codigo_autor) references autores (codigo_autor) on update cascade on delete cascade,
foreign key (codigo_libro) references libros (codigo_libro) on update cascade on delete cascade );

