DROP TRIGGER CheckMany;

DELIMITER //
CREATE TRIGGER check_many_employee_to_pharmacy
AFTER INSERT
ON employee FOR EACH ROW
BEGIN
	IF(SELECT COUNT(*) FROM pharmacy WHERE new.pharmacy_id = id) = 0
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'pharmacy_id isn`t in pharmacy table';
END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_many_employee_to_post
AFTER INSERT
ON employee FOR EACH ROW
BEGIN
	IF(SELECT COUNT(*) FROM post WHERE new.post = post) = 0
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'new.post isn`t in post';
END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_many_pharmacy_to_street
AFTER INSERT
ON pharmacy FOR EACH ROW
BEGIN
	IF(SELECT COUNT(*) FROM street WHERE new.street = street) = 0
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'new.street isn`t in street table';
END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_many_employee_to_pharmacy_update
AFTER UPDATE
ON employee FOR EACH ROW
BEGIN
	IF(SELECT COUNT(*) FROM pharmacy WHERE new.pharmacy_id = id) = 0
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'pharmacy_id isn`t in pharmacy table';
END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_many_employee_to_post_update
AFTER UPDATE
ON employee FOR EACH ROW
BEGIN
	IF(SELECT COUNT(*) FROM post WHERE new.post = post) = 0
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'new.post isn`t in post';
END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_many_pharmacy_to_street_update
AFTER UPDATE
ON pharmacy FOR EACH ROW
BEGIN
	IF(SELECT COUNT(*) FROM street WHERE new.street = street) = 0
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'new.street isn`t in street table';
END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_many_pharmacy_to_medicine_update
AFTER UPDATE
ON pharmacy FOR EACH ROW
BEGIN
	IF(SELECT COUNT(*) FROM pharmacy_medicine WHERE new.id = medicine_id) = 0
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'medicine_id isn`t in pharmacy_medicine table';
END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_many_medicine_to_pharmacy_update
AFTER UPDATE
ON medicine FOR EACH ROW
BEGIN
	IF(SELECT COUNT(*) FROM pharmacy_medicine WHERE new.id = pharmacy_id) = 0
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'pharmacy_id isn`t in pharmacy_medicine table';
END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_many_medicine_to_zone_update
AFTER UPDATE
ON medicine FOR EACH ROW
BEGIN
	IF(SELECT COUNT(*) FROM medicine_zone WHERE new.id = medicine_id) = 0
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'medicine_id isn`t in pharmacy_medicine table';
END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_many_zone_to_medicine_update
AFTER UPDATE
ON zone FOR EACH ROW
BEGIN
	IF(SELECT COUNT(*) FROM medicine_zone WHERE new.id = zone_id) = 0
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'pharmacy_id isn`t in pharmacy_medicine table';
END IF;
END //
DELIMITER ;



DELIMITER //
CREATE TRIGGER check_pharmacy_to_many_employee
AFTER UPDATE
ON pharmacy FOR EACH ROW
BEGIN
	UPDATE employee SET employee.pharmacy_id = new.id WHERE employee.pharmacy_id = old.id;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_post_to_many_employee
AFTER UPDATE
ON post FOR EACH ROW
BEGIN
	UPDATE employee SET employee.post = new.post WHERE employee.post = old.post;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_street_to_many_pharmacy
AFTER UPDATE
ON street FOR EACH ROW
BEGIN
	UPDATE pharmacy SET pharmacy.street = new.street WHERE pharmacy.street = old.street;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_medicine_to_many_pharmacy
AFTER UPDATE
ON medicine FOR EACH ROW
BEGIN
	UPDATE pharmacy_medicine SET pharmacy_medicine.medicine_id = new.id WHERE pharmacy_medicine.id = old.id;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_pharmacy_to_many_medicine
AFTER UPDATE
ON pharmacy FOR EACH ROW
BEGIN
	UPDATE pharmacy_medicine SET pharmacy_medicine.pharmacy_id = new.id WHERE pharmacy_medicine.pharmacy_id = old.id;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_zone_to_many_medicine
