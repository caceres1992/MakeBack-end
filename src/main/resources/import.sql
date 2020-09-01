INSERT INTO distritos(id,nombre)values (1,'San borja');
INSERT INTO distritos(id,nombre)values (3,'San Juan de Lurigancho');
INSERT INTO distritos(id,nombre)values (2,'la Victoria');

INSERT INTO paises(id,nombre)values (1,'PERU');
INSERT INTO paises(id,nombre)values (2,'USA');

INSERT INTO ciudades(id,nombre,id_pais)values (1,'GEORGIA',2);
INSERT INTO ciudades(id,nombre,id_pais)values (2,'MAIAMI',2);
insert into ciudades(id,nombre,id_pais)values (3,'LIMA',1);


insert into patrocinadores(id,pasaporte,nombre,apellido,telefono,correo,estado,id_ciudad)values (1,'1234567891','jack','canouse','123456789','jack@gmail.com',1,1);
insert into patrocinadores(id,pasaporte,nombre,apellido,telefono,correo,estado,id_ciudad)values (2,'1111111111','Ernan','Sanchez','556655665','Ernan@gmail.com',1,1);
insert into patrocinadores(id,pasaporte,nombre,apellido,telefono,correo,estado,id_ciudad)values (3,'2222222222','Frederick','Castro','55666555','Frederick@gmail.com',1,1);

insert into tipo_instituciones(id,nombre)values (1,'UNIVERSIDAD');
insert into tipo_instituciones(id,nombre)values (2,'INSTITUTO');





#H2
# INSERT INTO instituciones(id,nombre,id_carrera,id_tipo_institucion)VALUES(1,'CESAR VALLEJO',1,1);
# INSERT INTO instituciones(id,nombre,id_carrera,id_tipo_institucion)VALUES(2,'CESAR VALLEJO',1,2);
# INSERT INTO instituciones(id,nombre,id_carrera,id_tipo_institucion)VALUES(3,'CESAR VALLEJO',1,4);
# INSERT INTO instituciones(id,nombre,id_carrera,id_tipo_institucion)VALUES(4,'CESAR VALLEJO',1,5);
# INSERT INTO instituciones(id,nombre,id_carrera,id_tipo_institucion)VALUES(5,'PRIVADA DEL NORTE',1,2);
# INSERT INTO instituciones(id,nombre,id_carrera,id_tipo_institucion)VALUES(6,'PRIVADA DEL NORTE',1,4);
# INSERT INTO instituciones(id,nombre,id_carrera,id_tipo_institucion)VALUES(7,'PRIVADA DEL NORTE',1,5);
# INSERT INTO instituciones(id,nombre,id_carrera,id_tipo_institucion)VALUES(8,'PRIVADA DEL NORTE',1,1);
# INSERT INTO instituciones(id,nombre,id_carrera,id_tipo_institucion)VALUES(9,'PRIVADA DEL NORTE',1,11);
# INSERT INTO instituciones(id,nombre,id_carrera,id_tipo_institucion)VALUES(10,'PRIVADA DEL NORTE',1,8);
# INSERT INTO instituciones(id,nombre,id_carrera,id_tipo_institucion)VALUES(11,'PRIVADA DEL NORTE',1,9);
#
#
# INSERT INTO instituciones(id,nombre,id_carrera,id_tipo_institucion)VALUES(12,'CIBERTEC',2,8);
# INSERT INTO instituciones(id,nombre,id_carrera,id_tipo_institucion)VALUES(13,'IDAT',2,8);
# INSERT INTO instituciones(id,nombre,id_carrera,id_tipo_institucion)VALUES(14,'CIBERTEC',2,11);
# INSERT INTO instituciones(id,nombre,id_carrera,id_tipo_institucion)VALUES(15,'IDAT',2,10);
# INSERT INTO instituciones(id,nombre,id_carrera,id_tipo_institucion)VALUES(16,'CIBERTEC',2,9);
# INSERT INTO instituciones(id,nombre,id_carrera,id_tipo_institucion)VALUES(17,'IDAT',2,9);
#H2

insert into carreras(nombre)values ('INGENIERIA DE SISTEMA');
insert into carreras(nombre)values ('INGENIERIA DE SOFTWARE');
insert into carreras(nombre)values ('INGENIERO CIVIL');
insert into carreras(nombre)values ('DERECHO');
insert into carreras(nombre)values ('MEDICINA HUMANA');
insert into carreras(nombre)values ('INGENIERIA QUIMICA');
insert into carreras(nombre)values ('ADMINISTRACION DE EMPRESAS');
insert into carreras(nombre)values ('COMPUTACION E INFOMARTICA');
insert into carreras(nombre)values ('CONTABILIDAD');
insert into carreras(nombre)values ('DISENO GRAFICO');
insert into carreras(nombre)values ('DISENO DE INTERIORES');

# -- CESAR VALLEJO
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(1,1,1);
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(2,1,2);
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(3,1,3);
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(4,1,4);
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(5,1,5);
#
# -- PRIVADA DEL NORTE
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(6,2,1);
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(7,2,2);
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(8,2,3);
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(9,2,4);
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(10,2,5);
# -- UTP
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(11,5,1);
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(12,5,2);
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(13,5,3);
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(14,5,4);
#
# -- IDAT INSTITUO
#
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(15,7,9);
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(16,7,10);
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(17,7,11);
# INSERT INTO DETALLE_CARRERAS(id,id_institucion,id_carrera)VALUES(18,7,8);


