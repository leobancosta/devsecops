CREATE DATABASE dso;
GRANT ALL PRIVILEGES ON dso.* TO 'dsorole'@'%' IDENTIFIED BY 'dsopass';
GRANT ALL PRIVILEGES ON dso.* TO 'dsorole'@'localhost' IDENTIFIED BY 'dsopass';
USE dso;

CREATE TABLE role (
	role_id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY,
	role_name VARCHAR(50) NOT NULL,
	role_desc VARCHAR(100) NOT NULL,
	created_date DATETIME,
	updated_date DATETIME,
	created_by INT,
	updated_by INT
);