CREATE DATABASE dso;

GRANT ALL PRIVILEGES ON dso.* TO 'dsobacklog'@'%' IDENTIFIED BY 'dsopass';
GRANT ALL PRIVILEGES ON dso.* TO 'dsobacklog'@'localhost' IDENTIFIED BY 'dsopass';

USE dso;

CREATE TABLE backlog (
	backlog_id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY,
	backlog_name VERCHAR(80) NOT NULL,
	backlog_desc VARCHAR(100),
	project_id INT NOT NULL,
	created_date DATETIME,
	updated_date DATETIME,
	created_by INT,
	updated_by INT
);