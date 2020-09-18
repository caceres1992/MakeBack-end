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



insert into estudiantes (  apellido ,cod_estudiante ,correo , direccion,dni ,estado, fecha_nac,nombre,FECHA_REGISTRADA  , sexo, telefono,id_distrito)values ('CACERES' ,'a18100054', 'JASSON@GMAIL.COM' ,'MZ G LOTE 11','47474754' ,1 ,'1992-06-17','JASSON','2020-01-01','M','741258963',1);
insert into estudiantes (  apellido ,cod_estudiante ,correo , direccion,dni ,estado, fecha_nac,nombre ,FECHA_REGISTRADA , sexo, telefono,id_distrito)values ('CASTRO PAIRAZAMAN' ,'a18100014', 'CRAIG@GMAIL.COM' ,'AV LAS FLORES 123','75841258' ,1 ,'1993-05-01','CRAIG KEM','2020-01-01','M','369852147',1);
insert into estudiantes (  apellido ,cod_estudiante ,correo , direccion,dni ,estado, fecha_nac,nombre,FECHA_REGISTRADA  , sexo, telefono,id_distrito)values ('SUAREZ' , 'R185452','ESAUD@GMAIL.COM' ,'AV CAQUETA 485','85214787' ,1 ,'2000-01-01','ESAUD','2020-01-01','M','852852147',1);
insert into estudiantes (  apellido ,cod_estudiante ,correo , direccion,dni ,estado, fecha_nac,nombre ,FECHA_REGISTRADA , sexo, telefono,id_distrito)values ('CASTILLO' ,'Z7489654', 'KIMBERLY@GMAIL.COM' ,'AV LA PAZ 4785','85244485' ,1 ,'1999-05-05','KIMBERLY','2020-01-01','F','112233445',1);




insert into instituciones(nombre,id_tipo_institucion)values ('CESAR VALLEJO',1);
insert into instituciones(nombre,id_tipo_institucion)values ('CESAR VALLEJO',1);
insert into instituciones(nombre,id_tipo_institucion)values ('CESAR VALLEJO',1);
insert into instituciones(nombre,id_tipo_institucion)values ('CESAR VALLEJO',1);
insert into instituciones(nombre,id_tipo_institucion)values ('PRIVADA DEL NORTE',1);
insert into instituciones(nombre,id_tipo_institucion)values ('PRIVADA DEL NORTE',1);
insert into instituciones(nombre,id_tipo_institucion)values ('PRIVADA DEL NORTE',1);
insert into instituciones(nombre,id_tipo_institucion)values ('PRIVADA DEL NORTE',1);
insert into instituciones(nombre,id_tipo_institucion)values ('PRIVADA DEL NORTE',1);
insert into instituciones(nombre,id_tipo_institucion)values ('PRIVADA DEL NORTE',1);
insert into instituciones(nombre,id_tipo_institucion)values ('PRIVADA DEL NORTE',1);


insert into instituciones(nombre,id_tipo_institucion)values ('CIBERTEC',2);
insert into instituciones(nombre,id_tipo_institucion)values ('IDAT',2);
insert into instituciones(nombre,id_tipo_institucion)values ('CIBERTEC',2);
insert into instituciones(nombre,id_tipo_institucion)values ('IDAT',2);
insert into instituciones(nombre,id_tipo_institucion)values ('CIBERTEC',2);
insert into instituciones(nombre,id_tipo_institucion)values ('IDAT',2);

INSERT INTO DETALLE_CARRERAS ( ID_CARRERA ,ID_INSTITUCION) VALUES (5,1)
INSERT INTO DETALLE_CARRERAS ( ID_CARRERA ,ID_INSTITUCION) VALUES (4,7)
INSERT INTO DETALLE_CARRERAS ( ID_CARRERA ,ID_INSTITUCION) VALUES (3,8)

insert into actividades(descripcion,direccion,estado,fecha_registro,nombre) values  ('casa de la Familia Esther','Cerro el Paraiso' ,1,'2019-05-05','Construccion');
insert into actividades(descripcion,direccion,estado,fecha_registro,nombre) values  ('TEMA DEL DIA : DAR GRACIAS','JERUSALEN' ,1,'2019-05-05','Star Kids');

insert into asistencia(salida,comentario,entrada,estado,total_horas,id_actividad,id_estudiante) values  ('18:00','registro de todo los estudiantes','14:00',1,null,1,1);

INSERT INTO BECAS (ESTADO ,FECHA_CULMINADO ,FECHA_REGISTRO ,OBSERVACION ,ID_CARRERA ,ID_ESTUDIANTE ,ID_INSTITUCION ,ID_PATROCINADOR ) VALUES ('A','2015-05-10','2018-10-10','FUE ANULADO POR COSAS BLA BLA BLA',1,1,1,1);
INSERT INTO BECAS (ESTADO ,FECHA_CULMINADO ,FECHA_REGISTRO ,OBSERVACION ,ID_CARRERA ,ID_ESTUDIANTE ,ID_INSTITUCION ,ID_PATROCINADOR ) VALUES ('F','2017-05-10','2018-12-25','TERMINO',2,2,2,2);
INSERT INTO BECAS (ESTADO ,FECHA_CULMINADO ,FECHA_REGISTRO ,OBSERVACION ,ID_CARRERA ,ID_ESTUDIANTE ,ID_INSTITUCION ,ID_PATROCINADOR ) VALUES ('A','2019-12-20','2018-10-30','DEJO DE ESTUDIAR',3,1,2,NULL);
INSERT INTO BECAS (ESTADO ,FECHA_CULMINADO ,FECHA_REGISTRO ,OBSERVACION ,ID_CARRERA ,ID_ESTUDIANTE ,ID_INSTITUCION ,ID_PATROCINADOR ) VALUES ('F','2018-12-12','2018-10-30','TERMINO',3,1,2,NULL);

