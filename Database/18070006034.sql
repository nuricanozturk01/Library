DROP DATABASE IF EXISTS library;
CREATE DATABASE Library;



USE Library;
CREATE TABLE Books
(
	bookID INT NOT NULL AUTO_INCREMENT ,
    ISBN VARCHAR(13) NOT NULL UNIQUE CHECK (LENGTH(ISBN) = 13),
    title VARCHAR(45) NOT NULL,
    category VARCHAR(45) NOT NULL,
    page INT ,
    CONSTRAINT PRIMARY KEY(bookID,ISBN)
);
CREATE TABLE Authors
(
	authorID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45) NOT NULL UNIQUE,
    surname VARCHAR(45) NOT NULL,
    gender CHAR(1) NOT NULL ,
    birthdate DATE ,
    country VARCHAR(45),
    CHECK (gender IN ('F','M'))

);


CREATE TABLE AuthorBooks
(
	authorID INT NOT NULL,
    bookID INT NOT NULL,
  
    
    CONSTRAINT FOREIGN KEY (authorID) REFERENCES Authors(authorID)
		ON DELETE CASCADE
		ON UPDATE CASCADE,
    
	CONSTRAINT FOREIGN KEY (bookID ) REFERENCES Books(bookID)
		ON DELETE CASCADE
		ON UPDATE CASCADE
);

CREATE TABLE Publishers
(
	publisherID INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(45) NOT NULL,
    address VARCHAR(45) NOT NULL,
    CONSTRAINT PRIMARY KEY (publisherID)
    
);

CREATE TABLE AuthorPublisher
(
	authorID INT NOT NULL,
    publisherID INT NOT NULL,
    
    CONSTRAINT FOREIGN KEY (authorID) REFERENCES Authors(authorID)
		ON DELETE CASCADE
		ON UPDATE CASCADE,
    CONSTRAINT FOREIGN KEY (publisherID) REFERENCES Publishers(publisherID)
		ON DELETE CASCADE
		ON UPDATE CASCADE
);

CREATE TABLE BookPublishers
(
	publisherID INT NOT NULL,
    bookID INT NOT NULL,
    -- bookISBN VARCHAR(13) NOT NULL,
    
    CONSTRAINT FOREIGN KEY (publisherID) REFERENCES Publishers(publisherID)
		ON DELETE CASCADE
		ON UPDATE CASCADE,
	CONSTRAINT FOREIGN KEY (bookID) REFERENCES Books(bookID)
		ON DELETE CASCADE
		ON UPDATE CASCADE
);

CREATE TABLE People
(
	peopleID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    surname VARCHAR(45) NOT NULL,
	birthdate DATE NOT NULL
    
    
);

CREATE TABLE BooksPeople
(
	peopleID INT NOT NULL,
    bookID INT NOT NULL,
    year INT NOT NULL,
    
    CONSTRAINT FOREIGN KEY (peopleID) REFERENCES People(peopleID)
		ON DELETE CASCADE
		ON UPDATE CASCADE,
	CONSTRAINT FOREIGN KEY (bookID ) REFERENCES Books(bookID)
		ON DELETE CASCADE
		ON UPDATE CASCADE
);
/*
	--------------------------------------- PROCEDURES - TRIGGERS  ---------------------------------------
*/

SET SQL_SAFE_UPDATES = 0;


DELIMITER $$
CREATE PROCEDURE insertBook (in ISBN VARCHAR(13)  , in title VARCHAR(45) , in category VARCHAR(45) , in page INT)
BEGIN
	INSERT  INTO Books (ISBN , title , category , page) VALUES (ISBN , title , category , page);
END$$
DELIMITER ;



DELIMITER $$
CREATE PROCEDURE insertAuthor (in name VARCHAR(45)  , in surname VARCHAR(45) , in gender CHAR(1) , in birthdate DATE , in country VARCHAR(45))
BEGIN
	IF NOT EXISTS (SELECT  name , surname FROM Authors author WHERE author.name = name AND author.surname = surname) THEN
		INSERT  INTO Authors (name ,surname,gender,birthdate,country) VALUES (name ,surname,gender,birthdate,country);
    END IF;
