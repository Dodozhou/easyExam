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
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='data_category属性为INT型，0表示通用型，1表示计科院，2表示.......';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data_sharing`
--

LOCK TABLES `data_sharing` WRITE;
/*!40000 ALTER TABLE `data_sharing` DISABLE KEYS */;
INSERT INTO `data_sharing` VALUES (6,4,'管理学复习资料','管理学是一门综合性的交叉学科，是系统研究管理活动的基本规律和一般方法的科学。管理学是适应现代社会化大生产的需要产生的，它的目的是：研究在现有的条件下，如何通过合理的组织和配置人、财、物等因素，提高生产力的水平。','/uploads/data/doc/2017/04/09/11/e2c77278-2632-4eaf-b6f8-f953bec3cefc.jpg',0,1,0,'管理学','/uploads/data/img/2017/04/09/11/d48a0316-6536-49ca-b063-edf030d32e50.jpg',2,'经管院',NULL),(7,4,'大学英语复习资料','为了配合《大学英语教学大纲》（修订本）的实施，外教社在新世纪初隆重推出《大学英语》（全新版）系列教材，为促进我国大学英语教育再作贡献。全套教材由复旦大学、北京大学、华东师范大学、中国科技大学、华南理工大学、南京大学、武汉大学、南开大学、中山大学、华中理工大学等著名院校的资深教授及英语教学专家合作编写而成','/uploads/data/doc/2017/04/09/11/462801f1-17cf-4169-92fe-949cbed2e6b2.docx',0,1,0,'大学英语综合教程','/uploads/data/img/2017/04/09/11/dc128864-60bd-4976-ab47-53304d52bd89.jpg',1,'通用',NULL),(14,7,'大学物理','大学物理资料','/uploads/data/doc/2017/04/09/14/cf84292e-71b0-4b53-94a4-145200ae27bf.txt',0,1,0,'大学物理','/uploads/data/img/2017/04/09/14/3b8522d4-464d-477b-bcbd-ecd209a02bb3.png',1,'计科院',NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doc_seek`
--

