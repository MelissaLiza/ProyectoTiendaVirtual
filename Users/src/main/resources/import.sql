INSERT INTO usuarios(username,password,firstname,lastname,enabled,email,createat,updateat)VALUES('jose','$2a$10$HfczD9XTDBjRZPTKfl8wU.E8B3TLDC8LxVJGLQRaiAOqe2WX4/Q2K','JOSE HERNAN','LIZA GARAVITO',true,'jose@gmail.com',NOW(),NOW());
INSERT INTO usuarios(username,password,firstname,lastname,enabled,email,createat,updateat)VALUES('melissa','$2a$10$xgK9mVS5Av2Br1iRWICC0OAtQZbnDBS8/R0MnYSc7MiBwSI2OZp1a','MELISSA','LIZA SHERON',true,'melissa@gmail.com',NOW(),NOW());

INSERT INTO roles(description)VALUES('USER');
INSERT INTO roles(description)VALUES('ADMIN');
INSERT INTO roles(description)VALUES('DEVELOPER');

INSERT INTO usuarios_roles(user_id, roles_id)VALUES(1,1);
INSERT INTO usuarios_roles(user_id, roles_id)VALUES(2,1);
INSERT INTO usuarios_roles(user_id, roles_id)VALUES(1,3);
INSERT INTO usuarios_roles(user_id, roles_id)VALUES(2,2);
