-- Order by and Update (DML command) Delete

create database school;

use school;

create table class_1(id int,
roll_no int,
F_name varchar(20),
l_name varchar(50),
no_sub int,
last_percent float(5));

select * from Class_1;

insert into class_1 (id,roll_no,f_name,l_name,no_sub) values(1,21,'Prashant','Pattanashetti',3);
insert into class_1 (id,roll_no,f_name,l_name,no_sub) values(2,22,'Parvez','Byahatti',9);
insert into class_1 (id,roll_no,f_name,l_name,no_sub) values(3,23,'Rashmi','Pass',1);
insert into class_1 (id,roll_no,f_name,l_name,no_sub) values(4,24,'Avinash','Nair',2);

update class_1 set f_name ='Purushottam',l_name='P' where id=1;

update class_1 set f_name='purushottam' where roll_no = 21; 

delete from class_1 where id=1;

update class_1 set last_percent=99 where f_name='Purushottam';
update class_1 set last_percent=89 where f_name='Parveez';
update class_1 set last_percent=91 where f_name='Rashmi';


select * from class_1 order by no_sub; 
select f_name,last_percent from class_1 order by last_percent desc;
select f_name,l_name,id from class_1 order by id;

