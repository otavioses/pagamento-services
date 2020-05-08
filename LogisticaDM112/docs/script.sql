CREATE TABLE Entregador (
	cpf VARCHAR(14) NOT NULL,
	name VARCHAR(256) NOT NULL,
	description VARCHAR(256),
    CONSTRAINT Entregador_pk PRIMARY KEY (cpf)
);

CREATE TABLE Entrega (
	numeroPedido VARCHAR(256) NOT NULL,
	cpfEntrega VARCHAR(14) NOT NULL,
	dataEntrega DATE NOT NULL,
    CONSTRAINT Entrega_PK PRIMARY KEY (numero_pedido)
);

CREATE TABLE Usuario (
	cpf VARCHAR(14) NOT NULL,
	name VARCHAR(256) NOT NULL,
	email VARCHAR(256) NOT NULL,
    CONSTRAINT Usuario_pk PRIMARY KEY (cpf)
);
