FROM openjdk:8-jre
VOLUME /tmp
ADD target/boot_docker-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]