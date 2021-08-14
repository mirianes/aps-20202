FROM adoptopenjdk/openjdk11:alpine

VOLUME /tmp
COPY target/petcare-discovery-server-*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
