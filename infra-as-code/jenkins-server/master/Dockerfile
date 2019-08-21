FROM jenkins/jenkins:lts

USER root
ENV JENKINS_USER admin
ENV JENKINS_PASS admin

ENV JAVA_OPTS "-Djenkins.install.runSetupWizard=false ${JAVA_OPTS:-}"

COPY ./master/config/executors.groovy /var/lib/jenkins/init.groovy.d/
COPY ./master/config/default-user.groovy /var/lib/jenkins/init.groovy.d/

COPY ./master/config/plugins.txt /usr/share/jenkins/plugins.txt
RUN /usr/local/bin/plugins.sh /usr/share/jenkins/plugins.txt

RUN apt-get update && apt-get -y upgrade && apt-get install -y apt-transport-https ca-certificates curl gnupg-agent software-properties-common unzip

RUN curl -fsSL https://download.docker.com/linux/ubuntu/gpg | apt-key add -
RUN apt-key fingerprint 0EBFCD88
RUN add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu bionic stable"

RUN apt-get update
RUN apt-get install docker-ce

COPY ./master/ngrok/ngrok-stable-linux-amd64.zip /home/jenkins/ngrok-stable-linux-amd64.zip
RUN chmod +x /home/jenkins/ngrok-stable-linux-amd64.zip
RUN unzip /home/jenkins/ngrok-stable-linux-amd64.zip -d /opt/ngrok/
RUN /opt/ngrok/ngrok http 8080 >> /var/jenkins_home/url.txt

COPY ./master/ssh/install_openssh.sh /var/jenkins_home/install_openssh.sh
RUN chmod _x /var/jenkins_home/install_openssh.sh
RUN /var/jenkins_home/install_openssh.sh

RUN ./master/ssh/install_openssh.sh
RUN ./master/ngrok/install_ngrok.sh

RUN apt-get clean

RUN usermod -a -G docker jenkins
USER jenkins