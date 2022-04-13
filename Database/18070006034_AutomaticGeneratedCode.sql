-- MySQL Script generated by MySQL Workbench
-- Thu Dec 30 23:46:38 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Books`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Books` (
  `bookID` INT NOT NULL AUTO_INCREMENT,
  `ISBN` VARCHAR(13) NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `category` VARCHAR(45) NOT NULL,
  `page` INT NOT NULL,
  PRIMARY KEY (`bookID`, `ISBN`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Authors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Authors` (
  `authorID` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `gender` CHAR(1) NOT NULL,
  `birthdate` DATE NULL,
  `country` VARCHAR(45) NULL,
  PRIMARY KEY (`authorID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`AuthorBooks`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`AuthorBooks` (
  `Authors_authorID` INT NOT NULL,
  `Books_bookID` INT NOT NULL,
  PRIMARY KEY (`Authors_authorID`, `Books_bookID`),
  INDEX `fk_AuthorBooks_Authors_idx` (`Authors_authorID` ASC) VISIBLE,
  INDEX `fk_AuthorBooks_Books1_idx` (`Books_bookID` ASC) VISIBLE,
  CONSTRAINT `fk_AuthorBooks_Authors`
    FOREIGN KEY (`Authors_authorID`)
    REFERENCES `mydb`.`Authors` (`authorID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_AuthorBooks_Books1`
    FOREIGN KEY (`Books_bookID`)
    REFERENCES `mydb`.`Books` (`bookID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Publisher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Publisher` (
  `publisherID` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`publisherID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`BookPublishers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`BookPublishers` (
  `Books_bookID` INT NOT NULL,
  `Publisher_publisherID` INT NOT NULL,
  PRIMARY KEY (`Books_bookID`, `Publisher_publisherID`),
  INDEX `fk_Books_has_Publisher_Publisher1_idx` (`Publisher_publisherID` ASC) VISIBLE,
  INDEX `fk_Books_has_Publisher_Books1_idx` (`Books_bookID` ASC) VISIBLE,
  CONSTRAINT `fk_Books_has_Publisher_Books1`
    FOREIGN KEY (`Books_bookID`)
    REFERENCES `mydb`.`Books` (`bookID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Books_has_Publisher_Publisher1`
    FOREIGN KEY (`Publisher_publisherID`)
    REFERENCES `mydb`.`Publisher` (`publisherID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`People`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`People` (
  `peopleID` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `birthdate` CHAR(1) NOT NULL,
  PRIMARY KEY (`peopleID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`BookPeople`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`BookPeople` (
  `Books_bookID` INT NOT NULL,
  `People_peopleID` INT NOT NULL,
  `year` INT NULL,
  PRIMARY KEY (`Books_bookID`, `People_peopleID`),
  INDEX `fk_Books_has_People_People1_idx` (`People_peopleID` ASC) VISIBLE,
  INDEX `fk_Books_has_People_Books1_idx` (`Books_bookID` ASC) VISIBLE,
  CONSTRAINT `fk_Books_has_People_Books1`
    FOREIGN KEY (`Books_bookID`)
    REFERENCES `mydb`.`Books` (`bookID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Books_has_People_People1`
    FOREIGN KEY (`People_peopleID`)
    REFERENCES `mydb`.`People` (`peopleID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`AuthorPublisher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`AuthorPublisher` (
  `Authors_authorID` INT NOT NULL,
  `Publisher_publisherID` INT NOT NULL,
  PRIMARY KEY (`Authors_authorID`, `Publisher_publisherID`),
  INDEX `fk_Authors_has_Publisher_Publisher1_idx` (`Publisher_publisherID` ASC) VISIBLE,
  INDEX `fk_Authors_has_Publisher_Authors1_idx` (`Authors_authorID` ASC) VISIBLE,
  CONSTRAINT `fk_Authors_has_Publisher_Authors1`
    FOREIGN KEY (`Authors_authorID`)
    REFERENCES `mydb`.`Authors` (`authorID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Authors_has_Publisher_Publisher1`
    FOREIGN KEY (`Publisher_publisherID`)
    REFERENCES `mydb`.`Publisher` (`publisherID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
