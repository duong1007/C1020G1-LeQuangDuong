create database Bai_tap;

use Bai_tap;

create table sinh_vien (
	id int,
    ten varchar(50),
    tuoi int,
    khoa_hoc varchar(5),
    so_tien int
);

insert into sinh_vien 
values 
(1,"Hoang",21,"CNTT",400000),
(2,"Viet",19,"DTVT",320000),
(3,"Thanh",18,"KTDN",400000),
(4,"Nhan",19,"CK",450000),
(5,"Huong",20,"TCHN",500000),
(5,"Huong",20,"TCHN",200000);

select * 
from Sinh_vien
where ten = "Huong";

select sum(so_tien)
from Sinh_vien
where ten = "Huong"
group by ten;

select distinct ten 
from Sinh_vien;
