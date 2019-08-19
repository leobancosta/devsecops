CREATE DATABASE dso;

GRANT ALL PRIVILEGES ON dso.* TO 'dsoemprole'@'%' IDENTIFIED BY 'dsopass';
GRANT ALL PRIVILEGES ON dso.* TO 'dsoemprole'@'localhost' IDENTIFIED BY 'dsopass';

USE dso;

CREATE TABLE emp_role (
	emp_role_id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY,
	emp_id INT NOT NULL,
	role_id INT NOT NULL,
	active TINYINT NOT NULL,
	created_date DATETIME,
	udated_date DATETIME,
	created_by INT,
	updated_by INT
);