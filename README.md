
- Build Steps
    - docker compose up -d (Look at docker-compose.yml configuration at root)
    - http://localhost:5050/browser/ (is the pgAdmin , a free open source graphical management tool for PostgreSQL)
    - Run the Customer Boot App

- This is a multi module maven project wherein submodules inherit from parent pom dependency - see dependencyManagement in root pom.xml
```xml

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-dependencies</artifactId>
                <version>${spring.boot.dependencies.version}</version>
                <scope>import</scope>
                <type>pom</type>
            </dependency>
        </dependencies>
    </dependencyManagement>
```

- Customer Endpoint (POST) : localhost:8080/api/v1/customers
```json
{
   "firstName":"Kelsi",
   "lastName":"Johnson",
   "email":"theGoal@life.com"
}
```

References - https://github.com/amigoscode/microservices
