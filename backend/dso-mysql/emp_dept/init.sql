CREATE DATABASE dso;
GRANT ALL PRIVILEGES ON dso.* TO 'dsodept'@'%' IDENTIFIED BY 'dsopass';
GRANT ALL PRIVILEGES ON dso.* TO 'dsodept'@'localhost' IDENTIFIED BY 'dsopass';
USE dso;

CREATE TABLE emp_dept (
	emp_dept_id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY,
	emp_id INT NOT NULL,
	dept_id INT NOT NULL,
	dept_head TINYINT NOT NULL DEFAULT 0,
	active TINYINT NOT NULL DEFAULT 0,
	created_date DATETIME,
	updated_date DATETIME,
	created_by INT,
	updated_by INT
);