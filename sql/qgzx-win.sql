/*
SQLyog  v12.2.6 (64 bit)
MySQL - 5.7.19-log : Database - hardwork
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hardwork` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `hardwork`;

/*Table structure for table `bringinfo` */

DROP TABLE IF EXISTS `bringinfo`;

CREATE TABLE `bringinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `people` char(8) NOT NULL,
  `time` datetime NOT NULL,
  `title` varchar(30) NOT NULL,
  `type` varchar(10) NOT NULL,
  `location` varchar(50) NOT NULL,
  `worktime` varchar(30) NOT NULL,
  `workplace` varchar(50) NOT NULL,
  `pay` varchar(8) NOT NULL,
  `deadline` date NOT NULL,
  `sex` varchar(2) NOT NULL,
  `grade` varchar(10) NOT NULL,
  `place` varchar(10) NOT NULL,
  `need` varchar(200) NOT NULL,
  `interview` varchar(2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

/*Data for the table `bringinfo` */

insert  into `bringinfo`(`id`,`name`,`people`,`time`,`title`,`type`,`location`,`worktime`,`workplace`,`pay`,`deadline`,`sex`,`grade`,`place`,`need`,`interview`) values 
(2,'5','5','2017-09-17 09:35:36','5555','5','5','5','543','55','2017-09-06','男','色彩对比','5','55','1'),
(5,'1','11','2017-09-17 10:38:11','1','1','1','1','1','1','2017-09-15','男','1','1','1','1'),
(6,'1','1','2017-09-17 10:41:08','1','1','1','1','1','1','2017-09-26','男','1','1','11','1'),
(17,'224','1','2017-09-20 17:57:56','1212','固定','2323322','2','1','2','2017-09-22','不限','1','11','1','1'),
(18,'11','1','2017-09-20 19:21:31','1','固定','1','1','1','1','2017-09-12','不限','11','1','1','');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` varchar(10) NOT NULL,
  `userName` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL,
  `phoneNumber` varchar(11) NOT NULL,
  `qq` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`userName`,`password`,`phoneNumber`,`qq`) values 
('1','1','1','1','1');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
