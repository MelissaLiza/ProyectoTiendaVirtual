INSERT INTO usuarios(username,password,enabled,nombre,apellido,email,createat,updateat)VALUES('jose','123456',TRUE,'JOSE HERNAN','LIZA GARAVITO','joselizag@gmail.com',NOW(),NOW());
INSERT INTO usuarios(username,password,enabled,nombre,apellido,email,createat,updateat)VALUES('melissa','654321',TRUE,'MELISSA','LIZA SHERON','melissa@gmail.com',NOW(),NOW());

INSERT INTO 'roles'(nombre)VALUES ('ROLE_USER');
INSERT INTO 'roles'(nombre)VALUES ('ROLE_ADMIN');

INSERT INTO 'usuarios_roles(usuario_id, role_id) VALUES (1,1)';
INSERT INTO 'usuarios_roles(usuario_id, role_id) VALUES (2,2)';
INSERT INTO 'usuarios_roles(usuario_id, role_id) VALUES (2,1)';