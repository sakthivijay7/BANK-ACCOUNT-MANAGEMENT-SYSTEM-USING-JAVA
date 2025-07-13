use universalbank;

create table DepositDetail(
Deposit_id int primary key auto_increment not null,
Deposit decimal(20,2) ,
DepositDate varchar(20),
User_id int ,
foreign key(User_id)references user(User_id)
);
select * from transaction;
drop table transaction