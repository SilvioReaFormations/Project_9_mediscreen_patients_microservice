FROM openjdk:11
ADD target/mediscreen-0.0.1.SNAPSHOT.jar patients-microservice-docker.jar
ENTRYPOINT ["java", "-jar", "patients-microservice-docker.jar"]