END$$
DELIMITER ;




DELIMITER $$
CREATE PROCEDURE insertPublisher (in name VARCHAR(45)  , in address VARCHAR(45))
BEGIN
	IF NOT EXISTS (SELECT  name , address FROM Publishers pb WHERE pb.name = name AND pb.address = address) THEN
		INSERT  INTO Publishers (name ,address) VALUES (name ,address);
    END IF;
END$$
DELIMITER ;



DELIMITER $$
CREATE PROCEDURE insertAuthorBooks (in authorID INT, in bookID INT)
BEGIN
	IF NOT EXISTS (SELECT  authorID , bookID FROM AuthorBooks ab WHERE ab.authorID = authorID AND ab.bookID = bookID) THEN
		INSERT INTO AuthorBooks VALUES(authorID , bookID);
    END IF;
END$$
DELIMITER ;






DELIMITER $$
CREATE PROCEDURE insertPeople (in name VARCHAR(45)  , in surname VARCHAR(45) , in birthdate DATE )
BEGIN
	IF NOT EXISTS (SELECT  name , surname FROM People person WHERE person.name = name AND person.surname = surname) THEN
		INSERT  INTO People (name ,surname,birthdate) VALUES (name ,surname,birthdate);
	END IF;
END$$
DELIMITER ;

 
DELIMITER $$
CREATE PROCEDURE insertBookPeople (in peopleID INT  , in bookID INT , in year INT )
BEGIN
	IF NOT EXISTS (SELECT  peopleID , bookID  FROM BooksPeople bp WHERE bp.peopleID = peopleID AND bp.bookID = bookID) THEN
		INSERT  INTO BooksPeople VALUES (peopleID , bookID ,year) ;
	END IF;
END$$
DELIMITER ;


-- DELETE
CREATE TABLE Temp
(
	pID INT UNIQUE
);


DELIMITER $$    
CREATE PROCEDURE deleteLastNYear(in idx INT)
BEGIN

	INSERT INTO Temp  SELECT DISTINCT p.peopleID FROM BooksPeople bp , People p WHERE  bp.peopleID = p.peopleID AND
    YEAR(current_date()) - idx <= ANY (SELECT bp2.year FROM BooksPeople bp2 WHERE bp.peopleID = bp2.peopleID );
   
    DELETE FROM People WHERE peopleID NOT IN(Select pID FROM Temp);

	SET @num := 0;
	UPDATE People SET peopleID = @num := (@num + 1);
	ALTER TABLE People AUTO_INCREMENT = 1;
    
	TRUNCATE Temp; -- For clean the Temp table
END $$
DELIMITER ;





DELIMITER $$
CREATE PROCEDURE deletePerson(in id INT)
BEGIN
	DELETE FROM People WHERE peopleID = id;
    SET @num := 0;
	UPDATE People SET peopleID = @num := (@num+1);
	ALTER TABLE People AUTO_INCREMENT = 1;
END $$
DELIMITER ;    
    

DELIMITER $$
CREATE PROCEDURE deleteBook(in id INT)
BEGIN
	DELETE FROM Books WHERE bookID = id;
    SET @num := 0;
	UPDATE Books SET bookID = @num := (@num+1);
	ALTER TABLE Books AUTO_INCREMENT = 1;
END $$
DELIMITER ;    



DELIMITER $$
CREATE PROCEDURE deleteAuthor(in id INT)
BEGIN
	DELETE FROM Authors WHERE authorID = id;
    SET @num := 0;
	UPDATE Authors SET authorID = @num := (@num+1);
	ALTER TABLE Authors AUTO_INCREMENT = 1;
END $$
DELIMITER ;    













