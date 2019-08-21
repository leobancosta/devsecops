#!/bin/bash

echo "Installing openssh-server...." >> %OUT

apt-get update
out_put=$?

if [ $out_put -eq 0 ]
then
   apt-get upgrade
   
   apt-get install openssh-server
   
   ufw allow ssh
   
   ufw enable
   
   mkdir $HOME/.ssh
   chmod 777 $HOME/.ssh
   
   ssh-keygen -f $HOME/.ssh/id_rsa -t rsa -b 4096 -N ''
fi
