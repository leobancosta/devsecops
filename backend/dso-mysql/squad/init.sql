CREATE DATABASE dso;

GRANT ALL PRIVILEGES ON dso.* TO 'dsosquad'@'%' IDENTIFIED BY 'dsopass';
GRANT ALL PRIVILEGES ON dso.* TO 'dsosquad'@'localhost' IDENTIFIED BY 'dsopass';

USE dso;

CREATE TABLE squad (
	squad_id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY,
	squad_name VARCHAR(70) NOT NULL,
	squad_desc VARCHAR(100),
	created_date DATETIME,
	updated_date DATETIME,
	created_by INT,
	updated_by INT
);