-- Books
INSERT INTO  Books (ISBN,title,category,page) VALUES ("9780134743356","Java How to Program","Computer Science",1224);
INSERT INTO  Books (ISBN,title,category,page) VALUES ("9780316037723","Ghost in the Wires","Adventure",554);
INSERT INTO  Books (ISBN,title,category,page) VALUES ("9780316380522","The Art of Invisibility","Action",365);
INSERT INTO  Books (ISBN,title,category,page) VALUES ("9780340960196","Dune","Adventure",592);
INSERT INTO  Books (ISBN,title,category,page) VALUES ("9781408855669","Harry Potter Chamber of Secrets","Action",371);
-- Authors
INSERT INTO Authors (name,surname,gender,birthdate,country) VALUES ("Paul","Deitel","M","1977-12-12","USA");
INSERT INTO Authors (name,surname,gender,birthdate,country) VALUES ("Harvey","Deitel","M","1978-05-11","USA");
INSERT INTO Authors (name,surname,gender,birthdate,country) VALUES ("Kevin","Mitnick","M","1969-01-25","USA");
INSERT INTO Authors (name,surname,gender,birthdate,country) VALUES ("Frank","Herbert","M","1972-06-04","Germany");
INSERT INTO Authors (name,surname,gender,birthdate,country) VALUES ("Joanne Kathleen","Rowling ","F","1967-12-12","US");



-- Author Book relationship
INSERT INTO AuthorBooks VALUES(1,1);
INSERT INTO AuthorBooks VALUES(2,1);
INSERT INTO AuthorBooks VALUES(3,3);
INSERT INTO AuthorBooks VALUES(3,2);
INSERT INTO AuthorBooks VALUES(4,4);
INSERT INTO AuthorBooks VALUES(5,5);

-- Publishers
INSERT INTO Publishers(name,address) VALUES ("Pearson","New York");
INSERT INTO Publishers(name,address) VALUES ("Back Bay Books","Canada");
INSERT INTO Publishers(name,address) VALUES ("‎Hodder Paperback","Germany");
INSERT INTO Publishers(name,address) VALUES ("HarperCollins","Los Angeles");
INSERT INTO Publishers(name,address) VALUES ("National Geographic","Miami");
-- Publisher Book Relationship
INSERT INTO bookpublishers VALUES(1,1); 
INSERT INTO bookpublishers VALUES(2,2); 
INSERT INTO bookpublishers VALUES(3,3); 
INSERT INTO bookpublishers VALUES(3,4); 
INSERT INTO bookpublishers VALUES(4,5); 
-- Author Publisher relationship
INSERT INTO AuthorPublisher VALUES(1,1);
INSERT INTO AuthorPublisher VALUES(2,1);
INSERT INTO AuthorPublisher VALUES(3,2);
INSERT INTO AuthorPublisher VALUES(3,3);
INSERT INTO AuthorPublisher VALUES(4,4);
INSERT INTO AuthorPublisher VALUES(5,4);
INSERT INTO AuthorPublisher VALUES(4,5);
-- People
INSERT INTO People(name,surname,birthdate) VALUES ("John","Wick","1999-01-25");
INSERT INTO People(name,surname,birthdate) VALUES ("Neon","Matrix","1974-06-22");
INSERT INTO People(name,surname,birthdate) VALUES ("Nuri Can","Öztürk","1999-01-25");
INSERT INTO People(name,surname,birthdate) VALUES ("Rebecca","Ferguson","1984-12-14");
INSERT INTO People(name,surname,birthdate) VALUES ("Tobey","Maguire","2002-03-16");
-- People Books
INSERT INTO BooksPeople VALUES(1,2,2008);
INSERT INTO BooksPeople VALUES(1,4,2002);
INSERT INTO BooksPeople VALUES(1,3,2003);
INSERT INTO BooksPeople VALUES(3,1,2020);
INSERT INTO BooksPeople VALUES(3,2,2019);
INSERT INTO BooksPeople VALUES(2,4,2022);
INSERT INTO BooksPeople VALUES(3,5,2008);
INSERT INTO BooksPeople VALUES(4,1,2006);
INSERT INTO BooksPeople VALUES(5,2,2005);