LOCK TABLES `doc_seek` WRITE;
/*!40000 ALTER TABLE `doc_seek` DISABLE KEYS */;
INSERT INTO `doc_seek` VALUES (2,1,'高等数学','求大神带高等数学，希望上90分','机电工程学院','1',1,1,'2017/04/08 23:51',0,0,0),(3,7,'高等数学','高等数学资料悬赏','理学院','1',1,1,'2017/04/09 14:08',0,0,0);
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
  PRIMARY KEY (`id`),
  KEY `help_user_idx` (`pub_id`),
  CONSTRAINT `help_user` FOREIGN KEY (`pub_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `help_aid`
--

LOCK TABLES `help_aid` WRITE;
/*!40000 ALTER TABLE `help_aid` DISABLE KEYS */;
INSERT INTO `help_aid` VALUES (1,4,'计科院',1,'C#','马上要考试了，求一位C#成绩好的大神','15845625812',0,0,0,NULL,NULL),(2,4,'经管院',2,'管理学','要考试了，管理学都有哪些重点啊，需要大神帮帮我一','1584552445',0,0,0,NULL,NULL),(3,4,'计科院',2,'数据结构','数据结构好难啊，要考试了，有没有大神带我飞哦，急！','128545625556',0,0,0,NULL,NULL),(4,4,'计科院',2,'运筹学','平时上课没好好听，运筹学那么难，后天就考试了，有没有大神帮帮我','12545566655',0,0,0,NULL,NULL),(5,6,'计科院',1,'高等数学','高等数学辅导','1095121033',0,0,0,NULL,NULL),(6,7,'计科院',2,'操作系统','寻求一个大神辅导操作系统','1095121033',0,0,0,NULL,NULL);
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
  PRIMARY KEY (`id`),
  KEY `sharing_user_idx` (`user_id`),
  CONSTRAINT `sharing_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `method_sharing`
--

LOCK TABLES `method_sharing` WRITE;
/*!40000 ALTER TABLE `method_sharing` DISABLE KEYS */;
INSERT INTO `method_sharing` VALUES (3,4,'计算机网络的要点','<span style=\"color:#323E32;font-family:simsun;font-size:14px;white-space:normal;background-color:#FFFFFF;\">计算机网络是计算机与通信技术的结合，软件与硬件的结合，通信子网与资源子网的结合，这样来理解，可以减少网络课程学习的难度。这也是网络协议分层的基本知识原点，即网络为什么要分为通信子网和资源子网，因为计算机网络是由通信与计算机技术相结合而产生的。</span>',0,0,1,NULL,'计科院'),(5,4,'运筹学应该怎么学习','<span style=\"color:#262626;font-family:&quot;font-size:15px;white-space:pre-wrap;background-color:#FFFFFF;\">学运筹学之前，在知乎查过运筹学入门方面的问题，没有得到想要的答案。现在过运筹学了，自己提问，自己回答。</span><span style=\"color:#262626;font-family:&quot;font-size:15px;white-space:pre-wrap;background-color:#FFFFFF;\">说到运筹学入门书籍，似乎离不开 Frederick。\r\n<div>\r\n	<div>\r\n		S. Hillier 和 Gerald J. Lieberman 的《<b>Introduction to Operations Research</b>》（<a href=\"https://link.zhihu.com/?target=http%3A/book.douban.com/subject/2250362/\" class=\" wrap external\" target=\"_blank\" rel=\"nofollow noreferrer\">Introduction to Operations Research (豆瓣)<i class=\"icon-external\"></i></a>），在国内由清华大学的胡运权翻译成《<b>运筹学导论</b>》(<a href=\"https://link.zhihu.com/?target=http%3A/book.douban.com/subject/2253276/\" class=\" wrap external\" target=\"_blank\" rel=\"nofollow noreferrer\">运筹学导论 (豆瓣)<i class=\"icon-external\"></i></a>)，但是只是截取了部分章节，重点选取了线性规划的章节。这本书英文版网上有电子书，百度或者谷歌一下 “Introduction to Operations Research pdf ”就没问题的。\r\n	</div>\r\n<br />\r\n</div>\r\n</span>',0,0,1,NULL,'经管院'),(10,4,'数据结构该怎么学习','第一件事. 把数据结构图形化,视觉化.(突然想起来我高中竞赛老师说的一句话:数形结合千般好,一旦不做万事休啊! 就是要画图! )在直觉上感受一个数据结构是什么样子的.使用它是什么感觉,抽象上和具体实现上是什么样子的.这就是最重要的事情.并且无论是对于简单的队列,栈还是天杀的平衡树都很重要而且有效.把数据结构画出来,在你的脑袋瓜里面就能想象出来,总之,你需要做的就是,直观的去了解这些数据结构.\r\n<div>\r\n	<div>\r\n		第二件事.学习什么时候用什么样的数据结构和算法.对于学生来说这很难,而且你要做作业的时候老师也没告诉你们这该怎么办.╮(￣▽￣\")╭ 不过没关系. 你要认识到当你真正处理到现实问题的时候或许你才能掌握某些数据结构,比如哈希表.但是即使是个学生,你也应该知道数据结构的实用性:什么时候你需要个哈希表,什么时候你需要个树,什么时候你需要个堆? 而不是一开始就陷入到追求细节中去.\r\n	</div>\r\n</div>',0,0,1,NULL,'计科院'),(11,5,'数据结构','数据结构学习方法',0,0,1,NULL,'计科院'),(12,5,'石油工程','工程信息',0,0,1,NULL,'石工院'),(13,1,'大学化学','大学化学',0,0,1,NULL,'化工院'),(14,1,'石油工程','石油工程概论',0,0,1,NULL,'石工院'),(23,1,'土建工程','土建工程',0,0,1,NULL,'土建院'),(24,1,'shigong','shigong',0,0,1,NULL,'石工院'),(25,1,'tujian','tujain',0,0,1,NULL,'石工院'),(26,6,'操作系统','操作系统学习方法',0,0,1,NULL,'计科院'),(27,7,'高数学习方法','高等数学学习方法分享',0,0,1,NULL,'计科院');
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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='“我是大神”信息表,pub_id是发布者的id，外键连接到user表；pub_grade是发布者的年级；academy是发布者的学院；study_object是帮辅的科目；\nshare_score：是否公开绩点，1为公开，0为不公开；pub_phone：发布者联系方式。';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `study_aid`
--

LOCK TABLES `study_aid` WRITE;
/*!40000 ALTER TABLE `study_aid` DISABLE KEYS */;
INSERT INTO `study_aid` VALUES (3,4,2,'通用','高数','计科院的一名女生，擅长高数',4,'15928543307',0,0,NULL,0),(4,4,2,'经管院','管理学','管理薛大神哦，有需要的电话联系我',4,'1821633871',0,0,NULL,0),(5,4,2,'经管院','运筹学','运筹学是一门比较难的学科，有需要的联系我，能保你过哦',4,'15985247725',0,0,NULL,0),(6,4,1,'计科院','数据结构','考前3天，带你轻松过数据结构',4,'15896423588',0,0,NULL,0),(7,5,3,'计科院','操作系统','操作系统辅导',4,'1095121033',0,0,NULL,0),(8,6,2,'计科院','数据结构','数据结构辅导',4,'1095121033',0,0,NULL,0),(9,7,2,'计科院','数据结构','数据结构90分',4,'1095121033',0,0,NULL,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='nickname为用户名，email为邮件，student_id为学号，user_img为用户头像保存地址';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'zhoudada','1355141123','zhouheng05_13@163.com','201531060634','/uploads/user/2017/04/08/20/9e92259e-8df8-43d0-b208-258317c9078e.png','我是一名程序猿'),(2,'zhouzhou','123456','453453453','201531060648','/uploads/user/2017/04/07/14/f86aae2f-cafd-462a-b184-dd3962c317dd.jpg','这个人很懒，什么都没说'),(3,'aaa','123456','zhouzho453453','201631060648','/uploads/user/2017/04/07/14/f86aae2f-cafd-462a-b184-dd3962c317dd.jpg','这个人很懒，什么都没说'),(4,'lwf','lwf812913','15928543307@163.com','201531060681','/uploads/user/2017/04/20/17/4f6b59e9-e504-401a-82cf-2995fa61dbca.jpg','这个人很懒，什么都没有留下'),(5,'zhoucheng','123456','zhoucheng05_13@163.com','201531060633','/static/img/touxiang.png','这个人很懒，什么都没有留下'),(6,'chengcheng','123456','zhouzhou@163.com','201531060632','/static/img/touxiang.png','这个人很懒，什么都没有留下'),(7,'chengcheng','1355141123','zhouzhou@163.com','201531060631','/static/img/touxiang.png','这个人很懒，什么都没有留下'),(8,'大大','1234567','dada@163.com','201531060613','/static/img/touxiang.png','这个人很懒，什么都没有留下');
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

-- Dump completed on 2017-05-09 21:22:46
