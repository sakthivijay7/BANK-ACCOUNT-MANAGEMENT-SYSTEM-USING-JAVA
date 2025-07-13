use universalbank;

create table WithdrawDetail(
Withdraw_id int primary key auto_increment not null,
Withdraw decimal(20,2),
WithdrawDate varchar(20),
User_id int ,
foreign key(User_id)references user(User_id)
);