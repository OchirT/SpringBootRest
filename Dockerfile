FROM openjdk
EXPOSE 8080
COPY target/netology-0.0.1-SNAPSHOT.jar app.jar
CMD ["java","-jar", "app.jar"]