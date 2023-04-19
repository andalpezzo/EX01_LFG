
DROP table IF EXISTS games cascade;
DROP table IF EXISTS parties cascade;
DROP table IF EXISTS usuarios cascade;
DROP table IF EXISTS mensajes cascade;

create table games(
	id int auto_increment,
	nombre varchar(250),
    descripcion varchar(250),
    dificultad varchar(250)
);

create table parties(
	id int auto_increment,
	nombre varchar(250),
    game integer,
    FOREIGN KEY (game) REFERENCES games(id)
	ON DELETE CASCADE ON UPDATE CASCADE
);

create table usuarios(
	id int auto_increment,
	username varchar(250),
    pass varchar(250),
	email varchar(250),
	telefono integer,
    userstream varchar(250),
    party integer,
	FOREIGN KEY (party) REFERENCES parties(id)
	ON DELETE CASCADE ON UPDATE CASCADE
);

create table mensajes(
	id int auto_increment,
	texto varchar(250),
    usuario integer,
    party integer,
    FOREIGN KEY (usuario) REFERENCES usuarios(id)
	ON DELETE CASCADE ON UPDATE CASCADE
);

insert into games (nombre,descripcion,dificultad)values('Fornite','Es un juego de tipo batalla real en el que compiten hasta cien jugadores en solitario, dúos, tríos o escuadrones','Media');
insert into games (nombre,descripcion,dificultad)values('Among Us','Es un juego multijugador que permite que un máximo de 10 jugadores asuman los roles de Compañero de tripulación o Impostor. El objetivo del juego es que los Crewmates identifiquen a los jugadores que son los impostores en el juego.','Facil');
insert into parties (nombre,game)values('Bootcamp_party',1);
insert into parties (nombre,game)values('Sala1',2);
insert into usuarios (username,pass,email,telefono,userstream,party)values('Andalpezzo','Contraseñasegura.1','andrea@email.com',691123456,'Andreita97',1);
insert into usuarios (username,pass,email,telefono,userstream,party)values('Jose_the_best','Contraseñasegura.2','jose@email.com',691654321,'Josemarin777',2);
insert into mensajes (texto,usuario)values('Hola!',1);
insert into mensajes (texto,usuario)values('¿Alguien para jugar?',2);


