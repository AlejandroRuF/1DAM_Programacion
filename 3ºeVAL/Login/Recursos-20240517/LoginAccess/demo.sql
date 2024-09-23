DROP TABLE IF EXISTS demo.cuentausuario;

CREATE TABLE demo.cuentausuario (
  `id` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(100) DEFAULT NULL,
  `Apellidos` varchar(200) DEFAULT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

UNLOCK TABLES;

LOCK TABLES demo.cuentausuario WRITE;

INSERT INTO demo.cuentausuario (Nombre,Apellidos,username,password) VALUES ('Manu','Romero','demo','12345');
INSERT INTO demo.cuentausuario (Nombre,Apellidos,username,password) VALUES ('Jose','Romero','manu','12345');
INSERT INTO demo.cuentausuario (Nombre,Apellidos,username,password) VALUES ('Pascual','Marin','Pascu','12345');
INSERT INTO demo.cuentausuario (Nombre,Apellidos,username,password) VALUES ('Maria','Alama','maria','12345');
INSERT INTO demo.cuentausuario (Nombre,Apellidos,username,password) VALUES ('Aritz','Macario','aritz','12345');

UNLOCK TABLES;
