-- create database UniversalBank;
use UniversalBank;
create table user(
User_id int auto_increment primary key not null,
Name varchar(30) default "Unassign",
GardianName varchar(30)default "Unassign",
Phone varchar(10)  not null,
Address varchar(60)not null,
Pin int unique
);
