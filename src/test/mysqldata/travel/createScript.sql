CREATE DATABASE IF NOT EXISTS `travel` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `travel`;


CREATE TABLE IF NOT EXISTS `stays` (
  `stay_id` int(11) NOT NULL AUTO_INCREMENT,
  `stay_name` varchar(50) NOT NULL,
  `stay_type` enum('Resort','Homestay','cottages','Hotel') DEFAULT NULL,
  `dest_type` enum('Hillside','Beach','Beachwaters') DEFAULT NULL,
  `loc` geometry DEFAULT NULL,
  PRIMARY KEY (`stay_id`),
  UNIQUE KEY `stay_id` (`stay_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;


CREATE TABLE IF NOT EXISTS `customers` (
  `cust_id` int(11) NOT NULL AUTO_INCREMENT,
  `cust_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cust_id`),
  UNIQUE KEY `cust_id` (`cust_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `bookings` (
  `cust_id` int(11) DEFAULT NULL,
  `stay_id` int(11) DEFAULT NULL,
  `rating` int(11) DEFAULT NULL,
  KEY `FK__customers` (`cust_id`),
  KEY `FK_bookings_stays` (`stay_id`),
  CONSTRAINT `FK__customers` FOREIGN KEY (`cust_id`) REFERENCES `customers` (`cust_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_bookings_stays` FOREIGN KEY (`stay_id`) REFERENCES `stays` (`stay_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
