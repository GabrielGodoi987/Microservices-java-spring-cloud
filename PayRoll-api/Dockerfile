FROM openjdk:21-jdk-slim

## tudo o que estiver dentro da pasta target(pasta criada quando fazemos o build do nosso projeto)
ARG JAR_FILE=target/*.jar

## renomeando o arquivo .jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]