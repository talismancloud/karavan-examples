# HTTP to Oracle example

Application receives XML through HTTP, extract values and store them into Oracle Database.
Running in Docker Compose environment.

1. Build Application docker image
```
cd source
mvn clean package
```

2. Start ocker compose
```
cd ..
docker compose up
```
Wait untill following message appears: `DONE: Executing user defined scripts`

3. Test HTTP Call
```
curl -X POST "http://0.0.0.0:8080/api" -H "Content-Type: application/xml" -d '<person><id>1</id><firstname>Jani</firstname><lastname>Reminder</lastname></person>'       
```

4. Check database table
Connect to Oracle Database:
```
docker exec -it oracle sqlplus / as sysdba
```
Select data:
```
select * from dev.persons;
```

