-- Creation of product table
CREATE TABLE IF NOT EXISTS product (
  product_id INT NOT NULL,
  name varchar(250) NOT NULL,
  status varchar(250) NOT NULL,
  error varchar(2500) NOT NULL,
  PRIMARY KEY (product_id)
);

INSERT INTO product VALUES(0, 'PRODUCT0', 'NEW', '');
INSERT INTO product VALUES(1, 'PRODUCT1', 'NEW', '');
INSERT INTO product VALUES(2, 'PRODUCT2', 'NEW', '');
INSERT INTO product VALUES(3, 'PRODUCT3', 'NEW', '');
INSERT INTO product VALUES(4, 'PRODUCT4', 'NEW', '');