CREATE DATABASE dso;

GRANT ALL PRIVILEGES ON dso.* TO 'dsoprojectsquad'@'%' IDENTIFIED BY 'dsopass';
GRANT ALL PRIVILEGES ON dso.* TO 'dsoprojectsquad'@'localhost' IDENTIFIED BY 'dsopass';

USE dso;

CREATE TABLE project_squad (
	project_squad_id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY,
	project_id INT NOT NULL,
	squad_id INT NOT NULL,
	start_date DATETIME,
	end_date DATETIME,
	created_date DATETIME,
	updated_date DATETIME,
	created_by INT,
	updated_by INT
);