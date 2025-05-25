-- Active: 1748206983038@@127.0.0.1@14033@model@dbo
-- Crear la tabla
CREATE TABLE customer (
    id INT IDENTITY(1,1) PRIMARY KEY,
    dni CHAR(8) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    state CHAR(1) NOT NULL
);


CREATE TABLE product (
    id_product int PRIMARY KEY,
    product_name varchar(100)  NOT NULL,
    product_description varchar(100)  NOT NULL,
    expiration_date date  NOT NULL,
    unit_if_measure varchar(3) NOT NULL,
    product_price decimal(10,2)  NOT NULL,
    admission_date date  NOT NULL,
    current_stock char(100)  NOT NULL,
    active char(1)  DEFAULT 'A'
);
