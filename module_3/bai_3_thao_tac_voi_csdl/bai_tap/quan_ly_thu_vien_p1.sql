drop database if exists library_management;

create database library_management;

use library_management;

create table Student (
	student_id int primary key,
    student_name varchar(50),
    student_date date,
    address text,
    email varchar(50),
    phone varchar(15),
    img text
);

create table status_student (
	status_id int primary key,
    status_name varchar (20),
    
    student_id int,
    foreign key (student_id) references Student (student_id)
);

create table borrow_order (
	borrow_id int primary key,
	date_borowed date,
    date_return date,
    
    student_id int,
    foreign key (student_id) references Student(student_id)
);

create table category (
	category_id int primary key,
    category_name varchar (50)
);

create table Book (
	book_id int primary key,
    book_name varchar(50),
    book_date date,
    author varchar(50),
    publishing_year date,
    publishing_company varchar(50),
    publications int,
    price double,
    
    category_id int,
    borrow_id int,
    foreign key (category_id) references category (category_id),
    foreign key (borrow_id) references borrow_order (borrow_id)
);

create table status_book (
	status_id int primary key,
    status_name varchar(20),
    
    book_id int,
    foreign key (book_id) references Book (book_id)
);
