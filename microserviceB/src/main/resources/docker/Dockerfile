FROM openjdk:8-jdk-alpine

EXPOSE 8082

ARG JAR
WORKDIR /home
COPY ${JAR} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar", "app.jar"]
