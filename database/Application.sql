ALTER TABLE car ADD COLUMN nameinterest VARCHAR(100);

ALTER TABLE car ADD COLUMN numberinterest VARCHAR(12);

UPDATE car SET interest = 0 WHERE interest = 1;

DROP TABLE car;

SELECT * FROM car;

SHOW TABLES;

DESCRIBE report;

SELECT * FROM report;

SELECT * FROM user;

DESCRIBE user;

INSERT INTO user (login, password, name, active, birthdate, registerdate) VALUES ("admin", "admin2020", "Admin", 1, "2022-02-02", "2022-02-02");

DELETE FROM report;
