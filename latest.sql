-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: booster
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `movimientoprincipal`
--

DROP TABLE IF EXISTS `movimientoprincipal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movimientoprincipal` (
  `idMovimientoprincipal` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `rm` decimal(5,2) DEFAULT NULL,
  `pesoMin` decimal(5,2) DEFAULT NULL,
  `pesoMax` decimal(5,2) DEFAULT NULL,
  `pocentajeMin` int DEFAULT NULL,
  `porcentajeMax` int DEFAULT NULL,
  `serieMin` int DEFAULT NULL,
  `serieMax` int DEFAULT NULL,
  `repsTotalMin` int DEFAULT NULL,
  `repsTotalMax` int DEFAULT NULL,
  `repsOptima` int DEFAULT NULL,
  `idWod` int NOT NULL,
  `idUsuario` int NOT NULL,
  PRIMARY KEY (`idMovimientoprincipal`,`idWod`,`idUsuario`),
  KEY `fk_EjercicioMovimientoPrincipal_Wod1_idx` (`idWod`),
  KEY `fk2_idx` (`idUsuario`),
  CONSTRAINT `fk1` FOREIGN KEY (`idWod`) REFERENCES `wod` (`idWod`),
  CONSTRAINT `fk2` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimientoprincipal`
--

LOCK TABLES `movimientoprincipal` WRITE;
/*!40000 ALTER TABLE `movimientoprincipal` DISABLE KEYS */;
INSERT INTO `movimientoprincipal` VALUES (16,'Snatch',90.00,67.00,78.00,50,60,0,0,10,20,16,1,1),(17,'Clean',90.00,67.00,78.00,50,60,0,0,10,20,16,2,1),(18,'Clean',90.00,67.00,78.00,50,60,0,0,10,20,16,2,1),(19,'Clean',90.00,67.00,78.00,50,60,0,0,10,20,16,2,1),(20,'Clean',90.00,67.00,78.00,50,60,0,0,10,20,16,2,2);
/*!40000 ALTER TABLE `movimientoprincipal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pullmovimientoprincipal`
--

DROP TABLE IF EXISTS `pullmovimientoprincipal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pullmovimientoprincipal` (
  `idPullmovimientoprincipal` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `rm` decimal(5,2) DEFAULT NULL,
  `pesoMin` decimal(5,2) DEFAULT NULL,
  `pesoMax` decimal(5,2) DEFAULT NULL,
  `pocentajeMin` int DEFAULT NULL,
  `porcentajeMax` int DEFAULT NULL,
  `serieMin` int DEFAULT NULL,
  `serieMax` int DEFAULT NULL,
  `repsTotalMin` int DEFAULT NULL,
  `repsTotalMax` int DEFAULT NULL,
  `repsOptima` int DEFAULT NULL,
  `idWod` int NOT NULL,
  `idUsuario` int NOT NULL,
  PRIMARY KEY (`idPullmovimientoprincipal`,`idWod`,`idUsuario`),
  KEY `fk_EjercicioPullMovimientoPrincipal_Wod1_idx` (`idWod`,`idUsuario`),
  KEY `fk2_idx` (`idUsuario`),
  KEY `fk2_pull` (`idUsuario`),
  CONSTRAINT `fk1pull` FOREIGN KEY (`idWod`) REFERENCES `wod` (`idWod`),
  CONSTRAINT `fk2pull` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pullmovimientoprincipal`
--

LOCK TABLES `pullmovimientoprincipal` WRITE;
/*!40000 ALTER TABLE `pullmovimientoprincipal` DISABLE KEYS */;
INSERT INTO `pullmovimientoprincipal` VALUES (1,'Panda Pull',90.00,30.00,46.00,40,50,3,7,14,20,16,1,1),(2,'Panda Pull',90.00,30.00,46.00,40,50,3,7,14,20,16,1,2),(3,'Snatch',90.00,67.00,78.00,50,60,0,0,10,20,16,3,1),(4,'Snatch',90.00,67.00,78.00,50,60,0,0,10,20,16,3,1);
/*!40000 ALTER TABLE `pullmovimientoprincipal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rmcleanjerk`
--

DROP TABLE IF EXISTS `rmcleanjerk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rmcleanjerk` (
  `idRmCleanJerk` int NOT NULL AUTO_INCREMENT,
  `peso` decimal(5,2) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `idUsuario` int NOT NULL,
  PRIMARY KEY (`idRmCleanJerk`,`idUsuario`),
  KEY `fk_RmCleanJerk_Usuario1_idx` (`idUsuario`),
  CONSTRAINT `fk_RmCleanJerk_Usuario1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rmcleanjerk`
--

LOCK TABLES `rmcleanjerk` WRITE;
/*!40000 ALTER TABLE `rmcleanjerk` DISABLE KEYS */;
INSERT INTO `rmcleanjerk` VALUES (1,90.00,'2020-02-02',1),(2,95.00,'2021-08-12',1),(3,109.00,'2022-01-02',1),(4,60.00,'2021-02-02',2),(5,67.00,'2022-03-02',2),(7,46.00,'2020-06-02',2);
/*!40000 ALTER TABLE `rmcleanjerk` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rmsnatch`
--

DROP TABLE IF EXISTS `rmsnatch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rmsnatch` (
  `idRmSnatch` int NOT NULL AUTO_INCREMENT,
  `peso` decimal(5,2) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `idUsuario` int NOT NULL,
  PRIMARY KEY (`idRmSnatch`,`idUsuario`),
  KEY `fk_RmSnatch_Usuario1_idx` (`idUsuario`),
  CONSTRAINT `fk_RmSnatch_Usuario1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rmsnatch`
--

LOCK TABLES `rmsnatch` WRITE;
/*!40000 ALTER TABLE `rmsnatch` DISABLE KEYS */;
INSERT INTO `rmsnatch` VALUES (4,70.00,'2021-01-18',1),(5,75.00,'2021-10-10',1),(6,80.00,'2022-02-17',1),(7,85.00,'2022-03-21',1),(8,40.00,'2022-01-18',2),(9,50.00,'2022-02-24',2);
/*!40000 ALTER TABLE `rmsnatch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rmsquat`
--

DROP TABLE IF EXISTS `rmsquat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rmsquat` (
  `idRmSquat` int NOT NULL AUTO_INCREMENT,
  `peso` decimal(5,2) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `idUsuario` int NOT NULL,
  PRIMARY KEY (`idRmSquat`,`idUsuario`),
  KEY `fk_RmSquat_Usuario1_idx` (`idUsuario`),
  CONSTRAINT `fk_RmSquat_Usuario1` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rmsquat`
--

LOCK TABLES `rmsquat` WRITE;
/*!40000 ALTER TABLE `rmsquat` DISABLE KEYS */;
INSERT INTO `rmsquat` VALUES (1,100.00,'2021-08-01',1),(3,135.00,'2022-04-23',1),(4,105.50,'2022-08-04',1),(7,55.50,'2021-01-04',2);
/*!40000 ALTER TABLE `rmsquat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `squat`
--

DROP TABLE IF EXISTS `squat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `squat` (
  `idSquat` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `rm` decimal(5,2) DEFAULT NULL,
  `pesoMin` decimal(5,2) DEFAULT NULL,
  `pesoMax` decimal(5,2) DEFAULT NULL,
  `pocentajeMin` int DEFAULT NULL,
  `porcentajeMax` int DEFAULT NULL,
  `serieMin` int DEFAULT NULL,
  `serieMax` int DEFAULT NULL,
  `repsTotalMin` int DEFAULT NULL,
  `repsTotalMax` int DEFAULT NULL,
  `repsOptima` int DEFAULT NULL,
  `idWod` int NOT NULL,
  `idUsuario` int NOT NULL,
  PRIMARY KEY (`idSquat`,`idWod`,`idUsuario`),
  KEY `fk1Squat_idx` (`idWod`),
  KEY `fk2Squat_idx` (`idUsuario`),
  CONSTRAINT `fk1Squat` FOREIGN KEY (`idWod`) REFERENCES `wod` (`idWod`),
  CONSTRAINT `fk2Squat` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `squat`
--

LOCK TABLES `squat` WRITE;
/*!40000 ALTER TABLE `squat` DISABLE KEYS */;
INSERT INTO `squat` VALUES (1,'Back Squat',150.00,100.00,120.00,85,90,5,7,17,25,20,1,1);
/*!40000 ALTER TABLE `squat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `sexo` varchar(45) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `peso` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Josué','1234','josusk8@gmail.com','Gutiérrez Carrillo','H','1989-01-09',80.00),(2,'Aroa','1234','aroa@gmail.com','Padilla Barroso','M','1988-05-02',55.00);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `varmovimientosecundario`
--

DROP TABLE IF EXISTS `varmovimientosecundario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `varmovimientosecundario` (
  `idVarmovimientosecundario` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `rm` decimal(5,2) DEFAULT NULL,
  `pesoMin` decimal(5,2) DEFAULT NULL,
  `pesoMax` decimal(5,2) DEFAULT NULL,
  `pocentajeMin` int DEFAULT NULL,
  `porcentajeMax` int DEFAULT NULL,
  `serieMin` int DEFAULT NULL,
  `serieMax` int DEFAULT NULL,
  `repsTotalMin` int DEFAULT NULL,
  `repsTotalMax` int DEFAULT NULL,
  `repsOptima` int DEFAULT NULL,
  `idWod` int NOT NULL,
  `idUsuario` int NOT NULL,
  PRIMARY KEY (`idVarmovimientosecundario`,`idWod`,`idUsuario`),
  KEY `fk_aa_idx` (`idWod`),
  KEY `fk_ee_idx` (`idUsuario`),
  CONSTRAINT `fk_aa` FOREIGN KEY (`idWod`) REFERENCES `wod` (`idWod`),
  CONSTRAINT `fk_ee` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `varmovimientosecundario`
--

LOCK TABLES `varmovimientosecundario` WRITE;
/*!40000 ALTER TABLE `varmovimientosecundario` DISABLE KEYS */;
INSERT INTO `varmovimientosecundario` VALUES (1,'Power Snatch',90.00,80.00,95.00,90,105,1,2,5,8,6,1,1);
/*!40000 ALTER TABLE `varmovimientosecundario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wod`
--

DROP TABLE IF EXISTS `wod`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `wod` (
  `idWod` int NOT NULL AUTO_INCREMENT,
  `semana` int NOT NULL,
  `dia` int NOT NULL,
  `comentario` varchar(300) DEFAULT NULL,
  `fecha` date NOT NULL,
  `idUsuario` int NOT NULL,
  PRIMARY KEY (`idWod`,`idUsuario`),
  KEY `fk_Wod_Usuario1_idx` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wod`
--

LOCK TABLES `wod` WRITE;
/*!40000 ALTER TABLE `wod` DISABLE KEYS */;
INSERT INTO `wod` VALUES (1,1,1,' ','2022-04-08',1),(2,1,2,'Hola','2022-04-10',1),(3,2,2,'12121','1989-02-01',1),(9,2,2,'12121','1989-02-01',1);
/*!40000 ALTER TABLE `wod` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-19 12:59:38
