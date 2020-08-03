INSERT INTO DISTRITOS(id,nombre)VALUES(1,'San borja');
INSERT INTO DISTRITOS(id,nombre)VALUES(3,'San Juan de Lurigancho');
INSERT INTO DISTRITOS(id,nombre)VALUES(2,'la Victoria');

INSERT INTO PAISES(id,nombre)VALUES(1,'PERU');
INSERT INTO PAISES(id,nombre)VALUES(2,'USA');

INSERT INTO CIUDADES(id,nombre,id_pais)VALUES(1,'GEORGIA',2);
INSERT INTO CIUDADES(id,nombre,id_pais)VALUES(2,'MAIAMI',2);
INSERT INTO CIUDADES(id,nombre,id_pais)VALUES(3,'LIMA',1);


INSERT INTO PATROCINADORES(id,pasaporte,nombre,apellido,telefono,correo,estado,id_ciudad)VALUES(1,'1234567891','jack','canouse','123456789','jack@gmail.com',1,1);
INSERT INTO PATROCINADORES(id,pasaporte,nombre,apellido,telefono,correo,estado,id_ciudad)VALUES(2,'1111111111','Ernan','Sanchez','556655665','Ernan@gmail.com',1,1);
INSERT INTO PATROCINADORES(id,pasaporte,nombre,apellido,telefono,correo,estado,id_ciudad)VALUES(3,'2222222222','Frederick','Castro','55666555','Frederick@gmail.com',1,1);

INSERT INTO TIPO_INSTITUCIONES(id,nombre)VALUES(1,'UNIVERSIDAD');
INSERT INTO TIPO_INSTITUCIONES(id,nombre)VALUES(2,'INSTITUTO');


INSERT INTO INSTITUCIONES(id,nombre,id_tipo_institucion)VALUES(1,'CESAR VALLEJO',1);
INSERT INTO INSTITUCIONES(id,nombre,id_tipo_institucion)VALUES(2,'PRIVADA DEL NORTE',1);
INSERT INTO INSTITUCIONES(id,nombre,id_tipo_institucion)VALUES(3,'RICARDO PALMA',1);
INSERT INTO INSTITUCIONES(id,nombre,id_tipo_institucion)VALUES(4,'MARIA AUXILIADORA',1);
INSERT INTO INSTITUCIONES(id,nombre,id_tipo_institucion)VALUES(5,'TEGNOLOGICA DEL PERU',1);
INSERT INTO INSTITUCIONES(id,nombre,id_tipo_institucion)VALUES(6,'CIBERTEC',2);
INSERT INTO INSTITUCIONES(id,nombre,id_tipo_institucion)VALUES(7,'IDAT',2);
INSERT INTO INSTITUCIONES(id,nombre,id_tipo_institucion)VALUES(8,'CERTUS',2);
INSERT INTO INSTITUCIONES(id,nombre,id_tipo_institucion)VALUES(9,'IPAE',2);
INSERT INTO INSTITUCIONES(id,nombre,id_tipo_institucion)VALUES(10,'SISE',2);

INSERT INTO CARRERAS(id,nombre)VALUES(1,'INGENIERIA DE SISTEMA');
INSERT INTO CARRERAS(id,nombre)VALUES(2,'INGENIERIA DE SOFTWARE');
INSERT INTO CARRERAS(id,nombre)VALUES(3,'INGENIERO CIVIL');
INSERT INTO CARRERAS(id,nombre)VALUES(4,'DERECHO');
INSERT INTO CARRERAS(id,nombre)VALUES(5,'MEDICINA HUMANA');
INSERT INTO CARRERAS(id,nombre)VALUES(6,'INGENIERIA QUIMICA');
INSERT INTO CARRERAS(id,nombre)VALUES(7,'ADMINISTRACION DE EMPRESAS');
INSERT INTO CARRERAS(id,nombre)VALUES(8,'COMPUTACION E INFOMARTICA');
INSERT INTO CARRERAS(id,nombre)VALUES(9,'CONTABILIDAD');
INSERT INTO CARRERAS(id,nombre)VALUES(10,'DISENO GRAFICO');
INSERT INTO CARRERAS(id,nombre)VALUES(11,'DISENO DE INTERIORES');

-- CESAR VALLEJO
INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(1,1,1);
INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(2,1,2);
INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(3,1,3);
INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(4,1,4);
INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(5,1,5);

-- PRIVADA DEL NORTE
INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(6,2,1);
INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(7,2,2);
INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(8,2,3);
INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(9,2,4);
INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(10,2,5);
-- UTP
INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(11,5,1);
INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(12,5,2);
INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(13,5,3);
INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(14,5,4);

-- IDAT INSTITUO

INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(15,7,9);
INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(16,7,10);
INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(17,7,11);
INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(18,7,8);


INSERT INTO ESTUDIANTES (dni , nombre , apellido , sexo , fecha_nac, direccion, telefono,correo,estado,id_distrito)VALUES('47218688' , 'jasson kevin' ,'caceres villar' ,'M' ,'2020-01-01','AV las flores 123','123456789','jasson@gmail.com',1,1);
INSERT INTO ESTUDIANTES (dni , nombre , apellido , sexo , fecha_nac, direccion, telefono,correo,estado,id_distrito)VALUES('78658734' , 'Santiago' ,'Lopez Oropeza' ,'M' ,'2020-01-01','AV las Orquideas 123','123456789','Santiago@gmail.com',1,2);
INSERT INTO ESTUDIANTES (dni , nombre , apellido , sexo , fecha_nac, direccion, telefono,correo,estado,id_distrito)VALUES('89093412' , 'Simon' ,'Gomez Acero' ,'M' ,'2020-01-01','AV Bayovar 123','123456789','Simonn@gmail.com',1,3);



INSERT INTO USUARIOS (nombre,apellido,username,password,enable) values ('Doriz','Bazan','supervisor','$2a$10$nTjqZGFJq2.e6ugdz49h3eDzAaakRoXbEkAaQ9jSFzx2bjvqU9uDG',1);
INSERT INTO USUARIOS (nombre,apellido,username,password,enable) values ('Jasson','caceres','admin','$2a$10$Okg.e5j.aZT3fxF0MdpsweAiTyZbqBvT2KqIuqzQ.Wg/uct8z2c0a',1);
INSERT INTO USUARIOS (nombre,apellido,username,password,enable) values ('jefry','villareal','estudiante1','$2a$10$qlOBFlWzLrGww.NCQcIXpOcVSWoEUYnSSM1M2uKJpaCEkqV/D7iNK',1);


INSERT INTO roles(id,nombre) values (1,'ROLE_SUPERVISOR');
INSERT INTO roles(id,nombre) values (2,'ROLE_ADMIN');
INSERT INTO roles(id,nombre) values (3,'ROLE_ESTUDIANTE');


INSERT INTO usuarios_roles (usuario_id,role_id) value (1,1);
INSERT INTO usuarios_roles (usuario_id,role_id) value (2,2);
INSERT INTO usuarios_roles (usuario_id,role_id) value (2,1);
INSERT INTO usuarios_roles (usuario_id,role_id) value (3,3);

insert into becas (id, estado ,facha_registro ,observacion ,id_carrera ,id_estudiante ,id_institucion ,id_patrocinador ) values (null,'p','2020/10/10','vacio',1,2,5,1);
insert into becas (id, estado ,facha_registro ,observacion ,id_carrera ,id_estudiante ,id_institucion ,id_patrocinador ) values (null,'p','2020/10/10','vacio',1,2,1,null);


