CREATE DATABASE dso;

GRANT ALL PRIVILEGES ON dso.* TO 'dsouserstory'@'%' IDENTIFIED BY 'dsopass';
GRANT ALL PRIVILEGES ON dso.* TO 'dsouserstory'@'localhost' IDENTIFIED BY 'dsopass';

USE dso;

CREATE TABLE userstory (
	userstory_id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY,
	userstory_name VARCHAR(100) NOT NULL,
	userstory_desc VARCHAR(100),
	project_id INT NOT NULL,
	created_date DATETIME,
	updated_date DATETIME,
	created_by INT,
	updated_by INT,
	status TINYINT NOT NULL DEFAULT 0
);