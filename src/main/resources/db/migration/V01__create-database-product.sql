CREATE TABLE tb_products (

    id UUID NOT NULL,
	name    VARCHAR(100) NOT NULL,
	price   NUMERIC(38,2) NOT NULL,

    primary key (id)
)