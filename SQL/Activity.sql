create database BMW;

use BMW;

create table branches_of_BMW(country varchar(10),location varchar(20),contact bigint);

create table Employee(Employee_id int,Employee_name varchar(10),contact bigint,Address varchar(20));

show databases;

describe branches_of_BMW;
select * from branches_of_BMW;

describe Employee;
select * from Employee;

insert into branches_of_BMW values("India","Bangalore",7896541254);
insert into branches_of_BMW values("Germany","Munich",7845154412);
insert into branches_of_BMW values("Brazil","Sao Paulo",4157841212);
insert into branches_of_BMW values("The NL","Amsterdam",7845129541);
insert into branches_of_BMW values("SA","Midrand",8574102130);
insert into branches_of_BMW values("UK","hams Hall",1174859632);
insert into branches_of_BMW values("US","Ridge Road",7485124500);
insert into branches_of_BMW values("US","New Jersey",8451207541);
insert into branches_of_BMW values("US","WoodClif",5421245152);

insert into Employee values(123,"Prashant",8088204455,"Dharwad");
insert into Employee values(124,"John",8745126510,"New york");
insert into Employee values(125,"Peter",8745102019,"London");
insert into Employee values(126,"Carol",7841002210,"Los Angels");
insert into Employee values(127,"David",9641225570,"Stanford");
insert into Employee values(128,"Sneha",9997455108,"SA Oths");
insert into Employee values(129,"Priya",9966778844,"Aagrah");
insert into Employee values(130,"Naveen",9955666441,"Shimogha");

select * from Employee where Address="Shimogha";

Alter table Employee rename Employee_info;

select * from Employee_info;

Alter table Employee_info rename column contact to Contact;

select * from Employee_info order by Employee_id desc;  

