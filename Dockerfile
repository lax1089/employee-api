FROM openjdk:8-jre-slim
WORKDIR /home
COPY /target/employee-api.jar employee-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "employee-api.jar"]
