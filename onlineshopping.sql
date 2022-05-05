-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--

-- Generation Time: May 03, 2022 at 01:18 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `onlineshopping`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
CREATE TABLE IF NOT EXISTS `cart` (
  `brandName` varchar(50) NOT NULL,
  `model` varchar(50) NOT NULL,
  `price` double NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`brandName`, `model`, `price`, `quantity`) VALUES
('Coca-Cola', '400ml', 123, 1);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `name` varchar(50) NOT NULL,
  `userName` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `tel` int(10) NOT NULL,
  `password` varchar(50) NOT NULL,
  `birthday` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `cId` int(5) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`cId`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`name`, `userName`, `email`, `tel`, `password`, `birthday`, `address`, `cId`) VALUES
('User', 'user', 'user@gmail.com', 778955449, '1234', 'Jun 12, 1990', 'Colombo', 8),('Chathuri', 'chathu', 'chathu@gmail.com', 778955449, '1234', 'Jun 12, 1990', 'Colombo', 6),
('Kamal', 'Kamal', 'kamal@gmail.com', 778955447, '1234', 'Jun 12, 1990', 'Colombo', 5);

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
CREATE TABLE IF NOT EXISTS `item` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `brandName` varchar(50) NOT NULL,
  `model` varchar(50) NOT NULL,
  `price` double NOT NULL,
  `features` varchar(100) NOT NULL,
  `stock` int(11) NOT NULL,
  `item_type` varchar(100) NOT NULL,
  `image` varchar(1000) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`Id`, `brandName`, `model`, `price`, `features`, `stock`, `item_type`, `image`) VALUES
(2, 'Innvovex', 'M001', 13500, '4 Speed', 5, 'E', 'src\\lk\\NIMI\\OnlineShopping\\View\\Images\\innvoexFan.jpg'),
(3, 'Singer', 'Fan1', 10000, '4 Speed', 4, 'E', 'src\\lk\\NIMI\\OnlineShopping\\View\\Images\\innvoexFan.jpg'),
(4, 'Invex', 'Frf4', 10000, '5 Speed', 4, 'E', 'src\\lk\\NIMI\\OnlineShopping\\View\\Images\\innvoexFan.jpg'),
(5, 'Lux', '-', 123, 'Rose and gold', 12, 'NA', 'src\\lk\\NIMI\\OnlineShopping\\View\\Images\\shopping_80px.png'),
(6, 'Samsung', 'S10', 25000, '6gb ram + 128gb Hard with 48mpx camera', 10, 'M', 'src\\lk\\NIMI\\OnlineShopping\\View\\Images\\s10.jpg'),
(7, 'Coca-Cola', '400ml', 123, 'Carbonated Water', 20, 'F', 'src\\lk\\NIMI\\OnlineShopping\\View\\Images\\coke.jpg');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
