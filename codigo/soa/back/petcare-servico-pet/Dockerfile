FROM adoptopenjdk/openjdk11:alpine

VOLUME /tmp
COPY target/petcare-servico-pet-*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
