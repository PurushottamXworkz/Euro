CREATE DATABASE FRIENDS;

CREATE TABLE names_of_them(name varchar(20), school varchar(20),contact_info bigint);
desc names_of_them;

alter table names_of_them add surname char;
alter table names_of_them rename column surname to initial;
alter table names_of_them rename to friends_name;

insert into friends_name (name,school) values ("haji","Xworkz");
select * from friends_name;

alter table friends_name drop column initial; 
alter table friends_name modify school int;







