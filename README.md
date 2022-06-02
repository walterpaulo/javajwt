## API IN jAVA

* Java 11;
* SpringBoot 2.7.0;
* Docker-compose 3.3;

### Init data Postgresql
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
password: d9bc25472e2c909e0f

***psql package present in postgresql-client-12 or postgresql-client-common***