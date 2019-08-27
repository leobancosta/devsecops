FROM jenkins/jenkins:lts

USER root
ENV JENKINS_USER admin
ENV JENKINS_PASS admin

ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false"

COPY ./master/config/executor.groovy /usr/share/jenkins/ref/init.groovy.d/
COPY ./master/config/default-user.groovy /usr/share/jenkins/ref/init.groovy.d/

COPY ./master/config/plugins.txt /usr/share/jenkins/plugins.txt
RUN /usr/local/bin/install_plugins.sh /usr/share/jenkins/plugins.txt

RUN apt-get update && apt-get upgrade -y && apt-get install -y apt-transport-https ca-certificates curl gnupg-agent software-properties-common unzip

RUN curl -fsSL https://download.docker.com/linux/ubuntu/gpg | apt-key add -
RUN apt-key fingerprint 0EBFCD88
RUN add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu bionic stable"

RUN apt-get update
RUN apt-get install -y docker-ce

COPY ./master/ssh/install_openssh.sh /usr/share/jenkins/ref/install_openssh.sh
RUN chmod +x /usr/share/jenkins/ref/install_openssh.sh
RUN /usr/share/jenkins/ref/install_openssh.sh

RUN curl https://bin.equinox.io/c/4VmDzA7iaHb/ngrok-stable-linux-amd64.zip - /usr/share/jenkins/ref/ngrok-stable-linux-amd64.zip
RUN chmod +x /usr/share/jenkins/ref/ngrok-stable-linux-amd64.zip
RUN unzip /usr/share/jenkins/ref/ngrok-stable-linux-amd64.zip -d /usr/share/jenkins/ref/ngrok
RUN chmod +x /usr/share/jenkins/ref/ngrok


RUN apt-get clean

RUN usermod -a -G docker jenkins
USER jenkins