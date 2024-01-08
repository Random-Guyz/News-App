SET SQL_SAFE_UPDATES = 0;
create database news_application;
show databases;
use news_application;
show tables;

create table signup(email varchar(25),fullname varchaR(25),username varchar(25),password varchar(25));
show tables;
create table login(username varchar(25),password varchar(25));
select * from login;

/*DELETE FROM signup;*/
DELETE FROM signup;
DELETE FROM login;
select * from signup;