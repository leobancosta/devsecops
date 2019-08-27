#!/bin/bash

echo "Installing openssh-server...." >> %OUT

apt-get update && upgrade -y && install -y openssh-server
