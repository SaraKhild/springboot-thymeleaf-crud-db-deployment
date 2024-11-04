FROM  openjdk:17
WORKDIR /
ADD target/spring-boot-thymeleaf-crud-db-project-0.0.1-SNAPSHOT.jar /
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/spring-boot-thymeleaf-crud-db-project-0.0.1-SNAPSHOT.jar"]
