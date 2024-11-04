#!/bin/bash

sudo apt-get update -yy
sudo apt-get install -yy git curl

curl -fsSL https://get.docker.com -o get-docker.sh
sudo sh ./get-docker.sh

docker run -d \
    -p 3306:3306 \
    --name mysql \
    -v /data/db:/var/lib/mysql \
    -e MYSQL_ROOT_PASSWORD=demopass \
    -e MYSQL_DATABASE=demo \
    -e MYSQL_USER=demouser \
    -e MYSQL_PASSWORD=demopass \
    mysql:latest