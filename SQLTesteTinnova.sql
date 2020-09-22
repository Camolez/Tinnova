-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           8.0.21 - MySQL Community Server - GPL
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              10.1.0.5464
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para banco_estudo
CREATE DATABASE IF NOT EXISTS `banco_estudo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `banco_estudo`;

-- Copiando estrutura para tabela banco_estudo.veiculos
CREATE TABLE IF NOT EXISTS `veiculos` (
  `ID_VEICULO` bigint unsigned NOT NULL AUTO_INCREMENT,
  `VEICULO` varchar(250) DEFAULT NULL,
  `MARCA` varchar(50) NOT NULL DEFAULT '0',
  `ANO` int NOT NULL DEFAULT '0',
  `DESC_VEICULO` varchar(250) NOT NULL DEFAULT '0',
  `STATUS_VENDIDO` tinyint NOT NULL,
  `DATA_CRIACAO` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `DATA_ATUALIZACAO` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  KEY `ID_VEICULO` (`ID_VEICULO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Exportação de dados foi desmarcado.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
