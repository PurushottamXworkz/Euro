create database Company;

use Company;

create table Department(D_Name varchar(20),D_no int,D_mgr_start_date date);
select * from Department;
insert into Department values('Development',1,'2023-12-03');
insert into Department values('DevOps',2,'2023-06-15');
insert into Department values('Testing',3,'2023-12-07');
insert into Department values('Analyst',4,'2024-01-08');
insert into Department values('HR',5,'2023-06-03');
insert into Department values('Enquiry',6,'2021-12-08');
insert into Department values('Data-science',7,'2023-11-03');
insert into Department values('Programer',8,'2023-04-03');
insert into Department values('Excecutive',9,'2023-03-31');



create table Employee(F_name varchar(20),M_name varchar(3),L_name varchar(20),E_id int,dob date,gender varchar(20),address varchar(20),contact bigint);
select * from Employee;
insert into Employee values('Purushottam','I','Pattanashetty',121,'1999-05-04','male','Dharwad',8855441100);
insert into Employee values('Deepak','S','Sulakhe',122,'1999-08-04','male','Gadag',8956544110);
insert into Employee values('Madhav','M','Mestri',123,'1999-12-04','male','Hubblli',8855441123);
insert into Employee values('Kantesh','k','Shetty',124,'1999-01-06','male','Dharwad',8855441185);
insert into Employee values('Amith','A','Pathan',125,'1999-05-28','male','Karwar',8855441174);
insert into Employee values('Ajneesh','L','Lokanath',126,'1999-05-11','male','Hasan',8855421100);
insert into Employee values('Amar','S','Hugar',127,'1998-05-04','male','Dharwad',8855041100);
insert into Employee values('Basavaraj','B','Kabbinad',128,'1978-05-15','male','Belur',8855441199);
insert into Employee values('Balachandra','B','Hegade',129,'1999-11-04','male','UK',8855441123);
insert into Employee values('Megharaj','S','salagar',130,'2000-05-24','male','Ullal',7845951210);


select * from Employee where E_id between 125 and 130;

select * from Employee where F_Name='Megharaj' or L_Name='salagar';

select count(*) from Department;
select * from Department where D_Name='Devops' or D_Name='HR'; 

select *  from Employee where dob between '1999-01-01' and '2000-01-01' ;

