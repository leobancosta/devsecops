CREATE DATABASE dso;

GRANT ALL PRIVILEGES ON dso.* TO 'dsoemp'@'172.10.10.11' IDENTIFIED BY 'dsopass';
GRANT ALL PRIVILEGES ON dso.* TO 'dsoemp'@'localhost' IDENTIFIED BY 'dsopass';

USE dso;

CREATE TABLE emp (
	emp_id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY,
	emp_username VARCHAR(60) NOT NULL,
	emp_password VARCHAR(70) NOT NULL,
	emp_firstname VARCHAR(100) NOT NULL,
	emp_lastname VARCHAR(100) NOT NULL,
	emp_email VARCHAR(50) NOT NULL,
	title VARCHAR(50),
	dept_id INT NOT NULL,
	manager_id INT,
	start_date DATETIME NOT NULL,
	active TINYINT DEFAULT 0
);