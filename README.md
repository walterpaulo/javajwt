## API IN jAVA

* Java 11;
* SpringBoot 2.7.0;
* Docker-compose 3.3;
* Postgres;
* Documentação Swagger;

<hr/>

## Swagger
<p>

UI <p>
[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

API <p>
[http://localhost:8080/v2/api-docs](http://localhost:8080/v2/api-docs)

<hr/>

## Postgresql

### Init data
```
docker-compose up -d
````

### Destroy Data

```
docker-compose dostroy
```

### Access Data
```
psql -h localhost -d userapi -U dev
```
> password: d9bc25472e2c909e0f

***psql package present in postgresql-client-12 or postgresql-client-common***



