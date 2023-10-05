SELECT * FROM car;
ALTER TABLE car ADD COLUMN nameinterest VARCHAR(100);
ALTER TABLE car ADD COLUMN numberinterest VARCHAR(12);
UPDATE car SET interest = 0 WHERE interest = 1;