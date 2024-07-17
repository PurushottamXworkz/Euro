create database horizon;

use horizon;

create table department(d_id int,d_name varchar(40),hod varchar(40),no_of_students int,contact bigint);

select * from department;

insert into department values(2,'Computer science','Ajit',200,7874124510);
insert into department values(3,'Information Science','Patil',70,9854124510);
insert into department values(4,'Electrical & Electronics','Sujata',510,9874124510);
insert into department values(5,'Automation & Robotics','Nagaraj',56,9574854510);
insert into department values(6,'Biochemistry','Devendra',65,9574124580);

update department set d_name='Mechanical' where d_id=1;
 
select d_name,no_of_students from department order by no_of_students;

-- IN and NOT IN are membership operators

select * from department where hod='Haji' or hod='Nagaraj' or hod='Sujata' or hod='Patil';
-- to avoid multiple OR in the query
select *  from department where hod in ('Haji','Sujata','Patil','Nagaraj');

select * from department where hod not in ('Haji','Sujata','Patil','Nagaraj');

-- like is Patern matching
-- % ->any number of charachers
-- _ => One character

select * from department where  d_name like '%e';  
select * from department where d_name like 'C%';

-- Multiple In and Like we dont use becasue it create ambiguity

select * from department where d_name like '%i%' and hod like 'P%'; 

select * from department where hod like '___i';