create database Xworkz;

use Xworkz;

create table trainer(name varchar(20),trainer_id int,dob date);

create table trainee(name varchar(20),trainer_id int,dob date,location varchar(30));

describe trainer;

describe trainee;

alter table trainee add column trainee_reg_no int;

alter table trainee drop column trainee_reg_no;

show databases;

show tables;

alter table trainee add column last_name varchar(20); 

describe trainee;

alter table trainee drop column last_name;

alter table trainee rename column name to First_name; 