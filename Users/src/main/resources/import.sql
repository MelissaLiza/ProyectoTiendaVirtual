INSERT INTO usuarios(username,password,firstname,lastname,email,createat,updateat)VALUES('jose','123456','JOSE HERNAN','LIZA GARAVITO','jose@gmail.com',NOW(),NOW());
INSERT INTO usuarios(username,password,firstname,lastname,email,createat,updateat)VALUES('melissa','654321','MELISSA','LIZA SHERON','melissa@gmail.com',NOW(),NOW());

<<<<<<< HEAD
INSERT INTO 'roles'(description)VALUES ('ROLE_USER');
INSERT INTO 'roles'(description)VALUES ('ROLE_ADMIN');

INSERT INTO 'usuarios_roles(usuario_id, role_id) VALUES (1,1)';
INSERT INTO 'usuarios_roles(usuario_id, role_id) VALUES (2,2)';
INSERT INTO 'usuarios_roles(usuario_id, role_id) VALUES (2,1)';
=======
INSERT INTO roles(description)VALUES('ROLE_USER');
INSERT INTO roles(description)VALUES('ROLE_ADMIN');

INSERT INTO usuarios_roles(user_id, roles_id)VALUES(1,1);
INSERT INTO usuarios_roles(user_id, roles_id)VALUES(2,1);
>>>>>>> 0aa2f93aaeca6af77c9f997b54ebeace5eca34b4
