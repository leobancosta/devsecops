CREATE DATABASE dso;

GRANT ALL PRIVILEGES ON dso.* TO 'dsoaction'@'%' IDENTIFIED BY 'dsopass';
GRANT ALL PRIVILEGES ON dso.* TO 'dsoaction'@'localhost' IDENTIFIED BY 'dsopass';

USE dso;

CREATE TABLE action (
	action_id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY,
	action_name VARCHAR(50) NOT NULL,
	action_description VARCHAR(100),
	created_date DATETIME,
	updated_date DATETIME,
	created_by INT,
	updated_by INT
);