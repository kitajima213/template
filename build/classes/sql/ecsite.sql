drop database if exists ecsite;

create database if not exists ecsite;
use ecsite;

drop table if exists login_user_transaction;

create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);

drop table if exists item_info_transaction;

create table item_info_transaction(
id int not null primary key auto_increment,
item_name varchar(30),
item_price int,
item_stock int,
insert_date datetime,
update_date datetime
);

drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
id int not null primary key auto_increment,
item_transaction_id int,
itemName varchar(30),
total_price int,
total_count int,
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
delete_date datetime
);


drop table if exists user_contact;

create table user_contact(
user_name varchar(50),
user_email varchar(50),
message_title varchar(50),
message_main varchar(300),
insert_date datetime,
delete_date datetime
);

INSERT INTO item_info_transaction(id, item_name, item_price, item_stock) VALUES(1,"ノートBook", 120, 50),(2,"鉛筆",30,1000),(3,"ボールペン",100,80),(4,"メモ帳",100,500),(5,"消しゴム",80,200),(6,"修正機",110,90);
INSERT INTO login_user_transaction(login_id, login_pass, user_name) VALUES("test", "111", "kitajima");