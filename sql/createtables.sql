create table courseapp_user(
id int primary key auto_increment,
name varchar(100) not null,
email varchar(100) not null,
password varchar(100) not null,
mobile bigint not null,
unique(email),
check(length(password>=8) and length(mobile)=10));

INSERT INTO courseapp_user (name,email,password,mobile) 
VALUES('Manoj','manoj@man.com','12345',6383122691);