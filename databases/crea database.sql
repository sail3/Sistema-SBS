create database geka_r;

use geka_r;

create table Distrito(
	chr_distcodigo char(10) not null,
	vch_distnombre varchar(40) not null,
	primary key(chr_distcodigo)
);

create table PostaMedica(
	chr_pomecodigo char(10) not null,
	vch_nombre varchar(40) not null,
	chr_distcodigo char(10) not null,
	primary key (chr_pomecodigo),
	foreign key fk_posta_distrito(chr_distcodigo)
	references Distrito(chr_distcodigo)
);

create table Padre(
	chr_padrdni char(8) not null,
	vch_padrnombre varchar(40) not null,
	vch_padrmaterno varchar(40) not null,
	vch_padrpaterno varchar(40) not null,
	primary key(chr_padrdni)
);

create table Paciente (
	chr_pacicodigo char(10) not null,
	chr_pacidni char(8) not null,
	vch_pacinombre varchar(60) not null,
	vch_pacipaterno varchar(40) not null,
	vch_pacimaterno varchar(40) not null,
	smi_paciedad smallint not null,
	dat_pacinacimiento date not null,
	vch_pacidireccion varchar(60) not null,
	chr_distcodigo char(10) not null,
	chr_padrdni char(8) not null,
	primary key (chr_pacicodigo),
	foreign key fk_Paciente_distrito(chr_distcodigo)
	references Distrito(chr_distcodigo)
	on delete restrict
	on update cascade,
	foreign key fk_Paciente_Padre(chr_padrdni)
	references Padre(chr_padrdni)
	on update cascade
	on delete restrict
);