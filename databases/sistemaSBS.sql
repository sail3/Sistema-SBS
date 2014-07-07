-- MySQL dump 10.13  Distrib 5.6.19, for Linux (x86_64)
--
-- Host: localhost    Database: geka_r
-- ------------------------------------------------------
-- Server version	5.6.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Categoria`
--

DROP TABLE IF EXISTS `Categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Categoria` (
  `chr_catecodigo` char(8) NOT NULL,
  `vch_catenombre` varchar(40) NOT NULL,
  `vch_catedescripcion` varchar(40) NOT NULL,
  PRIMARY KEY (`chr_catecodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Categoria`
--

LOCK TABLES `Categoria` WRITE;
/*!40000 ALTER TABLE `Categoria` DISABLE KEYS */;
/*!40000 ALTER TABLE `Categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Distrito`
--

DROP TABLE IF EXISTS `Distrito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Distrito` (
  `chr_distcodigo` char(10) NOT NULL,
  `vch_distnombre` varchar(40) NOT NULL,
  PRIMARY KEY (`chr_distcodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Distrito`
--

LOCK TABLES `Distrito` WRITE;
/*!40000 ALTER TABLE `Distrito` DISABLE KEYS */;
INSERT INTO `Distrito` VALUES ('DIST0001','SAN VICENTE'),('DIST0002','Imperial'),('DIST0003','Fuji City');
/*!40000 ALTER TABLE `Distrito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Enfermera`
--

DROP TABLE IF EXISTS `Enfermera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Enfermera` (
  `chr_enfecodigo` char(15) NOT NULL,
  `vch_enfenombre` varchar(40) NOT NULL,
  `vch_enfedireccion` varchar(40) NOT NULL,
  `chr_enfeTelefono` char(12) NOT NULL,
  PRIMARY KEY (`chr_enfecodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Enfermera`
--

LOCK TABLES `Enfermera` WRITE;
/*!40000 ALTER TABLE `Enfermera` DISABLE KEYS */;
/*!40000 ALTER TABLE `Enfermera` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Paciente`
--

