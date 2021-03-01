
drop database if exists code_gym;
create database code_gym;

use code_gym;

create table product (
id int auto_increment primary key,
`name` varchar(50) not null,
price double not null,
discount int,
amount int not null
);

insert into product
values 
(null,"JAVA",150,5,10),
(null,"PHP",100,6,9),
(null,"C++",200,4,12),
(null,"C#",178,7,32),
(null,"RUBY",202,2,12),
(null,"PYTHON",156,8,34),
(null,"CSS",456,2,22),
(null,"HTML",234,7,10),
(null,"JS",675,3,5),
(null,"SQL",232,5,32);

create table employee (
id int auto_increment primary key,
`name` varchar(50) not null,
date_of_birth date not null,
phone varchar(20),
email varchar(50),
address varchar(50) not null
);

insert into employee
values 
(null,"Dương Lê","1998-07-10",0903291409,"Duong1@gmail.com","Đà Nẵng"),
(null,"Minh Ngọc","1998-06-10",0903291234,"Duong2@gmail.com","Quảng Nam"),
(null,"Anh Thư","1998-05-10",0903294545,"Duong3@gmail.com","Hội An"),
(null,"Dương Thư","1998-04-10",09032978567,"Duong4@gmail.com","Quảng Trị"),
(null,"Lưu Ngọc","1998-03-10",09032567567,"Duong5@gmail.com","Đà Nẵng"),
(null,"Thảo Ngọc","1998-02-10",09032915646,"Duong6@gmail.com","Đà Nẵng"),
(null,"Thu Hà","1998-01-10",0905643645,"Duong7@gmail.com","Đà Nẵng"),
(null,"Hoàng Oanh","1999-07-10",0904563454,"Duong8@gmail.com","Hội An"),
(null,"Thu Hằng","2001-07-10",090454534,"Duong9@gmail.com","Hội An"),
(null,"Thu Phượng","2002-07-10",0907676494,"Duong10@gmail.com","Nghệ an");


create table payment_card (
id int auto_increment primary key,
name varchar(20) not null
);

insert into payment_card
values 
(1,"visa"),
(2,"promo"),
(3,"money");

create table customer (
id int auto_increment primary key,
`name` varchar(50) not null,
date_of_birth date not null,
phone varchar(20) not null,
email varchar(50) not null,
address varchar(50) not null
);

insert into customer
values 
(null,"Dương Quang","1998-07-10",09032423,"Thu1@gmail.com","Hội An"),
(null,"Hoàng Ngọc","1998-06-10",090329546234,"Thu2@gmail.com","Hội An"),
(null,"Minh Thư","1998-05-10",09064564545,"Thu3@gmail.com","Đà Nẵng"),
(null,"Dương Linh","1998-04-10",09032976767,"Thu4@gmail.com","Quảng Bình"),
(null,"Lưu Ly","1998-03-10",09032545367,"Thu5@gmail.com","Đà Nẵng"),
(null,"Thảo Hiền","1998-02-10",09032913453,"Thu6@gmail.com","Đà Nẵng"),
(null,"Thu Hiền","1998-01-10",090564333453,"Thu7@gmail.com","Hội An"),
(null,"Hoàng Minh","1999-07-10",09045345354,"Thu8@gmail.com","Đà Nẵng"),
(null,"Lê Hằng","2001-07-10",0904543454,"Thu9@gmail.com","Hội An"),
(null,"Minh Phượng","2002-07-10",0903456494,"Thu10@gmail.com","Hải Phòng");

create table `order` (
id int auto_increment primary key,
payment_card_id int not null,
customer_id INT not null,
employee_id int not null,
order_date date not null,
delivery_date date not null,
delivery_address varchar(100) not null,

foreign key (customer_id) references customer(id),
foreign key (employee_id) references employee(id)
);

insert into `order`
values 
(null,2,4,9,"2020-12-01","2020-12-07","Hội An"),
(null,1,6,9,"2020-12-01","2020-12-07","Đà nẵng"),
(null,1,2,2,"2020-12-01","2020-12-07","Quảng Trị"),
(null,1,5,4,"2020-12-01","2020-12-07","Hải Phòng"),
(null,3,7,7,"2020-12-01","2020-12-07","Đà nẵng"),
(null,1,8,7,"2020-12-01","2020-12-07","Hội An"),
(null,2,10,5,"2020-12-01","2020-12-07","Quảng Trị"),
(null,3,1,3,"2020-12-01","2020-12-07","Đà nẵng"),
(null,3,2,7,"2020-12-01","2020-12-07","Hội An"),
(null,2,9,8,"2020-12-01","2020-12-07","Hội An");




create table order_detail (
id int auto_increment primary key,
order_id int not null,
product_id int not null,
amount int,

foreign key (order_id) references `order`(id),
foreign key (product_id) references product(id)
);

insert into order_detail
values 
(1,1,5,2),
(2,2,6,5),
(3,3,2,2),
(4,4,3,14),
(5,5,7,12),
(6,6,9,23),
(7,7,8,6),
(8,8,2,6),
(9,9,3,8),
(10,10,5,9);

