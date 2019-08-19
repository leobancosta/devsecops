CREATE DATABASE dso;

GRANT ALL PRIVILEGES ON dso.* TO 'dsoproject'@'%' IDENTIFIED BY 'dsopass';
GRANT ALL PRIVILEGES ON dso.* TO 'dsoproject'@'localhost' IDENTIFIED BY 'dsopass';

USE dso;

CREATE TABLE project (
	project_id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY,
	project_name VARCHAR(100) NOT NULL,
	project_desc VARCHAR(200),
	start_date DATETIME,
	end_date DATETIME,
	billable TINYINT NOT NULL DEFAULT 0,
	client_id INT,
	created_date DATETIME,
	updated_date DATETIME,
	created_by INT,
	updated_by INT,
	agile TINYINT NOT NULL DEFAULT 0,
	po_id INT,
	sm_id INT
);