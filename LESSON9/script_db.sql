CREATE DATABASE students1;
USE students1;

CREATE TABLE student (	
		id 				INT AUTO_INCREMENT NOT NULL,
		full_name		VARCHAR(100) NOT NULL,
        photo			BLOB,
        autobiography	TEXT,
        home_address	VARCHAR(100) NOT NULL,
        rating			DOUBLE DEFAULT NULL,
        PRIMARY KEY(id)
) ENGINE InnoDb;

CREATE TABLE `subject`(
		id 				INT AUTO_INCREMENT NOT NULL,
        `name`			VARCHAR(100) NOT NULL,
        mark			DOUBLE,
        mod_1_result	DOUBLE,
        mod_2_result	DOUBLE,
        control_type	ENUM('exam','test'),
        PRIMARY KEY(id)
) ENGINE InnoDb;

CREATE TABLE student_has_subject (
        id              INT AUTO_INCREMENT NOT NULL,
        student_id      INT DEFAULT NULL,
        subject_id      INT DEFAULT NULL,
        PRIMARY KEY(id)
);

CREATE TABLE lecturer (
		id 				INT AUTO_INCREMENT NOT NULL,
		full_name		VARCHAR(100) NOT NULL,
        PRIMARY KEY(id)
) ENGINE InnoDb;

CREATE TABLE studentship (
		id 				INT AUTO_INCREMENT NOT NULL,
        amount			DECIMAL(5,2) NOT NULL,
        PRIMARY KEY(id)
) ENGINE InnoDb;   

CREATE TABLE student_group (
		id 				INT AUTO_INCREMENT NOT NULL,
        group_name		VARCHAR(30) NOT NULL,
        PRIMARY KEY(id)
) ENGINE InnoDb;

CREATE TABLE speciality (
		id 				INT AUTO_INCREMENT NOT NULL,
        speciality_name	VARCHAR(30) NOT NULL,
        PRIMARY KEY(id)
) ENGINE InnoDb;

ALTER TABLE `subject` ADD
	CONSTRAINT lecturer_id
    FOREIGN KEY(id)
    REFERENCES lecturer(id);

ALTER TABLE student ADD
	CONSTRAINT studentship_id
    FOREIGN KEY(id)
    REFERENCES studentship(id);
    
ALTER TABLE student ADD
	CONSTRAINT student_group_id
    FOREIGN KEY(id)
    REFERENCES student_group(id);
    
ALTER TABLE student ADD
	CONSTRAINT speciality_id
    FOREIGN KEY(id)
    REFERENCES speciality(id);
    
ALTER TABLE student_has_subject ADD
	CONSTRAINT st_student_id
    FOREIGN KEY(student_id)
    REFERENCES student(id)
    ON UPDATE CASCADE ON DELETE CASCADE;
    
ALTER TABLE student_has_subject ADD
	CONSTRAINT st_subject_id
    FOREIGN KEY(subject_id)
    REFERENCES `subject`(id)
    ON UPDATE CASCADE ON DELETE CASCADE;
    
INSERT INTOspeciality(speciality_name) values('Programmer');

INSERT INTO student_group(group_name) values('KN-210');

INSERT INTO studentship(amount) values(900);

INSERT INTO lecturer(full_name) values('Astakhov Oleksij Ivanovich');

INSERT INTO subject(`name`,control_type) values
    ('OOP',exam),
    ('AOP',test);
    
INSERT INTO student(full_name, home_address) values
	('Klontsak Oleg', 'm. Lviv, vul. Petra Pancha 7'),
    ('Sidak Andrij', 'm. Lviv, vul. Zaliznychna 27'),
    ('Ostaschenko Oleksij', 'm. Lviv, vul. Oleksandra Dovzhenka 19');
    
