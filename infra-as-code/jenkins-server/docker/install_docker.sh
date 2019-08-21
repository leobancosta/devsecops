#!/bin/bash

apt-get update
out_put=$?

if [ $out_put -eq 0 ]
then
   apt-get upgrade

   apt-get install apt-transport-https ca-certificates curl gnupg-agent software-properties-common
   curl -fsSL https://download.docker.com/linux/ubuntu/gpg | apt-key add -

   apt-key fingerprint 0EBFCD88

   add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu bionic stable"

   apt-get update

   apt-get install docker-ce docker-ce-cli containerd.io
fi
