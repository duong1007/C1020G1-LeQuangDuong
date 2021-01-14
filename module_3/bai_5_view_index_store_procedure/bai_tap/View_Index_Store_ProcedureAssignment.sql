drop database if exists View_Index_Store_Procedure;

create database View_Index_Store_Procedure;

use View_Index_Store_Procedure;

create table Products (
	Id int,
	productCode varchar(5),
	productName varchar(50),
	productPrice int,
	productAmount int,
	productDescription text,
	productStatus varchar(50)
);

insert into products
values 
(1,"HDMI","Duong",3000,1,"dep trai vl","sold"),
(2,"HDMA","Thu",2000,1,"dep trai vl","sold"),
(3,"HDMB","Hai",1000,1,"dep trai vl","sold"),
(4,"HDMC","Phong",1500,1,"dep trai vl","sold"),
(5,"HDMD","Vip",2500,1,"dep trai vl","sold");

-- buoc 3
create unique index `code`
on products(productCode);

ALTER TABLE products ADD INDEX Composite_Index (productName, productPrice);

explain select productCode, productName from products;

-- buoc 4
create view duong_view as
select productCode, productName, productPrice, productStatus
from products;

select * from duong_view;

 UPDATE duong_view
 SET productPrice = 3500
 WHERE productCode = "HDMI";
 
 select * from duong_view;
 
 DELETE FROM duong_view
 WHERE productPrice = 2500;
 
 DROP VIEW duong_view;
 
 
 -- buoc 5
 
 delimiter //
 create procedure add_produces()
 begin 
 
 select * from produces;
 
 end;
 
 // delimiter ;
 
 
 
 delimiter //
 create procedure all_produces(Id int,
	productCode varchar(5),
	productName varchar(50),
	productPrice int,
	productAmount int,
	productDescription text,
	productStatus varchar(50))
 begin 
 
 insert into products
values ( Id, productCode, productName, productPrice, productAmount, productDescription, productStatus);
 
 end;
 
 // delimiter ;
 
 
 delimiter //
 create procedure edit_produces(Idn int,
	productCoden varchar(5),
	productNamen varchar(50),
	productPricen int,
	productAmountn int,
	productDescriptionn text,
	productStatusn varchar(50))
 begin 
 
update products 
set productCode = productCoden,
  productName = productNamen, 
  productPrice = productPricen, 
  productAmount = productAmountn, 
  productDescription = productDescriptionn, 
  productStatus = productStatusn
where id = Idn;

 end;
 
 // delimiter ;
 
  delimiter //
 create procedure delete_produces(id int)
 begin 
 
 delete from produces
 where Id = id;
 
 end;
 
 // delimiter ;
 