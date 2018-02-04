#1SELECT DISTINCT maker FROM product WHERE `type` = 'pc' AND maker NOT IN(SELECT maker FROM product p WHERE p.`type` = 'laptop')
#2SELECT DISTINCT maker FROM product WHERE `type` = 'pc' AND maker != ALL(SELECT maker FROM product p WHERE p.`type` = 'laptop')
#3SELECT DISTINCT maker FROM product WHERE `type` = 'PC' AND NOT maker=ANY (SELECT maker FROM product WHERE `type`='Laptop');
#4SELECT DISTINCT maker FROM product WHERE `type` = 'pc' AND maker IN(SELECT maker FROM product p WHERE p.`type` = 'laptop')
#5SELECT DISTINCT maker FROM product WHERE `type` = 'pc' AND NOT maker = ALL(SELECT maker FROM product p WHERE p.`type` = 'laptop' )
#6SELECT DISTINCT maker FROM product WHERE `type` = 'pc' AND maker = ANY(SELECT maker FROM product p WHERE p.`type` = 'laptop')
#7SELECT DISTINCT maker FROM product WHERE `type` = 'pc' AND maker NOT IN (SELECT DISTINCT maker FROM product WHERE `type` = 'pc' AND model NOT IN (SELECT DISTINCT model FROM pc))
#8SELECT DISTINCT country,classes.class FROM ships,classes WHERE (ships.class = classes.class AND country = 'Ukraine') OR country RLIKE '%'
#10SELECT COUNT(pc.model) FROM product,pc WHERE pc.model = product.model AND maker = 'A'
#11SELECT DISTINCT maker FROM product WHERE `type` = 'pc' AND model NOT IN (SELECT DISTINCT model FROM pc)
#12SELECT laptop.model,price FROM product, laptop WHERE laptop.model = product.model AND price > ALL(SELECT price FROM pc)

#1SELECT DISTINCT maker FROM product p1 WHERE NOT EXISTS(SELECT model FROM product WHERE product.maker = p1.maker AND product.model NOT IN(SELECT model FROM pc))
#SELECT product.model FROM product WHERE product.model NOT IN(SELECT model FROM pc)\
#2SELECT DISTINCT maker FROM product WHERE `type` = 'pc' AND EXISTS (SELECT model FROM pc WHERE pc.model = product.model AND speed > 750)
#3SELECT DISTINCT maker FROM product p1 WHERE `type` = 'pc' AND EXISTS(SELECT `type` FROM product WHERE p1.maker = maker AND `type` = 'laptop' ) AND EXISTS (SELECT model FROM laptop WHERE model IN(SELECT model FROM laptop WHERE speed>=750)  AND EXISTS (SELECT model FROM pc WHERE model IN(SELECT model FROM pc WHERE speed>750))) 
#4SELECT DISTINCT maker FROM product p1, printer WHERE p1.model = printer.model AND EXISTS (SELECT pc.model FROM pc, product p2 WHERE pc.model = p2.model AND p1.maker = p2.maker HAVING MAX(speed))
#5SELECT `name`, launched, displacement FROM ships, classes cl WHERE ships.class = cl.class AND launched > 1922 AND EXISTS (SELECT displacement from classes WHERE class = cl.class AND displacement>35 )
#6SELECT class FROM ships, outcomes WHERE ships.`name` = outcomes.ship AND outcomes.result = 'sunk' 
#7SELECT DISTINCT maker FROM product p WHERE p.`type` = 'laptop' AND EXISTS(SELECT maker FROM product WHERE p.maker = maker AND `type` = 'printer')
#8SELECT DISTINCT maker FROM product p WHERE p.`type` = 'laptop' AND NOT EXISTS(SELECT maker FROM product WHERE p.maker = maker AND `type` = 'printer')

#1SELECT 'Середня ціна: ' , AVG(price) AS Price FROM laptop
#2SELECT CONCAT('Модель: ', model) AS 'Model', CONCAT('Швидкість:', speed) AS 'CPU', CONCAT( 'ОЗУ: ', ram) AS 'RAM', CONCAT( 'Память: ' , hd) AS 'HDD', CONCAT('Шв. диска: ', cd) AS 'CD', CONCAT( 'Ціна: ', price) AS 'Price' FROM pc
#3SELECT CONCAT(YEAR(`date`),'.',MONTH(`date`),'.',day(`date`)) AS 'Date' FROM income
#6SELECT trip_no, ID_comp, plane, CONCAT('from ', town_from, ' to ', town_to) AS 'Route', time_out, time_in FROM trip

