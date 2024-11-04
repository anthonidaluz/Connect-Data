CREATE DATABASE  IF NOT EXISTS `funcionario` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `funcionario`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: funcionario
-- ------------------------------------------------------
-- Server version	8.0.35

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
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionario` (
  `idFuncionario` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `email` varchar(45) NOT NULL,
  `genero` char(1) NOT NULL DEFAULT '-',
  `telefone` varchar(17) NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `bairro` varchar(45) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `cep` varchar(45) NOT NULL,
  `nacionalidade` varchar(45) NOT NULL,
  `cnh` tinyint NOT NULL,
  `data_contratado` date DEFAULT NULL,
  `periodo` varchar(12) NOT NULL,
  `nome_empresa` varchar(45) NOT NULL,
  `idDepartamento` int NOT NULL,
  `foto` varchar(30) NOT NULL,
  `idRelatorios` int NOT NULL,
  `MetaCumprida` int NOT NULL,
  PRIMARY KEY (`idFuncionario`),
  KEY `fk_Funcionário_Departamento_idx` (`idDepartamento`),
  KEY `fk_Funcionário_Relatorios1_idx` (`idRelatorios`),
  CONSTRAINT `fk_Funcionário_Departamento` FOREIGN KEY (`idDepartamento`) REFERENCES `departamento` (`idDepartamento`),
  CONSTRAINT `fk_Funcionário_Relatorios1` FOREIGN KEY (`idRelatorios`) REFERENCES `relatorio` (`idRelatorios`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES (2,'Carlos ramon','23456789011','carlos.oliveira@example.com','M','(21)98765-4321','Av. das Palmeiras, 456','Jardim Botânico','Rio de Janeiro','21098-765','Brasileiro',0,'2022-12-03','Meio Período','XYZ Comércio',1,'x',1,1),(3,'Maria Santos','45678912300','maria.santos@example.com','F','(31)98765-4321','Rua dos Pinheiros, 789','Centro','Belo Horizonte','34567-890','Brasileiro',1,'2024-02-15','Integral','LMN Tecnologia',1,'x',1,0),(4,'João Oliveira','45678901233','joao.oliveira@example.com','M','(41)98765-4321','Travessa das Oliveiras, 321','Centro','Curitiba','45678-901','Brasileiro',1,'2023-08-20','Integral','OPQ Engenharia',1,'x',1,2),(5,'Laura Almeida','56789012344','laura.almeida@example.com','F','(51)98765-4321','Rua dos Girassóis, 987','Centro','Porto Alegre','56789-012','Brasileiro',1,'2023-11-05','Meio Período','RST Consultoria',1,'x',1,1),(6,'Pedro Santos','67890123455','pedro.santos@example.com','M','(21)98765-1234','Av. dos Sonhos, 456','Barra da Tijuca','Rio de Janeiro','21012-345','Brasileiro',0,'2023-06-15','Meio Período','DEF Comércio',2,'x',2,2),(7,'Amanda Oliveira','78901234566','amanda.oliveira@example.com','F','(31)98765-2345','Rua das Estrelas, 789','Santo André','São Paulo','45678-901','Brasileiro',1,'2022-11-20','Integral','GHI Indústria',2,'x',2,1),(8,'Bruno Almeida','89012345677','bruno.almeida@example.com','M','(41)98765-3456','Rua das Árvores, 123','Centro','Curitiba','56789-012','Brasileiro',0,'2024-01-05','Meio Período','JKL Tecnologia',2,'x',2,0),(9,'Camila Silva','90123456788','camila.silva@example.com','F','(51)98765-4567','Av. das Avenidas, 789','Boa Viagem','Recife','67890-123','Brasileiro',1,'2023-09-10','Integral','MNO Engenharia',2,'x',2,0),(10,'Rafael Oliveira','01234567899','rafael.oliveira@example.com','M','(61)98765-5678','Rua dos Rios, 456','Asa Sul','Brasília','78901-234','Brasileiro',1,'2023-07-25','Meio Período','PQR Consultoria',2,'x',2,1),(11,'Fernanda Lima','21098765433','fernanda.lima@example.com','F','(11)98765-6789','Rua das Montanhas, 987','Copacabana','Rio de Janeiro','89012-345','Brasileira',1,'2023-08-15','Meio Período','STU Comércio',3,'x',3,0),(12,'Guilherme Costa','32109876544','guilherme.costa@example.com','M','(21)98765-7890','Av. dos Oceanos, 321','Barra da Tijuca','Rio de Janeiro','90123-456','Brasileira',1,'2022-10-25','Integral','VWX Indústria',3,'x',3,1),(13,'Juliana Oliveira','43210987655','juliana.oliveira@example.com','F','(31)98765-8901','Rua das Praias, 654','Boa Viagem','Recife','01234-567','Brasileira',0,'2024-03-05','Meio Período','YZA Tecnologia',3,'x',3,2),(14,'Ana da Silva','54321098766','lucas.silva@example.com','M','(41)98765-9012','Rua das Torres, 234','Centro','Curitiba','12345-678','Uruguaia',1,'2023-12-20','Integral','ZAB Engenharia',3,'x',3,1),(15,'Mariana Rodrigues','65432109877','mariana.rodrigues@example.com','F','(51)98765-0123','Av. das Florestas, 789','Floresta','Porto Alegre','23456-789','Brasileira',1,'2023-04-10','Meio Período','ABC Consultoria',3,'x',3,1),(16,'Mateus Oliveira','76543210988','mateus.oliveira@example.com','M','(21)98765-1234','Rua dos Pássaros, 456','Ipanema','Rio de Janeiro','21012-345','Brasileira',0,'2023-06-15','Meio Período','DEF Comércio',4,'x',4,0),(17,'Carolina Santos','87654321099','carolina.santos@example.com','F','(31)98765-2345','Av. das Estrelas, 789','Santo André','São Paulo','45678-901','Brasileira',1,'2022-11-20','Integral','GHI Indústria',4,'x',4,0),(18,'Diego Almeida','98765432100','diego.almeida@example.com','M','(41)98765-3456','Rua das Árvores, 123','Centro','Curitiba','56789-012','Brasileira',1,'2024-01-05','Meio Período','JKL Tecnologia',4,'x',4,1),(19,'Elisa Silva','09876543211','elisa.silva@example.com','F','(51)98765-4567','Av. dos Anjos, 789','Boa Viagem','Recife','67890-123','Brasileira',1,'2023-09-10','Integral','MNO Engenharia',4,'x',4,2),(20,'Fábio Oliveira','98765432122','fabio.oliveira@example.com','M','(61)98765-5678','Rua dos Rios, 456','Asa Sul','Brasília','78901-234','Brasileira',1,'2023-07-25','Meio Período','PQR Consultoria',4,'x',4,1),(21,'Elena Petrov','87654321033','elena.petrov@example.com','F','(33)98765-4321','Ulitsa Lenina, 123','Moscou','Rússia','12345','Russa',0,'2023-06-18','Integral','XYZ Comércio',5,'x',5,1),(22,'Gabriel Fernandes','76543210944','gabriel.fernandes@example.com','M','(44)98765-4321','Rue de la Paix, 456','Paris','França','23456','Francês',1,'2023-07-29','Meio Período','MNO Tecnologia',5,'x',5,0);
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-03 20:36:45
