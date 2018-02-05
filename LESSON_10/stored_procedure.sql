#1

#2
DELIMITER // 
CREATE PROCEDURE add_to_medicine_zone (
	IN medicine_id int, 
	IN zone_id int)
BEGIN 
	IF((SELECT COUNT(*) FROM medicine WHERE medicine_id = id) > 0 AND (SELECT COUNT(*) FROM zone WHERE zone_id = id) > 0)
		THEN INSERT INTO medicine_zone(medicine_id, zone_id) values(medicine_id, zone_id);
	END IF;
END // 
DELIMITER ;
#3
DELIMITER // 
CREATE PROCEDURE ProcCursor() 
BEGIN 
 DECLARE done int DEFAULT false; 
 DECLARE SurnameT, NameT char(25); 
 DECLARE St_Cursor10 CURSOR 
 FOR SELECT Surname, Name FROM Student; 
 DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = true; 
 OPEN St_Cursor10; 
myLoop: LOOP 
 FETCH St_Cursor10 INTO SurnameT, NameT; 
 IF done=true THEN LEAVE myLoop; 
 END IF; 
 SET @temp_query=CONCAT('CREATE DATABASE ', 
 SurnameT, NameT); 
 PREPARE myquery FROM @temp_query; 
 EXECUTE myquery; 
 DEALLOCATE PREPARE myquery; 
 END LOOP; 
 CLOSE St_Cursor10; 
END // 
DELIMITER ; 