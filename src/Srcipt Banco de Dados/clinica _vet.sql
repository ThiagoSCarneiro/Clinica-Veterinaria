CREATE DATABASE clinica_vet;
USE clinica_vet;


CREATE TABLE veterinario(
    registro_vet VARCHAR(10) PRIMARY KEY,
    nome_vet VARCHAR(50),
    
    especialidade_vet VARCHAR(25),
    ativo_vet boolean


);

CREATE TABLE medicamento(
	id_med_pk INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome_med VARCHAR(30),
    descricao_med VARCHAR(100),
    fabricante_med VARCHAR(30),
    data_vali_med DATE
);

CREATE TABLE cliente(
    cpf_cli_pk VARCHAR(14) PRIMARY KEY,
    nome_cli VARCHAR(50),
    sexo_cli VARCHAR(50),
    data_nasc_cli DATE,
    rua_end_cli VARCHAR (200),
    numero_end_cli INTEGER,
    complemento_end_cli VARCHAR(100),
    email_con VARCHAR(30),
    telefone_con VARCHAR(18)
	
);

CREATE TABLE agendamento(
	id_agendamento INTEGER PRIMARY KEY AUTO_INCREMENT,
    data_hora_age DATETIME,
    cancelado_age BOOLEAN,
    concluido_sge BOOLEAN,
    cpf_cli VARCHAR(14),
    FOREIGN KEY (cpf_cli) REFERENCES cliente (cpf_cli_pk),
    registro_vet VARCHAR(10),
    FOREIGN KEY (registro_vet) REFERENCES veterinario(registro_vet)
);

CREATE TABLE atendimento(
	id_ate_pk INTEGER PRIMARY KEY AUTO_INCREMENT,
    data_ate DATE,
    tipo_ate VARCHAR(10),
    descricao_ate VARCHAR(500),
    id_med INTEGER,
    FOREIGN KEY (id_med) REFERENCES medicamento(id_med_pk)
);

CREATE TABLE animal(
	id_ani_pk INTEGER PRIMARY KEY AUTO_INCREMENT,
	nome_ani VARCHAR(30),
	especie_ani VARCHAR(30),
	raca_ani VARCHAR(30),
	sexo_ani VARCHAR(30),
    data_nasc_ani DATE,
	descricao_ani VARCHAR(200),
    cpf_cli_fk VARCHAR(14),
    FOREIGN KEY (cpf_cli_fk) REFERENCES cliente (cpf_cli_pk)
);


ALTER TABLE cliente DROP id_cli_pk;
select * from animal




