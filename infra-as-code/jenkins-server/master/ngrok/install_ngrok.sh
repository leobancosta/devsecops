#!/bin/bash


echo "Installing ngrok...." >> %OUT

apt-get update
out_put=$?

if [ $out_put -eq 0 ]
then
   apt-get upgrade
   mkdir /opt/ngrok/
   chmod 777 /opt/ngrok/

   apt-get install unzip
   curl -T https://bin.equinox.io/c/4VmDzA7iaHb/ngrok-stable-linux-amd64.zip -o /opt/ngrok
   unzip /opt/ngrok/ngrok.zip
   
fi