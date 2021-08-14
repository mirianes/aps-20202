FROM adoptopenjdk/openjdk11:alpine

VOLUME /tmp
COPY target/petcare-gateway-*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
