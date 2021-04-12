FROM openjdk:8-jre-alpine
EXPOSE 8084
WORKDIR /app
COPY target/School-of-Music-0.0.1-SNAPSHOT.jar .
ENTRYPOINT [ "java", "-jar", "School-of-Music-0.0.1-SNAPSHOT.jar" ]
