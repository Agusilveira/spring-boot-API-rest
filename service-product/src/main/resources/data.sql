
INSERT INTO tbl_categories (id, name, description) VALUES (1, 'shoes', 'This are shoes');
INSERT INTO tbl_categories (id, name, description) VALUES (2, 'books', 'This are books');
INSERT INTO tbl_categories (id, name, description) VALUES (3, 'electronics', 'This are electronics objects');

INSERT INTO tbl_products (id, name, description, stock,buy_price, sell_price,status, create_at,category_id)
VALUES (1, 'adidas Cloudfoam Ultimate','Walk in the air in the black / black CLOUDFOAM ULTIMATE running shoe from ADIDAS',5,178.89,550.00,'CREATED','2018-09-05',1);

INSERT INTO tbl_products (id, name, description, stock,buy_price, sell_price,status, create_at,category_id)
VALUES (2, 'under armour Men ''s Micro G Assert – 7','under armour Men ''Lightweight mesh upper delivers complete breathability . Durable leather overlays for stability ',4,12.5,35.00,'CREATED','2018-09-05',1);


INSERT INTO tbl_products (id, name, description, stock,buy_price, sell_price,status, create_at,category_id)
VALUES (3, 'Spring Boot in Action','under armour Men '' Craig Walls is a software developer at Pivotal and is the author of Spring in Action',12,40.06,150.00,'CREATED','2018-09-05',2);