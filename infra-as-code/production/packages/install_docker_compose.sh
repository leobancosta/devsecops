#!/bin/bash

apt-get update
out_put=$?

if [ $out_put -eq 0 ]
then
   apt-get upgrade
   curl -L https://github.com/docker/compose/releases/download/1.25.0-rc2/docker-compose-`uname -s`-`uname -m` -o /usr/local/bin/docker-compose
   chmod +x /usr/local/bin/docker-compose
 
 fi
 