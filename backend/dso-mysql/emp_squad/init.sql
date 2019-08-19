CREATE DATABASE dso;

GRANT ALL PRIVILEGES ON dso.* TO 'dsoempsquad'@'%' IDENTIFIED BY 'dsopass';
GRANT ALL PRIVILEGES ON dso.* TO 'dsoempsquad'@'localhost' IDENTIFIED BY 'dsopass';

USE dso;

CREATE TABLE emp_squad (
	emp_squad_id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY,
	emp_id INT NOT NULL,
	squad_id INT NOT NULL,
	active TINYINT NOT NULL DEFAULT 0,
	role_id INT NOT NULL,
	created_date DATETIME,
	udated_date DATETIME,
	created_by INT,
	updated_by INT
);