Insert into BDD_FIREACADEMY.TB01_BLOQUE(ID,TEXTO) values (1,'PARTE GENERAL');

Insert into BDD_FIREACADEMY.TB02_TEMA(ID,TEXTO,BLOQUE_ID) values (1,'Constitución Española',1);

Insert into BDD_FIREACADEMY.TB03_PREGUNTA(ID,TEXTO,TEMA_ID) values (1,'¿Qué artículo de la Constitución está dedicado a  la  irretroactividad  de las  disposiciones  desfavorables o restrictivas  de derechos individuales?',1);

Insert into BDD_FIREACADEMY.TB04_RESPUESTA(ID,TEXTO,CORRECTA,PREGUNTA_ID) values (1,'Artículo 9.2',false,1);
Insert into BDD_FIREACADEMY.TB04_RESPUESTA(ID,TEXTO,CORRECTA,PREGUNTA_ID) values (2,'Artículo 9.3',true,1);
Insert into BDD_FIREACADEMY.TB04_RESPUESTA(ID,TEXTO,CORRECTA,PREGUNTA_ID) values (3,'Artículo 9.4',false,1);
Insert into BDD_FIREACADEMY.TB04_RESPUESTA(ID,TEXTO,CORRECTA,PREGUNTA_ID) values (4,'Artículo 10',false,1);