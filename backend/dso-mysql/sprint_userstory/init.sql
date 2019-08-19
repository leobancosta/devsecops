CREATE DATABASE dso;

GRANT ALL PRIVILEGES ON dso.* TO 'dsouserstory'@'%' IDENTIFIED BY 'dsopass';
GRANT ALL PRIVILEGES ON dso.* TO 'dsosprintuserstory'@'localhost' IDENTIFIED BY 'dsopass';

USE dso;

CREATE TABLE sprint_userstory (
	sprint_userstory_id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY,
	sprint_id INT NOT NULL,
	userstory_id INT NOT NULL,
	project_id INT NOT NULL,
	created_date DATETIME,
	updated_date DATETIME,
	created_by INT,
	updated_by INT,
	status TINYINT NOT NULL DEFAULT 0
);