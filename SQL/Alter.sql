create database CRICKET;

use CRICKET;

create table players(Name_of_players varchar(20),Age int,Contact long);

create table coach(Name_of_Coach varchar(20),Age int,Contact long);

describe coach;

alter table players drop contact;

describe players;

alter table players rename column Name_of_players to Name;