#1SELECT model,price FROM printer HAVING MAX(price)
#2SELECT 'laptop' AS 'Type',model,speed FROM laptop WHERE speed < ALL (SELECT speed FROM pc)
#3SELECT DISTINCT maker,price FROM printer JOIN product ON(printer.model) HAVING MIN(price)
#4SELECT DISTINCT maker, COUNT(model) AS num FROM product WHERE `type` = 'pc' GROUP BY maker HAVING num>=2
#5SELECT DISTINCT AVG(hd) FROM pc,product p1 WHERE pc.model = p1.model  AND maker IN (SELECT maker FROM product WHERE p1.maker = product.maker AND product.`type` = 'printer')
#6SELECT DISTINCT `date`, count(`date`) AS Num FROM pass_in_trip GROUP BY `date`
#7SELECT DISTINCT `date`, count(`date`) AS Num FROM pass_in_trip, trip WHERE pass_in_trip.trip_no = trip.trip_no AND town_to = 'Moscow' GROUP BY `date` 


#1SELECT p1.maker, (SELECT COUNT(model) FROM product WHERE `type` = 'pc' AND maker = p1.maker) AS PC, (SELECT COUNT(model) FROM product WHERE `type` = 'laptop' AND maker = p1.maker) AS Laptop, (SELECT COUNT(model) FROM product WHERE `type` = 'printer' AND maker = p1.maker) AS Printer FROM product p1 GROUP BY maker
#2SELECT maker, (SELECT AVG(hd) FROM laptop,product WHERE laptop.model = product.model AND maker = p1.maker) AVERAGE FROM product p1,laptop WHERE laptop.model = p1.model GROUP BY maker
#3SELECT maker, (SELECT MAX(price) FROM pc,product WHERE pc.model = product.model AND maker = p1.maker) Max_Price FROM product p1,pc WHERE pc.model = p1.model GROUP BY maker
#4SELECT maker, (SELECT MIN(price) FROM pc,product WHERE pc.model = product.model AND maker = p1.maker) Min_Price FROM product p1,pc WHERE pc.model = p1.model GROUP BY maker
#5SELECT maker, (SELECT AVG(price) FROM pc,product WHERE pc.model = product.model AND pc.speed = pc1.speed) Avg_Price FROM product p1,pc pc1 WHERE pc1.model = p1.model AND pc1.speed > 600 GROUP BY maker
#6SELECT maker, (SELECT AVG(hd) FROM pc,product WHERE pc.model = product.model AND maker = p1.maker) Avg_HDD FROM product p1,pc pc1 WHERE pc1.model = p1.model AND maker IN(SELECT maker FROM product WHERE `type` = 'printer') GROUP BY maker
#7SELECT ship, (SELECT displacement FROM classes, ships WHERE ships.class = classes.class AND ships.name = ship) AS displacement,(SELECT numGuns FROM classes, ships WHERE ships.class = classes.class AND ships.name = ship) AS numGuns FROM Outcomes WHERE battle = 'Guadalcanal'
#8SELECT ship, (SELECT country FROM classes, ships WHERE ships.class = classes.class AND ships.name = ship) AS country,(SELECT numGuns FROM classes, ships WHERE ships.class = classes.class AND ships.name = ship) AS numGuns FROM Outcomes WHERE result = 'damaged'

#1SELECT DISTINCT maker, CASE (SELECT COUNT(pc.model) FROM product,pc WHERE product.model = pc.model AND maker = p.maker) WHEN 0 THEN 'NO(0)' ELSE CONCAT('YES') END AS PC_Num FROM product p GROUP BY maker

#1SELECT maker,product.model,product.`type` ,price FROM product, pc WHERE maker = 'B' UNION SELECT maker,product.model,product.`type` ,price FROM product, laptop WHERE maker = 'B' UNION SELECT maker,product.model,product.`type` ,price FROM product, printer WHERE maker = 'B'
#2SELECT product.`type`, product.model, MAX(price) FROM (SELECT product.`type`,product.model, price FROM pc JOIN product ON(product.model) UNION SELECT product.`type`,product.model, price FROM laptop JOIN product ON(product.model) UNION SELECT product.`type`,product.model, price FROM product JOIN printer ON(product.model)) AS models, product
#3SELECT AVG(price) FROM (SELECT price FROM pc UNION SELECT price FROM laptop) AS prices
