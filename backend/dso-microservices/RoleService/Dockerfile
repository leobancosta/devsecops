FROM tomcat:8.5-jdk8-openjdk

COPY ./dso-microservices/RoleService/target/role-service.war /usr/local/tomcat/webapps/
COPY ./dso-microservices/RoleService/conf/server.xml /usr/local/tomcat/conf/
COPY ./dso-microservices/RoleService/conf/setenv.sh /usr/local/tomcat/bin/

RUN touch /usr/local/tomcat/bin/setenv.sh

RUN apt-get update -qq && apt-get install -qqy curl wget && apt-get clean

EXPOSE 8080

CMD ["catalina.sh", "run"]