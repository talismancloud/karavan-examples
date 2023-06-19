alter session set "_ORACLE_SCRIPT"=true;
CREATE USER dev IDENTIFIED BY dev;
GRANT CONNECT, RESOURCE TO dev;
GRANT UNLIMITED TABLESPACE TO dev;
CREATE TABLE dev.persons(
    person_id NUMBER,
    first_name VARCHAR2(50) NOT NULL,
    last_name VARCHAR2(50) NOT NULL
);