use springjdbc
--use CNTSECDESA
--go

create table marca(
id smallint primary key,
nombre varchar(40)
)
 
create table camiseta(
id smallint primary key,
numero int,
idMarca smallint  foreign key(idMarca)  references marca(id))

create table equipo(
id smallint primary key,
nombre varchar(40)
)

create table jugador(
id int primary key,
nombre varchar(50),
idEquipo smallint foreign key(idEquipo) references equipo(id),
idCamiseta smallint foreign key(idCamiseta) references camiseta(id))

GO


select * from jugador
select * from marca
select * from camiseta
select * from equipo

INSERT INTO equipo(id,nombre)VALUES(1,'Barcelona')

INSERT INTO camiseta(id,numero,idMarca)VALUES(1,10,3)