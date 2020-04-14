create table depart(
  dept_no int(5) primary key,
  dnombre VARCHAR(30),
  loc VARCHAR(30)
);


create table emple(
  emp_no int(5) PRIMARY KEY,
  apellido VARCHAR(50) NOT NULL,
  oficio VARCHAR(30),
  dir int(5), 
  fecha_alt DATE, 
  salario int(5),
  comision int(5),
  dept_no int(5),
  constraint fk_emple_depart foreign key (dept_no) references depart(dept_no)
);