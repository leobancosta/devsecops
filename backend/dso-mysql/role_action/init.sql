CREATE DATABASE dso;

GRANT ALL PRIVILEGES ON dso.* TO 'dsoroleaction'@'%' IDENTIFIED BY 'dsopass';
GRANT ALL PRIVILEGES ON dso.* TO 'dsoroleaction'@'localhost' IDENTIFIED BY 'dsopass';

USE dso;

CREATE TABLE role_action (
	role_action_id INT NOT NULL AUTO_INCREMENT PRIMARY_KEY,
	role_id INT NOT NULL,
	action_id INT NOT NULL,
	active TINYINT NOT NULL DEFAULT 0
);