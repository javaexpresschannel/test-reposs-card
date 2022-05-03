FROM openjdk:11-slim as build

#Below command is used to copy source(local system) to unix OS(Destination)
COPY target/cards-0.0.1-SNAPSHOT.jar cards-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/cards-0.0.1-SNAPSHOT.jar"]