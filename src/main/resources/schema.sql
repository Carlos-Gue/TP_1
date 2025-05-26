-- Active: 1748212865229@@127.0.0.1@14033@model@dbo

CREATE TABLE product (
    id_product int IDENTITY(1,1) PRIMARY KEY,
    product_name varchar(100)  NOT NULL,
    product_description varchar(100)  NOT NULL,
    expiration_date date  NOT NULL,
    unit_if_measure varchar(3) NOT NULL,
    product_price decimal(10,2)  NOT NULL,
    admission_date date  NOT NULL,
    current_stock char(100)  NOT NULL,
    active char(1)  DEFAULT 'A'
);


select * from product