DROP TABLE IF EXISTS `Paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Paciente` (
  `chr_pacicodigo` char(10) NOT NULL,
  `chr_pacidni` char(8) NOT NULL,
  `vch_pacinombre` varchar(60) NOT NULL,
  `vch_pacipaterno` varchar(40) NOT NULL,
  `vch_pacimaterno` varchar(40) NOT NULL,
  `smi_paciedad` smallint(6) NOT NULL,
  `dat_pacinacimiento` date NOT NULL,
  `vch_pacidireccion` varchar(60) NOT NULL,
  `chr_distcodigo` char(10) NOT NULL,
  `chr_padrdni` char(8) NOT NULL,
  PRIMARY KEY (`chr_pacicodigo`),
  KEY `fk_Paciente_Distrito` (`chr_distcodigo`),
  KEY `fk_Paciente_Padre` (`chr_padrdni`),
  CONSTRAINT `Paciente_ibfk_1` FOREIGN KEY (`chr_distcodigo`) REFERENCES `Distrito` (`chr_distcodigo`) ON UPDATE CASCADE,
  CONSTRAINT `Paciente_ibfk_2` FOREIGN KEY (`chr_padrdni`) REFERENCES `Padre` (`chr_padrdni`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Paciente`
--

LOCK TABLES `Paciente` WRITE;
/*!40000 ALTER TABLE `Paciente` DISABLE KEYS */;
/*!40000 ALTER TABLE `Paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Paciente_Enfermera`
--

DROP TABLE IF EXISTS `Paciente_Enfermera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Paciente_Enfermera` (
  `chr_pacicodigo` char(10) NOT NULL,
  `chr_vacucodigo` char(8) NOT NULL,
  `chr_enfecodigo` char(15) NOT NULL,
  `chr_pomecodigo` char(10) NOT NULL,
  `dat_pavafecha` datetime NOT NULL,
  `vch_pavadosis` varchar(20) NOT NULL,
  KEY `fk_PacienteVacuna_Paciente` (`chr_pacicodigo`),
  KEY `fk_PacienteVacuna_Vacuna` (`chr_vacucodigo`),
  KEY `fk_PacienteVacuna_PostaMedica` (`chr_pomecodigo`),
  KEY `fk_PacienteVacuna_Enfermera` (`chr_enfecodigo`),
  CONSTRAINT `Paciente_Enfermera_ibfk_1` FOREIGN KEY (`chr_pacicodigo`) REFERENCES `Paciente` (`chr_pacicodigo`) ON UPDATE CASCADE,
  CONSTRAINT `Paciente_Enfermera_ibfk_2` FOREIGN KEY (`chr_vacucodigo`) REFERENCES `Vacuna` (`chr_vacucodigo`) ON UPDATE CASCADE,
  CONSTRAINT `Paciente_Enfermera_ibfk_3` FOREIGN KEY (`chr_pomecodigo`) REFERENCES `PostaMedica` (`chr_pomecodigo`) ON UPDATE CASCADE,
  CONSTRAINT `Paciente_Enfermera_ibfk_4` FOREIGN KEY (`chr_enfecodigo`) REFERENCES `Enfermera` (`chr_enfecodigo`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Paciente_Enfermera`
--

LOCK TABLES `Paciente_Enfermera` WRITE;
/*!40000 ALTER TABLE `Paciente_Enfermera` DISABLE KEYS */;
/*!40000 ALTER TABLE `Paciente_Enfermera` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Padre`
--

DROP TABLE IF EXISTS `Padre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Padre` (
  `chr_padrdni` char(8) NOT NULL,
  `vch_padrnombre` varchar(40) NOT NULL,
  `vch_padrmaterno` varchar(40) NOT NULL,
  `vch_padrpaterno` varchar(40) NOT NULL,
  PRIMARY KEY (`chr_padrdni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Padre`
--

LOCK TABLES `Padre` WRITE;
/*!40000 ALTER TABLE `Padre` DISABLE KEYS */;
/*!40000 ALTER TABLE `Padre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PostaMedica`
--

DROP TABLE IF EXISTS `PostaMedica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PostaMedica` (
  `chr_pomecodigo` char(10) NOT NULL,
  `vch_nombre` varchar(40) NOT NULL,
  `chr_distcodigo` char(10) NOT NULL,
  PRIMARY KEY (`chr_pomecodigo`),
  KEY `fk_posta_distrito` (`chr_distcodigo`),
  CONSTRAINT `PostaMedica_ibfk_1` FOREIGN KEY (`chr_distcodigo`) REFERENCES `Distrito` (`chr_distcodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PostaMedica`
--

LOCK TABLES `PostaMedica` WRITE;
/*!40000 ALTER TABLE `PostaMedica` DISABLE KEYS */;
/*!40000 ALTER TABLE `PostaMedica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Rango`
--

DROP TABLE IF EXISTS `Rango`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Rango` (
  `chr_rangcodigo` char(8) NOT NULL,
  `vch_rangnombre` varchar(40) NOT NULL,
  `vch_rangdescripcion` varchar(40) NOT NULL,
  PRIMARY KEY (`chr_rangcodigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Rango`
--

LOCK TABLES `Rango` WRITE;
/*!40000 ALTER TABLE `Rango` DISABLE KEYS */;
/*!40000 ALTER TABLE `Rango` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Vacuna`
--

DROP TABLE IF EXISTS `Vacuna`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Vacuna` (
  `chr_vacucodigo` char(8) NOT NULL,
  `vch_vacunombre` varchar(40) NOT NULL,
  `chr_rangcodigo` char(8) DEFAULT NULL,
  `chr_catecodigo` char(8) DEFAULT NULL,
  PRIMARY KEY (`chr_vacucodigo`),
  KEY `fk_Vacuna_Rango` (`chr_rangcodigo`),
  KEY `fk_Vacuna_Categoria` (`chr_catecodigo`),
  CONSTRAINT `Vacuna_ibfk_1` FOREIGN KEY (`chr_rangcodigo`) REFERENCES `Rango` (`chr_rangcodigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `Vacuna_ibfk_2` FOREIGN KEY (`chr_catecodigo`) REFERENCES `Categoria` (`chr_catecodigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Vacuna`
--

LOCK TABLES `Vacuna` WRITE;
/*!40000 ALTER TABLE `Vacuna` DISABLE KEYS */;
/*!40000 ALTER TABLE `Vacuna` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-07-07  8:45:40
