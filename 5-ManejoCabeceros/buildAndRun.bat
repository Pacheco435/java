@echo off
call mvn clean package
call docker build -t mx.com.gm/5-ManejoCabeceros .
call docker rm -f 5-ManejoCabeceros
call docker run -d -p 9080:9080 -p 9443:9443 --name 5-ManejoCabeceros mx.com.gm/5-ManejoCabeceros