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
	foreign key fk_Paciente_Distrito(chr_distcodigo)
	references Distrito(chr_distcodigo)
	on delete restrict
	on update cascade,
	foreign key fk_Paciente_Padre(chr_padrdni)
	references Padre(chr_padrdni)
	on update cascade
	on delete restrict
);

create table Categoria (
	chr_catecodigo char(8) not null,
	vch_catenombre varchar(40) not null,
	vch_catedescripcion varchar(40) not null,
	primary key (chr_catecodigo)
);

create table Rango (
	chr_rangcodigo char(8) not null,
	vch_rangnombre varchar(40) not null,
	vch_rangdescripcion varchar(40) not null,
	primary key (chr_rangcodigo)
);

create table Vacuna (
	chr_vacucodigo char(8) not null,
	vch_vacunombre varchar(40) not null,
	chr_rangcodigo char(8),
	chr_catecodigo char(8),
	primary key (chr_vacucodigo),
	foreign key fk_Vacuna_Rango(chr_rangcodigo)
	references Rango (chr_rangcodigo)
	on delete no action
	on update no action,
	foreign key fk_Vacuna_Categoria(chr_catecodigo)
	references Categoria (chr_catecodigo)
	on delete no action
	on update no action
);
create table Enfermera (
	chr_enfecodigo char(15) not null,
	vch_enfenombre varchar(40) not null,
	vch_enfedireccion varchar(40) not null,
	chr_enfeTelefono char(12) not null,
	primary key (chr_enfecodigo),
);

create table Paciente_Enfermera (
	chr_pacicodigo not null,
	chr_vacucodigo not null,
	chr_enfecodigo not null,
	chr_pomecodigo not null,
	dat_pavafecha not null,
	vch_pavadosis not null,
	foreign key fk_PacienteVacuna_Paciente (chr_pacicodigo)
	references Paciente (chr_pacicodigo)
	on delete restrict
	on update cascade,
	foreign key fk_PacienteVacuna_Vacuna (chr_vacucodigo)
	references Vacuna (chr_vacucodigo)
	on delete restrict
	on update cascade,
	foreign key fk_PacienteVacuna_PostaMedica (chr_pomecodigo)
	references PostaMedica (chr_pomecodigo)
	on delete restrict
	on update cascade,
	foreign key fk_PacienteVacuna_Enfermera (chr_enfecodigo)
	references Enfermera (chr_enfecodigo)
	on delete restrict
	on update cascade
);
