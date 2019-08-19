CREATE DATABASE dso;

GRANT ALL PRIVILEGES ON dso.* TO 'dsosprint'@'%' IDENTIFIED BY 'dsopass';
GRANT ALL PRIVILEGES ON dso.* TO 'dsosprint'@'localhost' IDENTIFIED BY 'dsopass';

USE dso;

CREATE TABLE sprint (
	sprint_id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY,
	sprint_name VARCHAR(50) NOT NULL,
	sprint_desc VARCHAR(100),
	spring_goal VARCHAR(80) NOT NULL,
	order INT NOT NULL,
	start_date DATETIME NOT NULL,
	end_date DATETIME NOT NULL,
	planned_start_date DATETIME,
	planned_end_date DATETIME,
	created_date DATETIME,
	updated_date DATETIME,
	created_by INT,
	updated_by INT,
	remarks VARCHAR(200)
);