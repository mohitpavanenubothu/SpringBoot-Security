FROM java:8-jdk-alpine

COPY ./target/spring-boot-docker-app.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch spring-boot-docker-app.jar'

ENTRYPOINT ["java","-jar","spring-boot-docker-app.jar"]

# For Java 8, try this
# FROM openjdk:8-jdk-alpine

# For Java 11, try this
FROM adoptopenjdk/openjdk16:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/spring-boot-security.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]