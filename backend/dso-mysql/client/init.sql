CREATE DATABASE dso;

GRANT ALL PRIVILEGES ON dso.* TO 'dsoclient'@'%' IDENTIFIED BY 'dsopass';
GRANT ALL PRIVILEGES ON dso.* TO 'dsoclient'@'localhost' IDENTIFIED BY 'dsopass';

USE dso;

CREATE TABLE client (
	client_id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY,
	client_username String NOT NULL,
	client_password String NOT NULL,
	client_name VARCHAR(100) NOT NULL,
	client_desc VARCHAR(100),
	industry VARCHAR(80),
	start_date DATETIME,
	created_date DATETIME,
	updated_date DATETIME,
	created_by INT,
	updated_by INT,
	activated TINYINT
);