AFTER UPDATE
ON zone FOR EACH ROW
BEGIN
	UPDATE medicine_zone SET medicine_zone.zone_id = new.id WHERE medicine_zone.zone_id = old.id;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_medicine_to_many_zone
AFTER UPDATE
ON medicine FOR EACH ROW
BEGIN
	UPDATE medicine_zone SET medicine_zone.medicine_id = new.id WHERE medicine_zone.medicine_id = old.id;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_identify_number_insert
AFTER INSERT
ON employee FOR EACH ROW
BEGIN
	IF(identity_number RLIKE '%00')
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'identify number can`t end with 00';
END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_identify_number_update
AFTER UPDATE
ON employee FOR EACH ROW
BEGIN
	IF(identity_number RLIKE '%00')
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'identify number can`t end with 00';
END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER trigger_check_medicine_ministry_code_insert
AFTER INSERT
ON medicine FOR EACH ROW
BEGIN
  IF NOT(convert(new.ministry_code USING cp1251) RLIKE convert('^[^МП][^МП]-[0-9][0-9][0-9]-[0-9][0-9]$' USING cp1251) )
 THEN
 SIGNAL SQLSTATE '45000'
      SET MESSAGE_TEXT = 'Ministry code format: 2 довільні букви, окрім М та П - 3 цифри - 2 цифри';
 END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_medicine_ministry_code_update
AFTER UPDATE
ON medicine FOR EACH ROW
BEGIN
  IF NOT(convert(new.ministry_code USING cp1251) RLIKE convert('^[^МП][^МП]-[0-9][0-9][0-9]-[0-9][0-9]$' USING cp1251) )
 THEN
 SIGNAL SQLSTATE '45000'
      SET MESSAGE_TEXT = 'Ministry code format: 2 довільні букви, окрім М та П - 3 цифри - 2 цифри';
 END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_post_update
AFTER UPDATE
ON post FOR EACH ROW
BEGIN
	SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'identify number can`t end with 00';
END //
DELIMITER ;


DELIMITER //
CREATE TRIGGER check_pharmacy_to_many_employee
AFTER DELETE
ON pharmacy FOR EACH ROW
BEGIN
	IF(SELECT COUNT(*) FROM employee WHERE old.pharmacy_id = id) > 0
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'pharmacy_id is in employee table';
END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_post_to_many_employee
AFTER DELETE
ON post FOR EACH ROW
BEGIN
	IF(SELECT COUNT(*) FROM employee WHERE old.post = post) > 0
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'old.post is in employee table';
END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_street_to_many_pharmacy
AFTER DELETE
ON street FOR EACH ROW
BEGIN
	IF(SELECT COUNT(*) FROM pharmacy WHERE old.street = street) > 0
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'old.street is in pharmacy table';
END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_medicine_to_many_pharmacy
AFTER DELETE
ON medicine_pharmacy FOR EACH ROW
BEGIN
	IF(SELECT COUNT(*) FROM medicine WHERE old.medicine_id = id) > 0
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'medicine_id is in medicine table';
END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_pharmacy_to_many_medicine
AFTER DELETE
ON medicine_pharmacy FOR EACH ROW
BEGIN
	IF(SELECT COUNT(*) FROM pharmacy WHERE old.pharmacy_id = id) > 0
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'pharmacy_id is in pharmacy table';
END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_zone_to_many_medicine
AFTER DELETE
ON medicine_zone FOR EACH ROW
BEGIN
	IF(SELECT COUNT(*) FROM zone WHERE old.zone_id = id) > 0
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'zone_id is in zone table';
END IF;
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER check_medicine_to_many_zone
AFTER DELETE
ON medicine_zone FOR EACH ROW
BEGIN
	IF(SELECT COUNT(*) FROM medicine WHERE old.medicine_id = id) = 0
    THEN SIGNAL SQLSTATE '45000'
		SET MESSAGE_TEXT = 'medicine_id is in medicine_zone table';
END IF;
END //
DELIMITER ;
