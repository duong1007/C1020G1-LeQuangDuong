drop database if exists car_store;
create database car_store;

use car_store;

create table offices (
	office_code varchar(10) primary key,
    city varchar(50) not null,
    phone varchar(50) not null,
    address_Line1 varchar(50) not null,
    address_Line2 varchar(50) not null,
    state varchar(50) not null,
    country varchar(50) not null,
    postalCode varchar(15) not null
);

create table employees (
	employee_number int primary key,
    lastName varchar(50) not null,
    firstName varchar(50) not null,
    email varchar(100) not null,
    job_Title varchar(50) not null,
    
	leader_number int not null,
	offices_office_Code varchar(10) not null,
	FOREIGN KEY (leader_number) REFERENCES employees (employee_number),
	FOREIGN KEY (offices_office_Code) REFERENCES offices (office_code) 
);


create table customers (
	employees_employee_number int, 
	customer_number int primary key,
    customer_name varchar(50) not null,
    contact_Last_Name varchar(50) not null,
    contact_First_Name varchar(50) not null,
    phone varchar(50) not null,
    address_Line1 varchar(50) not null,
    address_Line2 varchar(50) not null,
    city varchar(50) not null,
    state varchar(50) not null,
    postal_Code varchar(15) not null,
    country varchar(50) not null,
    credit_Limit int,
    
    foreign key (employees_employee_number) references employees (employee_number)
);

create table products_line (
	product_line varchar(50) primary key,
    text_decription varchar(50) not null,
    image text
);

create table products (
	products_line_product_line varchar(50),
	product_code varchar(15) primary key,
    product_name varchar(70) not null,
    product_Scale varchar(10) not null,
    product_Vendor varchar(50) not null,
    product_Description text not null,
    quantity_InStock int not null,
    buy_Price double,
    MSRP double,
    
    foreign key (products_line_product_line) references products_line (product_line)
);

create table orders (
	customers_customer_number int,
	oder_number int primary key,
    order_Date date not null,
    required_Date date not null,
	shipped_Date date,
    `status` varchar(15) not null,
    comments text,
    quantity_Ordered int not null,
    price_Each double not null,
    
    foreign key (customers_customer_number) references customers (customer_number)
);

create table payment (
	customers_customer_number int,
	payment_number int primary key,
    check_Number varchar(50) not null,
    payment_Date date not null,
    amount double not null,
    
	foreign key (customers_customer_number) references customers (customer_number)

);

create table Order_Details (
	products_product_code varchar(15),
    orders_oder_number int,
    
    primary key (products_product_code,orders_oder_number),
    foreign key (products_product_code) references products (product_code),
    foreign key (orders_oder_number) references orders (oder_number)
);
