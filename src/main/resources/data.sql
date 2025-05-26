-- Active: 1748212865229@@127.0.0.1@14033@model@dbo

INSERT INTO product 
(product_name, product_description, expiration_date, unit_if_measure, product_price, admission_date, current_stock)
    VALUES
    ('Fertilizante NPK 15-15-15', 'Fertilizante granulado balanceado para uso general en cultivos', '2026-12-31', 'KG', 25.50,'2024-05-20', '500'),
    ('Urea 46%', 'Fertilizante nitrogenado de alta concentración para crecimiento vegetativo', '2027-06-30', 'KG', 18.75, '2024-05-15', '1200'),
    ('Fosfato Diamónico (DAP)', 'Fertilizante fosforado y nitrogenado para etapas iniciales del cultivo', '2026-09-15', 'KG', 32.00, '2024-05-22', '750'),
    ('Sulfato de Potasio', 'Fuente de potasio y azufre para mejorar la calidad de frutos', '2027-03-01', 'KG', 28.90, '2024-05-18', '300'),
    ('Abono Orgánico Compostado', 'Mejora la estructura del suelo y aporta nutrientes lentamente', '2025-11-30', 'KG', 12.00, '2024-05-10', '2000');

select * from product
