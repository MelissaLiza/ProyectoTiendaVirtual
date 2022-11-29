INSERT INTO usuarios(username,password,firstname,lastname,email,createat,updateat)VALUES('jose','123456','JOSE HERNAN','LIZA GARAVITO','jose@gmail.com',NOW(),NOW());
INSERT INTO usuarios(username,password,firstname,lastname,email,createat,updateat)VALUES('melissa','654321','MELISSA','LIZA SHERON','melissa@gmail.com',NOW(),NOW());

INSERT INTO roles(description)VALUES('ROLE_USER');
INSERT INTO roles(description)VALUES('ROLE_ADMIN');

INSERT INTO usuarios_roles(user_id, roles_id)VALUES(1,1);
INSERT INTO usuarios_roles(user_id, roles_id)VALUES(2,1);
