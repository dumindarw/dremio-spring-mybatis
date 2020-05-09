## Spring MVC Dremio Integration with MyBatis


### Install Dremio JDBC
```bash
mvn install:install-file -Dfile=/home/duminda/Downloads/dremio-jdbc-driver-4.2.2-202004211133290458-b550b6fa.jar -DgroupId=com.dremio \
        -DartifactId=dremio -Dversion=4.2.2 -Dpackaging=jar
```

```bash
curl http://localhost:8080/dremio-poc/reminder/1
```

### Run with OpenLiberty Server

```bash
mvn clean package liberty:run
```

### Live reloading

```bash
mvn liberty:dev
```

### Docker build and Run
```bash
docker build -t dremio-poc:1.0-SNAPSHOT  .

docker run -dt --name dremio-poc -p 8082:9080 dremio-poc:1.0-SNAPSHOT
```

