FROM openjdk:11-slim

WORKDIR /app
COPY app/target/app-*.jar server.jar
COPY app/application.yml .

USER nobody
CMD java -jar server.jar
