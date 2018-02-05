
#1
DELIMITER //

CREATE FUNCTION find_min_experience()
RETURNS DECIMAL(10,1)
BEGIN
	RETURN(SELECT MIN(experience) FROM employee);
END//
DELIMITER ;

SELECT find_min_experience();

#2
DELIMITER //

CREATE FUNCTION find_name_and_building_number(pharmacy_id INT)
RETURNS VARCHAR(20)
BEGIN
	RETURN CONCAT((SELECT `name` FROM pharmacy WHERE pharmacy_id = id), ' ', (SELECT building_number FROM pharmacy WHERE pharmacy_id = id));
END//
DELIMITER ;

SELECT *,find_name_and_building_number(id) FROM employee;