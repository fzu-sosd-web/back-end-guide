# Create Database
# ------------------------------------------------------------
CREATE DATABASE IF NOT EXISTS SOSDJavaCh01 DEFAULT CHARACTER SET = utf8mb4;

Use SOSDJavaCh01;


DROP TABLE IF EXISTS `Student`;

CREATE TABLE `Student` (
  `Id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `Name` varchar(32) NOT NULL DEFAULT 'default' COMMENT 'Name',
  `Intro` varchar(32) NOT NULL DEFAULT 'default' COMMENT 'Name',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

INSERT INTO Student (Id, Name, Intro) VALUES (0, 'cxq', 'juan ge');
INSERT INTO Student (Id, Name, Intro) VALUES (0, 'wzl', 'cai niao');