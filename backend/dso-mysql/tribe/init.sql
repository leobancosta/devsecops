CREATE DATABASE dso;
GRANT ALL PRIVILEGES ON dso.* TO 'dsodept'@'%' IDENTIFIED BY 'dsopass';
GRANT ALL PRIVILEGES ON dso.* TO 'dsodept'@'localhost' IDENTIFIED BY 'dsopass';
USE dso;

CREATE TABLE dept (
	dept_id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY,
	dept_name VERCHAR(100) NOT NULL,
	dept_desc VARCHAR(100) NOT NULL,
	enabled TINYINT NOT NULL DEFAULT 0
);