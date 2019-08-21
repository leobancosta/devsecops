# devsecops
DevSecOps - POC Sprint 1 Continuous Integration

Project structure :

Top directory                                      DEVSECOPS
                  frontend                   BACKEND                      Infra As Code
	           Web UI         vault  API-Gateway  Microservices
	                       LogStash                 database


Vault           : Hashicorp or Spring Vault
API Gateway     : ExpressJS
Microservices   : Spring Data Rest
Database        : Mysql
Central Logging : ELK Stack
Infra as Code   : Makefile and Bash Scripts