-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: trileros
-- ------------------------------------------------------
-- Server version	8.0.27

--
-- Table structure for table `usuarios`
--
CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  `usuario` varchar(255) DEFAULT NULL,
  `aciertos` int DEFAULT '0',
  `errores` int DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `usuario_UNIQUE` (`usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` VALUES (1,'juan','acuña moreno','juanacuña',0,0),(2,'aleixandre','benitez carmona','aleixandrebenitex',0,0),(3,'gaudi','cebrian crespo','gaudicebrian',0,0),(4,'emanuel rafael','ciobanu','emanuelciobanu',0,0),(5,'artur grygoriy vasyliovych','fytsyk','arturfytsyk',0,0),(6,'miguel','gasco martinez','miguelgasco',0,0),(7,'luis','lopez parra','luislopez',7,18),(8,'pablo','marti cintas','pablomarti',0,0),(9,'yassine','mekkor','yassinemekkor',0,0),(10,'samuel','perez ortiz','samuelperez',0,0),(11,'manel','piernas hernandez','manelpiernas',0,0),(12,'alejandro','plasencia querol','alejandroplasencia',0,0),(13,'pablo','prieto villanova','pabloprieto',0,0),(14,'anxo','rodriguez mendez','anxorodriguez',0,0),(15,'john','sanchez tortajada','johnsanchez',0,0),(16,'hamza','zahiri hajri','hamzazahiri',0,0);
