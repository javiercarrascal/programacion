create table Salas(
  numero int(5) primary key

);
create table Peliculas(
	numero_pelicua int(5) primary key
	
);
create table Sesiones(
  numero int(5) PRIMARY KEY,
  numero_sala int(5),
  numero_pelicula int(5),
  constraint fk_sesiones_salas foreign key (numero_sala) 
  references salas(numero),
  constraint fk_sesiones_peliculas foreign key(numero_pelicula)
  referencia peliculas(numero_pelicula)
);
create table Entradas(
	numero_entrada int(5) primary key,
	numero_sesion int(5),
	constraint fk_entradas_sesiones foreign key(numero_sesion)
	references sesiones(numero)
)