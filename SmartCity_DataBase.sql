CREATE DATABASE  IF NOT EXISTS `SmartCity` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `SmartCity`;
-- MySQL dump 10.13  Distrib 8.0.27, for Linux (x86_64)
--
-- Host: localhost    Database: SmartCity
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `CityDetails`
--

DROP TABLE IF EXISTS `CityDetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `CityDetails` (
  `Sno` int NOT NULL AUTO_INCREMENT,
  `cityname` varchar(255) DEFAULT NULL,
  `category` varchar(455) DEFAULT NULL,
  `PorS` varchar(45) DEFAULT NULL,
  `PorS_Address` varchar(455) DEFAULT NULL,
  `TravelType` varchar(45) DEFAULT NULL,
  `AvailableVehicle` varchar(45) DEFAULT NULL,
  `VehicleArrivingTime` varchar(45) DEFAULT NULL,
  `Distance_KM` varchar(45) DEFAULT NULL,
  `ShopContact` varchar(45) DEFAULT NULL,
  `CodesOfCatogery` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Sno`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CityDetails`
--

LOCK TABLES `CityDetails` WRITE;
/*!40000 ALTER TABLE `CityDetails` DISABLE KEYS */;
INSERT INTO `CityDetails` VALUES (1,'Chennai','Hospital','S','Sugam Hospital,Chrompet MainRoad, Saranava store','BUS,TRAIN','553','10.00AM','5km','8767656799','H01'),(2,'Chennai','Hospital','S','Apollo Hospital, Dr MGR MainRoad, Saranava store','BUS,TRAIN','553','10.00AM','5km','8767656799','H01'),(3,'Chennai','Hospital','S','Kauvery Hospital,Nandhanam MainRoad,Four way Signal','BUS,Metro','29C','10.00AM','5km','8767656793','H01'),(4,'Chennai','Mobile','S','Samsang Shop,Anna salai,Gemini Brige Opposite Side','BUS','78','10.00AM','5km','8767656792','M01'),(5,'Chennai','Mobile','S','oppo ShopThirumangalam, Anna Nagar','BUS,Metro','5C','10.00AM','5km','8767656798','M01'),(6,'Chennai','Mobile','S','Redmi Shop,Egmore, Red Cross Rd','BUS,Train','21G','10.00AM','5km','8767656798','M01'),(7,'Chennai','Mobile','S','APPLE Shop,Nandhanam MainRoad,Four way Signal','BUS,Train','7F','7.00AM','10km','8767656797','M01'),(8,'Chennai','Mall','S','Express Avenue Mall,Roypet MainRoad','BUS,Train','7F','7.00AM','10km','87676567981','M11'),(9,'Chennai','Mall','S','VR Mall,00 Feet Rd, Thirumangalam, Anna Nagar','BUS,Train','7F','7.00AM','10km','8767656792','M11'),(10,'Chennai','Mall','S','Alsa Mall,Egmore, Red Cross Rd','BUS,Train','7F','7.00AM','10km','8767656793','M11'),(11,'Chennai','Mall','S','CityCenter Mall,Gokulam Colony, Ramakrishnapuram, West Mambalam','BUS,Metro','41F','8.00AM','10km','876765','M11'),(12,'Chennai','ATM','S','Indian Bank,Chrompet MainRoad, saravan store Opposite Side','BUS,Metro','41F','8.00AM','10km','8248912385','A01'),(13,'Chennai','ATM','S','HDFC Bank,Pallavaram MainRoad, Yamudhin Opposite Side','BUS,Metro','41F','8.00AM','10km','8248912386','A01'),(14,'Chennai','ATM','S','AXIS Bank,Guindy National park','BUS,Metro','41F','8.00AM','10km','8248912387','A01'),(15,'Chennai','Tourist Palce','P','Marina Beach Road, Navalar Nagar, Chepauk','BUS,Metro','41F','8.00AM','10km','8248912388','TP1'),(16,'Chennai','Tourist Palce','P','Dr MGR Memorial, Marina Beach Road, Navalar Nagar, Chepauk','BUS,Metro','41F','8.00AM','10km','8248912389','TP1'),(17,'Bangalore','Hospital','S','Sugam Hospital, Salem MainRoad, Bengaluru, Karnataka 560004','BUS,Metro','21G','10.00AM','5km','8767656790','H01'),(18,'Bangalore','Hospital','S','Apollo Hospital,KGF Main Road Bengaluru, Karnataka 560004','BUS,Metro','553','10.00AM','5km','8767656799','H01'),(19,'Bangalore','Hospital','S','Kauvery Hospital,Four way Signal,Bengaluru, Karnataka 560004','BUS,Metro','29C','10.00AM','5km','8767656793','H01'),(20,'Bangalore','Mobile','S','Samsang Shop,Gemini Brige,Bengaluru, Karnataka 560004','BUS','78','10.00AM','5km','8767656792','M01'),(21,'Bangalore','Mobile','S','oppo ShopThirumangalam, Anna Nagar,Bengaluru, Karnataka 560004','BUS,Metro','5C','10.00AM','5km','8767656798','M01'),(22,'Bangalore','Mobile','S','Redmi Shop,Red Cross Rd,Bengaluru, Karnataka 560004','BUS,Metro','21G','10.00AM','5km','8767656798','M01'),(23,'Bangalore','Mobile','S','APPLE Shop,Four way Signal,Bengaluru, Karnataka 560004','BUS,Metro','7F','7.00AM','5km','8767656797','M01'),(24,'Bangalore','Mall','S','Express Avenue Mall,Roypet MainRoad','BUS,Metro','7F','7.00AM','5km','87676567981','M11'),(25,'Bangalore','Mall','S','VR Mall,00 Feet Rd, Thirumangalam, Anna Nagar','BUS,Metro','7F','7.00AM','5km','8767656792','M11'),(26,'Bangalore','Mall','S','Alsa Mall,Red Cross Rd,Bengaluru, Karnataka 560004','BUS,Metro','7F','7.00AM','5km','8767656793','M11'),(27,'Bangalore','Mall','S','CityCenter Mall,Bengaluru, Karnataka 560004','BUS,Metro','41F','8.00AM','5km','876765','M11'),(28,'Bangalore','ATM','S','Indian Bank,Bengaluru, Karnataka 560004','BUS,Metro','41F','8.00AM','5km','8248912385','A01'),(29,'Bangalore','ATM','S','HDFC Bank,Bengaluru, Karnataka 560004','BUS,Metro','41F','8.00AM','5km','8248912386','A01'),(30,'Bangalore','ATM','S','AXIS Bank,Bengaluru, Karnataka 560004','BUS,Metro','41F','8.00AM','5km','8248912387','A01'),(31,'Bangalore','Tourist Palce','P','LAL Park, Mavalli, Bengaluru, Karnataka 560004','BUS,Metro','41F','8.00AM','5km','08026570181','TP1'),(32,'Bangalore','Tourist Palce','P','Wonderla,28th Km, Mysore Rd, Bengaluru, Karnataka 562109','BUS,Metro','41F','8.00AM','5km','NA','TP1'),(33,'Bangalore','Tourist Palce','P','National Park, Bannerghatta Main Rd, Bannerughatta','BUS,Metro','41F','8.00AM','5km','NA','TP1'),(34,'Chennai','Tourist Palce','P','Mahabalipuram Beach,Mahabalipuram','BUS,Metro','41F','8.00AM','10km','8248912380','TP1'),(35,'Chennai','Tourist Palce','p','Santhi medical,Pallavaram junction back side','BUS,TRAIN','98F','10.00am','6km','9865789078','TP1');
/*!40000 ALTER TABLE `CityDetails` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-21 20:39:44
