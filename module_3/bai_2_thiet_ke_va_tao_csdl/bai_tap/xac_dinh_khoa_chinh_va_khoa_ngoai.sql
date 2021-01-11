create database bank_account;

use bank_account;

create table account_type (
	id int primary key,
    `name` varchar(15)
); 

create table `account` (
	account_number int primary key,
    account_type_id int,
    `date` 	date,
    balance double,
    foreign key (account_type_id) references account_type (id)
);

create table email_of_customer (
	email_number int primary key,
    email varchar(50) UNIQUE
);

create table phone_of_customer (
	phone_number int primary key,
    phone varchar(50) UNIQUE
);

create table customer (
	customer_number int primary key,
    full_name varchar(50),
    address varchar(100),
    email_of_customer_email varchar(50) UNIQUE,
    phone_of_customer_phone int,
    account_account_number int,
    
    foreign key (email_of_customer_email) references email_of_customer (email),
    foreign key (phone_of_customer_phone) references phone_of_customer (phone),
    foreign key (account_account_number) references `account` (account_number)
);



create table `transaction` (
	tran_number int primary key,
    account_account_number int,
    `date` date,
    amounts double,
    decriptions varchar(50),
    foreign key (account_account_number) references `account` (account_number)
);