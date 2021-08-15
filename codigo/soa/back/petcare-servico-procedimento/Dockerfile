FROM adoptopenjdk/openjdk11:alpine

VOLUME /tmp
COPY target/petcare-servico-procedimento-*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
