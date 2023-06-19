

1. Start Oracle database
```
docker run -d -p:1521:1521 --name oracle -e admin -v $(pwd)/scripts:/opt/oracle/scripts/startup  container-registry.oracle.com/database/free:latest         
```
