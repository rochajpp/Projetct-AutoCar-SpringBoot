CREATE TABLE car(
    id INT PRIMARY KEY AUTO_INCREMENT,
    brand VARCHAR(50) NOT NULL,
    model VARCHAR(50) NOT NULL,
    value FLOAT NOT NULL,
    description VARCHAR(1000) NOT NULL,
    image VARCHAR(1000) NOT NULL,
    interest BOOLEAN NOT NULL,
    manufactureyear YEAR NOT NULL,
    modelyear YEAR NOT NULL,
    registerdate DATE NOT NULL
);

CREATE TABLE user(
    id INT PRIMARY KEY AUTO_INCREMENT,
    login VARCHAR(10) NOT NULL, 
    password VARCHAR(20) NOT NULL,
    name VARCHAR(100) NOT NULL,
    active BOOLEAN NOT NULL,
    bithdate DATE NOT NULL,
    registerdate DATE NOT NULL
);