insert into estudiantes (  apellido ,cod_estudiante ,correo , direccion,dni ,estado, fecha_nac,nombre , sexo, telefono,id_distrito)values ('CACERES' ,'a18100054', 'JASSON@GMAIL.COM' ,'MZ G LOTE 11','47474754' ,1 ,'2020-01-01','JASSON','M','741258963',1);
insert into estudiantes (  apellido ,cod_estudiante ,correo , direccion,dni ,estado, fecha_nac,nombre , sexo, telefono,id_distrito)values ('CASTRO PAIRAZAMAN' ,'a18100014', 'CRAIG@GMAIL.COM' ,'AV LAS FLORES 123','75841258' ,1 ,'2020-02-02','CRAIG KEM','M','369852147',1);
insert into estudiantes (  apellido ,cod_estudiante ,correo , direccion,dni ,estado, fecha_nac,nombre , sexo, telefono,id_distrito)values ('SUAREZ' , 'R185452','ESAUD@GMAIL.COM' ,'AV CAQUETA 485','85214787' ,1 ,'2005-01-01','ESAUD','M','852852147',1);
insert into estudiantes (  apellido ,cod_estudiante ,correo , direccion,dni ,estado, fecha_nac,nombre , sexo, telefono,id_distrito)values ('CASTILLO' ,'Z7489654', 'KIMBERLY@GMAIL.COM' ,'AV LA PAZ 4785','85244485' ,1 ,'1999-05-05','KIMBERLY','F','112233445',1);


# INSERT INTO USUARIOS (nombre,apellido,username,password,enable) values ('Doriz','Bazan','supervisor','$2a$10$nTjqZGFJq2.e6ugdz49h3eDzAaakRoXbEkAaQ9jSFzx2bjvqU9uDG',1);
# INSERT INTO USUARIOS (nombre,apellido,username,password,enable) values ('Jasson','caceres','admin','$2a$10$Okg.e5j.aZT3fxF0MdpsweAiTyZbqBvT2KqIuqzQ.Wg/uct8z2c0a',1);
# INSERT INTO USUARIOS (nombre,apellido,username,password,enable) values ('jefry','villareal','estudiante1','$2a$10$qlOBFlWzLrGww.NCQcIXpOcVSWoEUYnSSM1M2uKJpaCEkqV/D7iNK',1);
#

insert into roles(id,nombre) values  (1,'ROLE_SUPERVISOR');
insert into roles(id,nombre) values  (2,'ROLE_ADMIN');
insert into roles(id,nombre) values  (3,'ROLE_ESTUDIANTE');


insert into usuarios_roles (usuario_id,role_id) values (1,1);
insert into usuarios_roles (usuario_id,role_id) values (2,2);
insert into usuarios_roles (usuario_id,role_id) values (2,1);
insert into usuarios_roles (usuario_id,role_id) values (3,3);


#
insert into instituciones(nombre,id_carrera,id_tipo_institucion)values ('CESAR VALLEJO',1,1);
insert into instituciones(nombre,id_carrera,id_tipo_institucion)values ('CESAR VALLEJO',2,1);
insert into instituciones(nombre,id_carrera,id_tipo_institucion)values ('CESAR VALLEJO',4,1);
insert into instituciones(nombre,id_carrera,id_tipo_institucion)values ('CESAR VALLEJO',5,1);
insert into instituciones(nombre,id_carrera,id_tipo_institucion)values ('PRIVADA DEL NORTE',2,1);
insert into instituciones(nombre,id_carrera,id_tipo_institucion)values ('PRIVADA DEL NORTE',4,1);
insert into instituciones(nombre,id_carrera,id_tipo_institucion)values ('PRIVADA DEL NORTE',5,1);
insert into instituciones(nombre,id_carrera,id_tipo_institucion)values ('PRIVADA DEL NORTE',1,1);
insert into instituciones(nombre,id_carrera,id_tipo_institucion)values ('PRIVADA DEL NORTE',11,1);
insert into instituciones(nombre,id_carrera,id_tipo_institucion)values ('PRIVADA DEL NORTE',8,1);
insert into instituciones(nombre,id_carrera,id_tipo_institucion)values ('PRIVADA DEL NORTE',9,1);


insert into instituciones(nombre,id_carrera,id_tipo_institucion)values ('CIBERTEC',8,2);
insert into instituciones(nombre,id_carrera,id_tipo_institucion)values ('IDAT',8,2);
insert into instituciones(nombre,id_carrera,id_tipo_institucion)values ('CIBERTEC',11,2);
insert into instituciones(nombre,id_carrera,id_tipo_institucion)values ('IDAT',10,2);
insert into instituciones(nombre,id_carrera,id_tipo_institucion)values ('CIBERTEC',9,2);
insert into instituciones(nombre,id_carrera,id_tipo_institucion)values ('IDAT',9,2);


insert into actividades(descripcion,direccion,estado,fecha_registro,nombre) values  ('casa de la Familia Esther','Cerro el Paraiso' ,1,'2019-05-05','Construccion');
insert into actividades(descripcion,direccion,estado,fecha_registro,nombre) values  ('TEMA DEL DIA : DAR GRACIAS','JERUSALEN' ,1,'2019-05-05','Star Kids');

insert into asistencia(salida,comentario,entrada,estado,total_horas,id_actividad,id_estudiante) values  ('18:00','registro de todo los estudiantes','14:00',1,null,1,1);

insert into becas ( estado ,facha_registro ,observacion ,id_carrera ,id_estudiante ,id_institucion ,id_patrocinador ) values  ('p','2020/10/10','vacio',1,2,5,1);
insert into becas ( estado ,facha_registro ,observacion ,id_carrera ,id_estudiante ,id_institucion ,id_patrocinador ) values  ('p','2020/10/10','vacio',1,2,1,1);d

