
drop database if exists code_gym;
create database code_gym;

use code_gym;

create table product (
id varchar(8) primary key,
`name` varchar(50) not null,
price double not null,
discount int,
amount int not null
);

insert into product
values 
("PT-001","JAVA",150,5,10),
("PT-002","PHP",100,6,9),
("PT-003","C++",200,4,12),
("PT-004","C#",178,7,32),
("PT-005","RUBY",202,2,12),
("PT-006","PYTHON",156,8,34),
("PT-007","CSS",456,2,22),
("PT-008","HTML",234,7,10),
("PT-009","JS",675,3,5),
("PT-010","SQL",232,5,32);

create table employee (
id varchar(8) primary key,
`name` varchar(50) not null,
date_of_birth date not null,
phone varchar(20),
email varchar(50),
address varchar(50) not null
);

insert into employee
values 
("EP-001","Dương Lê","1998-07-10",0903291409,"Duong1@gmail.com","Đà Nẵng"),
("EP-002","Minh Ngọc","1998-06-10",0903291234,"Duong2@gmail.com","Quảng Nam"),
("EP-003","Anh Thư","1998-05-10",0903294545,"Duong3@gmail.com","Hội An"),
("EP-004","Dương Thư","1998-04-10",09032978567,"Duong4@gmail.com","Quảng Trị"),
("EP-005","Lưu Ngọc","1998-03-10",09032567567,"Duong5@gmail.com","Đà Nẵng"),
("EP-006","Thảo Ngọc","1998-02-10",09032915646,"Duong6@gmail.com","Đà Nẵng"),
("EP-007","Thu Hà","1998-01-10",0905643645,"Duong7@gmail.com","Đà Nẵng"),
("EP-008","Hoàng Oanh","1999-07-10",0904563454,"Duong8@gmail.com","Hội An"),
("EP-009","Thu Hằng","2001-07-10",090454534,"Duong9@gmail.com","Hội An"),
("EP-010","Thu Phượng","2002-07-10",0907676494,"Duong10@gmail.com","Nghệ an");


create table payment_card (
id int primary key,
name varchar(20) not null
);

insert into payment_card
values 
(1,"visa"),
(2,"promo"),
(3,"money");

create table customer (
id varchar(8) primary key,
`name` varchar(50) not null,
date_of_birth date not null,
phone varchar(20) not null,
email varchar(50) not null,
address varchar(50) not null
);

insert into customer
values 
("CS-001","Dương Quang","1998-07-10",09032423,"Thu1@gmail.com","Hội An"),
("CS-002","Hoàng Ngọc","1998-06-10",090329546234,"Thu2@gmail.com","Hội An"),
("CS-003","Minh Thư","1998-05-10",09064564545,"Thu3@gmail.com","Đà Nẵng"),
("CS-004","Dương Linh","1998-04-10",09032976767,"Thu4@gmail.com","Quảng Bình"),
("CS-005","Lưu Ly","1998-03-10",09032545367,"Thu5@gmail.com","Đà Nẵng"),
("CS-006","Thảo Hiền","1998-02-10",09032913453,"Thu6@gmail.com","Đà Nẵng"),
("CS-007","Thu Hiền","1998-01-10",090564333453,"Thu7@gmail.com","Hội An"),
("CS-008","Hoàng Minh","1999-07-10",09045345354,"Thu8@gmail.com","Đà Nẵng"),
("CS-009","Lê Hằng","2001-07-10",0904543454,"Thu9@gmail.com","Hội An"),
("CS-010","Minh Phượng","2002-07-10",0903456494,"Thu10@gmail.com","Hải Phòng");

create table `order` (
id varchar(10) primary key,
payment_card_id int not null,
customer_id varchar(8) not null,
employee_id varchar(8) not null,
order_date date not null,
delivery_date date not null,
delivery_address varchar(100) not null,

foreign key (customer_id) references customer(id),
foreign key (employee_id) references employee(id)
);

insert into `order`
values 
("OD-001",2,"CS-004","EP-009","2020-12-01","2020-12-07","Hội An"),
("OD-002",1,"CS-006","EP-009","2020-12-01","2020-12-07","Đà nẵng"),
("OD-003",1,"CS-002","EP-002","2020-12-01","2020-12-07","Quảng Trị"),
("OD-004",1,"CS-005","EP-004","2020-12-01","2020-12-07","Hải Phòng"),
("OD-005",3,"CS-007","EP-007","2020-12-01","2020-12-07","Đà nẵng"),
("OD-006",1,"CS-008","EP-007","2020-12-01","2020-12-07","Hội An"),
("OD-007",2,"CS-010","EP-005","2020-12-01","2020-12-07","Quảng Trị"),
("OD-008",3,"CS-001","EP-003","2020-12-01","2020-12-07","Đà nẵng"),
("OD-009",3,"CS-002","EP-007","2020-12-01","2020-12-07","Hội An"),
("OD-010",2,"CS-009","EP-008","2020-12-01","2020-12-07","Hội An");




create table order_detail (
id int primary key,
order_id varchar(10) not null,
product_id varchar(8) not null,
amount int,

foreign key (order_id) references `order`(id),
foreign key (product_id) references product(id)
);

insert into order_detail
values 
(1,"OD-001","PT-005",2),
(2,"OD-002","PT-006",5),
(3,"OD-003","PT-002",2),
(4,"OD-004","PT-003",14),
(5,"OD-005","PT-007",12),
(6,"OD-006","PT-009",23),
(7,"OD-007","PT-008",6),
(8,"OD-008","PT-002",6),
(9,"OD-009","PT-003",8),
(10,"OD-010","PT-005",9);



