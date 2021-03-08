#!/bin/sh
mvn clean package && docker build -t mx.com.gm/5-ManejoCabeceros .
docker rm -f 5-ManejoCabeceros || true && docker run -d -p 9080:9080 -p 9443:9443 --name 5-ManejoCabeceros mx.com.gm/5-ManejoCabeceros