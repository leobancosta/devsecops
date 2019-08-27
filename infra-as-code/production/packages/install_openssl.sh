#!/bin/bash

echo "Installing openssl-server...." >> %OUT

apt-get update
out_put=$?

if [ $out_put -eq 0 ]
then
   apt-get upgrade
   apt-get install -y git openjdk-8-jre-headless
fi
