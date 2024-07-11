create database Vegitables;

use Vegitables;

create table list_of_vegis(
id int,
name_of_veg varchar(40),
quantity bigint,
price decimal(4,2),
date_of_buying date);


insert into list_of_vegis values (1,'carrot',500,99.99,'2024-07-09');

select * from list_of_vegis;

truncate list_of_vegis; 

alter table list_of_vegis modify price decimal(8,2);

insert into list_of_vegis values (2,'potato',650,102410.99,'2024-07-29');

insert into list_of_vegis values (3,'Tomato',700,98521.99,'2024-07-10');

insert into list_of_vegis values (4,'Brinjal',450,854.88,'2024-07-15');

insert into list_of_vegis values (5,'beetRoot',780,89412.88,'2024-07-13');

insert into list_of_vegis values (6,'Greeen-Chilly',100,9852.12,'2024-07-01');

select * from list_of_vegis where name_of_veg='Brinjal' and price=854.88;

select * from list_of_vegis where name_of_veg='Greeen-Chilly' or price=5124;

select * from list_of_vegis where name_of_veg='Greeen-Chilly' or id=2;

select * from list_of_vegis;

select * from list_of_vegis where price between 1 and 9999;

-- Order by and Update(DML command)




