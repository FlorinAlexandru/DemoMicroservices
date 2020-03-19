FROM openjdk:8-jdk-alpine

ARG JAR
EXPOSE 8081
WORKDIR /home
COPY ${JAR} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar", "app.jar"]