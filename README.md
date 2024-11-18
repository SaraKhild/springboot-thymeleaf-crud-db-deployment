# Spring Boot & Thymeleaf: CRUD Operations with Database Integration and Deployment on Alibaba Cloud

<br>

## Overview
This project focuses on managing an employee database through a user-friendly interface. It includes functionalities to:
 * Display a list of employees.
 * Add new employees to the database.
 * Update existing employee information.
 * Delete employees from the database. <br>
   
The project also incorporates cloud deployment using Alibaba Cloud. Infrastructure is provisioned and managed using Terraform, enabling scalable and efficient deployment of the application.
  
<br>

## Usages
-  SpringBoot
-  SpringJPA
-  Thymeleaf
-  MySQL
-  Terraform
-  Dockerfile
-  Docekr Compose
  
## Architecture of the Project

 ### 1- deployment folders
   - provider.tf
   - vpc.tf
   - key.tf
   - bastion-sg.t
   - bastion.tf
   - employee-sg.tf
   - employee.tf
   - employee.tpl
   - mysql-sg.tf
   - mysql.tf
   - mysql.tpl
   - load-balancer.tf
     
 ### 2- src folders
 ####  2.1 main 
   - Controllers folder
   - Entities folder
   - DAO folder
   - Services folder
#### 2.2 resources  
##### 2.2.1 templates
   - employee-form.html
   - list-employees.html

 ### 2-Maven pom.xml
<br>

```
 <dependencies>

        <!-- thymeleaf engin for html -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>

        <!-- spring mvc includs RES support -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <!-- dev tool for reload server automatic when change code -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>

        <!-- mysql deriver -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>

        <!-- Hibernate -->
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>${hibernate.version}</version>
        </dependency>

</dependencies>
 ```
<br>

### 3-Application.properties.yml

```
spring.datasource.url=jdbc:mysql://mydb:3306/demo
spring.datasource.username=demouser
spring.datasource.password=demopass

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update  

 ```
### 4- Dockerfile
```
FROM  openjdk:17
WORKDIR /
ADD target/spring-boot-thymeleaf-crud-db-project-0.0.1-SNAPSHOT.jar /
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/spring-boot-thymeleaf-crud-db-project-0.0.1-SNAPSHOT.jar"]

```
### 5- Docker-compose.yml
```
version: "3"
services:
  server:
    container_name: app-container
    image: app-image
    build: .
    restart: always
    ports:
      - 9091:8080
    depends_on: 
      - mydb

  mydb:
    container_name: mydb
    platform: linux/arm64/v8
    image: mysql:latest
    restart: always
    ports:
      - 3313:3306
    environment:
      MYSQL_DATABASE: demo
      MYSQL_USER: demouser
      MYSQL_PASSWORD: demopass
      MYSQL_ROOT_PASSWORD: demopass
```

## Let's Start :mechanical_arm:
### • Display Empoyees Table
<br>
<img width="1674" alt="display-employee" src="https://user-images.githubusercontent.com/67427643/124305147-5d68ce80-db6d-11eb-8f44-e27b23c1645c.png">



### • Add new Employee
<br>
<img width="1673" alt="add-employee" src="https://user-images.githubusercontent.com/67427643/124305371-ade02c00-db6d-11eb-866e-bb572312e91e.png">
<img width="1654" alt="add-employee" src="https://user-images.githubusercontent.com/67427643/124305516-e08a2480-db6d-11eb-8cff-08247c8a66fa.png">



### • Update Empoyee:
<br>
<img width="1665" alt="update-employee" src="https://user-images.githubusercontent.com/67427643/124305561-f0a20400-db6d-11eb-91d8-e4c0c94f9a60.png">
<img width="1659" alt="update-employee" src="https://user-images.githubusercontent.com/67427643/124305710-1fb87580-db6e-11eb-9935-306d2030080e.png">



### • Delete Employee:
<br>
<img width="1646" alt="delete-employee" src="https://user-images.githubusercontent.com/67427643/124306008-863d9380-db6e-11eb-9502-0cf65233b8a2.png">
<img width="1671" alt="delete-employee" src="https://user-images.githubusercontent.com/67427643/124306030-8b024780-db6e-11eb-8a2c-02ef02fc6e33.png">

---

### Good Luck <img src="https://media.giphy.com/media/hvRJCLFzcasrR4ia7z/giphy.gif" width="30px"> 

