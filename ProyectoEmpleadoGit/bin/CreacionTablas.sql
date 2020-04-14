
-- Nombre de la base de datos: Proyecto_empleados

create table departamentos(
  numero int(5) primary key,
  nombre VARCHAR(30),
  localidad VARCHAR(30)
);


create table empleados(
  numero int(5) PRIMARY KEY,
  apellidos VARCHAR(50) NOT NULL,
  oficio VARCHAR(30),
  codigo_postal int(5), 
  fecha_alta DATE, 
  salario int(5),
  comision int(5),
  numero_departamento int(5),
  constraint fk_emple_depart foreign key (numero_departamento) 
  references departamentos(numero)
);