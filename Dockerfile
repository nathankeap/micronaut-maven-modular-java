FROM openjdk:14-alpine
COPY target/boilerplate-*.jar boilerplate.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "boilerplate.jar"]