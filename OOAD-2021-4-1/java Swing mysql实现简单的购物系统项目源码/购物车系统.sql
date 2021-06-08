/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.1.62-community : Database - db_shop
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_shop` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_shop`;

/*Table structure for table `t_customer` */

DROP TABLE IF EXISTS `t_customer`;

CREATE TABLE `t_customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `customerName` varchar(20) DEFAULT NULL,
  `password1` varchar(20) DEFAULT NULL,
  `password2` varchar(20) DEFAULT NULL,
  `money` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `t_customer` */

insert  into `t_customer`(`id`,`customerName`,`password1`,`password2`,`money`) values (1,'java','1234','1234',269.623),(2,'eqw','123','123',64.989),(3,'java1','1','1',1),(4,'dsf','1','1',1),(5,'java2','1','1',3);

/*Table structure for table `t_product` */

DROP TABLE IF EXISTS `t_product`;

CREATE TABLE `t_product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productName` varchar(20) DEFAULT NULL,
  `productTime` varchar(20) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `productDesc` varchar(20) DEFAULT NULL,
  `productTypeId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_t_product` (`productTypeId`),
  CONSTRAINT `FK_t_product` FOREIGN KEY (`productTypeId`) REFERENCES `t_producttype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `t_product` */

insert  into `t_product`(`id`,`productName`,`productTime`,`price`,`productDesc`,`productTypeId`) values (2,'32','23',23,'32',3),(4,'121','2111',12.011,'1211',2),(5,'1','1',11,'11',5),(6,'雪糕','2013',2.5,'好吃',2),(7,'科技书','2012',15.3,'益智',3);

/*Table structure for table `t_productchosen` */

DROP TABLE IF EXISTS `t_productchosen`;

CREATE TABLE `t_productchosen` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productName` varchar(20) DEFAULT NULL,
  `productTime` varchar(20) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `productDesc` varchar(20) DEFAULT NULL,
  `productTypeId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_t_product` (`productTypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `t_productchosen` */

insert  into `t_productchosen`(`id`,`productName`,`productTime`,`price`,`productDesc`,`productTypeId`) values (13,'科技书','2012',15.3,'益智',3),(14,'32','23',23,'32',3),(15,'121','2111',12.011,'1211',2);

/*Table structure for table `t_producttype` */

DROP TABLE IF EXISTS `t_producttype`;

CREATE TABLE `t_producttype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productTypeName` varchar(20) DEFAULT NULL,
  `productTypeDesc` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `t_producttype` */

insert  into `t_producttype`(`id`,`productTypeName`,`productTypeDesc`) values (2,'食品类','好吃'),(3,'书本类','益智'),(4,'trtr','rtgrtre'),(5,'fdfd1','fdfdfdx1'),(7,'傻瓜','dfsdfs');

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`userName`,`password`) values (1,'java','1234');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
