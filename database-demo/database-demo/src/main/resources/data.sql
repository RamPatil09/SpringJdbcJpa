create table PERSON(
id integer not NULL,
name varchar(255) not null,
location varchar(255),
birth_date timestamp,
primary key(id)
);

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10001,'Ranga','Hydrabad',now());

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10002,'Raman','Pune',now());

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10003,'Shivu','Bengaluru',now());

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10004,'Peter','New York',now());

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10005,'Shivu','America',now());

