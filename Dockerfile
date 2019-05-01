FROM	frolvlad/alpine-java:jdk8-slim
COPY 	target/prad-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
