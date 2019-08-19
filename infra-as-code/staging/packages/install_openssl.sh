#!/bin/bash

echo "Installing openssh-server...." >> %OUT

apt-get update
out_put=$?

if [ $out_put -eq 0 ]
then
   apt-get upgrade
fi
