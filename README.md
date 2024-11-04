# SpringBoot Thymeleaf with CUDR Database Concept.

<br>

## Overview
 The project is about the employee's table so it can display employees, add new employee, updates employee info and delete employee.
 
<br>

## Usages
-  SpringBoot
-  SpringJPA
-  Thymeleaf
-  MySQL
  
## Architecture of the Project

 ### 1- src folders
   - Controllers folder
   - Entities folder
   - DAO folder
   - Services folder

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
server.port=8082
spring.datasource.url = jdbc:mysql://localhost:3306/employee-directory?useSSL=false&serverTimezone=UTC
spring.datasource.username=springemployee
spring.datasource.password= springemployee

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
# project-deploy
