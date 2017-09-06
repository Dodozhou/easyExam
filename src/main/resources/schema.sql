-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: yikao
-- ------------------------------------------------------
-- Server version	5.7.13-log

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
-- Table structure for table `data_sharing`
--

DROP TABLE IF EXISTS `data_sharing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `data_sharing` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `data_title` varchar(45) NOT NULL,
  `data_description` varchar(200) NOT NULL,
  `data_url` varchar(100) NOT NULL,
  `download_number` int(100) DEFAULT '0',
  `view_number` int(100) DEFAULT '1',
  `data_praise` int(100) DEFAULT '0',
  `data_category` varchar(45) DEFAULT NULL,
  `data_imgs` varchar(100) DEFAULT NULL,
  `data_grade` int(1) DEFAULT '2',
  `data_college` varchar(20) DEFAULT NULL,
  `pub_date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `data_user_idx` (`user_id`),
  CONSTRAINT `data_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='data_category属性为INT型，0表示通用型，1表示计科院，2表示.......';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data_sharing`
--

LOCK TABLES `data_sharing` WRITE;
/*!40000 ALTER TABLE `data_sharing` DISABLE KEYS */;
/*!40000 ALTER TABLE `data_sharing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doc_seek`
--

DROP TABLE IF EXISTS `doc_seek`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doc_seek` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pub_id` int(11) NOT NULL,
  `seek_title` varchar(45) NOT NULL,
  `seek_need` varchar(200) NOT NULL,
  `need_academy` varchar(45) NOT NULL,
  `need_grade` varchar(45) NOT NULL,
  `seek_time` int(5) NOT NULL,
  `seek_praise` int(11) NOT NULL,
  `pub_date` varchar(45) NOT NULL,
  `view_numb` int(11) DEFAULT '0',
  `comment_numb` int(11) DEFAULT '0',
  `praise_numb` int(11) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `seek_user_idx` (`pub_id`),
  CONSTRAINT `seek_user` FOREIGN KEY (`pub_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doc_seek`
--

LOCK TABLES `doc_seek` WRITE;
/*!40000 ALTER TABLE `doc_seek` DISABLE KEYS */;
INSERT INTO `doc_seek` VALUES (4,9,'计算机网络','计算机网络复习资料','计算机科学学院','2',2,2,'2017/09/06 14:16',1,0,0);
/*!40000 ALTER TABLE `doc_seek` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `help_aid`
--

DROP TABLE IF EXISTS `help_aid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `help_aid` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pub_id` int(11) NOT NULL,
  `academy` varchar(45) NOT NULL,
  `pub_grade` int(2) NOT NULL,
  `help_subject` varchar(45) NOT NULL,
  `help_need` varchar(200) DEFAULT NULL,
  `pub_phone` varchar(45) NOT NULL,
  `view_numb` int(11) DEFAULT '0',
  `comment_numb` int(11) DEFAULT '0',
  `praise_numb` int(11) DEFAULT '0',
  `time` varchar(45) DEFAULT NULL,
  `userPortrait` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `help_user_idx` (`pub_id`),
  CONSTRAINT `help_user` FOREIGN KEY (`pub_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `help_aid`
--

LOCK TABLES `help_aid` WRITE;
/*!40000 ALTER TABLE `help_aid` DISABLE KEYS */;
INSERT INTO `help_aid` VALUES (12,9,'机电院',1,'机电维修','寻找机电维修大神，帮助辅导，必有重谢','1095121033',1,0,0,'2017/09/06 14:27',NULL,NULL);
/*!40000 ALTER TABLE `help_aid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `method_sharing`
--

DROP TABLE IF EXISTS `method_sharing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `method_sharing` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `sharing_title` varchar(45) NOT NULL,
  `sharing_content` text NOT NULL,
  `sharing_praise` int(11) NOT NULL,
  `sharing_criticism` int(11) NOT NULL,
  `reading_number` int(100) NOT NULL DEFAULT '1',
  `reading_imgs` varchar(100) DEFAULT NULL,
  `academy` varchar(45) NOT NULL,
  `time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `sharing_user_idx` (`user_id`),
  CONSTRAINT `sharing_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `method_sharing`
--

LOCK TABLES `method_sharing` WRITE;
/*!40000 ALTER TABLE `method_sharing` DISABLE KEYS */;
INSERT INTO `method_sharing` VALUES (34,9,'石油勘测技术','<div class=\"para\" label-module=\"para\" style=\"font-size:14px;color:#333333;margin-bottom:15px;text-indent:2em;line-height:24px;zoom:1;font-family:arial, 宋体, sans-serif;white-space:normal;background-color:#FFFFFF;\">\r\n	<span style=\"font-weight:700;\">初期阶段</span>\r\n</div>\r\n<div class=\"para\" label-module=\"para\" style=\"font-size:14px;color:#333333;margin-bottom:15px;text-indent:2em;line-height:24px;zoom:1;font-family:arial, 宋体, sans-serif;white-space:normal;background-color:#FFFFFF;\">\r\n	19世纪40年代以前。最初人们通过寻找油苗、气苗等指导寻找石油（以无机派为主）。早期的找油是从观察出露到地表的油或气(被称为“油气苗”)入手的，勘探队员们在野外特别注意寻找和打听工区内有没有石油或冒气泡的水泉，这是最直观的找油方法，古今中外都一样。我国的克拉玛依油田因其附近有“黑油山”而引起注意，投入钻探后发现的；独山子油田则因有含油气的泥水长期溢流而成的“泥火山”著称；玉门油田其旁有“石油沟”；延长油矿范围内有多处油苗出露;四川最早利用气井的自贡，也有不少气苗可以点燃，古籍中也有记载；青海有些与“油”有关的地名如“油砂山”、“油泉子”等则是现代的石油队员在勘查时以其油苗而取的名字。\r\n</div>\r\n<div class=\"para\" label-module=\"para\" style=\"font-size:14px;color:#333333;margin-bottom:15px;text-indent:2em;line-height:24px;zoom:1;font-family:arial, 宋体, sans-serif;white-space:normal;background-color:#FFFFFF;\">\r\n	<span style=\"font-weight:700;\">第二阶段</span>\r\n</div>\r\n<div class=\"para\" label-module=\"para\" style=\"font-size:14px;color:#333333;margin-bottom:15px;text-indent:2em;line-height:24px;zoom:1;font-family:arial, 宋体, sans-serif;white-space:normal;background-color:#FFFFFF;\">\r\n	19世纪40年代至20世纪40年代.人们在长期利用和寻找石油的实践中，随着科学水平的提高，逐渐认识到油气的聚集和背斜构造有关。19世纪40年代左右出现了“背斜聚油理论”，这个理论指导石油勘探近百年，目前仍起着重要作用。同时逐步完善了物探方法，运用重力、电、磁等进行油气勘探，这期间有机成油说逐渐占了统治地位。\r\n</div>\r\n<div class=\"para\" label-module=\"para\" style=\"font-size:14px;color:#333333;margin-bottom:15px;text-indent:2em;line-height:24px;zoom:1;font-family:arial, 宋体, sans-serif;white-space:normal;background-color:#FFFFFF;\">\r\n	<span style=\"font-weight:700;\">第三阶段</span>\r\n</div>\r\n<div class=\"para\" label-module=\"para\" style=\"font-size:14px;color:#333333;margin-bottom:15px;text-indent:2em;line-height:24px;zoom:1;font-family:arial, 宋体, sans-serif;white-space:normal;background-color:#FFFFFF;\">\r\n	20世纪40年代至今。由于科学的迅速发展和油气田大规模勘探开发，获得了丰富的地质资料，对油气的生成、运移、聚集等各方面的规律有了进一步的认识，各种油气田勘探方法的质量有了明显的提高，勘探的精度和深度有了相当高的水平，并出现了许多新型找油技术，大大提高了找油效率。\r\n</div>\r\n<div>\r\n	<br />\r\n</div>\r\n<div class=\"para-title level-2\" label-module=\"para-title\" style=\"clear:both;zoom:1;overflow:hidden;border-left:12px solid #4F9CEE;line-height:24px;font-size:22px;font-family:&quot;margin:35px 0px 15px -30px;background:url(&quot;https://bkssl.bdimg.com/static/wiki-lemma/normal/resource/img/paraTitle-line_c5e6d61.png&quot;position:relative;color:#333333;white-space:normal;\">\r\n</div>',0,0,1,NULL,'石工院','2017/09/06 14:27');
/*!40000 ALTER TABLE `method_sharing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `study_aid`
--

DROP TABLE IF EXISTS `study_aid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `study_aid` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pub_id` int(11) NOT NULL,
  `pub_grade` int(5) NOT NULL,
  `academy` varchar(45) NOT NULL,
  `study_subject` varchar(45) NOT NULL,
  `pub_description` varchar(45) NOT NULL,
  `share_score` int(2) NOT NULL DEFAULT '1',
  `pub_phone` varchar(45) NOT NULL,
  `view_numb` int(11) DEFAULT '0',
  `comment_numb` int(11) DEFAULT '0',
  `time` varchar(45) DEFAULT NULL,
  `praise_numb` int(11) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `helper_user_idx` (`pub_id`),
  CONSTRAINT `helper_user` FOREIGN KEY (`pub_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='“我是大神”信息表,pub_id是发布者的id，外键连接到user表；pub_grade是发布者的年级；academy是发布者的学院；study_object是帮辅的科目；\nshare_score：是否公开绩点，1为公开，0为不公开；pub_phone：发布者联系方式。';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `study_aid`
--

LOCK TABLES `study_aid` WRITE;
/*!40000 ALTER TABLE `study_aid` DISABLE KEYS */;
INSERT INTO `study_aid` VALUES (11,9,2,'石工院','石油勘测','我擅长石油勘测专业',4,'1095121033',1,0,'2017/09/06 14:26',0);
/*!40000 ALTER TABLE `study_aid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `student_id` varchar(45) NOT NULL,
  `user_img` varchar(100) DEFAULT '/static/img/touxiang.png',
  `personal_desc` varchar(200) DEFAULT '这个人很懒，什么都没说',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='nickname为用户名，email为邮件，student_id为学号，user_img为用户头像保存地址';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (9,'周成','13355141123','1095121033@qq.com','201531060634','/uploads/user/2017/09/04/20/28a4804f-6132-41eb-b80d-eb948b2d65c8.jpeg','这个人很懒，什么都没有留下'),(11,'成成','13355141123','cheng@123.com','201531060633','/uploads/user/2017/09/06/13/454f4dda-6ca0-4fbf-9443-b3bd258e9163.jpeg','这个人很懒，什么都没有留下');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-06 14:33:51
